package com.example.first_application.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Builder
@Setter
@Getter
public class EmployeeUserRequest {

    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    @JsonProperty(value = "address", required = false, defaultValue = "null")
    private String address;

    @JsonProperty("phone")
    private String phone;
}
