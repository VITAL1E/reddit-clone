package com.reddit.clone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostRequest {

    private Long postId;
    private String url;
    private String postName;
    private String description;
    private String subredditName;
}
