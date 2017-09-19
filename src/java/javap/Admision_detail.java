
package javap;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name="studentdata.admission_detail")
public class Admision_detail implements Serializable {
    String user_name;
    String course;
String admitted_branch;
int admitted_sem;
int admitted_session;
Date admission_date;
String entrance_exam_name;
int max_marks;
float marks_obtained;
float percentage;
float percentile;
double all_india_rank;
String admission_quota;
double quota_rank;
String type_of_admission;
int year;

    public Admision_detail() {
        this.course =" ";
        this.admitted_branch =" ";
        this.admitted_sem =0;
        this.admitted_session =0;
        
        this.entrance_exam_name =" ";
        this.max_marks =0;
        this.marks_obtained =0.0f;
        this.percentage =0.0f;
        this.percentile =0.0f;
        this.all_india_rank =0;
        this.admission_quota =" ";
        this.quota_rank =0;
        this.type_of_admission =" ";
        
    }

    public Admision_detail(String user_name, String course, String admitted_branch, int admitted_sem, int admitted_session, Date admission_date, String entrance_exam_name, int max_marks, int marks_obtained, float percentage, float percentile, double all_india_rank, String admission_quota, double quota_rank, String type_of_admission, int year) {
        this.user_name = user_name;
        this.course = course;
        this.admitted_branch = admitted_branch;
        this.admitted_sem = admitted_sem;
        this.admitted_session = admitted_session;
        this.admission_date = admission_date;
        this.entrance_exam_name = entrance_exam_name;
        this.max_marks = max_marks;
        this.marks_obtained = marks_obtained;
        this.percentage = percentage;
        this.percentile = percentile;
        this.all_india_rank = all_india_rank;
        this.admission_quota = admission_quota;
        this.quota_rank = quota_rank;
        this.type_of_admission = type_of_admission;
        this.year = year;
    }
    @Id
     @Column(name="user_name")
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

   
    @Column(name="admission_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getAdmission_date() {
        return admission_date;
    }

    public void setAdmission_date(Date admission_date) {
        this.admission_date = admission_date;
    }
     @Column(name="admission_quota")
    public String getAdmission_quota() {
        return admission_quota;
    }

    public void setAdmission_quota(String admission_quota) {
        this.admission_quota = admission_quota;
    }
    @Column(name="admitted_branch")
    public String getAdmitted_branch() {
        return admitted_branch;
    }

    public void setAdmitted_branch(String admitted_branch) {
        this.admitted_branch = admitted_branch;
    }
    @Column(name="admitted_sem")
    public int getAdmitted_sem() {
        return admitted_sem;
    }

    public void setAdmitted_sem(int admitted_sem) {
        this.admitted_sem = admitted_sem;
    }
    @Column(name="admitted_session")
    public int getAdmitted_session() {
        return admitted_session;
    }

    public void setAdmitted_session(int admitted_session) {
        this.admitted_session = admitted_session;
    }
    @Column(name="all_india_rank")
    public double getAll_india_rank() {
        return all_india_rank;
    }

    public void setAll_india_rank(double all_india_rank) {
        this.all_india_rank = all_india_rank;
    }
     @Column(name="course")
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
     @Column(name="entrance_exam_name")
    public String getEntrance_exam_name() {
        return entrance_exam_name;
    }

    public void setEntrance_exam_name(String entrance_exam_name) {
        this.entrance_exam_name = entrance_exam_name;
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
     @Column(name="percentage")
    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
     @Column(name="percentile")
    public float getPercentile() {
        return percentile;
    }

    public void setPercentile(float percentile) {
        this.percentile = percentile;
    }
     @Column(name="quota_rank")
    public double getQuota_rank() {
        return quota_rank;
    }

    public void setQuota_rank(double quota_rank) {
        this.quota_rank = quota_rank;
    }
    @Column(name="type_of_admission")
    public String getType_of_admission() {
        return type_of_admission;
    }

    public void setType_of_admission(String type_of_admission) {
        this.type_of_admission = type_of_admission;
    }
     @Column(name="year")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
