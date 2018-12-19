package com.example.meeting.controller;

import com.example.meeting.bean.meetingRoom;
import com.example.meeting.repository.MeetingRoomRepository;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.transaction.Transactional;
import java.util.List;

@RestController
public class MeetingRoom {
    @Autowired
    private MeetingRoomRepository meetingRoomDao;

    @Transactional
    @PostMapping("/api/meetingRoom/add")
    public String addMeetingRoom(@RequestBody meetingRoom room){
        try {
            room.setRoomIsOpen(true);
            meetingRoomDao.save(room);
            return "insert success";
        }catch(Exception e){
            return "insert failed";
        }


    }

    @Transactional
    @GetMapping("/api/meetingRoom/get")
    public List<meetingRoom> getMeetingRoom(){
        try {
            List<meetingRoom> rooms=meetingRoomDao.findAll();
            return rooms;
        }catch(Exception e){
             throw e;
        }


    }

    @Transactional
    @PostMapping("/api/meetingRoom/delete")
    public String deleteMeetingRoom(@RequestBody JSONObject obj){
        try {
            meetingRoomDao.deleteByRoomId(obj.getInt("id"));
            return "delete success";
        }catch(Exception e){
            throw e;
        }


    }

}
