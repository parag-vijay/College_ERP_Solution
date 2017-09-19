
package javap;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name="studentdata.student_record")
public class Student_record implements Serializable {
    

String name;
String enrollment_no;
String scholar_no;
String gender;
Date date_of_birth;
String mobile1;
String mobile2;
String p_email;
String bus_no;
String stop_name;
String l_address;
String l_city;
String l_state;
int l_pincode;
String l_telephone_no;
String p_address;
String p_city;
String p_state;
int p_pincode;
String p_telephone_no;
String father_name;
Date f_dob;
String f_occupation;
String f_mobile;
String f_email;
String mother_name;
Date m_dob;
String m_occupaion;
String m_mobile;
String m_email;
Date anniversary;
float income;
String vehicle;
String sibling1;
String sibling2;
String sibling3;
String l_guardian;
String lg_mobile;
String lg_telephone;
String lg_address;
String category;
String cast;
String religion;
String m_tongue;
String nationality;
String medical_detail;
String s_goal;
String l_goal;
String image;
String ex_anchoring;
String ex_debate;
String ex_painting;
String ex_dancing;
String ex_singing;
String ex_instrument;
String ex_name_of_instrument;
String ex_remark;
String spo_Football;
String spo_Carom;
String spo_TT;
String spo_Cricket;
String Cheese;
String spo_Basketball;
String spo_Softball;
String spo_Kho_Kho;
String spo_other;
String spo_remark;
String after_graduation;
int year;
int sem;
String branchvar;
String username;
String e_write;
String e_read;
String e_speak;
String e_understand;

    public Student_record() {
        this.name ="-";
        this.enrollment_no ="-";
        this.scholar_no ="-";
        this.gender =" ";
        this.blood_group =" ";
        this.c_email ="-";
        this.mobile1 ="-";
        this.mobile2 ="-";
        this.p_email ="-";
        this.bus_no ="-";
        this.stop_name ="-";
        this.l_address ="-";
        this.l_city ="-";
        this.l_state ="-";
        this.l_pincode =0;
        this.l_telephone_no ="-";
        this.p_address ="-";
        this.p_city ="-";
        this.p_state ="-";
        this.p_pincode =0;
        this.p_telephone_no ="-";
        this.father_name ="-";
        
        this.f_occupation ="-";
        this.f_mobile ="-";
        this.f_email ="-";
        this.mother_name ="-";
        
        this.m_occupaion ="-";
        this.m_mobile ="-";
        this.m_email ="-";
        
        this.income =0.0f;
        this.vehicle ="-";
        this.sibling1 ="-";
        this.sibling2 ="-";
        this.sibling3 ="-";
        this.l_guardian ="-";
        this.lg_mobile ="-";
        this.lg_telephone ="-";
        this.lg_address ="-";
        this.category ="-";
        this.cast ="-";
        this.religion ="-";
        this.m_tongue ="-";
        this.nationality ="-";
        this.medical_detail ="-";
        this.s_goal ="-";
        this.l_goal ="-";
        this.image ="-";
        this.ex_anchoring ="-";
        this.ex_debate ="-";
        this.ex_painting ="-";
        this.ex_dancing ="-";
        this.ex_singing ="-";
        this.ex_instrument ="-";
        this.ex_name_of_instrument ="-";
        this.ex_remark ="-";
        this.spo_Football ="-";
        this.spo_Carom ="-";
        this.spo_TT ="-";
        this.spo_Cricket ="-";
        this.Cheese ="-";
        this.spo_Basketball ="-";
        this.spo_Softball ="-";
        this.spo_Kho_Kho ="-";
        this.spo_other ="-";
        this.spo_remark ="-";
        this.after_graduation ="-";
        this.year =0;
        this.sem =0;
        this.e_read="-";
        this.e_speak="-";
        this.e_understand="-";
        this.e_write="-";
        this.branchvar ="-";
        
    }


    public Student_record(String name,String e_read,String e_write,String e_understand,String e_speak ,String enrollment_no, String scholar_no, String gender, Date date_of_birth, String blood_group, String c_email, String mobile1, String mobile2, String p_email, String bus_no, String stop_name, String l_address, String l_city, String l_state, int l_pincode, String l_telephone_no, String p_address, String p_city, String p_state, int p_pincode, String p_telephone_no, String father_name, Date f_dob, String f_occupation, String f_mobile, String f_email, String mother_name, Date m_dob, String m_occupaion, String m_mobile, String m_email, Date anniversary,float income, String vehicle, String sibling1, String sibling2, String sibling3, String l_guardian, String lg_mobile, String lg_telephone, String lg_address, String category, String cast, String religion, String m_tongue, String nationality, String medical_detail, String s_goal, String l_goal, String image, String ex_anchoring, String ex_debate, String ex_painting, String ex_dancing, String ex_singing, String ex_instrument, String ex_name_of_instrument, String ex_remark, String spo_Football, String spo_Carom, String spo_TT, String spo_Cricket, String Cheese, String spo_Basketball, String spo_Softball, String spo_Kho_Kho, String spo_other, String spo_remark, String after_graduation, int year,int sem,  String branchvar,String username) {
        this.name = name;
        this.enrollment_no = enrollment_no;
        this.scholar_no = scholar_no;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.blood_group = blood_group;
        this.c_email = c_email;
        this.mobile1 = mobile1;
        this.mobile2 = mobile2;
        this.p_email = p_email;
        this.bus_no = bus_no;
        this.stop_name = stop_name;
        this.l_address = l_address;
        this.l_city = l_city;
        this.l_state = l_state;
        this.l_pincode = l_pincode;
        this.l_telephone_no = l_telephone_no;
        this.p_address = p_address;
        this.p_city = p_city;
        this.p_state = p_state;
        this.p_pincode = p_pincode;
        this.p_telephone_no = p_telephone_no;
        this.father_name = father_name;
        this.f_dob = f_dob;
        this.f_occupation = f_occupation;
        this.f_mobile = f_mobile;
        this.f_email = f_email;
        this.mother_name = mother_name;
        this.m_dob = m_dob;
        this.m_occupaion = m_occupaion;
        this.m_mobile = m_mobile;
        this.m_email = m_email;
        this.anniversary = anniversary;
        this.income = income;
        this.vehicle = vehicle;
        this.sibling1 = sibling1;
        this.sibling2 = sibling2;
        this.sibling3 = sibling3;
        this.l_guardian = l_guardian;
        this.lg_mobile = lg_mobile;
        this.lg_telephone = lg_telephone;
        this.lg_address = lg_address;
        this.category = category;
        this.cast = cast;
        this.religion = religion;
        this.m_tongue = m_tongue;
        this.nationality = nationality;
        this.medical_detail = medical_detail;
        this.s_goal = s_goal;
        this.l_goal = l_goal;
        this.image = image;
        this.ex_anchoring = ex_anchoring;
        this.ex_debate = ex_debate;
        this.ex_painting = ex_painting;
        this.ex_dancing = ex_dancing;
        this.ex_singing = ex_singing;
        this.ex_instrument = ex_instrument;
        this.ex_name_of_instrument = ex_name_of_instrument;
        this.ex_remark = ex_remark;
        this.spo_Football = spo_Football;
        this.spo_Carom = spo_Carom;
        this.spo_TT = spo_TT;
        this.spo_Cricket = spo_Cricket;
        this.Cheese = Cheese;
        this.spo_Basketball = spo_Basketball;
        this.spo_Softball = spo_Softball;
        this.spo_Kho_Kho = spo_Kho_Kho;
        this.spo_other = spo_other;
        this.spo_remark = spo_remark;
        this.after_graduation = after_graduation;
        this.year = year;
        this.sem =sem;
        this.e_read= e_read;
        this.e_speak=e_speak;
        this.e_understand= e_understand;
        this.e_write= e_write;
        this.branchvar = branchvar;
        this.username=username;
    }
String blood_group;
String c_email;
@Column(name="e_read")
 public String getE_read() {
        return e_read;
    }

    public void setE_read(String e_read) {
        this.e_read = e_read;
    }
@Column(name="e_speak")
    public String getE_speak() {
        return e_speak;
    }

    public void setE_speak(String e_speak) {
        this.e_speak = e_speak;
    }
 @Column(name="e_understand")
    public String getE_understand() {
        return e_understand;
    }

    public void setE_understand(String e_understand) {
        this.e_understand = e_understand;
    }
   @Column(name="e_write")
    public String getE_write() {
        return e_write;
    }

    public void setE_write(String e_write) {
        this.e_write = e_write;
    }
      @Column(name="spo_Cheese")
    public String getCheese() {
        return Cheese;
    }
        
    public void setCheese(String Cheese) {
        this.Cheese = Cheese;
    }
          @Column(name="anniversary")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getAnniversary() {
        return anniversary;
    }

    public void setAnniversary(Date anniversary) {
        this.anniversary = anniversary;
    }
      @Column(name="blood_group")
    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }
      @Column(name="current_branch")
    public String getBranchvar() {
        return branchvar;
    }

    public void setBranchvar(String branchvar) {
        this.branchvar = branchvar;
    }
     @Column(name="bus_no")
    public String getBus_no() {
        return bus_no;
    }

    public void setBus_no(String bus_no) {
        this.bus_no = bus_no;
    }
     @Column(name="c_email")
    public String getC_email() {
        return c_email;
    }
      
    public void setC_email(String c_email) {
        this.c_email = c_email;
    }
     @Column(name="cast")
    public String getCast() {
        return cast;
    }
        
    public void setCast(String cast) {
        this.cast = cast;
    }
        @Column(name="category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
      @Column(name="date_of_birth")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
       @Column(name="enrollment_no")
    public String getEnrollment_no() {
        return enrollment_no;
    }

    public void setEnrollment_no(String enrollment_no) {
        this.enrollment_no = enrollment_no;
    }
           @Column(name="ex_anchoring")
    public String getEx_anchoring() {
        return ex_anchoring;
    }

    public void setEx_anchoring(String ex_anchoring) {
        this.ex_anchoring = ex_anchoring;
    }
     @Column(name="ex_dancing")
    public String getEx_dancing() {
        return ex_dancing;
    }

    public void setEx_dancing(String ex_dancing) {
        this.ex_dancing = ex_dancing;
    }
     @Column(name="ex_debate")
    public String getEx_debate() {
        return ex_debate;
    }

    public void setEx_debate(String ex_debate) {
        this.ex_debate = ex_debate;
    }
     @Column(name="ex_instrument")
    public String getEx_instrument() {
        return ex_instrument;
    }

    public void setEx_instrument(String ex_instrument) {
        this.ex_instrument = ex_instrument;
    }
        @Column(name="ex_name_of_instrument")
    public String getEx_name_of_instrument() {
        return ex_name_of_instrument;
    }

    public void setEx_name_of_instrument(String ex_name_of_instrument) {
        this.ex_name_of_instrument = ex_name_of_instrument;
    }
    @Column(name="ex_painting")
    public String getEx_painting() {
        return ex_painting;
    }

    public void setEx_painting(String ex_painting) {
        this.ex_painting = ex_painting;
    }
     @Column(name="ex_remark")
    public String getEx_remark() {
        return ex_remark;
    }

    public void setEx_remark(String ex_remark) {
        this.ex_remark = ex_remark;
    }
      @Column(name="ex_singing")
    public String getEx_singing() {
        return ex_singing;
    }

    public void setEx_singing(String ex_singing) {
        this.ex_singing = ex_singing;
    }
     @Column(name="f_dob")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getF_dob() {
        return f_dob;
    }

    public void setF_dob(Date f_dob) {
        this.f_dob = f_dob;
    }
     @Column(name="f_email")
    public String getF_email() {
        return f_email;
    }

    public void setF_email(String f_email) {
        this.f_email = f_email;
    }
      @Column(name="f_mobile")
    public String getF_mobile() {
        return f_mobile;
    }

    public void setF_mobile(String f_mobile) {
        this.f_mobile = f_mobile;
    }
         @Column(name="f_occupation")
    public String getF_occupation() {
        return f_occupation;
    }

    public void setF_occupation(String f_occupation) {
        this.f_occupation = f_occupation;
    }
          @Column(name="father_name")
    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }
      @Column(name="gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
      @Column(name="after_graduation")
    public String getAfter_graduation() {
        return after_graduation;
    }

    public void setAfter_graduation(String after_graduation) {
        this.after_graduation = after_graduation;
    }
       
       @Column(name="year")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
         @Column(name="current_sem")
    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }
     @Column(name="image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
      @Column(name="income")
    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }
       @Column(name="l_address")
    public String getL_address() {
        return l_address;
    }

    public void setL_address(String l_address) {
        this.l_address = l_address;
    }
       @Column(name="l_city")
    public String getL_city() {
        return l_city;
    }

    public void setL_city(String l_city) {
        this.l_city = l_city;
    }
       @Column(name="l_goal")
    public String getL_goal() {
        return l_goal;
    }

    public void setL_goal(String l_goal) {
        this.l_goal = l_goal;
    }
      @Column(name="l_guardian")
    public String getL_guardian() {
        return l_guardian;
    }
       
    public void setL_guardian(String l_guardian) {
        this.l_guardian = l_guardian;
    }
         @Column(name="l_pincode")
    public int getL_pincode() {
        return l_pincode;
    }
         
    public void setL_pincode(int l_pincode) {
        this.l_pincode = l_pincode;
    }
       @Column(name="l_state")
    public String getL_state() {
        return l_state;
    }

    public void setL_state(String l_state) {
        this.l_state = l_state;
    }
      @Column(name="l_telephone_no")
    public String getL_telephone_no() {
        return l_telephone_no;
    }

    public void setL_telephone_no(String l_telephone_no) {
        this.l_telephone_no = l_telephone_no;
    }
        @Column(name="lg_address")
    public String getLg_address() {
        return lg_address;
    }

    public void setLg_address(String lg_address) {
        this.lg_address = lg_address;
    }
      @Column(name="lg_mobile")
    public String getLg_mobile() {
        return lg_mobile;
    }

    public void setLg_mobile(String lg_mobile) {
        this.lg_mobile = lg_mobile;
    }
        @Column(name="lg_telephone")
    public String getLg_telephone() {
        return lg_telephone;
    }

    public void setLg_telephone(String lg_telephone) {
        this.lg_telephone = lg_telephone;
    }
     @Column(name="m_dob")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getM_dob() {
        return m_dob;
    }

    public void setM_dob(Date m_dob) {
        this.m_dob = m_dob;
    }
    @Column(name="m_email")
    public String getM_email() {
        return m_email;
    }

    public void setM_email(String m_email) {
        this.m_email = m_email;
    }
          @Column(name="m_mobile")
    public String getM_mobile() {
        return m_mobile;
    }

    public void setM_mobile(String m_mobile) {
        this.m_mobile = m_mobile;
    }
       @Column(name="m_occupaion")
    public String getM_occupaion() {
        return m_occupaion;
    }

    public void setM_occupaion(String m_occupaion) {
        this.m_occupaion = m_occupaion;
    }
      @Column(name="m_tongue")
    public String getM_tongue() {
        return m_tongue;
    }

    public void setM_tongue(String m_tongue) {
        this.m_tongue = m_tongue;
    }
         @Column(name="medical_detail")
    public String getMedical_detail() {
        return medical_detail;
    }

    public void setMedical_detail(String medical_detail) {
        this.medical_detail = medical_detail;
    }
          @Column(name="mobile1")
    public String getMobile1() {
        return mobile1;
    }

    public void setMobile1(String mobile1) {
        this.mobile1 = mobile1;
    }
     @Column(name="mobile2")
    public String getMobile2() {
        return mobile2;
    }

    public void setMobile2(String mobile2) {
        this.mobile2 = mobile2;
    }
       @Column(name="mother_name")
    public String getMother_name() {
        return mother_name;
    }

    public void setMother_name(String mother_name) {
        this.mother_name = mother_name;
    }
        @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
      @Column(name="nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
        @Column(name="p_address")
    public String getP_address() {
        return p_address;
    }

    public void setP_address(String p_address) {
        this.p_address = p_address;
    }
       @Column(name="p_city")
    public String getP_city() {
        return p_city;
    }

    public void setP_city(String p_city) {
        this.p_city = p_city;
    }
          @Column(name="p_email")
    public String getP_email() {
        return p_email;
    }

    public void setP_email(String p_email) {
        this.p_email = p_email;
    }
        @Column(name="p_pincode")
    public int getP_pincode() {
        return p_pincode;
    }

    public void setP_pincode(int p_pincode) {
        this.p_pincode = p_pincode;
    }
       @Column(name="p_state")
    public String getP_state() {
        return p_state;
    }

    public void setP_state(String p_state) {
        this.p_state = p_state;
    }
         @Column(name="p_telephone_no")
    public String getP_telephone_no() {
        return p_telephone_no;
    }

    public void setP_telephone_no(String p_telephone_no) {
        this.p_telephone_no = p_telephone_no;
    }
       @Column(name="religion")
    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
     @Column(name="s_goal")
    public String getS_goal() {
        return s_goal;
    }

    public void setS_goal(String s_goal) {
        this.s_goal = s_goal;
    }
      @Column(name="scholar_no")
    public String getScholar_no() {
        return scholar_no;
    }

    public void setScholar_no(String scholar_no) {
        this.scholar_no = scholar_no;
    }
       @Column(name="sibling1")
    public String getSibling1() {
        return sibling1;
    }

    public void setSibling1(String sibling1) {
        this.sibling1 = sibling1;
    }
     @Column(name="sibling2")
    public String getSibling2() {
        return sibling2;
    }

    public void setSibling2(String sibling2) {
        this.sibling2 = sibling2;
    }
        @Column(name="sibling3")
    public String getSibling3() {
        return sibling3;
    }

    public void setSibling3(String sibling3) {
            this.sibling3 = sibling3;
    }
       @Column(name="spo_Basketball")
    public String getSpo_Basketball() {
        return spo_Basketball;
    }

    public void setSpo_Basketball(String spo_Basketball) {
        this.spo_Basketball = spo_Basketball;
    }
       @Column(name="spo_Carom")
    public String getSpo_Carom() {
        return spo_Carom;
    }

    public void setSpo_Carom(String spo_Carom) {
        this.spo_Carom = spo_Carom;
    }
       @Column(name="spo_Cricket")
    public String getSpo_Cricket() {
        return spo_Cricket;
    }

    public void setSpo_Cricket(String spo_Cricket) {
        this.spo_Cricket = spo_Cricket;
    }
        @Column(name="spo_Football")
    public String getSpo_Football() {
        return spo_Football;
    }

    public void setSpo_Football(String spo_Football) {
        this.spo_Football = spo_Football;
    }
           @Column(name="spo_Kho_Kho")
    public String getSpo_Kho_Kho() {
        return spo_Kho_Kho;
    }

    public void setSpo_Kho_Kho(String spo_Kho_Kho) {
        this.spo_Kho_Kho = spo_Kho_Kho;
    }
      @Column(name="spo_Softball")
    public String getSpo_Softball() {
        return spo_Softball;
    }

    public void setSpo_Softball(String spo_Softball) {
        this.spo_Softball = spo_Softball;
    }
         @Column(name="spo_TT")
    public String getSpo_TT() {
        return spo_TT;
    }

    public void setSpo_TT(String spo_TT) {
        this.spo_TT = spo_TT;
    }
        @Column(name="spo_other")
    public String getSpo_other() {
        return spo_other;
    }

    public void setSpo_other(String spo_other) {
        this.spo_other = spo_other;
    }
        @Column(name="spo_remark")
    public String getSpo_remark() {
        return spo_remark;
    }

    public void setSpo_remark(String spo_remark) {
        this.spo_remark = spo_remark;
    }
     @Column(name="stop_name")
    public String getStop_name() {
        return stop_name;
    }

    public void setStop_name(String stop_name) {
        this.stop_name = stop_name;
    }
     @Column(name="vehicle")
    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
    @Id
    @Column(name="user_name")
     public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
