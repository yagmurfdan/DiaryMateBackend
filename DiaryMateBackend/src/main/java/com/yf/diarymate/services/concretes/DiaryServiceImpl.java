package com.yf.diarymate.services.concretes;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yf.diarymate.core.utilites.ModelMapperService;
import com.yf.diarymate.dataAccess.DiaryRepo;
import com.yf.diarymate.entity.Diary;
import com.yf.diarymate.services.abstracts.DiaryService;
import com.yf.diarymate.services.dtos.requests.DiaryCreateRequest;
import com.yf.diarymate.services.dtos.responses.DiaryListResponse;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class DiaryServiceImpl implements DiaryService {
	
	@Autowired
    private  ModelMapperService mapperService;
	@Autowired
    private  DiaryRepo repo;

    @Override
    public Diary save(DiaryCreateRequest diaryCreateRequest) {
        Diary diary = this.mapperService.forRequest().map(diaryCreateRequest, Diary.class);
        return this.repo.save(diary);
    }

    @Override
    public List<DiaryListResponse> getDiariesByUserId(int id) {
        List<Diary> diaries = this.repo.findByUserId(id);
        List<DiaryListResponse> response
                = diaries.stream().map(diary -> this.mapperService.forResponse().map(diary, DiaryListResponse.class))
                .collect(Collectors.toList());
        return response;
    }

}