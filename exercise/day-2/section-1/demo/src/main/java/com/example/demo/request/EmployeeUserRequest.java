package com.example.demo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class CreateUserRequest {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

}
