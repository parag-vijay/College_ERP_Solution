
package javap;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="timetable.timetable")
public class TimeTable implements Serializable {
    int s_no;
     String time;
    String day;
    String sem;
    String subcode;
    String faculty_name;
    String room_no;
    String user_name;
    String class1;
    public TimeTable() {
        
    }

    public TimeTable(String class1,String user_name,int s_no, String time, String day, String sem, String subcode, String faculty_name, String room_no) {
        this.s_no = s_no;
        this.time = time;
        this.day = day;
        this.sem = sem;
        this.subcode = subcode;
        this.faculty_name = faculty_name;
        this.room_no = room_no;
        this.user_name=user_name;
        this.class1=class1;
    }
    @Column(name="class1")
    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }
    
    @Column(name="user_name")
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    
     @Column(name="faculty_name")
    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }
    @Column(name="room_no")
    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }
    @Column(name="dday")
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
   @Column(name="sno")
    @Id
    public int getS_no() {
        return s_no;
    }

    public void setS_no(int s_no) {
        this.s_no = s_no;
    }
     @Column(name="sem")
    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }
    @Column(name="subcode")
    public String getSubcode() {
        return subcode;
    }

    public void setSubcode(String subcode) {
        this.subcode = subcode;
    }
     @Column(name="ttime")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
    
}
