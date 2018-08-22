package com.example.paulsuarez.downloadedimagelist;

import java.util.ArrayList;
import java.util.List;

public class InstaData {

    public static final List<InstaPost> slothprovider = new ArrayList<>();
    static {
        slothprovider.add(new InstaPost("name", "title", "img"));
        slothprovider.add(new InstaPost("name", "title", "img"));
        slothprovider.add(new InstaPost("name", "title", "img"));
    }
}
