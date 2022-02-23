package com.training.repository;

import com.training.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
