package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginDTO {

    @NotNull
    @NotBlank
    @Size(min=5, max=20, message = "Invalid username")
    private String username;

    @NotNull
    @NotBlank
    @Size(min=5, max=20, message="Invalid password")
    private String password;

    public LoginDTO() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
