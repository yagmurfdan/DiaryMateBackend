package com.yf.diarymate.api;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.yf.diarymate.entity.Diary;
import com.yf.diarymate.services.abstracts.DiaryService;
import com.yf.diarymate.services.dtos.requests.DiaryCreateRequest;
import com.yf.diarymate.services.dtos.responses.DiaryListResponse;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/diary")
@AllArgsConstructor
@CrossOrigin
public class DiariesController {

	@Autowired
    private DiaryService service;  

    @PostMapping()
    public Diary save(@RequestBody DiaryCreateRequest diaryCreateRequest)
    {
        return this.service.save(diaryCreateRequest);
    }

    @GetMapping("{userId}")
    public List<DiaryListResponse> getDiariesByUserId(@PathVariable int userId)
    {    	
        return this.service.getDiariesByUserId(userId);
    }
}
