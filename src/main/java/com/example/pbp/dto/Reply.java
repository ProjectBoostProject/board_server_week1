package com.example.pbp.dto;

import lombok.Data;

@Data
public class Reply {
    private int id;
    private Integer boardId;
    private String writer;
    private String content;
    private String password;
    private String createDate;
}
