package in.nooble.institution.entities;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author User
 */
@Entity
public class Users {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String user_id;

    @Basic
    private String first_name;

    @Basic
    private String middle_name;

    @Basic
    private String last_name;

    @Basic
    private String email;

    @Basic
    private String password;

    @Basic
    private String address1;

    @Basic
    private String address2;

    @Basic
    private String city;

    @Basic
    private String state;

    @Basic
    private String country;

    @Basic
    private String zipcode;

    @Basic
    private String primary_phone;

    @Basic
    private String secondary_phone;

    @Basic
    private String gender;

    @Basic
    private String dob;

    @Basic
    private String blood_group;

    @Basic
    private String used_as;

    @Basic
    private String avatar;

    @Basic
    private String remember_token;

    @Basic
    private String created_at;

    @Basic
    private String updated_at;

    @Basic
    private String username;

    @Basic
    private String defaultPassword;

    @OneToMany(mappedBy ="user")
    private List<Payments> paymentses;

    @OneToMany(mappedBy ="user")
    private List<Student_details> student_detailses;

    @OneToMany(mappedBy ="user")
    private List<User_institution> user_institutions;

    @OneToMany(mappedBy ="user")
    private List<FeeUsers> feeUserses;
    @OneToMany(mappedBy = "user")
    private TeachersDetials Teacher_Detials;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPrimary_phone() {
        return primary_phone;
    }

    public void setPrimary_phone(String primary_phone) {
        this.primary_phone = primary_phone;
    }

    public String getSecondary_phone() {
        return secondary_phone;
    }

    public void setSecondary_phone(String secondary_phone) {
        this.secondary_phone = secondary_phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }

    public String getUsed_as() {
        return used_as;
    }

    public void setUsed_as(String used_as) {
        this.used_as = used_as;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRemember_token() {
        return remember_token;
    }

    public void setRemember_token(String remember_token) {
        this.remember_token = remember_token;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDefaultPassword() {
        return defaultPassword;
    }

    public void setDefaultPassword(String defaultPassword) {
        this.defaultPassword = defaultPassword;
    }

    public List<Payments> getPaymentses() {
        if (paymentses == null) {
            paymentses = new ArrayList<>();
        }
        return paymentses;
    }

    public void setPaymentses(List<Payments> paymentses) {
        this.paymentses = paymentses;
    }

    public void addPaymentse(Payments paymentse) {
        getPaymentses().add(paymentse);
    }

    public void removePaymentse(Payments paymentse) {
        getPaymentses().remove(paymentse);
    }

    public List<Student_details> getStudent_detailses() {
        if (student_detailses == null) {
            student_detailses = new ArrayList<>();
        }
        return student_detailses;
    }

    public void setStudent_detailses(List<Student_details> student_detailses) {
        this.student_detailses = student_detailses;
    }

    public void addStudent_detailse(Student_details student_detailse) {
        getStudent_detailses().add(student_detailse);
    }

    public void removeStudent_detailse(Student_details student_detailse) {
        getStudent_detailses().remove(student_detailse);
    }

    public List<User_institution> getUser_institutions() {
        if (user_institutions == null) {
            user_institutions = new ArrayList<>();
        }
        return user_institutions;
    }

    public void setUser_institutions(List<User_institution> user_institutions) {
        this.user_institutions = user_institutions;
    }

    public void addUser_institution(User_institution user_institution) {
        getUser_institutions().add(user_institution);
    }

    public void removeUser_institution(User_institution user_institution) {
        getUser_institutions().remove(user_institution);
    }

    public List<FeeUsers> getFeeUserses() {
        if (feeUserses == null) {
            feeUserses = new ArrayList<>();
        }
        return feeUserses;
    }

    public void setFeeUserses(List<FeeUsers> feeUserses) {
        this.feeUserses = feeUserses;
    }

    public void addFeeUserse(FeeUsers feeUserse) {
        getFeeUserses().add(feeUserse);
    }

    public void removeFeeUserse(FeeUsers feeUserse) {
        getFeeUserses().remove(feeUserse);
    }

}