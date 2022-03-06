package com.training;

import com.training.model.Comment;
import com.training.service.CommentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TrainingApplication {

    public static void main(String[] args) {


        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = SpringApplication.run(TrainingApplication.class, args);
        // We wont write the left part of the equation in real life application
        CommentService cs = context.getBean(CommentService.class);

        cs.publishComment(comment);
    }

}
