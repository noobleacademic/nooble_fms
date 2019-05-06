package in.nooble.institution.entities;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * @author User
 */
@Entity
public class Payments {

    @Id
    @GeneratedValue
    private Long payment_id;
    @ManyToOne
    private Fees_template Fees_Template;
    @ManyToOne
    private Users user;
    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    public Fees_template getFees_Template() {
        return Fees_Template;
    }

    public void setFees_Template(Fees_template fees_Template) {
        Fees_Template = fees_Template;
    }

    @Basic
    private String fee_id;

    @Basic
    private String user_id;

    @Basic
    private String parent_id;

    @Basic
    private String status;

    @Basic
    private String billing_date;

    @Basic
    private String due_date;

    @Basic
    private String amount;

    @Basic
    private String paid_amount;

    @Basic
    private String paid_date;

    @Basic
    private String is_split;

    @Basic
    private String transacation_id;

    @Basic
    private String completed;

    @Basic
    private String created_at;

    @Basic
    private String updated_at;

    @Basic
    private String mytextt;

    @Basic
    private String lateFee;

    @Basic
    private String mode;

    @Basic
    private String updatedBy;

    @Basic
    private String invoice;

    @ManyToOne
    private PaymentSplit paymentSplit;

    @ManyToOne
    private TransactionHistory transactionHistory;

    @ManyToMany(mappedBy = "paymentses")
    private List<Late_Fee> late_Fees;

    public Long getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Long payment_id) {
        this.payment_id = payment_id;
    }

    public String getFee_id() {
        return fee_id;
    }

    public void setFee_id(String fee_id) {
        this.fee_id = fee_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPaid_amount() {
        return paid_amount;
    }

    public void setPaid_amount(String paid_amount) {
        this.paid_amount = paid_amount;
    }

    public String getPaid_date() {
        return paid_date;
    }

    public void setPaid_date(String paid_date) {
        this.paid_date = paid_date;
    }

    public String getIs_split() {
        return is_split;
    }

    public void setIs_split(String is_split) {
        this.is_split = is_split;
    }

    public String getTransacation_id() {
        return transacation_id;
    }

    public void setTransacation_id(String transacation_id) {
        this.transacation_id = transacation_id;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
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

    public String getMytextt() {
        return mytextt;
    }

    public void setMytextt(String mytextt) {
        this.mytextt = mytextt;
    }

    public String getLateFee() {
        return lateFee;
    }

    public void setLateFee(String lateFee) {
        this.lateFee = lateFee;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public PaymentSplit getPaymentSplit() {
        return paymentSplit;
    }

    public void setPaymentSplit(PaymentSplit paymentSplit) {
        this.paymentSplit = paymentSplit;
    }

    public TransactionHistory getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(TransactionHistory transactionHistory) {
        this.transactionHistory = transactionHistory;
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

}