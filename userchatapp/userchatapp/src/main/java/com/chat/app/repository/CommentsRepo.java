package com.chat.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.chat.app.model.Comments;

@EnableJpaRepositories
@Repository
public interface CommentsRepo extends JpaRepository<Comments, Integer> {
    

	@Query(value="SELECT  message FROM  comments WHERE posted_by IN (SELECT userid FROM appuser WHERE comment_to = :comment_to) ",nativeQuery = true)
	public List<String> getComment(@Param("comment_to") String comment_to);
	
	
	


}
