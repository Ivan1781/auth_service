package de.music.auth.controllers;

import de.music.auth.dto.RegistrationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
public class HealthChecker {

    @GetMapping("/health")
    public String publicEndpoint() {
        return "{\"Hello\":\"me\"}";
    }

    @PostMapping("/notes")
    public ResponseEntity<String> getNotes(@RequestBody String request) {
        System.out.println(request);
        return ResponseEntity.ok("The data was successfully received");
    }
}
