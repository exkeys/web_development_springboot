package me.parkgunwoo.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.parkgunwoo.springbootdeveloper.domain.RefreshToken;
import me.parkgunwoo.springbootdeveloper.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final RefreshTokenRepository refreshTokenRepository;

    public RefreshToken findByRefreshToken(String refreshToken) {
        return refreshTokenRepository.findByRefreshToken(refreshToken)
                .orElseThrow(() -> new IllegalArgumentException("unexpected token"));
    }
}
