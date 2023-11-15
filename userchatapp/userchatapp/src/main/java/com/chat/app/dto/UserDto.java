package com.chat.app.dto;

public class UserDto {
	
	 private Integer user_id;
	 
   	private String comment_from;
     
	 private String comment_to;
	 
	 
	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
	

	public String getComment_from() {
		return comment_from;
	}

	public void setComment_from(String comment_from) {
		this.comment_from = comment_from;
	}

	public String getComment_to() {
		return comment_to;
	}

	public void setComment_to(String comment_to) {
		this.comment_to = comment_to;
	}

	public UserDto(Integer user_id,String user_name, String comment_from, String comment_to) {
		super();
		this.user_id = user_id;
		
		this.comment_from = comment_from;
		this.comment_to = comment_to;
	}

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserDto [user_id=" + user_id + ", user_name=" + ", comment_from=" + comment_from
				+ ", comment_to=" + comment_to + "]";
	}


	

	 
	 
	 
}
