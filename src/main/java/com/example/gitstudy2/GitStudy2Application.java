package com.example.gitstudy2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class GitStudy2Application {

    public static void main(String[] args) {
        Meeting meeting = new Meeting();
        Set<String> participants = new HashSet<String>();
        participants.add("danny");
        meeting.validateAndUpdate(new UpdateMeeting(
                "미팅룸 1",
                "책읽기",
                participants,
                "책읽기 스터디",
                ZonedDateTime.now(),
                ZonedDateTime.now()
        ));
    }
}