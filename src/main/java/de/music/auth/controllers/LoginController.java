package de.music.auth.controllers;

import de.music.auth.dto.RegistrationRequest;
import de.music.auth.services.UserRegistrationService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    private final UserRegistrationService userService;

    public LoginController(UserRegistrationService userService) {
        this.userService = userService;
    }

    @PostMapping( value = "/health", consumes = "application/json")
    public ResponseEntity<String> login() {
        return ResponseEntity.ok("User login successfully");
    }
}
