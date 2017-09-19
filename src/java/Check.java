
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="studentdata.check")
public class Check implements Serializable  {
    int s_no;
    String name;
    float mobile;

    public Check() {
    }

    public Check(int s_no, String name, float mobile) {
        this.s_no = s_no;
        this.name = name;
        this.mobile = mobile;
    }
     @Column(name="mobile")
    public float getMobile() {
        return mobile;
    }

    public void setMobile(float mobile) {
        this.mobile = mobile;
    }
    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
