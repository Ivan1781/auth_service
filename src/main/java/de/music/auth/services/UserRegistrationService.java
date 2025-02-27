package de.music.auth.services;

import de.music.auth.dto.RegistrationRequest;
import de.music.auth.model.AppUser;
import de.music.auth.repository.UserMusRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {
    private final UserMusRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserRegistrationService(UserMusRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public AppUser registerUser(RegistrationRequest request) {

        if (userRepository.findByUsername(request.getUsername()).isPresent()) {
            throw new IllegalArgumentException("Username already exists");
        }
        System.out.println("Username already exists");
        AppUser appUser = new AppUser();
        appUser.setUsername(request.getUsername());
        appUser.setPassword(passwordEncoder.encode(request.getPassword()));
        return userRepository.save(appUser);
    }
}
