package com.blog.app.repository;

import com.blog.app.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
List<Comment> findByPostId(Long postId);
}
