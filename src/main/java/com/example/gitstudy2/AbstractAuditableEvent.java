package com.example.gitstudy2;

import java.time.ZonedDateTime;
import java.util.Set;

public abstract class AbstractAuditableEvent { //값을 업데이트 하기 위한 클래스
    private String title;
    private ZonedDateTime startAt;
    private ZonedDateTime endAt;

    AbstractAuditableEvent(String title, ZonedDateTime startAt, ZonedDateTime endAt) {
        this.title = title;
        this.startAt = startAt;
        this.endAt = endAt;
    }


    public String getTitle() {
        return title;
    }

    public ZonedDateTime getStartAt() {
        return startAt;
    }

    public ZonedDateTime getEndAt() {
        return endAt;
    }


}
