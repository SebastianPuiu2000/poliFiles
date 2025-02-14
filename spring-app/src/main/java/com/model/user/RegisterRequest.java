package com.model.user;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterRequest {

    @JsonProperty(required = true)
    private String email;

    @JsonProperty(required = true)
    private String username;

    @JsonProperty(required = true)
    private String password;

    public RegisterRequest() {}

    @JsonCreator
    public RegisterRequest(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }
}
