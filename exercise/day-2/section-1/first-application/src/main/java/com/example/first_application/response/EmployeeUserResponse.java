package com.example.first_application.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Builder
@Setter
@Getter
public class EmployeeUserResponse {
    @JsonProperty("id")
    private Long id;

    @JsonProperty(value = "name", required = true)
    private String name;

    @JsonProperty("age")
    private Integer age;

    @JsonProperty(value = "address", required = false, defaultValue = "nul")
    private String address;

    @JsonProperty("phone")
    private String phone;
}
