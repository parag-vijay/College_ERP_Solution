
package javap;
import javax.persistence.*;
import java.io.Serializable;
import org.hibernate.annotations.ForeignKey;
@Entity
@Table(name="studentdata.strwek")
public class Strength implements Serializable {
  String strength;
String weakness;
String user_name;
int s_no;

    public Strength() {
        this.weakness="-";
        this.strength="-";
    }

    public Strength(String strength, String weakness, String user_name, int s_no) {
        this.strength = strength;
        this.weakness = weakness;
        this.user_name = user_name;
        this.s_no = s_no;
    }
    @Id
@Column(name="s_no")
    public int getS_no() {
        return s_no;
    }

    public void setS_no(int s_no) {
        this.s_no = s_no;
    }
@Column(name="strength")

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }
 @Column(name="user_name")
 
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
@Column(name="weakness")
    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

}
