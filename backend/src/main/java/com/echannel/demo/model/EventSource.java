package com.echannel.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "event_source")
public class EventSource {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "business_key")
	private String businessKey;

	@Column(name = "priority")
	private String priority;

	@Column(name = "source_bu")
	private String sourceBu;
	
	@Column(name = "dcp_reference")
	private String dcpReference;

	@Column(name = "account_name")
	private String accountName;

	@Column(name = "transaction_currency")
	private String transactionCurrency;
	
	@Column(name = "transaction_amount")
	private Number transactionAmount;

	@Column(name = "locked_by")
	private String lockedBy;

	@Column(name = "debit_account_number")
	private String debitAccountNumber;
	
	@Column(name = "account_currency")
	private String accountCurrency;

	@Column(name = "beneficiary_name")
	private String beneficiaryName;

	@Column(name = "cust_info_mkr")
	private String custInfoMkr;
	
	@Column(name = "account_info_mkr")
	private String accountInfoMkr;

	@Column(name = "outcome")
	private String outcome;

	@Column(name = "extension")
	private String extension;
	
	@Column(name = "contact_person")
	private String contactPerson;

	@Column(name = "customer_called_on")
	private String customerCalledOn;

	@Column(name = "comment")
	private String comment;
	
	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_on")
	private LocalDateTime createdOn;

	@Column(name = "updated_by")
	private String updatedBy;
	
	@Column(name = "updated_on")
	private LocalDateTime updatedOn;

	@Column(name = "status")
	private String status;

	public EventSource() {

	}

	public EventSource(String businessKey, String priority, String sourceBu, String dcpReference, String accountName,
			String transactionCurrency, Number transactionAmount, String lockedBy, String debitAccountNumber,
			String accountCurrency, String beneficiaryName, String custInfoMkr, String accountInfoMkr, String outcome,
			String extension, String contactPerson, String customerCalledOn, String comment, String createdBy,
			LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn, String status) {
		this.businessKey = businessKey;
		this.priority = priority;
		this.sourceBu = sourceBu;
		this.dcpReference = dcpReference;
		this.accountName = accountName;
		this.transactionCurrency = transactionCurrency;
		this.transactionAmount = transactionAmount;
		this.lockedBy = lockedBy;
		this.debitAccountNumber = debitAccountNumber;
		this.accountCurrency = accountCurrency;
		this.beneficiaryName = beneficiaryName;
		this.custInfoMkr = custInfoMkr;
		this.accountInfoMkr = accountInfoMkr;
		this.outcome = outcome;
		this.extension = extension;
		this.contactPerson = contactPerson;
		this.customerCalledOn = customerCalledOn;
		this.comment = comment;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
		this.status = status;
	}

	@Override
	public String toString() {
		return "EventSource [businessKey=" + businessKey + ", priority=" + priority + ", sourceBu="
				+ sourceBu + ", dcpReference=" + dcpReference + ", accountName=" + accountName
				+ ", transactionCurrency=" + transactionCurrency + ", transactionAmount=" + transactionAmount
				+ ", lockedBy=" + lockedBy + ", debitAccountNumber=" + debitAccountNumber + ", accountCurrency="
				+ accountCurrency + ", beneficiaryName=" + beneficiaryName + ", custInfoMkr=" + custInfoMkr
				+ ", accountInfoMkr=" + accountInfoMkr + ", outcome=" + outcome + ", extension=" + extension
				+ ", contactPerson=" + contactPerson + ", customerCalledOn=" + customerCalledOn + ", comment=" + comment
				+ ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", updatedBy=" + updatedBy + ", updatedOn="
				+ updatedOn + ", status=" + status + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getSourceBu() {
		return sourceBu;
	}

	public void setSourceBu(String sourceBu) {
		this.sourceBu = sourceBu;
	}

	public String getDcpReference() {
		return dcpReference;
	}

	public void setDcpReference(String dcpReference) {
		this.dcpReference = dcpReference;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getTransactionCurrency() {
		return transactionCurrency;
	}

	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}

	public Number getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Number transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getLockedBy() {
		return lockedBy;
	}

	public void setLockedBy(String lockedBy) {
		this.lockedBy = lockedBy;
	}

	public String getDebitAccountNumber() {
		return debitAccountNumber;
	}

	public void setDebitAccountNumber(String debitAccountNumber) {
		this.debitAccountNumber = debitAccountNumber;
	}

	public String getAccountCurrency() {
		return accountCurrency;
	}

	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getCustInfoMkr() {
		return custInfoMkr;
	}

	public void setCustInfoMkr(String custInfoMkr) {
		this.custInfoMkr = custInfoMkr;
	}

	public String getAccountInfoMkr() {
		return accountInfoMkr;
	}

	public void setAccountInfoMkr(String accountInfoMkr) {
		this.accountInfoMkr = accountInfoMkr;
	}

	public String getOutcome() {
		return outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getCustomerCalledOn() {
		return customerCalledOn;
	}

	public void setCustomerCalledOn(String customerCalledOn) {
		this.customerCalledOn = customerCalledOn;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}