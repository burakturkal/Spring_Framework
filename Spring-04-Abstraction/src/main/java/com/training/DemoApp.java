package com.training;

import com.training.config.ProjectConfig;
import com.training.model.Comment;
import com.training.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
This is the Runner Class, meaning the one that has main menthod.
This is supposed to be under main package.
 */
public class DemoApp {

    public static void main(String[] args) {

        //Let's make a new comment to test
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        //Let's make the container
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //Let's publish the comment publishComment(), but also implement the requirements

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

    }
}
