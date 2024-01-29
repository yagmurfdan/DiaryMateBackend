package com.yf.diarymate.dataAccess;
import org.springframework.data.jpa.repository.JpaRepository;

import com.yf.diarymate.entity.Diary;

import java.util.List;

public interface DiaryRepo extends JpaRepository<Diary,Integer> {
    List<Diary> findByUserId(int id);
}