package com.chat.app.service;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.chat.app.model.Comments;
import com.chat.app.model.User;
import com.chat.app.repository.CommentsRepo;
import com.chat.app.repository.UserRepo;

import jakarta.transaction.Transactional;


@Service
public class CommentsServiceImpl implements CommentsService {
	
	@Autowired
	private CommentsRepo commentsrepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Transactional
	public String addComments(String comment_from,String comment_to,String message) {
		
		String userId = userRepo.getUserIdByCommentFromAndTo(comment_to,comment_from);
		if(userId!=null) {
			int appUserId = Integer.parseInt(userId);
			Date currentDate = new Date();
			Comments comments = new Comments(message,currentDate,appUserId);
			commentsrepo.save(comments);
		} else {
			int count  = userRepo.getNumberOfRecords();
			User user = new User(comment_from,comment_to);
			userRepo.save(user);
			Date currentDate = new Date();
			Comments comments = new Comments(message,currentDate,count+1);
			commentsrepo.save(comments);
		}
		System.out.println("userID : " + userId);
		
		return "added successfully.";
	}
	
     public List<String>  getComment(String comment_to){
    	 return commentsrepo.getComment(comment_to);
     }



	
	}



	

	


