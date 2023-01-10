package com.example.demo.user.domain;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer userId;
    private String emailId;
    private String password;
    private String firstName;
    private String lastName;
}
