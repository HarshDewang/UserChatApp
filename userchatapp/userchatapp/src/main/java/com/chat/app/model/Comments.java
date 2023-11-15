package com.chat.app.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="comments")
public class Comments {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="comment_id",nullable = false, unique = true)
    private Integer comment_id;
	
	
	@NotBlank(message = "Message must not be blank")
	@Column(name="message", nullable = false, length = 255)
    private String message;
    
    @Column(name="datetime", nullable = false)
    private Date comment_date_time;
    
    @Column(name="posted_by", nullable = false)
    private int posted_by_user_id;

    
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

	public int getPosted_by_user_id() {
		return posted_by_user_id;
	}

	public void setPosted_by_user_id(Integer posted_by_user_id) {
		this.posted_by_user_id = posted_by_user_id;
	}

	public Comments(String message, Date comment_date_time, int posted_by_user_id) {
		super();
		this.message = message;
		this.comment_date_time = comment_date_time;
		this.posted_by_user_id = posted_by_user_id;
	}

	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Comments [comment_id=" + comment_id + ", message=" + message + ", comment_date_time="
				+ comment_date_time + ", posted_by_user_id=" + posted_by_user_id + "]";
	}
    
    
    
    
    
}
