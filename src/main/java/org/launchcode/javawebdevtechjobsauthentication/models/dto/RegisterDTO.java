package org.launchcode.javawebdevtechjobsauthentication.models.dto;

import javax.validation.constraints.NotNull;

public class RegisterDTO extends LoginDTO{

    @NotNull
    private String verifyPassword;

    public RegisterDTO() {}

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
