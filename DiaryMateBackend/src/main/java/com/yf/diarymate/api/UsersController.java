package com.yf.diarymate.api;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yf.diarymate.entity.User;
import com.yf.diarymate.services.abstracts.UserService;
import com.yf.diarymate.services.dtos.requests.UserAuthRequest;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
@CrossOrigin
public class UsersController {
	
	@Autowired
    private  UserService service;

    @PostMapping("/register")//burası register işlemini yapan controller methodu
    public User register(@RequestBody UserAuthRequest user)
    {
        return this.service.register(user);
    }

    @PostMapping("/login")//burası login işlemini yapan controller methodu
    public User login(@RequestBody UserAuthRequest user)
    {
        User userLogin = this.service.login(user);
        if(userLogin != null){
            return userLogin;
        }else{
            return null;
        }
    }

}
