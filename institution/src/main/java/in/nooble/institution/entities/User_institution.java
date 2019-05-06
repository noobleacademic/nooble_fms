package in.nooble.institution.entities;


import javax.persistence.*;

/**
 * @author User
 */
@Entity
public class User_institution {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Users user;
    @ManyToOne
    private Roles roles;

    public Users getUser() {
        return user;
    }
    public void setUser(Users user) {
        this.user = user;
    }
    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }



    public Institutions getInstitute() {
        return institute;
    }

    public void setInstitute(Institutions institute) {
        this.institute = institute;
    }

    @ManyToOne
    private Institutions institute;


    @Basic
    private String user_id;

    @Basic
    private String institution_id;

    @Basic
    private String role_id;

    @Basic
    private String reg_key;

    @Basic
    private String is_active;

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

    public String getInstitution_id() {
        return institution_id;
    }

    public void setInstitution_id(String institution_id) {
        this.institution_id = institution_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getReg_key() {
        return reg_key;
    }

    public void setReg_key(String reg_key) {
        this.reg_key = reg_key;
    }

    public String getIs_active() {
        return is_active;
    }

    public void setIs_active(String is_active) {
        this.is_active = is_active;
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