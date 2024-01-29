package com.yf.diarymate.services.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAuthRequest {

    @NotNull
    @NotBlank
    private String username;

    @NotNull
    @NotBlank
    private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    /*
    public String getUsername() {
    	return this.username;
    }
    
    public String getPassword() {
    	return this.password;
    }
    */
}