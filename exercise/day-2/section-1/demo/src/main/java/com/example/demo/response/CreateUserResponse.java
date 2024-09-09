package com.example.demo.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Builder;
import lombok.Setter;

@Builder
@Setter
@Getter
public class CreateUserResponse {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

}
