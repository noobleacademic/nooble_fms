package in.nooble.institution.entities;


import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author User
 */
@Entity
public class Onboard {

    @Id
    @GeneratedValue
    private Long onboardId;

    @Basic
    private String name;

    @Basic
    private String email;

    @Basic
    private String phone;

    @Basic
    private String onboardKey;

    @Basic
    private String registered;

    @Basic
    private String createdAt;

    @Basic
    private String updatedAt;

    public Long getOnboardId() {
        return onboardId;
    }

    public void setOnboardId(Long onboardId) {
        this.onboardId = onboardId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOnboardKey() {
        return onboardKey;
    }

    public void setOnboardKey(String onboardKey) {
        this.onboardKey = onboardKey;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
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

}