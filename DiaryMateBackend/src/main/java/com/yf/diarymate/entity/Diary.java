package com.yf.diarymate.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "diaries")
public class Diary {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int diaryId;

    @Column(name = "diary_text")
    private String diarytext;

    @Column(name = "result")
    private String result;

    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

	public int getDiaryId() {
		return diaryId;
	}

	public void setDiaryId(int diaryId) {
		this.diaryId = diaryId;
	}

	public String getDiarytext() {
		return diarytext;
	}

	public void setDiarytext(String diarytext) {
		this.diarytext = diarytext;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}