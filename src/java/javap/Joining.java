
package javap;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="studentdata.joining")
public class Joining implements Serializable {
 String user_name;
String joint_in;
String city;
String country;
int year;

    public Joining() {
        this.joint_in ="-";
        this.city ="-";
        this.country ="-";
        this.year =0;
    }

    public Joining(String user_name, String joint_in, String city, String country, int year) {
        this.user_name = user_name;
        this.joint_in = joint_in;
        this.city = city;
        this.country = country;
        this.year = year;
    }
 @Column(name="city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Column(name="country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
     @Column(name="join_in")
    public String getJoint_in() {
        return joint_in;
    }

    public void setJoint_in(String joint_in) {
        this.joint_in = joint_in;
    }
      @Id
     
      @Column(name="user_name")
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
 @Column(name="year")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



}
