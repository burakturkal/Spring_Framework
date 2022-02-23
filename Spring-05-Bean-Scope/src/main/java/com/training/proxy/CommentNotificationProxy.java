package com.training.proxy;

import com.training.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
