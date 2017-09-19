
package javap;
import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="studentdata.acedmic_record")
public class Acedemic_record implements Serializable {
 String   user_name;
String  sem;
String session;
float marks_obtnd;
int max_mrks;
String resul;
int division;
String grade;
String due_paper;
String remarks;
int s_no;

    public Acedemic_record() {
        this.sem ="-";
        this.session ="-";
        this.marks_obtnd =0.0f;
        this.max_mrks =0;
        this.resul ="-";
        this.division =0;
        this.grade ="-";
        this.due_paper ="-";
        this.remarks ="-";
    }

    public Acedemic_record(int s_no,String user_name, String sem,String session,float marks_obtnd, int max_mrks, String resul, int division, String grade, String due_paper, String remarks) {
        this.user_name = user_name;
        this.s_no=s_no;
        this.sem = sem;
        this.session = session;
        this.marks_obtnd = marks_obtnd;
        this.max_mrks = max_mrks;
        this.resul = resul;
        this.division = division;
        this.grade = grade;
        this.due_paper = due_paper;
        this.remarks = remarks;
    }
    @Id
  
@Column(name="s_no")
    public int getS_no() {
        return s_no;
    }

    public void setS_no(int s_no) {
        this.s_no = s_no;
    }
    
    @Column(name="user_name")
     public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    @Column(name="division")
    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }
    @Column(name="due_paper")
    public String getDue_paper() {
        return due_paper;
    }

    public void setDue_paper(String due_paper) {
        this.due_paper = due_paper;
    }
    @Column(name="grade")
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    @Column(name="marks_obtnd")
    public float getMarks_obtnd() {
        return marks_obtnd;
    }

    public void setMarks_obtnd(float marks_obtnd) {
        this.marks_obtnd = marks_obtnd;
    }
    @Column(name="max_mrks")
    public int getMax_mrks() {
        return max_mrks;
    }

    public void setMax_mrks(int max_mrks) {
        this.max_mrks = max_mrks;
    }
     @Column(name="remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    @Column(name="resul")
    public String getResul() {
        return resul;
    }

    public void setResul(String resul) {
        this.resul = resul;
    }
    @Column(name="sem")
    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }
    @Column(name="session")
    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

}
