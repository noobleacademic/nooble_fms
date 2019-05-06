package in.nooble.institution.entities;


import javax.persistence.*;

/**
 * @author User
 */
@Entity
public class Student_details {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Users user;
    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    @Basic
    private String user_id;

    @Basic
    private String classs;

    @Basic
    private String division;

    @Basic
    private String primary_language;

    @Basic
    private String secondary_language;

    @Basic
    private String student_id;

    @Basic
    private String parent_id;

    @Basic
    private String teacher_id;

    @Basic
    private String created_at;

    @Basic
    private String updated_at;

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

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getPrimary_language() {
        return primary_language;
    }

    public void setPrimary_language(String primary_language) {
        this.primary_language = primary_language;
    }

    public String getSecondary_language() {
        return secondary_language;
    }

    public void setSecondary_language(String secondary_language) {
        this.secondary_language = secondary_language;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
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

}