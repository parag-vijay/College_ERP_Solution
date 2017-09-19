
package javap;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="previous_qualification")
public class Previous_qualification implements Serializable {
    
String user_name;
String exam_name;
String roll_no;
String university_board;
String school_name_city;
String medium;
int year_of_passing;
int max_marks;
float marks_obtained;
String division;
String grade_percent;
int s_no;

    public Previous_qualification() {
        
        this.exam_name =" ";
        this.roll_no =" ";
        this.university_board =" ";
        this.school_name_city =" ";
        this.medium =" ";
        this.year_of_passing =0;
        this.max_marks =0;
        this.marks_obtained =0.0f ;
        this.division =" ";
        this.grade_percent =" ";
    }

    public Previous_qualification(int s_no,String user_name, String exam_name, String roll_no, String university_board, String school_name_city, String medium, int year_of_passing, int max_marks,float marks_obtained, String division, String grade_percent) {
        this.user_name = user_name;
        this.exam_name = exam_name;
        this.roll_no = roll_no;
        this.university_board = university_board;
        this.school_name_city = school_name_city;
        this.medium = medium;
        this.year_of_passing = year_of_passing;
        this.max_marks = max_marks;
        this.marks_obtained = marks_obtained;
        this.division = division;
        this.grade_percent = grade_percent;
        this.s_no=s_no;
    }
    @Id
    @Column(name="s_no")
    public int getS_no() {
        return s_no;
    }

    public void setS_no(int s_no) {
        this.s_no = s_no;
    }
    
    @Column(name="division")
    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    @Column(name="exam_name")
    public String getExam_name() {
        return exam_name;
    }

    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }
     @Column(name="grade_percent")
    public String getGrade_percent() {
        return grade_percent;
    }

    public void setGrade_percent(String grade_percent) {
        this.grade_percent = grade_percent;
    }
     @Column(name="marks_obtained")
    public float getMarks_obtained() {
        return marks_obtained;
    }

    public void setMarks_obtained(float marks_obtained) {
        this.marks_obtained = marks_obtained;
    }
     @Column(name="max_marks")
    public int getMax_marks() {
        return max_marks;
    }

    public void setMax_marks(int max_marks) {
        this.max_marks = max_marks;
    }
      @Column(name="medium")
    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }
     
     @Column(name="roll_no")
    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }
    
    @Column(name="user_name")
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
     @Column(name="school_name_city")
    public String getSchool_name_city() {
        return school_name_city;
    }

    public void setSchool_name_city(String school_name_city) {
        this.school_name_city = school_name_city;
    }
      @Column(name="university_board")
    public String getUniversity_board() {
        return university_board;
    }

    public void setUniversity_board(String university_board) {
        this.university_board = university_board;
    }
     @Column(name="year_of_passing")
    public int getYear_of_passing() {
        return year_of_passing;
    }

    public void setYear_of_passing(int year_of_passing) {
        this.year_of_passing = year_of_passing;
    }



}
