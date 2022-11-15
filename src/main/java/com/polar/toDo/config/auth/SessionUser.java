package com.polar.toDo.config.auth;

import lombok.Getter;
import lombok.Setter;
import com.polar.toDo.domain.user.User;

import java.io.Serializable;

@Getter
@Setter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String provider;
    private String nickname;

    public User toUser(){
        return User.builder()
                .name(name)
                .email(email)
                .provider(provider)
                .build();
    }
}
