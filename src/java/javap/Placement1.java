
package javap;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.*;
import java.io.Serializable;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.logging.SimpleFormatter;
import org.hibernate.annotations.ForeignKey;
@Entity
@Table(name="studentdata.placement")
public class Placement1 implements Serializable {
 String user_name;
Date date1;
String company_name;
String designation_or_job_tile;
String job_type;
String annual_package;
String office_letter;
String open_or_close_campus;
String remarks;
int s_no;
    public Placement1() {
             
            this.company_name ="-";
           this.designation_or_job_tile ="-";
           this.job_type ="-";
           this.annual_package ="-";
           this.office_letter ="-";
           this.open_or_close_campus ="-";
           this.remarks ="-";
         }

    public Placement1(int s_no,String user_name, Date date1, String company_name, String designation_or_job_tile, String job_type, String annual_package, String office_letter, String open_or_close_campus, String remarks) {
        this.user_name = user_name;
        this.date1 = date1;
        this.company_name = company_name;
        this.designation_or_job_tile = designation_or_job_tile;
        this.job_type = job_type;
        this.annual_package = annual_package;
        this.office_letter = office_letter;
        this.open_or_close_campus = open_or_close_campus;
        this.remarks = remarks;
        this.s_no=s_no;
    }
        @Column(name="annual_package")
    public String getAnnual_package() {
        return annual_package;
    }

    public void setAnnual_package(String annual_package) {
        this.annual_package = annual_package;
    }
    @Column(name="company_name")
    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
     @Column(name="date")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }
      @Column(name="designation_or_job_tile")
    public String getDesignation_or_job_tile() {
        return designation_or_job_tile;
    }

    public void setDesignation_or_job_tile(String designation_or_job_tile) {
        this.designation_or_job_tile = designation_or_job_tile;
    }
      @Column(name="job_type")
    public String getJob_type() {
        return job_type;
    }
      
    public void setJob_type(String job_type) {
        this.job_type = job_type;
    }
         @Column(name="office_letter")
    public String getOffice_letter() {
        return office_letter;
    }

    public void setOffice_letter(String office_letter) {
        this.office_letter = office_letter;
    }
        @Column(name="open_or_close_campus")
    public String getOpen_or_close_campus() {
        return open_or_close_campus;
    }

    public void setOpen_or_close_campus(String open_or_close_campus) {
        this.open_or_close_campus = open_or_close_campus;
    }
     @Column(name="remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
       
       @Column(name="user_name")
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
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
