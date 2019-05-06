package in.nooble.institution.entities;

import java.sql.Timestamp;
import javax.persistence.*;

/**
 * @author User
 */
@Entity
public class Institution_pages {
    public Institutions getInstitute() {
        return institute;
    }

    public void setInstitute(Institutions institute) {
        this.institute = institute;
    }

    @Id
    @GeneratedValue
    private Long page_id;

    @Basic
    private int institution_id;
    @ManyToOne
    private Institutions institute;

    @Basic
    @Column(length = 191)
    private String slug;

    @Basic
    private String title;

    @Basic
    private String content;

    @Basic
    @Column(length = 191)
    private String image;

    @Basic
    private Timestamp created_at;

    @Basic
    private Timestamp updated_at;

    @Basic
    private String pageOrder;

    public Long getPage_id() {
        return page_id;
    }

    public void setPage_id(Long page_id) {
        this.page_id = page_id;
    }

    public int getInstitution_id() {
        return institution_id;
    }

    public void setInstitution_id(int institution_id) {
        this.institution_id = institution_id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public String getPageOrder() {
        return pageOrder;
    }

    public void setPageOrder(String pageOrder) {
        this.pageOrder = pageOrder;
    }

}