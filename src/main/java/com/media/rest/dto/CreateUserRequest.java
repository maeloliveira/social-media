package com.media.rest.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateUserRequest {
    @NotBlank(message = "Name is Required")
    private String name ;

    @NotNull(message = "Age is Required")
    private Integer age;


    @Override
    public String toString() {
        return "CreateUserRequest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
