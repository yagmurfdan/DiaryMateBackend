package com.yf.diarymate.services.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiaryCreateRequest {

    @NotNull
    @NotBlank
    private String diaryText;

    @NotNull
    @NotBlank
    private String result;

    @NotNull
    @NotBlank
    private int userId;

	public String getDiaryText() {
		return diaryText;
	}

	public void setDiaryText(String diaryText) {
		this.diaryText = diaryText;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
}
