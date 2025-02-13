package com.example.layered.dto;

import com.example.layered.entity.Memo;
import lombok.Getter;

@Getter
public class MemoResponseDto {

    private Long id;
    private String title;
    private String contents;

    public MemoResponseDto(Memo memo) {
        this.id = memo.getId();
        this.title = memo.getTitle();
        this.contents = memo.getContents();
    }
}
