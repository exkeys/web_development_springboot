package me.parkgunwoo.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.parkgunwoo.springbootdeveloper.domain.User;
import me.parkgunwoo.springbootdeveloper.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException((email)));
    }
}
