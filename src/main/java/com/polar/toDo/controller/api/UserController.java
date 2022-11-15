package com.polar.toDo.controller.api;

import com.polar.toDo.config.auth.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final HttpSession httpSession;

    @GetMapping("/api/user")
    public SessionUser getUserName(){
        SessionUser user = (SessionUser) httpSession.getAttribute("user");

        if(user == null) throw new UsernameNotFoundException("User is not found!");

        return user;
    }
}
