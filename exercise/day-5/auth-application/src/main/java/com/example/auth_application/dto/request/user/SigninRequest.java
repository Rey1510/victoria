package com.example.auth_application.dto.request.user;




import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SigninRequest {

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;


}
