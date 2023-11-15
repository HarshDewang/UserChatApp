package com.chat.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chat.app.service.CommentsService;

@RestController
@RequestMapping("api/comments/")
public class CommentsController {

	  @Autowired
	    private CommentsService commentService;
	  


	    @PostMapping("/add")
	    public ResponseEntity<String> addComment(
	            @RequestParam String comment_from,
	            @RequestParam String comment_to,
	            @RequestParam String message
	    ) {
	        try {
	            String resonse = commentService.addComments(comment_from, comment_to, message);
	            return ResponseEntity.ok("Comment added successfully");
	        } catch (Exception e) {
	            return ResponseEntity.badRequest().body("Failed to add comment: " + e.getMessage());
	        }
	    }

	    @GetMapping("/messages/{comment_to}")
	    public ResponseEntity<List<String>>getComment(@PathVariable String comment_to) {
	        try {
	            List<String> messages = commentService.getComment(comment_to);
	            return ResponseEntity.ok(messages);
	        } catch (Exception e) {
	            // Handle exceptions and return an appropriate response
	            return ResponseEntity.badRequest().build();
	        }
	    }
	
	}

	

	

