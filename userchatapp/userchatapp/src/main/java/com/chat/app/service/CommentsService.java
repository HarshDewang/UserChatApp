package com.chat.app.service;

import java.util.List;

public interface CommentsService {

	String addComments(String comment_from, String comment_to, String message);
    
	 public List<String>  getComment(String comment_to);
	
}
