package com.example.auth_application.dto.response.user;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SigninResponse {

    @JsonProperty("token")
    private String token;


}
