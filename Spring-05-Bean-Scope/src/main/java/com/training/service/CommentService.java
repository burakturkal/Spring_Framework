package com.training.service;

/*
If a class has a dependency or other classes have dependencies
then we need to add @Component to them. That's the only
way to make dependencies.

We don't add @Component to interfaces (because we can't make objects/beans
from interfacees and also POJO classes.
 */
import com.training.model.Comment;
import com.training.proxy.CommentNotificationProxy;
import com.training.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") // -> Default is singleton. This makes the beans prototype
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Lazy // -> To see this, comment out the main method under DemoApp
public class CommentService {

    /*
    Below is the Dependency Injection
     */
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;
    /*
    We are never going to touch these classes above. That's why we
    used private final because they can't be changed and it's a good
    practice
     */

    @Autowired // -> To make the dependency injection.
               // You don't even need to add this because there is only one constructor
//    public CommentService(CommentRepository commentRepository,
//                          @Qualifier("commentPushNotificationProxy") CommentNotificationProxy commentNotificationProxy) {
    public CommentService(CommentRepository commentRepository,
                          @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        //PUSH is custom made in CommentNotificationProxy class
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;

        System.out.println("EAGER/LAZY INITIATION: This is Eager"); //-> Comment Scopes on this class to make this work
    }

    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}

/*
@Qualifier is to choose a class other than @Primary
 */
