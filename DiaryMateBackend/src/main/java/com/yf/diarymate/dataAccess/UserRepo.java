package com.yf.diarymate.dataAccess;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yf.diarymate.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findByUsernameAndPassword(String username, String password);

}
