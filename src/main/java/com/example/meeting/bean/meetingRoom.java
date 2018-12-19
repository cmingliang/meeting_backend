package com.example.meeting.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "meeting_room")
public class meetingRoom {
        @Id
        @GeneratedValue
        private Integer roomId;

        private String roomName;

        private Integer capacity;

        private Boolean roomIsOpen ;

        private Integer managerId;

        private String location;

        private String equipments;

        public meetingRoom(){
            super();
        }

        public meetingRoom(Integer roomId,String roomName, Integer capacity, Boolean roomIsOpen, Integer managerId) {
            this.roomId=roomId;
            this.roomName = roomName;
            this.capacity = capacity;
            this.roomIsOpen = roomIsOpen;
            this.managerId = managerId;
        }
        public Integer getRoomId() {
            return roomId;
        }

        public void setRoomId(Integer roomId) {
            this.roomId = roomId;
        }

        public String getRoomName() {
            return roomName;
        }

        public void setRoomName(String roomName) {
            this.roomName = roomName;
        }

        public Integer getCapacity() {
            return capacity;
        }

        public void setCapacity(Integer capacity) {
            this.capacity = capacity;
        }

        public Boolean getRoomIsOpen() {
            return roomIsOpen;
        }

        public void setRoomIsOpen(Boolean roomIsOpen) {
            this.roomIsOpen = roomIsOpen;
        }

        public Integer getManagerId() {
            return managerId;
        }

        public void setManagerId(Integer managerId) {
            this.managerId = managerId;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getEquipments() {
            return equipments;
        }

        public void setEquipments(String equipments) {
            this.equipments = equipments;
        }
}
