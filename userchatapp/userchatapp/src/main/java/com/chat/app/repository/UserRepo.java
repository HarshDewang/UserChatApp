package com.chat.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.chat.app.model.User;



@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	@Query(value = "SELECT userid FROM appuser WHERE comment_to = :comment_to and comment_from = :comment_from", nativeQuery = true)
    String getUserIdByCommentFromAndTo(@Param("comment_to") String comment_to, @Param("comment_from") String comment_from);
	
	@Query(value = "select count(*) from appuser", nativeQuery = true)
	int getNumberOfRecords();
}
