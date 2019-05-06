package in.nooble.institution.entities;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 * @author User
 */
@Entity
public class Fees_template {

    @Id
    @GeneratedValue
    private Long fee_id;
    @ManyToOne
    private Institutions institute;

    @Basic
    private int institution_id;

    @Basic
    private String title;

    @Basic
    private String description;

    @Basic
    @Column(length = 250)
    private String category;

    @Basic
    @Column(length = 250)
    private String sub_category;

    @Basic
    private int created_by;

    @Basic
    private String fee_type;

    @Basic
    private String recurring_period;

    @Basic
    private LocalDate recurring_start_date;

    @Basic
    private LocalDate recurring_end_date;

    @Basic
    private int can_split;

    @Basic
    private int max_split;

    @Basic
    private int is_active;

    @Basic
    private Timestamp created_at;

    @Basic
    private Timestamp updated_at;

    @Basic
    private String lateFee;

    @Basic
    private String isFeehead;

    @Basic
    private String amount;

    @Basic
    private String dueDuration;

    @OneToMany(mappedBy = "Fees_Template")
    private List<Late_Fee> late_Fees;

    @OneToMany(mappedBy = "Fees_Template")
    private List<Payments> paymentses;

    @OneToMany(mappedBy = "Fees_Template")
    private List<FeeUsers> feeUserses;

    public Long getFee_id() {
        return fee_id;
    }

    public void setFee_id(Long fee_id) {
        this.fee_id = fee_id;
    }

    public int getInstitution_id() {
        return institution_id;
    }

    public void setInstitution_id(int institution_id) {
        this.institution_id = institution_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSub_category() {
        return sub_category;
    }

    public void setSub_category(String sub_category) {
        this.sub_category = sub_category;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public String getRecurring_period() {
        return recurring_period;
    }

    public void setRecurring_period(String recurring_period) {
        this.recurring_period = recurring_period;
    }

    public LocalDate getRecurring_start_date() {
        return recurring_start_date;
    }

    public void setRecurring_start_date(LocalDate recurring_start_date) {
        this.recurring_start_date = recurring_start_date;
    }

    public LocalDate getRecurring_end_date() {
        return recurring_end_date;
    }

    public void setRecurring_end_date(LocalDate recurring_end_date) {
        this.recurring_end_date = recurring_end_date;
    }

    public int getCan_split() {
        return can_split;
    }

    public void setCan_split(int can_split) {
        this.can_split = can_split;
    }

    public int getMax_split() {
        return max_split;
    }

    public void setMax_split(int max_split) {
        this.max_split = max_split;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
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

    public String getLateFee() {
        return lateFee;
    }

    public void setLateFee(String lateFee) {
        this.lateFee = lateFee;
    }

    public String getIsFeehead() {
        return isFeehead;
    }

    public void setIsFeehead(String isFeehead) {
        this.isFeehead = isFeehead;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDueDuration() {
        return dueDuration;
    }

    public void setDueDuration(String dueDuration) {
        this.dueDuration = dueDuration;
    }

    public List<Late_Fee> getLate_Fees() {
        if (late_Fees == null) {
            late_Fees = new ArrayList<>();
        }
        return late_Fees;
    }

    public void setLate_Fees(List<Late_Fee> late_Fees) {
        this.late_Fees = late_Fees;
    }

    public void addLate_Fee(Late_Fee late_Fee) {
        getLate_Fees().add(late_Fee);
    }

    public void removeLate_Fee(Late_Fee late_Fee) {
        getLate_Fees().remove(late_Fee);
    }

    public Institutions getInstitute() {
        return institute;
    }

    public void setInstitute(Institutions institute) {
        this.institute = institute;
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