package com.reddit.clone.dto;

import com.reddit.clone.model.VoteType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VoteDto {

    private Long postId;
    private VoteType voteType;
}
