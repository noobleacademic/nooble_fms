package in.nooble.institution.entities;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author User
 */
@Entity
public class Institutions {

    @Id
    @GeneratedValue
    private Long institution_id;

    @Basic
    @Column(length = 191)
    private String name;

    @Basic
    @Column(length = 191)
    private String email;

    @Basic
    @Column(length = 191)
    private String domain;

    @Basic
    @Column(length = 191)
    private String password;

    @Basic
    private String address;

    @Basic
    @Column(length = 191)
    private String city;

    @Basic
    @Column(length = 191)
    private String district;

    @Basic
    @Column(length = 191)
    private String state;

    @Basic
    @Column(length = 191)
    private String zipcode;

    @Basic
    @Column(length = 191)
    private String mobile;

    @Basic
    @Column(length = 191)
    private String landline;

    @Basic
    @Column(length = 191)
    private String level;

    @Basic
    @Column(length = 191)
    private String syllabus;

    @Basic
    @Column(length = 191)
    private String target_gender;

    @Basic
    @Column(length = 191)
    private String board;

    @Basic
    @Column(length = 191)
    private String medium;

    @Basic
    @Column(length = 191)
    private String accreditation;

    @Basic
    @Column(length = 191)
    private String alternate_email;

    @Basic
    @Column(length = 191)
    private String owner_name;

    @Basic
    @Column(length = 250)
    private String bank_name;

    @Basic
    @Column(length = 250)
    private String account_name;

    @Basic
    @Column(length = 250)
    private String account_number;

    @Basic
    @Column(length = 250)
    private String branch;

    @Basic
    @Column(length = 100)
    private String ifsc_code;

    @Basic
    @Column(length = 100)
    private String pan;

    @Basic
    @Column(length = 191)
    private String logo;

    @Basic
    @Column(length = 191)
    private String cover_pic;

    @Basic
    @Column(length = 250)
    private String payu_id;

    @Basic
    private int onboard_id;

    @Basic
    private Timestamp created_at;

    @Basic
    private Timestamp updated_at;

    @OneToMany(mappedBy ="institute")
    private List<Fees_template> fees_templates;

    @OneToMany(mappedBy ="institute")
    private List<Institution_paytmdetailes> institution_paytmdetaileses;

    @OneToMany(mappedBy ="institute")
    private List<User_institution> user_institutions;

    @OneToMany(mappedBy ="institute")
    private List<Institution_pages> institution_pageses;

    @OneToMany(mappedBy ="institute")
    private List<Institution_contact_page> institution_contact_pages;

    public Long getInstitution_id() {
        return institution_id;
    }

    public void setInstitution_id(Long institution_id) {
        this.institution_id = institution_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public String getTarget_gender() {
        return target_gender;
    }

    public void setTarget_gender(String target_gender) {
        this.target_gender = target_gender;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getAccreditation() {
        return accreditation;
    }

    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }

    public String getAlternate_email() {
        return alternate_email;
    }

    public void setAlternate_email(String alternate_email) {
        this.alternate_email = alternate_email;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getIfsc_code() {
        return ifsc_code;
    }

    public void setIfsc_code(String ifsc_code) {
        this.ifsc_code = ifsc_code;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCover_pic() {
        return cover_pic;
    }

    public void setCover_pic(String cover_pic) {
        this.cover_pic = cover_pic;
    }

    public String getPayu_id() {
        return payu_id;
    }

    public void setPayu_id(String payu_id) {
        this.payu_id = payu_id;
    }

    public int getOnboard_id() {
        return onboard_id;
    }

    public void setOnboard_id(int onboard_id) {
        this.onboard_id = onboard_id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public List<Fees_template> getFees_templates() {
        if (fees_templates == null) {
            fees_templates = new ArrayList<>();
        }
        return fees_templates;
    }

    public void setFees_templates(List<Fees_template> fees_templates) {
        this.fees_templates = fees_templates;
    }

    public void addFees_template(Fees_template fees_template) {
        getFees_templates().add(fees_template);
    }

    public void removeFees_template(Fees_template fees_template) {
        getFees_templates().remove(fees_template);
    }

    public List<Institution_paytmdetailes> getInstitution_paytmdetaileses() {
        if (institution_paytmdetaileses == null) {
            institution_paytmdetaileses = new ArrayList<>();
        }
        return institution_paytmdetaileses;
    }

    public void setInstitution_paytmdetaileses(List<Institution_paytmdetailes> institution_paytmdetaileses) {
        this.institution_paytmdetaileses = institution_paytmdetaileses;
    }

    public void addInstitution_paytmdetailese(Institution_paytmdetailes institution_paytmdetailese) {
        getInstitution_paytmdetaileses().add(institution_paytmdetailese);
    }

    public void removeInstitution_paytmdetailese(Institution_paytmdetailes institution_paytmdetailese) {
        getInstitution_paytmdetaileses().remove(institution_paytmdetailese);
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

    public List<Institution_pages> getInstitution_pageses() {
        if (institution_pageses == null) {
            institution_pageses = new ArrayList<>();
        }
        return institution_pageses;
    }

    public void setInstitution_pageses(List<Institution_pages> institution_pageses) {
        this.institution_pageses = institution_pageses;
    }

    public void addInstitution_pagese(Institution_pages institution_pagese) {
        getInstitution_pageses().add(institution_pagese);
    }

    public void removeInstitution_pagese(Institution_pages institution_pagese) {
        getInstitution_pageses().remove(institution_pagese);
    }

    public List<Institution_contact_page> getInstitution_contact_pages() {
        if (institution_contact_pages == null) {
            institution_contact_pages = new ArrayList<>();
        }
        return institution_contact_pages;
    }

    public void setInstitution_contact_pages(List<Institution_contact_page> institution_contact_pages) {
        this.institution_contact_pages = institution_contact_pages;
    }

    public void addInstitution_contact_page(Institution_contact_page institution_contact_page) {
        getInstitution_contact_pages().add(institution_contact_page);
    }

    public void removeInstitution_contact_page(Institution_contact_page institution_contact_page) {
        getInstitution_contact_pages().remove(institution_contact_page);
    }

}