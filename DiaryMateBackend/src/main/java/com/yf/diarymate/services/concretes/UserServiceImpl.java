package com.yf.diarymate.services.concretes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yf.diarymate.core.utilites.ModelMapperService;
import com.yf.diarymate.dataAccess.UserRepo;
import com.yf.diarymate.entity.User;
import com.yf.diarymate.services.abstracts.UserService;
import com.yf.diarymate.services.dtos.requests.UserAuthRequest;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	@Autowired
	private  UserRepo repo;
	@Autowired
	private  ModelMapperService mapperService;

	@Override
	public User register(UserAuthRequest user) {
		User userRegister = this.mapperService.forRequest().map(user, User.class);
		return this.repo.save(userRegister);
	}

	@Override
	public User login(UserAuthRequest user) {
		Optional<User> userLogin = this.repo.findByUsernameAndPassword(user.getUsername(),user.getPassword());
		if (userLogin.isPresent()) {
			return userLogin.get();
		} else {
			return null;
		}
	}
}