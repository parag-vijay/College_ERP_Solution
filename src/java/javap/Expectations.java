
package javap;

import javax.persistence.*;
import java.io.Serializable;
import org.hibernate.annotations.ForeignKey;
@Entity
@Table(name="studentdata.expectations")
public class Expectations implements Serializable {
 String  exp_frm_colg;
String exp_frm_dept;
String exp_frm_mentr;
String actn_planed;
String username;
    public Expectations() {
    }

    public Expectations(String exp_frm_colg, String exp_frm_dept, String exp_frm_mentr, String actn_planed,String username) {
        this.exp_frm_colg = exp_frm_colg;
        this.exp_frm_dept = exp_frm_dept;
        this.exp_frm_mentr = exp_frm_mentr;
        this.actn_planed = actn_planed;
        this.username=username;
    }
    @Column(name="actn_planed")
    public String getActn_planed() {
        return actn_planed;
    }

    public void setActn_planed(String actn_planed) {
        this.actn_planed = actn_planed;
    }
@Column(name="exp_frm_colg")
    public String getExp_frm_colg() {
        return exp_frm_colg;
    }

    public void setExp_frm_colg(String exp_frm_colg) {
        this.exp_frm_colg = exp_frm_colg;
    }
@Column(name="exp_frm_dept")
    public String getExp_frm_dept() {
        return exp_frm_dept;
    }

    public void setExp_frm_dept(String exp_frm_dept) {
        this.exp_frm_dept = exp_frm_dept;
    }
@Column(name="exp_frm_mentr")
    public String getExp_frm_mentr() {
        return exp_frm_mentr;
    }

    public void setExp_frm_mentr(String exp_frm_mentr) {
        this.exp_frm_mentr = exp_frm_mentr;
    }
    @Id
    @Column(name="username")
    @OneToOne(cascade= CascadeType.ALL)
    @ForeignKey(name="fk_expe")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
}
