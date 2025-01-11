package com.example.gitstudy2;

import java.time.ZonedDateTime;
import java.util.Set;

public class Meeting extends AbstractEvent{
    private String meetingRoom;
    private String agenda;
    private Set<String> participants;

    public void update(String title, ZonedDateTime startAt, ZonedDateTime endAt,
                       String meetingRoom, String agenda, Set<String> participants) {
        if(this.deleteYn){
            throw new RuntimeException("이미 삭제된 데이터이기 때문에 값을 업데이트 할 수 없습ㄴ다");
        }

        this.meetingRoom = meetingRoom;
        this.agenda = agenda;
        this.participants = participants;
    }

    @Override
    protected void update(AbstractAuditableEvent event) {
        UpdateMeeting meeting = (UpdateMeeting) event;
        this.participants = meeting.getParticipants();
        this.meetingRoom = meeting.getMeetingRoom();
        this.agenda = meeting.getAgenda();
    }
}
