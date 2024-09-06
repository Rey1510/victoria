package com.example.first_application.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import jdk.jshell.Snippet;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class GetAssetResponse {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("full_name")
    private String fullName;

    @JsonProperty("age")
    private int age;

    @JsonProperty("Address")
    private String address;

}
