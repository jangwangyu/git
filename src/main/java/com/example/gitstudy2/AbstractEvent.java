package com.example.gitstudy2;

import java.time.ZonedDateTime;

public abstract class AbstractEvent {
    private String title;
    private ZonedDateTime startAt;
    private ZonedDateTime endAt;
    protected boolean deleteYn;

    public void validateAndUpdate(AbstractAuditableEvent event){
        if(getDeleteYn()){
            throw new RuntimeException();
        }
        update(event);
        defaultUpdate(event);
    }

    protected abstract void update(AbstractAuditableEvent event);

    private boolean getDeleteYn(){
        return deleteYn;
    }

    private void defaultUpdate(AbstractAuditableEvent event){
        this.title = event.getTitle();
        this.startAt = event.getStartAt();
        this.endAt = event.getEndAt();
    }
}
