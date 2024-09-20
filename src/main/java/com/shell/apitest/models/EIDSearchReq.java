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
 * This is a model class for EIDSearchReq type.
 */
public class EIDSearchReq {
    private Integer colCoCode;
    private Integer accountGroupCountry;
    private List<String> accountGroupId;
    private OptionalNullable<String> accountGroupName;
    private OptionalNullable<String> fromDate;
    private OptionalNullable<String> toDate;
    private OptionalNullable<String> invoiceType;
    private OptionalNullable<String> invoiceStatus;
    private List<String> sortBy;

    /**
     * Default constructor.
     */
    public EIDSearchReq() {
    }

    /**
     * Initialization constructor.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  accountGroupCountry  Integer value for accountGroupCountry.
     * @param  accountGroupId  List of String value for accountGroupId.
     * @param  accountGroupName  String value for accountGroupName.
     * @param  fromDate  String value for fromDate.
     * @param  toDate  String value for toDate.
     * @param  invoiceType  String value for invoiceType.
     * @param  invoiceStatus  String value for invoiceStatus.
     * @param  sortBy  List of String value for sortBy.
     */
    public EIDSearchReq(
            Integer colCoCode,
            Integer accountGroupCountry,
            List<String> accountGroupId,
            String accountGroupName,
            String fromDate,
            String toDate,
            String invoiceType,
            String invoiceStatus,
            List<String> sortBy) {
        this.colCoCode = colCoCode;
        this.accountGroupCountry = accountGroupCountry;
        this.accountGroupId = accountGroupId;
        this.accountGroupName = OptionalNullable.of(accountGroupName);
        this.fromDate = OptionalNullable.of(fromDate);
        this.toDate = OptionalNullable.of(toDate);
        this.invoiceType = OptionalNullable.of(invoiceType);
        this.invoiceStatus = OptionalNullable.of(invoiceStatus);
        this.sortBy = sortBy;
    }

    /**
     * Initialization constructor.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  accountGroupCountry  Integer value for accountGroupCountry.
     * @param  accountGroupId  List of String value for accountGroupId.
     * @param  accountGroupName  String value for accountGroupName.
     * @param  fromDate  String value for fromDate.
     * @param  toDate  String value for toDate.
     * @param  invoiceType  String value for invoiceType.
     * @param  invoiceStatus  String value for invoiceStatus.
     * @param  sortBy  List of String value for sortBy.
     */

    protected EIDSearchReq(Integer colCoCode, Integer accountGroupCountry,
            List<String> accountGroupId, OptionalNullable<String> accountGroupName,
            OptionalNullable<String> fromDate, OptionalNullable<String> toDate,
            OptionalNullable<String> invoiceType, OptionalNullable<String> invoiceStatus,
            List<String> sortBy) {
        this.colCoCode = colCoCode;
        this.accountGroupCountry = accountGroupCountry;
        this.accountGroupId = accountGroupId;
        this.accountGroupName = accountGroupName;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.invoiceType = invoiceType;
        this.invoiceStatus = invoiceStatus;
        this.sortBy = sortBy;
    }

    /**
     * Getter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory
     * @return Returns the Integer
     */
    @JsonGetter("ColCoCode")
    public Integer getColCoCode() {
        return colCoCode;
    }

    /**
     * Setter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = colCoCode;
    }

    /**
     * Getter for AccountGroupCountry.
     * Country code (colco code) of the account group. Mandatory
     * @return Returns the Integer
     */
    @JsonGetter("AccountGroupCountry")
    public Integer getAccountGroupCountry() {
        return accountGroupCountry;
    }

    /**
     * Setter for AccountGroupCountry.
     * Country code (colco code) of the account group. Mandatory
     * @param accountGroupCountry Value for Integer
     */
    @JsonSetter("AccountGroupCountry")
    public void setAccountGroupCountry(Integer accountGroupCountry) {
        this.accountGroupCountry = accountGroupCountry;
    }

    /**
     * Getter for AccountGroupId.
     * List of IDs of the account groups that user has access to. Mandatory
     * @return Returns the List of String
     */
    @JsonGetter("AccountGroupId")
    public List<String> getAccountGroupId() {
        return accountGroupId;
    }

    /**
     * Setter for AccountGroupId.
     * List of IDs of the account groups that user has access to. Mandatory
     * @param accountGroupId Value for List of String
     */
    @JsonSetter("AccountGroupId")
    public void setAccountGroupId(List<String> accountGroupId) {
        this.accountGroupId = accountGroupId;
    }

    /**
     * Internal Getter for AccountGroupName.
     * Account group name Optional. This input is a search criterion, if given.
     * @return Returns the Internal String
     */
    @JsonGetter("AccountGroupName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountGroupName() {
        return this.accountGroupName;
    }

    /**
     * Getter for AccountGroupName.
     * Account group name Optional. This input is a search criterion, if given.
     * @return Returns the String
     */
    public String getAccountGroupName() {
        return OptionalNullable.getFrom(accountGroupName);
    }

    /**
     * Setter for AccountGroupName.
     * Account group name Optional. This input is a search criterion, if given.
     * @param accountGroupName Value for String
     */
    @JsonSetter("AccountGroupName")
    public void setAccountGroupName(String accountGroupName) {
        this.accountGroupName = OptionalNullable.of(accountGroupName);
    }

    /**
     * UnSetter for AccountGroupName.
     * Account group name Optional. This input is a search criterion, if given.
     */
    public void unsetAccountGroupName() {
        accountGroupName = null;
    }

    /**
     * Internal Getter for FromDate.
     * EID date searched from this date. Optional.
     * @return Returns the Internal String
     */
    @JsonGetter("FromDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFromDate() {
        return this.fromDate;
    }

    /**
     * Getter for FromDate.
     * EID date searched from this date. Optional.
     * @return Returns the String
     */
    public String getFromDate() {
        return OptionalNullable.getFrom(fromDate);
    }

    /**
     * Setter for FromDate.
     * EID date searched from this date. Optional.
     * @param fromDate Value for String
     */
    @JsonSetter("FromDate")
    public void setFromDate(String fromDate) {
        this.fromDate = OptionalNullable.of(fromDate);
    }

    /**
     * UnSetter for FromDate.
     * EID date searched from this date. Optional.
     */
    public void unsetFromDate() {
        fromDate = null;
    }

    /**
     * Internal Getter for ToDate.
     * Invoice date searched until this date. Optional.
     * @return Returns the Internal String
     */
    @JsonGetter("ToDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetToDate() {
        return this.toDate;
    }

    /**
     * Getter for ToDate.
     * Invoice date searched until this date. Optional.
     * @return Returns the String
     */
    public String getToDate() {
        return OptionalNullable.getFrom(toDate);
    }

    /**
     * Setter for ToDate.
     * Invoice date searched until this date. Optional.
     * @param toDate Value for String
     */
    @JsonSetter("ToDate")
    public void setToDate(String toDate) {
        this.toDate = OptionalNullable.of(toDate);
    }

    /**
     * UnSetter for ToDate.
     * Invoice date searched until this date. Optional.
     */
    public void unsetToDate() {
        toDate = null;
    }

    /**
     * Internal Getter for InvoiceType.
     * Invoice type. Optional. Possible values: • NAT (National) • INT (International)
     * @return Returns the Internal String
     */
    @JsonGetter("InvoiceType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetInvoiceType() {
        return this.invoiceType;
    }

    /**
     * Getter for InvoiceType.
     * Invoice type. Optional. Possible values: • NAT (National) • INT (International)
     * @return Returns the String
     */
    public String getInvoiceType() {
        return OptionalNullable.getFrom(invoiceType);
    }

    /**
     * Setter for InvoiceType.
     * Invoice type. Optional. Possible values: • NAT (National) • INT (International)
     * @param invoiceType Value for String
     */
    @JsonSetter("InvoiceType")
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = OptionalNullable.of(invoiceType);
    }

    /**
     * UnSetter for InvoiceType.
     * Invoice type. Optional. Possible values: • NAT (National) • INT (International)
     */
    public void unsetInvoiceType() {
        invoiceType = null;
    }

    /**
     * Internal Getter for InvoiceStatus.
     * Status of the document. Optional. Possible values: • NEW • VIEWED • DOWNLOADED • RESTORED
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
     * Status of the document. Optional. Possible values: • NEW • VIEWED • DOWNLOADED • RESTORED
     * @return Returns the String
     */
    public String getInvoiceStatus() {
        return OptionalNullable.getFrom(invoiceStatus);
    }

    /**
     * Setter for InvoiceStatus.
     * Status of the document. Optional. Possible values: • NEW • VIEWED • DOWNLOADED • RESTORED
     * @param invoiceStatus Value for String
     */
    @JsonSetter("InvoiceStatus")
    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = OptionalNullable.of(invoiceStatus);
    }

    /**
     * UnSetter for InvoiceStatus.
     * Status of the document. Optional. Possible values: • NEW • VIEWED • DOWNLOADED • RESTORED
     */
    public void unsetInvoiceStatus() {
        invoiceStatus = null;
    }

    /**
     * Getter for SortBy.
     * Sort option – • InvoiceNumber ASC • InvoiceDate ASC • InvoiceNumber DESC • InvoiceDate DESC
     * Optional
     * @return Returns the List of String
     */
    @JsonGetter("SortBy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getSortBy() {
        return sortBy;
    }

    /**
     * Setter for SortBy.
     * Sort option – • InvoiceNumber ASC • InvoiceDate ASC • InvoiceNumber DESC • InvoiceDate DESC
     * Optional
     * @param sortBy Value for List of String
     */
    @JsonSetter("SortBy")
    public void setSortBy(List<String> sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * Converts this EIDSearchReq into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EIDSearchReq [" + "colCoCode=" + colCoCode + ", accountGroupCountry="
                + accountGroupCountry + ", accountGroupId=" + accountGroupId + ", accountGroupName="
                + accountGroupName + ", fromDate=" + fromDate + ", toDate=" + toDate
                + ", invoiceType=" + invoiceType + ", invoiceStatus=" + invoiceStatus + ", sortBy="
                + sortBy + "]";
    }

    /**
     * Builds a new {@link EIDSearchReq.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EIDSearchReq.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(colCoCode, accountGroupCountry, accountGroupId)
                .sortBy(getSortBy());
        builder.accountGroupName = internalGetAccountGroupName();
        builder.fromDate = internalGetFromDate();
        builder.toDate = internalGetToDate();
        builder.invoiceType = internalGetInvoiceType();
        builder.invoiceStatus = internalGetInvoiceStatus();
        return builder;
    }

    /**
     * Class to build instances of {@link EIDSearchReq}.
     */
    public static class Builder {
        private Integer colCoCode;
        private Integer accountGroupCountry;
        private List<String> accountGroupId;
        private OptionalNullable<String> accountGroupName;
        private OptionalNullable<String> fromDate;
        private OptionalNullable<String> toDate;
        private OptionalNullable<String> invoiceType;
        private OptionalNullable<String> invoiceStatus;
        private List<String> sortBy;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  colCoCode  Integer value for colCoCode.
         * @param  accountGroupCountry  Integer value for accountGroupCountry.
         * @param  accountGroupId  List of String value for accountGroupId.
         */
        public Builder(Integer colCoCode, Integer accountGroupCountry,
                List<String> accountGroupId) {
            this.colCoCode = colCoCode;
            this.accountGroupCountry = accountGroupCountry;
            this.accountGroupId = accountGroupId;
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
         * Setter for accountGroupCountry.
         * @param  accountGroupCountry  Integer value for accountGroupCountry.
         * @return Builder
         */
        public Builder accountGroupCountry(Integer accountGroupCountry) {
            this.accountGroupCountry = accountGroupCountry;
            return this;
        }

        /**
         * Setter for accountGroupId.
         * @param  accountGroupId  List of String value for accountGroupId.
         * @return Builder
         */
        public Builder accountGroupId(List<String> accountGroupId) {
            this.accountGroupId = accountGroupId;
            return this;
        }

        /**
         * Setter for accountGroupName.
         * @param  accountGroupName  String value for accountGroupName.
         * @return Builder
         */
        public Builder accountGroupName(String accountGroupName) {
            this.accountGroupName = OptionalNullable.of(accountGroupName);
            return this;
        }

        /**
         * UnSetter for accountGroupName.
         * @return Builder
         */
        public Builder unsetAccountGroupName() {
            accountGroupName = null;
            return this;
        }

        /**
         * Setter for fromDate.
         * @param  fromDate  String value for fromDate.
         * @return Builder
         */
        public Builder fromDate(String fromDate) {
            this.fromDate = OptionalNullable.of(fromDate);
            return this;
        }

        /**
         * UnSetter for fromDate.
         * @return Builder
         */
        public Builder unsetFromDate() {
            fromDate = null;
            return this;
        }

        /**
         * Setter for toDate.
         * @param  toDate  String value for toDate.
         * @return Builder
         */
        public Builder toDate(String toDate) {
            this.toDate = OptionalNullable.of(toDate);
            return this;
        }

        /**
         * UnSetter for toDate.
         * @return Builder
         */
        public Builder unsetToDate() {
            toDate = null;
            return this;
        }

        /**
         * Setter for invoiceType.
         * @param  invoiceType  String value for invoiceType.
         * @return Builder
         */
        public Builder invoiceType(String invoiceType) {
            this.invoiceType = OptionalNullable.of(invoiceType);
            return this;
        }

        /**
         * UnSetter for invoiceType.
         * @return Builder
         */
        public Builder unsetInvoiceType() {
            invoiceType = null;
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
         * Setter for sortBy.
         * @param  sortBy  List of String value for sortBy.
         * @return Builder
         */
        public Builder sortBy(List<String> sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Builds a new {@link EIDSearchReq} object using the set fields.
         * @return {@link EIDSearchReq}
         */
        public EIDSearchReq build() {
            return new EIDSearchReq(colCoCode, accountGroupCountry, accountGroupId,
                    accountGroupName, fromDate, toDate, invoiceType, invoiceStatus, sortBy);
        }
    }
}
