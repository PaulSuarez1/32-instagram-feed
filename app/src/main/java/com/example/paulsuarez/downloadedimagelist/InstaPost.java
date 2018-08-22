package com.example.paulsuarez.downloadedimagelist;

import java.util.ArrayList;
import java.util.List;

public class InstaPost {

    public String author;
    public String imageUrl;
    public String description;

    public InstaPost(String author, String description, String url) {
        this.author = author;
        this.description = description;
        this.imageUrl = url;
    }


}
