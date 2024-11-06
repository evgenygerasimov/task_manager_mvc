package com.evgenygerasimov.spring.task_manager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "users")
@ToString
public class User implements UserDetails {

    @Id
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "enabled")
    private int enabled = 1;
    @Column(name = "email")
    private String email;
    @Column(name = "role")
    private String role;
    @OneToMany(mappedBy = "user")
    private Set<Task> tasks;

    private transient Map<String, String> roles;

    public User() {
        roles = new HashMap<>();
        roles.put("ROLE_CUSTOMER", "CUSTOMER");
        roles.put("ROLE_EXECUTOR", "EXECUTOR");
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Set.of(new SimpleGrantedAuthority(role));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}