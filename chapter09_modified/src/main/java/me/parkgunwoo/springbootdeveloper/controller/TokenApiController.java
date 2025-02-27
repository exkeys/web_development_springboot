package me.parkgunwoo.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.parkgunwoo.springbootdeveloper.dto.CreateAccessTokenRequest;
import me.parkgunwoo.springbootdeveloper.dto.CreateAccessTokenResponse;
import me.parkgunwoo.springbootdeveloper.service.TokenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TokenApiController {
    private final TokenService tokenService;

    @PostMapping("/api/token")
    public ResponseEntity<CreateAccessTokenResponse> createNewAccessToken
            (@RequestBody CreateAccessTokenRequest request) {
        String newAccessToken = tokenService.createNewAccessToken(request
                .getRefreshToken());

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new CreateAccessTokenResponse(newAccessToken));
    }
    /*
        테스트 코드 작성할겁니다.
     */
}
