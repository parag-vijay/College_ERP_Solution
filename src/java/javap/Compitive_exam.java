
package javap;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="studentdata.compititive_exam")
public class Compitive_exam implements Serializable {
 String   user_name;
Date date;
String exam_name;
String type;
float marks_obtnd;
int max_marks;
float percentage;
int rank;
String quota_name;
int quota_rank;
String remark;
int s_no;

    public Compitive_exam() {
        this.exam_name ="-";
        this.type ="-";
        this.marks_obtnd =0.0f;
        this.max_marks =0;
        this.percentage =0.0f;
        this.rank =0;
        this.quota_name ="-";
        this.quota_rank =0;
        this.remark ="-";
    }

    public Compitive_exam(int s_no,String user_name, Date date, String exam_name, String type,float marks_obtnd, int max_marks, float percentage, int rank, String quota_name, int quota_rank, String remark) {
        this.user_name = user_name;
        this.date = date;
        this.exam_name = exam_name;
        this.type = type;
        this.marks_obtnd = marks_obtnd;
        this.max_marks = max_marks;
        this.percentage = percentage;
        this.rank = rank;
        this.quota_name = quota_name;
        this.quota_rank = quota_rank;
        this.remark = remark;
        this.s_no=s_no;
    }
    @Column(name="date")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDate() {
        return date;
    }
     @Id
     @Column(name="s_no")
    public int getS_no() {
        return s_no;
    }

    public void setS_no(int s_no) {
        this.s_no = s_no;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    @Column(name="exam_name")
    public String getExam_name() {
        return exam_name;
    }

    public void setExam_name(String exam_name) {
        this.exam_name = exam_name;
    }
     @Column(name="marks_obtnd")
    public float getMarks_obtnd() {
        return marks_obtnd;
    }

    public void setMarks_obtnd(float marks_obtnd) {
        this.marks_obtnd = marks_obtnd;
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
     @Column(name="quota_name")
    public String getQuota_name() {
        return quota_name;
    }

    public void setQuota_name(String quota_name) {
        this.quota_name = quota_name;
    }
     @Column(name="quota_rank")
    public int getQuota_rank() {
        return quota_rank;
    }

    public void setQuota_rank(int quota_rank) {
        this.quota_rank = quota_rank;
    }
     @Column(name="rank")
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
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
      @Column(name="type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}
