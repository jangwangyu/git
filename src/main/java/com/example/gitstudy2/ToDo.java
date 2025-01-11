package com.example.gitstudy2;

import java.time.ZonedDateTime;
import java.util.Set;

public class ToDo {
    private String title;
    private ZonedDateTime startAt;
    private ZonedDateTime endAt;
    private boolean deleteYn;

    private String description;

    public void update(String title, ZonedDateTime startAt, ZonedDateTime endAt,
                       String description) {
        if(this.deleteYn){
            throw new RuntimeException("이미 삭제된 데이터이기 때문에 값을 업데이트 할 수 없습ㄴ다");
        }
        this.title = title;
        this.startAt = startAt;
        this.endAt = endAt;
        this.description = description;

    }
}
