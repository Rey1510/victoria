package com.example.My_Everything.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Getter
@Setter
public class DeleteResponse {
    private String message;

    private ArrayList<CreateTaskResponse> tasks;

    public DeleteResponse(String message, ArrayList<CreateTaskResponse> tasks) {
        this.message = message;
        this.tasks = tasks;
    }
}
