package com.example.meeting.repository;

import com.example.meeting.bean.meetingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeetingRoomRepository extends JpaRepository<meetingRoom,Integer> {
    List<meetingRoom> findAll();
    void deleteByRoomId(int id);
}

