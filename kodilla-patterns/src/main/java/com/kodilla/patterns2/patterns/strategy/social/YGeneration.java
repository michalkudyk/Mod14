package com.kodilla.patterns2.patterns.strategy.social;

public class YGeneration extends User {

    public YGeneration(String name) {
        super(name);
        super.publisher = new FacebookPublisher();
    }
}
