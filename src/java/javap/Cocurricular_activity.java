
package javap;

import javax.persistence.*;

@Entity
@Table(name="studentdata.cocurricular_activity")
public class Cocurricular_activity {
 String user_name;
String activity_name;
String category;
String level;
String name_of_event;
String date_or_year;
String organised_by_or_place;
int position_secured;
String achievement_remark;
int s_no;

    public Cocurricular_activity() {
        this.activity_name =" ";
        this.category =" ";
        this.level =" ";
        this.name_of_event =" ";
        this.date_or_year ="";
        this.organised_by_or_place =" ";
        this.position_secured =0;
        this.achievement_remark =" ";
    }

    public Cocurricular_activity(int s_no,String user_name, String activity_name, String category, String level, String name_of_event, String date_or_year, String organised_by_or_place, int position_secured, String achievement_remark) {
        this.user_name = user_name;
        this.activity_name = activity_name;
        this.category = category;
        this.level = level;
        this.name_of_event = name_of_event;
        this.date_or_year = date_or_year;
        this.organised_by_or_place = organised_by_or_place;
        this.position_secured = position_secured;
        this.achievement_remark = achievement_remark;
        this.s_no=s_no;
    }
    @Column(name="achievement_remark")
    public String getAchievement_remark() {
        return achievement_remark;
    }

    public void setAchievement_remark(String achievement_remark) {
        this.achievement_remark = achievement_remark;
    }
     @Id
     @Column(name="s_no")
    public int getS_no() {
        return s_no;
    }

    public void setS_no(int s_no) {
        this.s_no = s_no;
    }
    @Column(name="activity_name")
    public String getActivity_name() {
        return activity_name;
    }

    public void setActivity_name(String activity_name) {
        this.activity_name = activity_name;
    }
    @Column(name="category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
     @Column(name="date_or_year")
    public String getDate_or_year() {
        return date_or_year;
    }

    public void setDate_or_year(String date_or_year) {
        this.date_or_year = date_or_year;
    }
    @Column(name="level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    @Column(name="name_of_event")
    public String getName_of_event() {
        return name_of_event;
    }

    public void setName_of_event(String name_of_event) {
        this.name_of_event = name_of_event;
    }
     @Column(name="organised_by_or_place")
    public String getOrganised_by_or_place() {
        return organised_by_or_place;
    }

    public void setOrganised_by_or_place(String organised_by_or_place) {
        this.organised_by_or_place = organised_by_or_place;
    }
    @Column(name="position_secured")
    public int getPosition_secured() {
        return position_secured;
    }

    public void setPosition_secured(int position_secured) {
        this.position_secured = position_secured;
    }
    @Column(name="user_name")
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }



}
