package com.reddit.clone.exceptions;

public class SubredditNotFound extends RuntimeException {
    public SubredditNotFound(String message) {
        super(message);
    }
}
