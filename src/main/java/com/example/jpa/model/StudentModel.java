package com.example.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentModel {
    @Id
    private int sid;
    private String sname;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    private String course;

    public int getSid() {
        return sid;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
