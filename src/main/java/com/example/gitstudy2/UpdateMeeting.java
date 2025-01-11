package com.example.gitstudy2;

import java.time.ZonedDateTime;
import java.util.Set;

public class UpdateMeeting extends AbstractAuditableEvent{
    private String meetingRoom;
    private String agenda;
    private Set<String> participants;

    UpdateMeeting(String meetingRoom, String agenda, Set<String> participants,
                  String title, ZonedDateTime startAt, ZonedDateTime endAt) {
        super(title, startAt, endAt);
        this.meetingRoom = meetingRoom;
        this.agenda = agenda;
        this.participants = participants;

    }

    public String getMeetingRoom() {
        return meetingRoom;
    }

    public String getAgenda() {
        return agenda;
    }

    public Set<String> getParticipants() {
        return participants;
    }
}
