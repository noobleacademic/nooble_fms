package in.nooble.institution.entities;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 * @author User
 */
@Entity
public class Late_Fee {

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
    private String fee_id;

    @Basic
    private String amount;

    @Basic
    private String billing_date;

    @Basic
    private String due_date;

    @Basic
    private String created_at;

    @Basic
    private String updated_at;

    @ManyToMany
    private List<Payments> paymentses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFee_id() {
        return fee_id;
    }

    public void setFee_id(String fee_id) {
        this.fee_id = fee_id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBilling_date() {
        return billing_date;
    }

    public void setBilling_date(String billing_date) {
        this.billing_date = billing_date;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
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
        paymentse.getLate_Fees().add(this);
    }

    public void removePaymentse(Payments paymentse) {
        getPaymentses().remove(paymentse);
        paymentse.getLate_Fees().remove(this);
    }

}