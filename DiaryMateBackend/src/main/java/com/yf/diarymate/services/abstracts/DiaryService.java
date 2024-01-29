package com.yf.diarymate.services.abstracts;

import java.util.List;

import com.yf.diarymate.entity.Diary;
import com.yf.diarymate.services.dtos.requests.DiaryCreateRequest;
import com.yf.diarymate.services.dtos.responses.DiaryListResponse;

public interface DiaryService {

    Diary save(DiaryCreateRequest diaryCreateRequest);

    List<DiaryListResponse> getDiariesByUserId(int id);
}