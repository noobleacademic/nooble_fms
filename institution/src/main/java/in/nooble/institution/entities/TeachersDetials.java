package in.nooble.institution.entities;


import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author User
 */
@Entity
public class TeachersDetials {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String user_id;

    @Basic
    private String educationalQualificcations;

    @Basic
    private String experienceInYear;

    @Basic
    private String certifications;

    @Basic
    private String otherActivities;

    @Basic
    private String specialisedSubject;

    @Basic
    private String employeeId;

    @Basic
    private String createdAt;

    @Basic
    private String updatedAt;

    @ManyToOne
    private Users users;

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

    public String getEducationalQualificcations() {
        return educationalQualificcations;
    }

    public void setEducationalQualificcations(String educationalQualificcations) {
        this.educationalQualificcations = educationalQualificcations;
    }

    public String getExperienceInYear() {
        return experienceInYear;
    }

    public void setExperienceInYear(String experienceInYear) {
        this.experienceInYear = experienceInYear;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    public String getOtherActivities() {
        return otherActivities;
    }

    public void setOtherActivities(String otherActivities) {
        this.otherActivities = otherActivities;
    }

    public String getSpecialisedSubject() {
        return specialisedSubject;
    }

    public void setSpecialisedSubject(String specialisedSubject) {
        this.specialisedSubject = specialisedSubject;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

}