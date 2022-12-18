package com.unipi.msc.HouseFindingBack.Controller.Auth.Requests;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AuthenticationSignUpRequest {
    private String email;
    private String password;
    private String name;
    private String phone;
}
