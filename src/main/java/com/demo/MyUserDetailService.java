package com.demo;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Darcy on 2016/2/22.
 */
public class MyUserDetailService implements UserDetailsService {
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        SimpleGrantedAuthority auth1 = new SimpleGrantedAuthority("ROLE_USER");
        SimpleGrantedAuthority auth2 = new SimpleGrantedAuthority("ROLE_ADMIN");

        if (username.equals("user")) {
            authorities = new ArrayList<GrantedAuthority>();
            authorities.add(auth1);
            authorities.add(auth2);
        }

        User user = new User(username, "user", true, true, true, true, authorities);
        return user;
    }
}
