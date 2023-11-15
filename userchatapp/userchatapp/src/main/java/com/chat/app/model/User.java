package com.chat.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="appuser")
public class User {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="userid",nullable = false, unique = true)
	 private Integer user_id;
	 
	 
	 @NotBlank(message = "User name must not be blank")
	 @Pattern(regexp = "^[a-zA-Z]+$", message = "User name should not contain special characters or numbers")
     @Column(name="comment_from", nullable = false, length = 25)
	 private String comment_from;
     
	 
	 @NotBlank(message = "User name must not be blank")
	 @Pattern(regexp = "^[a-zA-Z]+$", message = "User name should not contain special characters or numbers")
     @Column(name="comment_to" ,nullable = false, length = 25)
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

	public User(String comment_from, String comment_to) {
		super();
		this.comment_from = comment_from;
		this.comment_to = comment_to;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name="  + ", comment_from=" + comment_from
				+ ", comment_to=" + comment_to + "]";
	}    
}