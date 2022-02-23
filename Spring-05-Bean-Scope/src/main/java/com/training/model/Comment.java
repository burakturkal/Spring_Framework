package com.training.model;

import lombok.Data;

@Data
public class Comment {

    private String author;
    private String text;
}

/*
We don't add @Component because this is a basic class, POJO class.

 */