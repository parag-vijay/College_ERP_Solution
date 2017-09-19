
package javap;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Entity
@Table(name="studentdata.disciplinary_action")
public class Disciplinary_Action implements Serializable {
  String  user_name;
Date dis_date;
String types;
String particular;
int time_spend;
int S_no;

    public Disciplinary_Action() {
        this.types =" ";
        this.particular =" ";
        this.time_spend =0;
    }

    public Disciplinary_Action(int S_no,String user_name, Date dis_date, String types, String particular, int time_spend) {
        this.user_name = user_name;
        this.dis_date = dis_date;
        this.types = types;
        this.particular = particular;
        this.time_spend = time_spend;
        this.S_no=S_no;
    }
    @Column(name="dis_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDis_date() {
        return dis_date;
    }
    @Id
    @Column(name="s_no")
    public int getS_no() {
        return S_no;
    }

    public void setS_no(int S_no) {
        this.S_no = S_no;
    }
      @Column(name="user_name")
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setDis_date(Date dis_date) {
        this.dis_date = dis_date;
    }
     @Column(name="particular")
    public String getParticular() {
        return particular;
    }

    public void setParticular(String particular) {
        this.particular = particular;
    }

    @Column(name="time_spend")
    public int getTime_spend() {
        return time_spend;
    }

    public void setTime_spend(int time_spend) {
        this.time_spend = time_spend;
    }
     @Column(name="types")
    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }
    
}
