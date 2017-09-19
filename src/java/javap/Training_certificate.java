
package javap;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import org.hibernate.annotations.ForeignKey;
@Entity
@Table(name="studentdata.training_and_certification_details")
public class Training_certificate implements Serializable {
String user_name;
Date date;
String course_and_certification_name;
String company;
float marks_obtained;
float max_marks;
float marks_percentage;
String grade;
int total_attendance;
int attendance;
String pass;
String remark;
int s_no;
    public Training_certificate() {
        this.course_and_certification_name ="-";
        this.company ="-";
        this.marks_obtained =0.0f;
        this.max_marks =0;
        this.marks_percentage =0.0f;
        this.grade ="-";
        this.total_attendance =0;
        this.attendance =0;
        this.pass ="-";
        this.remark ="-";
    }

    public Training_certificate(int s_no,String user_name, Date date, String course_and_certification_name, String company,float marks_obtained, float max_marks, float marks_percentage, String grade, int total_attendance, int attendance, String pass, String remark) {
        this.user_name = user_name;
        this.date = date;
        this.course_and_certification_name = course_and_certification_name;
        this.company = company;
        this.marks_obtained = marks_obtained;
        this.max_marks = max_marks;
        this.marks_percentage = marks_percentage;
        this.grade = grade;
        this.total_attendance = total_attendance;
        this.attendance = attendance;
        this.pass = pass;
        this.remark = remark;
        this.s_no=s_no;
    }
 @Column(name="attendance")
    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }
  @Column(name="company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
      @Column(name="course_and_certification_name")
    public String getCourse_and_certification_name() {
        return course_and_certification_name;
    }

    public void setCourse_and_certification_name(String course_and_certification_name) {
        this.course_and_certification_name = course_and_certification_name;
    }
     @Column(name="date")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
     @Column(name="grade")
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
   @Column(name="marks_obtained")
    public float getMarks_obtained() {
        return marks_obtained;
    }

    public void setMarks_obtained(float marks_obtained) {
        this.marks_obtained = marks_obtained;
    }
       @Column(name="marks_percentage")
    public float getMarks_percentage() {
        return marks_percentage;
    }

    public void setMarks_percentage(float marks_percentage) {
        this.marks_percentage = marks_percentage;
    }
          @Column(name="max_marks")
    public float getMax_marks() {
        return max_marks;
    }

    public void setMax_marks(float max_marks) {
        this.max_marks = max_marks;
    }
       @Column(name="pass")
    public String getPass() {
        return pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
       @Column(name="remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    @Column(name="user_name")
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
           @Column(name="total_attendance")
    public int getTotal_attendance() {
        return total_attendance;
    }

    public void setTotal_attendance(int total_attendance) {
        this.total_attendance = total_attendance;
    }
      @Id
      
       @Column(name="s_no")
    public int getS_no() {
        return s_no;
    }

    public void setS_no(int s_no) {
        this.s_no = s_no;
    }
    



}
