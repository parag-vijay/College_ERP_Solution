
package javap;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="studentdata.higher_studies")
public class Higher_study implements Serializable {
  String  course_name;
String specialisation;
int year;
String institute_name;
String university_name;
String city;
String country;
String user_name;


    public Higher_study() {
        this.course_name ="-";
        this.specialisation ="-";
        this.year =0;
        this.institute_name ="-";
        this.university_name ="-";
        this.city ="-";
        this.country ="-";
    }

    public Higher_study(String course_name, String specialisation, int year, String institute_name, String university_name, String city, String country, String user_name) {
        this.course_name = course_name;
        this.specialisation = specialisation;
        this.year = year;
        this.institute_name = institute_name;
        this.university_name = university_name;
        this.city = city;
        this.country = country;
        this.user_name = user_name;
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
     @Column(name="course_name")
    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
      @Column(name="institute_name")
    public String getInstitute_name() {
        return institute_name;
    }

    public void setInstitute_name(String institute_name) {
        this.institute_name = institute_name;
    }
      @Id
     @Column(name="user_name")
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
     @Column(name="specialisation")
    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
      @Column(name="university_name")
    public String getUniversity_name() {
        return university_name;
    }

    public void setUniversity_name(String university_name) {
        this.university_name = university_name;
    }
     @Column(name="year")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



}
