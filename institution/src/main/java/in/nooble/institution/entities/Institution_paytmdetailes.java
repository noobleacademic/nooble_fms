package in.nooble.institution.entities;


import javax.persistence.*;

/**
 * @author User
 */
@Entity
public class Institution_paytmdetailes {

    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private int institution_id;
    @ManyToOne
    private Institutions institute;

    @Basic
    @Column(length = 250)
    private String merchant_key;

    @Basic
    @Column(length = 250)
    private String merchant_id;

    @Basic
    @Column(length = 250)
    private String merchant_website;

    @Basic
    @Column(length = 250)
    private String enviornment;

    @Basic
    @Column(length = 250)
    private String industry_type;

    @Basic
    private String category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getInstitution_id() {
        return institution_id;
    }

    public void setInstitution_id(int institution_id) {
        this.institution_id = institution_id;
    }

    public String getMerchant_key() {
        return merchant_key;
    }

    public void setMerchant_key(String merchant_key) {
        this.merchant_key = merchant_key;
    }

    public String getMerchant_id() {
        return merchant_id;
    }

    public void setMerchant_id(String merchant_id) {
        this.merchant_id = merchant_id;
    }

    public String getMerchant_website() {
        return merchant_website;
    }

    public void setMerchant_website(String merchant_website) {
        this.merchant_website = merchant_website;
    }

    public String getEnviornment() {
        return enviornment;
    }

    public void setEnviornment(String enviornment) {
        this.enviornment = enviornment;
    }

    public String getIndustry_type() {
        return industry_type;
    }

    public void setIndustry_type(String industry_type) {
        this.industry_type = industry_type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public Institutions getInstitute() {
        return institute;
    }

    public void setInstitute(Institutions institute) {
        this.institute = institute;
    }

}