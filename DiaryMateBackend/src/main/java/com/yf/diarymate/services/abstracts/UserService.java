package com.yf.diarymate.services.abstracts;

import com.yf.diarymate.entity.User;
import com.yf.diarymate.services.dtos.requests.UserAuthRequest;

public interface UserService {

    User register(UserAuthRequest user);

    User login(UserAuthRequest user);
}
