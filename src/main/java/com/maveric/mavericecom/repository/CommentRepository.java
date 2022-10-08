package com.maveric.mavericecom.repository;

import com.maveric.mavericecom.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByItemId(Long itemId);
    List<Comment> findAllByCommentedById(Long commentedById);
}
