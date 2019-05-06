package in.nooble.institution.entities;


import javax.persistence.*;

/**
 * @author User
 */
@Entity
public class FeeUsers {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Fees_template Fees_Template;
    public Fees_template getFees_Template() {
        return Fees_Template;
    }

    public void setFees_Template(Fees_template fees_Template) {
        Fees_Template = fees_Template;
    }

    @Basic
    private String feeId;

    @Basic
    private String userId;

    @Basic
    private String parentId;

    @Basic
    private String createdAt;

    @Basic
    private String updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFeeId() {
        return feeId;
    }

    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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