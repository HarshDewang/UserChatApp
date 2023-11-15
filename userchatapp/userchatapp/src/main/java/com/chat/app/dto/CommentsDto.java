package com.chat.app.dto;

import java.sql.Date;

public class CommentsDto {
	
	 private Integer comment_id;
	
	 private String message;
	 
	 private Date comment_date_time;
	  
	 private  Integer posted_by_user_id;
	 
	 

	public Integer getComment_id() {
		return comment_id;
	}

	public void setComment_id(Integer comment_id) {
		this.comment_id = comment_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getComment_date_time() {
		return comment_date_time;
	}

	public void setComment_date_time(Date comment_date_time) {
		this.comment_date_time = comment_date_time;
	}

	public Integer getPosted_by_user_id() {
		return posted_by_user_id;
	}

	public void setPosted_by_user_id(Integer posted_by_user_id) {
		this.posted_by_user_id = posted_by_user_id;
	}

	public CommentsDto(Integer comment_id, String message, Date comment_date_time, Integer posted_by_user_id) {
		super();
		this.comment_id = comment_id;
		this.message = message;
		this.comment_date_time = comment_date_time;
		this.posted_by_user_id = posted_by_user_id;
	}

	public CommentsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CommentsDto [comment_id=" + comment_id + ", message=" + message + ", comment_date_time="
				+ comment_date_time + ", posted_by_user_id=" + posted_by_user_id + "]";
	}
	
	
	 
	 
	 

}
