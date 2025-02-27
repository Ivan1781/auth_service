package de.music.auth.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
public class HealthChecker {

    @GetMapping("/health")
    public String publicEndpoint() {
        return "{\"Hello\":\"me\"}";
    }
}
