package com.yf.diarymate.services.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiaryListResponse {

    private String diaryText;
    private String result;
    private String userUsername;
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
	public String getUserUsername() {
		return userUsername;
	}
	public void setUserUsername(String userUsername) {
		this.userUsername = userUsername;
	}

}