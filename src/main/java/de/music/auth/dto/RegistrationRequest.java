package de.music.auth.dto;

import lombok.Data;

@Data
public class RegistrationRequest {

    private String username;
    private String password;

}
