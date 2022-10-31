package com.polar.toDo.config.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;


@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final OAuthService oAuthService;

    protected void configure(HttpSecurity http) throws Exception{
        http
                .csrf().disable() // csrf 공격을 막아주는 옵션을 sidable, rest api 같은 경우에는 브라우저를 통해 request 받지않아서 해당 옵션 꺼도됨
                .headers().frameOptions().disable()
                .and()
                .logout().logoutSuccessUrl("/")//로그아웃 요청시 홈으로 이동 - 기본 logout url = "/logout"
                .and()
                .oauth2Login() //OAuth2 로그인 설정 시작점
                .defaultSuccessUrl("/oauth/loginInfo", true) //OAuth2 성공시 redirect
                .userInfoEndpoint()
                .userService(oAuthService); //OAuth2 로그인 성공시 작업을 진행할 서비스
    }

}
