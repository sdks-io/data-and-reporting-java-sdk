/*
 * ShellDataReportingAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for SearchDocReq type.
 */
public class SearchDocReq {
    private String payerNumber;
    private OptionalNullable<String> accountNumber;
    private List<String> accountNumberList;
    private OptionalNullable<String> invoiceNumber;
    private List<String> invoiceNumberList;
    private OptionalNullable<String> invoiceStatus;
    private OptionalNullable<String> issuingDateFrom;
    private OptionalNullable<String> issuingDateTo;
    private OptionalNullable<String> dueDateFrom;
    private OptionalNullable<String> dueDateTo;
    private OptionalNullable<String> grossAmount;
    private OptionalNullable<String> grossAmountOperator;
    private OptionalNullable<String> documentType;
    private OptionalNullable<String> vATIssuerCountry;
    private List<String> sortyBy;
    private Integer colCoCode;

    /**
     * Default constructor.
     */
    public SearchDocReq() {
    }

    /**
     * Initialization constructor.
     * @param  payerNumber  String value for payerNumber.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  accountNumber  String value for accountNumber.
     * @param  accountNumberList  List of String value for accountNumberList.
     * @param  invoiceNumber  String value for invoiceNumber.
     * @param  invoiceNumberList  List of String value for invoiceNumberList.
     * @param  invoiceStatus  String value for invoiceStatus.
     * @param  issuingDateFrom  String value for issuingDateFrom.
     * @param  issuingDateTo  String value for issuingDateTo.
     * @param  dueDateFrom  String value for dueDateFrom.
     * @param  dueDateTo  String value for dueDateTo.
     * @param  grossAmount  String value for grossAmount.
     * @param  grossAmountOperator  String value for grossAmountOperator.
     * @param  documentType  String value for documentType.
     * @param  vATIssuerCountry  String value for vATIssuerCountry.
     * @param  sortyBy  List of String value for sortyBy.
     */
    public SearchDocReq(
            String payerNumber,
            Integer colCoCode,
            String accountNumber,
            List<String> accountNumberList,
            String invoiceNumber,
            List<String> invoiceNumberList,
            String invoiceStatus,
            String issuingDateFrom,
            String issuingDateTo,
            String dueDateFrom,
            String dueDateTo,
            String grossAmount,
            String grossAmountOperator,
            String documentType,
            String vATIssuerCountry,
            List<String> sortyBy) {
        this.payerNumber = payerNumber;
        this.accountNumber = OptionalNullable.of(accountNumber);
        this.accountNumberList = accountNumberList;
        this.invoiceNumber = OptionalNullable.of(invoiceNumber);
        this.invoiceNumberList = invoiceNumberList;
        this.invoiceStatus = OptionalNullable.of(invoiceStatus);
        this.issuingDateFrom = OptionalNullable.of(issuingDateFrom);
        this.issuingDateTo = OptionalNullable.of(issuingDateTo);
        this.dueDateFrom = OptionalNullable.of(dueDateFrom);
        this.dueDateTo = OptionalNullable.of(dueDateTo);
        this.grossAmount = OptionalNullable.of(grossAmount);
        this.grossAmountOperator = OptionalNullable.of(grossAmountOperator);
        this.documentType = OptionalNullable.of(documentType);
        this.vATIssuerCountry = OptionalNullable.of(vATIssuerCountry);
        this.sortyBy = sortyBy;
        this.colCoCode = colCoCode;
    }

    /**
     * Initialization constructor.
     * @param  payerNumber  String value for payerNumber.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  accountNumber  String value for accountNumber.
     * @param  accountNumberList  List of String value for accountNumberList.
     * @param  invoiceNumber  String value for invoiceNumber.
     * @param  invoiceNumberList  List of String value for invoiceNumberList.
     * @param  invoiceStatus  String value for invoiceStatus.
     * @param  issuingDateFrom  String value for issuingDateFrom.
     * @param  issuingDateTo  String value for issuingDateTo.
     * @param  dueDateFrom  String value for dueDateFrom.
     * @param  dueDateTo  String value for dueDateTo.
     * @param  grossAmount  String value for grossAmount.
     * @param  grossAmountOperator  String value for grossAmountOperator.
     * @param  documentType  String value for documentType.
     * @param  vATIssuerCountry  String value for vATIssuerCountry.
     * @param  sortyBy  List of String value for sortyBy.
     */

    protected SearchDocReq(String payerNumber, Integer colCoCode,
            OptionalNullable<String> accountNumber, List<String> accountNumberList,
            OptionalNullable<String> invoiceNumber, List<String> invoiceNumberList,
            OptionalNullable<String> invoiceStatus, OptionalNullable<String> issuingDateFrom,
            OptionalNullable<String> issuingDateTo, OptionalNullable<String> dueDateFrom,
            OptionalNullable<String> dueDateTo, OptionalNullable<String> grossAmount,
            OptionalNullable<String> grossAmountOperator, OptionalNullable<String> documentType,
            OptionalNullable<String> vATIssuerCountry, List<String> sortyBy) {
        this.payerNumber = payerNumber;
        this.accountNumber = accountNumber;
        this.accountNumberList = accountNumberList;
        this.invoiceNumber = invoiceNumber;
        this.invoiceNumberList = invoiceNumberList;
        this.invoiceStatus = invoiceStatus;
        this.issuingDateFrom = issuingDateFrom;
        this.issuingDateTo = issuingDateTo;
        this.dueDateFrom = dueDateFrom;
        this.dueDateTo = dueDateTo;
        this.grossAmount = grossAmount;
        this.grossAmountOperator = grossAmountOperator;
        this.documentType = documentType;
        this.vATIssuerCountry = vATIssuerCountry;
        this.sortyBy = sortyBy;
        this.colCoCode = colCoCode;
    }

    /**
     * Getter for PayerNumber.
     * Payer Number of the selected payer. Mandatory Example: GB000000123
     * @return Returns the String
     */
    @JsonGetter("PayerNumber")
    public String getPayerNumber() {
        return payerNumber;
    }

    /**
     * Setter for PayerNumber.
     * Payer Number of the selected payer. Mandatory Example: GB000000123
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = payerNumber;
    }

    /**
     * Internal Getter for AccountNumber.
     * Account Number of the customer. Mandatory for customer users else optional. This input is a
     * search criterion, if given. Example: GB000000123
     * @return Returns the Internal String
     */
    @JsonGetter("AccountNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Getter for AccountNumber.
     * Account Number of the customer. Mandatory for customer users else optional. This input is a
     * search criterion, if given. Example: GB000000123
     * @return Returns the String
     */
    public String getAccountNumber() {
        return OptionalNullable.getFrom(accountNumber);
    }

    /**
     * Setter for AccountNumber.
     * Account Number of the customer. Mandatory for customer users else optional. This input is a
     * search criterion, if given. Example: GB000000123
     * @param accountNumber Value for String
     */
    @JsonSetter("AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = OptionalNullable.of(accountNumber);
    }

    /**
     * UnSetter for AccountNumber.
     * Account Number of the customer. Mandatory for customer users else optional. This input is a
     * search criterion, if given. Example: GB000000123
     */
    public void unsetAccountNumber() {
        accountNumber = null;
    }

    /**
     * Getter for AccountNumberList.
     * Account Number of the customers. optional. This input is a search criterion, if given.
     * Example: [“GB00000123”, “GB00000225”]
     * @return Returns the List of String
     */
    @JsonGetter("AccountNumberList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getAccountNumberList() {
        return accountNumberList;
    }

    /**
     * Setter for AccountNumberList.
     * Account Number of the customers. optional. This input is a search criterion, if given.
     * Example: [“GB00000123”, “GB00000225”]
     * @param accountNumberList Value for List of String
     */
    @JsonSetter("AccountNumberList")
    public void setAccountNumberList(List<String> accountNumberList) {
        this.accountNumberList = accountNumberList;
    }

    /**
     * Internal Getter for InvoiceNumber.
     * Invoice number. Optional if InvoiceNumberList is passed else Mandatory This input is a search
     * criterion, if given. Example: 0123456789
     * @return Returns the Internal String
     */
    @JsonGetter("InvoiceNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetInvoiceNumber() {
        return this.invoiceNumber;
    }

    /**
     * Getter for InvoiceNumber.
     * Invoice number. Optional if InvoiceNumberList is passed else Mandatory This input is a search
     * criterion, if given. Example: 0123456789
     * @return Returns the String
     */
    public String getInvoiceNumber() {
        return OptionalNullable.getFrom(invoiceNumber);
    }

    /**
     * Setter for InvoiceNumber.
     * Invoice number. Optional if InvoiceNumberList is passed else Mandatory This input is a search
     * criterion, if given. Example: 0123456789
     * @param invoiceNumber Value for String
     */
    @JsonSetter("InvoiceNumber")
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = OptionalNullable.of(invoiceNumber);
    }

    /**
     * UnSetter for InvoiceNumber.
     * Invoice number. Optional if InvoiceNumberList is passed else Mandatory This input is a search
     * criterion, if given. Example: 0123456789
     */
    public void unsetInvoiceNumber() {
        invoiceNumber = null;
    }

    /**
     * Getter for InvoiceNumberList.
     * List of Invoice number. Optional if InvoiceNumber is passed else Mandatory Example:
     * [“0123456789”, “0123459799”]
     * @return Returns the List of String
     */
    @JsonGetter("InvoiceNumberList")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getInvoiceNumberList() {
        return invoiceNumberList;
    }

    /**
     * Setter for InvoiceNumberList.
     * List of Invoice number. Optional if InvoiceNumber is passed else Mandatory Example:
     * [“0123456789”, “0123459799”]
     * @param invoiceNumberList Value for List of String
     */
    @JsonSetter("InvoiceNumberList")
    public void setInvoiceNumberList(List<String> invoiceNumberList) {
        this.invoiceNumberList = invoiceNumberList;
    }

    /**
     * Internal Getter for InvoiceStatus.
     * The status of the invoices Optional One of the following values: • NEW • VIEWED • DOWNLOADED
     * • RESTORED
     * @return Returns the Internal String
     */
    @JsonGetter("InvoiceStatus")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetInvoiceStatus() {
        return this.invoiceStatus;
    }

    /**
     * Getter for InvoiceStatus.
     * The status of the invoices Optional One of the following values: • NEW • VIEWED • DOWNLOADED
     * • RESTORED
     * @return Returns the String
     */
    public String getInvoiceStatus() {
        return OptionalNullable.getFrom(invoiceStatus);
    }

    /**
     * Setter for InvoiceStatus.
     * The status of the invoices Optional One of the following values: • NEW • VIEWED • DOWNLOADED
     * • RESTORED
     * @param invoiceStatus Value for String
     */
    @JsonSetter("InvoiceStatus")
    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = OptionalNullable.of(invoiceStatus);
    }

    /**
     * UnSetter for InvoiceStatus.
     * The status of the invoices Optional One of the following values: • NEW • VIEWED • DOWNLOADED
     * • RESTORED
     */
    public void unsetInvoiceStatus() {
        invoiceStatus = null;
    }

    /**
     * Internal Getter for IssuingDateFrom.
     * Invoice Issuing Date Range/From Optional Format: yyyy/MM/dd
     * @return Returns the Internal String
     */
    @JsonGetter("IssuingDateFrom")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetIssuingDateFrom() {
        return this.issuingDateFrom;
    }

    /**
     * Getter for IssuingDateFrom.
     * Invoice Issuing Date Range/From Optional Format: yyyy/MM/dd
     * @return Returns the String
     */
    public String getIssuingDateFrom() {
        return OptionalNullable.getFrom(issuingDateFrom);
    }

    /**
     * Setter for IssuingDateFrom.
     * Invoice Issuing Date Range/From Optional Format: yyyy/MM/dd
     * @param issuingDateFrom Value for String
     */
    @JsonSetter("IssuingDateFrom")
    public void setIssuingDateFrom(String issuingDateFrom) {
        this.issuingDateFrom = OptionalNullable.of(issuingDateFrom);
    }

    /**
     * UnSetter for IssuingDateFrom.
     * Invoice Issuing Date Range/From Optional Format: yyyy/MM/dd
     */
    public void unsetIssuingDateFrom() {
        issuingDateFrom = null;
    }

    /**
     * Internal Getter for IssuingDateTo.
     * Invoice Issuing Date Range/To Optional Format: yyyy/MM/dd
     * @return Returns the Internal String
     */
    @JsonGetter("IssuingDateTo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetIssuingDateTo() {
        return this.issuingDateTo;
    }

    /**
     * Getter for IssuingDateTo.
     * Invoice Issuing Date Range/To Optional Format: yyyy/MM/dd
     * @return Returns the String
     */
    public String getIssuingDateTo() {
        return OptionalNullable.getFrom(issuingDateTo);
    }

    /**
     * Setter for IssuingDateTo.
     * Invoice Issuing Date Range/To Optional Format: yyyy/MM/dd
     * @param issuingDateTo Value for String
     */
    @JsonSetter("IssuingDateTo")
    public void setIssuingDateTo(String issuingDateTo) {
        this.issuingDateTo = OptionalNullable.of(issuingDateTo);
    }

    /**
     * UnSetter for IssuingDateTo.
     * Invoice Issuing Date Range/To Optional Format: yyyy/MM/dd
     */
    public void unsetIssuingDateTo() {
        issuingDateTo = null;
    }

    /**
     * Internal Getter for DueDateFrom.
     * Invoice Due Date Range/From Optional Format: yyyy/MM/dd
     * @return Returns the Internal String
     */
    @JsonGetter("DueDateFrom")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDueDateFrom() {
        return this.dueDateFrom;
    }

    /**
     * Getter for DueDateFrom.
     * Invoice Due Date Range/From Optional Format: yyyy/MM/dd
     * @return Returns the String
     */
    public String getDueDateFrom() {
        return OptionalNullable.getFrom(dueDateFrom);
    }

    /**
     * Setter for DueDateFrom.
     * Invoice Due Date Range/From Optional Format: yyyy/MM/dd
     * @param dueDateFrom Value for String
     */
    @JsonSetter("DueDateFrom")
    public void setDueDateFrom(String dueDateFrom) {
        this.dueDateFrom = OptionalNullable.of(dueDateFrom);
    }

    /**
     * UnSetter for DueDateFrom.
     * Invoice Due Date Range/From Optional Format: yyyy/MM/dd
     */
    public void unsetDueDateFrom() {
        dueDateFrom = null;
    }

    /**
     * Internal Getter for DueDateTo.
     * Invoice Due Date Range/To Optional Format: yyyy/MM/dd
     * @return Returns the Internal String
     */
    @JsonGetter("DueDateTo")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDueDateTo() {
        return this.dueDateTo;
    }

    /**
     * Getter for DueDateTo.
     * Invoice Due Date Range/To Optional Format: yyyy/MM/dd
     * @return Returns the String
     */
    public String getDueDateTo() {
        return OptionalNullable.getFrom(dueDateTo);
    }

    /**
     * Setter for DueDateTo.
     * Invoice Due Date Range/To Optional Format: yyyy/MM/dd
     * @param dueDateTo Value for String
     */
    @JsonSetter("DueDateTo")
    public void setDueDateTo(String dueDateTo) {
        this.dueDateTo = OptionalNullable.of(dueDateTo);
    }

    /**
     * UnSetter for DueDateTo.
     * Invoice Due Date Range/To Optional Format: yyyy/MM/dd
     */
    public void unsetDueDateTo() {
        dueDateTo = null;
    }

    /**
     * Internal Getter for GrossAmount.
     * Gross amount of the bill. Optional
     * @return Returns the Internal String
     */
    @JsonGetter("GrossAmount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetGrossAmount() {
        return this.grossAmount;
    }

    /**
     * Getter for GrossAmount.
     * Gross amount of the bill. Optional
     * @return Returns the String
     */
    public String getGrossAmount() {
        return OptionalNullable.getFrom(grossAmount);
    }

    /**
     * Setter for GrossAmount.
     * Gross amount of the bill. Optional
     * @param grossAmount Value for String
     */
    @JsonSetter("GrossAmount")
    public void setGrossAmount(String grossAmount) {
        this.grossAmount = OptionalNullable.of(grossAmount);
    }

    /**
     * UnSetter for GrossAmount.
     * Gross amount of the bill. Optional
     */
    public void unsetGrossAmount() {
        grossAmount = null;
    }

    /**
     * Internal Getter for GrossAmountOperator.
     * Criteria on the gross amount, for instance use GT when to retrieve the invoices for that
     * gross amount is greater than the given amount on GrossAmount parameter above. Optional This
     * parameter will be ignored if GrossAmount parameter is not set. One of the following values: •
     * LT (Less Than) • LE (Lesser or Equal) • EQ (equal) • GE (Greater or equal) • GT (Greater
     * than)
     * @return Returns the Internal String
     */
    @JsonGetter("GrossAmountOperator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetGrossAmountOperator() {
        return this.grossAmountOperator;
    }

    /**
     * Getter for GrossAmountOperator.
     * Criteria on the gross amount, for instance use GT when to retrieve the invoices for that
     * gross amount is greater than the given amount on GrossAmount parameter above. Optional This
     * parameter will be ignored if GrossAmount parameter is not set. One of the following values: •
     * LT (Less Than) • LE (Lesser or Equal) • EQ (equal) • GE (Greater or equal) • GT (Greater
     * than)
     * @return Returns the String
     */
    public String getGrossAmountOperator() {
        return OptionalNullable.getFrom(grossAmountOperator);
    }

    /**
     * Setter for GrossAmountOperator.
     * Criteria on the gross amount, for instance use GT when to retrieve the invoices for that
     * gross amount is greater than the given amount on GrossAmount parameter above. Optional This
     * parameter will be ignored if GrossAmount parameter is not set. One of the following values: •
     * LT (Less Than) • LE (Lesser or Equal) • EQ (equal) • GE (Greater or equal) • GT (Greater
     * than)
     * @param grossAmountOperator Value for String
     */
    @JsonSetter("GrossAmountOperator")
    public void setGrossAmountOperator(String grossAmountOperator) {
        this.grossAmountOperator = OptionalNullable.of(grossAmountOperator);
    }

    /**
     * UnSetter for GrossAmountOperator.
     * Criteria on the gross amount, for instance use GT when to retrieve the invoices for that
     * gross amount is greater than the given amount on GrossAmount parameter above. Optional This
     * parameter will be ignored if GrossAmount parameter is not set. One of the following values: •
     * LT (Less Than) • LE (Lesser or Equal) • EQ (equal) • GE (Greater or equal) • GT (Greater
     * than)
     */
    public void unsetGrossAmountOperator() {
        grossAmountOperator = null;
    }

    /**
     * Internal Getter for DocumentType.
     * Document Type Optional One of the following values: • NAT (National) • INT (International) •
     * SOA (Statement of Account)
     * @return Returns the Internal String
     */
    @JsonGetter("DocumentType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDocumentType() {
        return this.documentType;
    }

    /**
     * Getter for DocumentType.
     * Document Type Optional One of the following values: • NAT (National) • INT (International) •
     * SOA (Statement of Account)
     * @return Returns the String
     */
    public String getDocumentType() {
        return OptionalNullable.getFrom(documentType);
    }

    /**
     * Setter for DocumentType.
     * Document Type Optional One of the following values: • NAT (National) • INT (International) •
     * SOA (Statement of Account)
     * @param documentType Value for String
     */
    @JsonSetter("DocumentType")
    public void setDocumentType(String documentType) {
        this.documentType = OptionalNullable.of(documentType);
    }

    /**
     * UnSetter for DocumentType.
     * Document Type Optional One of the following values: • NAT (National) • INT (International) •
     * SOA (Statement of Account)
     */
    public void unsetDocumentType() {
        documentType = null;
    }

    /**
     * Internal Getter for VATIssuerCountry.
     * Two letter ISO country code.
     * @return Returns the Internal String
     */
    @JsonGetter("VATIssuerCountry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetVATIssuerCountry() {
        return this.vATIssuerCountry;
    }

    /**
     * Getter for VATIssuerCountry.
     * Two letter ISO country code.
     * @return Returns the String
     */
    public String getVATIssuerCountry() {
        return OptionalNullable.getFrom(vATIssuerCountry);
    }

    /**
     * Setter for VATIssuerCountry.
     * Two letter ISO country code.
     * @param vATIssuerCountry Value for String
     */
    @JsonSetter("VATIssuerCountry")
    public void setVATIssuerCountry(String vATIssuerCountry) {
        this.vATIssuerCountry = OptionalNullable.of(vATIssuerCountry);
    }

    /**
     * UnSetter for VATIssuerCountry.
     * Two letter ISO country code.
     */
    public void unsetVATIssuerCountry() {
        vATIssuerCountry = null;
    }

    /**
     * Getter for SortyBy.
     * Collecting Company Code of the selected payer. Mandatory Example: 86-Philippines 5-UK
     * @return Returns the List of String
     */
    @JsonGetter("SortyBy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getSortyBy() {
        return sortyBy;
    }

    /**
     * Setter for SortyBy.
     * Collecting Company Code of the selected payer. Mandatory Example: 86-Philippines 5-UK
     * @param sortyBy Value for List of String
     */
    @JsonSetter("SortyBy")
    public void setSortyBy(List<String> sortyBy) {
        this.sortyBy = sortyBy;
    }

    /**
     * Getter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory Example: 86-Philippines 5-UK
     * @return Returns the Integer
     */
    @JsonGetter("ColCoCode")
    public Integer getColCoCode() {
        return colCoCode;
    }

    /**
     * Setter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory Example: 86-Philippines 5-UK
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = colCoCode;
    }

    /**
     * Converts this SearchDocReq into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SearchDocReq [" + "payerNumber=" + payerNumber + ", colCoCode=" + colCoCode
                + ", accountNumber=" + accountNumber + ", accountNumberList=" + accountNumberList
                + ", invoiceNumber=" + invoiceNumber + ", invoiceNumberList=" + invoiceNumberList
                + ", invoiceStatus=" + invoiceStatus + ", issuingDateFrom=" + issuingDateFrom
                + ", issuingDateTo=" + issuingDateTo + ", dueDateFrom=" + dueDateFrom
                + ", dueDateTo=" + dueDateTo + ", grossAmount=" + grossAmount
                + ", grossAmountOperator=" + grossAmountOperator + ", documentType=" + documentType
                + ", vATIssuerCountry=" + vATIssuerCountry + ", sortyBy=" + sortyBy + "]";
    }

    /**
     * Builds a new {@link SearchDocReq.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SearchDocReq.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(payerNumber, colCoCode)
                .accountNumberList(getAccountNumberList())
                .invoiceNumberList(getInvoiceNumberList())
                .sortyBy(getSortyBy());
        builder.accountNumber = internalGetAccountNumber();
        builder.invoiceNumber = internalGetInvoiceNumber();
        builder.invoiceStatus = internalGetInvoiceStatus();
        builder.issuingDateFrom = internalGetIssuingDateFrom();
        builder.issuingDateTo = internalGetIssuingDateTo();
        builder.dueDateFrom = internalGetDueDateFrom();
        builder.dueDateTo = internalGetDueDateTo();
        builder.grossAmount = internalGetGrossAmount();
        builder.grossAmountOperator = internalGetGrossAmountOperator();
        builder.documentType = internalGetDocumentType();
        builder.vATIssuerCountry = internalGetVATIssuerCountry();
        return builder;
    }

    /**
     * Class to build instances of {@link SearchDocReq}.
     */
    public static class Builder {
        private String payerNumber;
        private Integer colCoCode;
        private OptionalNullable<String> accountNumber;
        private List<String> accountNumberList;
        private OptionalNullable<String> invoiceNumber;
        private List<String> invoiceNumberList;
        private OptionalNullable<String> invoiceStatus;
        private OptionalNullable<String> issuingDateFrom;
        private OptionalNullable<String> issuingDateTo;
        private OptionalNullable<String> dueDateFrom;
        private OptionalNullable<String> dueDateTo;
        private OptionalNullable<String> grossAmount;
        private OptionalNullable<String> grossAmountOperator;
        private OptionalNullable<String> documentType;
        private OptionalNullable<String> vATIssuerCountry;
        private List<String> sortyBy;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  payerNumber  String value for payerNumber.
         * @param  colCoCode  Integer value for colCoCode.
         */
        public Builder(String payerNumber, Integer colCoCode) {
            this.payerNumber = payerNumber;
            this.colCoCode = colCoCode;
        }

        /**
         * Setter for payerNumber.
         * @param  payerNumber  String value for payerNumber.
         * @return Builder
         */
        public Builder payerNumber(String payerNumber) {
            this.payerNumber = payerNumber;
            return this;
        }

        /**
         * Setter for colCoCode.
         * @param  colCoCode  Integer value for colCoCode.
         * @return Builder
         */
        public Builder colCoCode(Integer colCoCode) {
            this.colCoCode = colCoCode;
            return this;
        }

        /**
         * Setter for accountNumber.
         * @param  accountNumber  String value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = OptionalNullable.of(accountNumber);
            return this;
        }

        /**
         * UnSetter for accountNumber.
         * @return Builder
         */
        public Builder unsetAccountNumber() {
            accountNumber = null;
            return this;
        }

        /**
         * Setter for accountNumberList.
         * @param  accountNumberList  List of String value for accountNumberList.
         * @return Builder
         */
        public Builder accountNumberList(List<String> accountNumberList) {
            this.accountNumberList = accountNumberList;
            return this;
        }

        /**
         * Setter for invoiceNumber.
         * @param  invoiceNumber  String value for invoiceNumber.
         * @return Builder
         */
        public Builder invoiceNumber(String invoiceNumber) {
            this.invoiceNumber = OptionalNullable.of(invoiceNumber);
            return this;
        }

        /**
         * UnSetter for invoiceNumber.
         * @return Builder
         */
        public Builder unsetInvoiceNumber() {
            invoiceNumber = null;
            return this;
        }

        /**
         * Setter for invoiceNumberList.
         * @param  invoiceNumberList  List of String value for invoiceNumberList.
         * @return Builder
         */
        public Builder invoiceNumberList(List<String> invoiceNumberList) {
            this.invoiceNumberList = invoiceNumberList;
            return this;
        }

        /**
         * Setter for invoiceStatus.
         * @param  invoiceStatus  String value for invoiceStatus.
         * @return Builder
         */
        public Builder invoiceStatus(String invoiceStatus) {
            this.invoiceStatus = OptionalNullable.of(invoiceStatus);
            return this;
        }

        /**
         * UnSetter for invoiceStatus.
         * @return Builder
         */
        public Builder unsetInvoiceStatus() {
            invoiceStatus = null;
            return this;
        }

        /**
         * Setter for issuingDateFrom.
         * @param  issuingDateFrom  String value for issuingDateFrom.
         * @return Builder
         */
        public Builder issuingDateFrom(String issuingDateFrom) {
            this.issuingDateFrom = OptionalNullable.of(issuingDateFrom);
            return this;
        }

        /**
         * UnSetter for issuingDateFrom.
         * @return Builder
         */
        public Builder unsetIssuingDateFrom() {
            issuingDateFrom = null;
            return this;
        }

        /**
         * Setter for issuingDateTo.
         * @param  issuingDateTo  String value for issuingDateTo.
         * @return Builder
         */
        public Builder issuingDateTo(String issuingDateTo) {
            this.issuingDateTo = OptionalNullable.of(issuingDateTo);
            return this;
        }

        /**
         * UnSetter for issuingDateTo.
         * @return Builder
         */
        public Builder unsetIssuingDateTo() {
            issuingDateTo = null;
            return this;
        }

        /**
         * Setter for dueDateFrom.
         * @param  dueDateFrom  String value for dueDateFrom.
         * @return Builder
         */
        public Builder dueDateFrom(String dueDateFrom) {
            this.dueDateFrom = OptionalNullable.of(dueDateFrom);
            return this;
        }

        /**
         * UnSetter for dueDateFrom.
         * @return Builder
         */
        public Builder unsetDueDateFrom() {
            dueDateFrom = null;
            return this;
        }

        /**
         * Setter for dueDateTo.
         * @param  dueDateTo  String value for dueDateTo.
         * @return Builder
         */
        public Builder dueDateTo(String dueDateTo) {
            this.dueDateTo = OptionalNullable.of(dueDateTo);
            return this;
        }

        /**
         * UnSetter for dueDateTo.
         * @return Builder
         */
        public Builder unsetDueDateTo() {
            dueDateTo = null;
            return this;
        }

        /**
         * Setter for grossAmount.
         * @param  grossAmount  String value for grossAmount.
         * @return Builder
         */
        public Builder grossAmount(String grossAmount) {
            this.grossAmount = OptionalNullable.of(grossAmount);
            return this;
        }

        /**
         * UnSetter for grossAmount.
         * @return Builder
         */
        public Builder unsetGrossAmount() {
            grossAmount = null;
            return this;
        }

        /**
         * Setter for grossAmountOperator.
         * @param  grossAmountOperator  String value for grossAmountOperator.
         * @return Builder
         */
        public Builder grossAmountOperator(String grossAmountOperator) {
            this.grossAmountOperator = OptionalNullable.of(grossAmountOperator);
            return this;
        }

        /**
         * UnSetter for grossAmountOperator.
         * @return Builder
         */
        public Builder unsetGrossAmountOperator() {
            grossAmountOperator = null;
            return this;
        }

        /**
         * Setter for documentType.
         * @param  documentType  String value for documentType.
         * @return Builder
         */
        public Builder documentType(String documentType) {
            this.documentType = OptionalNullable.of(documentType);
            return this;
        }

        /**
         * UnSetter for documentType.
         * @return Builder
         */
        public Builder unsetDocumentType() {
            documentType = null;
            return this;
        }

        /**
         * Setter for vATIssuerCountry.
         * @param  vATIssuerCountry  String value for vATIssuerCountry.
         * @return Builder
         */
        public Builder vATIssuerCountry(String vATIssuerCountry) {
            this.vATIssuerCountry = OptionalNullable.of(vATIssuerCountry);
            return this;
        }

        /**
         * UnSetter for vATIssuerCountry.
         * @return Builder
         */
        public Builder unsetVATIssuerCountry() {
            vATIssuerCountry = null;
            return this;
        }

        /**
         * Setter for sortyBy.
         * @param  sortyBy  List of String value for sortyBy.
         * @return Builder
         */
        public Builder sortyBy(List<String> sortyBy) {
            this.sortyBy = sortyBy;
            return this;
        }

        /**
         * Builds a new {@link SearchDocReq} object using the set fields.
         * @return {@link SearchDocReq}
         */
        public SearchDocReq build() {
            return new SearchDocReq(payerNumber, colCoCode, accountNumber, accountNumberList,
                    invoiceNumber, invoiceNumberList, invoiceStatus, issuingDateFrom, issuingDateTo,
                    dueDateFrom, dueDateTo, grossAmount, grossAmountOperator, documentType,
                    vATIssuerCountry, sortyBy);
        }
    }
}
