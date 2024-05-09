package com.sreekar.security.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "TeluskoLearning")
public class Post {
    private String desc;
    private int exp;
    private String profile;
    private String[] techs;
}