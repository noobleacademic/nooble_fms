package in.nooble.institution.entities;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 * @author User
 */
@Entity
public class Roles {

    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String role_id;

    @Basic
    private String name;

    @Basic
    private String description;

    @Basic
    private String created_at;

    @Basic
    private String updated_at;

    @OneToMany(mappedBy = "roles")
    private List<User_institution> user_institutions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

}