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

/**
 * This is a model class for PayerAccess type.
 */
public class PayerAccess {
    private Boolean isDefault;
    private OptionalNullable<Integer> colcoId;
    private OptionalNullable<Integer> colcoCode;
    private OptionalNullable<String> colCoCountryCode;
    private OptionalNullable<Integer> payerGroupId;
    private OptionalNullable<String> payerGroup;
    private OptionalNullable<Integer> payerId;
    private OptionalNullable<String> payerNumber;
    private OptionalNullable<String> payerName;

    /**
     * Default constructor.
     */
    public PayerAccess() {
        isDefault = false;
    }

    /**
     * Initialization constructor.
     * @param  isDefault  Boolean value for isDefault.
     * @param  colcoId  Integer value for colcoId.
     * @param  colcoCode  Integer value for colcoCode.
     * @param  colCoCountryCode  String value for colCoCountryCode.
     * @param  payerGroupId  Integer value for payerGroupId.
     * @param  payerGroup  String value for payerGroup.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  payerName  String value for payerName.
     */
    public PayerAccess(
            Boolean isDefault,
            Integer colcoId,
            Integer colcoCode,
            String colCoCountryCode,
            Integer payerGroupId,
            String payerGroup,
            Integer payerId,
            String payerNumber,
            String payerName) {
        this.isDefault = isDefault;
        this.colcoId = OptionalNullable.of(colcoId);
        this.colcoCode = OptionalNullable.of(colcoCode);
        this.colCoCountryCode = OptionalNullable.of(colCoCountryCode);
        this.payerGroupId = OptionalNullable.of(payerGroupId);
        this.payerGroup = OptionalNullable.of(payerGroup);
        this.payerId = OptionalNullable.of(payerId);
        this.payerNumber = OptionalNullable.of(payerNumber);
        this.payerName = OptionalNullable.of(payerName);
    }

    /**
     * Initialization constructor.
     * @param  isDefault  Boolean value for isDefault.
     * @param  colcoId  Integer value for colcoId.
     * @param  colcoCode  Integer value for colcoCode.
     * @param  colCoCountryCode  String value for colCoCountryCode.
     * @param  payerGroupId  Integer value for payerGroupId.
     * @param  payerGroup  String value for payerGroup.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  payerName  String value for payerName.
     */

    protected PayerAccess(Boolean isDefault, OptionalNullable<Integer> colcoId,
            OptionalNullable<Integer> colcoCode, OptionalNullable<String> colCoCountryCode,
            OptionalNullable<Integer> payerGroupId, OptionalNullable<String> payerGroup,
            OptionalNullable<Integer> payerId, OptionalNullable<String> payerNumber,
            OptionalNullable<String> payerName) {
        this.isDefault = isDefault;
        this.colcoId = colcoId;
        this.colcoCode = colcoCode;
        this.colCoCountryCode = colCoCountryCode;
        this.payerGroupId = payerGroupId;
        this.payerGroup = payerGroup;
        this.payerId = payerId;
        this.payerNumber = payerNumber;
        this.payerName = payerName;
    }

    /**
     * Getter for IsDefault.
     * Whether this payer is the default payer of the user.
     * @return Returns the Boolean
     */
    @JsonGetter("IsDefault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Setter for IsDefault.
     * Whether this payer is the default payer of the user.
     * @param isDefault Value for Boolean
     */
    @JsonSetter("IsDefault")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Internal Getter for ColcoId.
     * Collecting company id.
     * @return Returns the Internal Integer
     */
    @JsonGetter("ColcoId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetColcoId() {
        return this.colcoId;
    }

    /**
     * Getter for ColcoId.
     * Collecting company id.
     * @return Returns the Integer
     */
    public Integer getColcoId() {
        return OptionalNullable.getFrom(colcoId);
    }

    /**
     * Setter for ColcoId.
     * Collecting company id.
     * @param colcoId Value for Integer
     */
    @JsonSetter("ColcoId")
    public void setColcoId(Integer colcoId) {
        this.colcoId = OptionalNullable.of(colcoId);
    }

    /**
     * UnSetter for ColcoId.
     * Collecting company id.
     */
    public void unsetColcoId() {
        colcoId = null;
    }

    /**
     * Internal Getter for ColcoCode.
     * Collecting company code. Example: 86-Philippines 5-UK
     * @return Returns the Internal Integer
     */
    @JsonGetter("ColcoCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetColcoCode() {
        return this.colcoCode;
    }

    /**
     * Getter for ColcoCode.
     * Collecting company code. Example: 86-Philippines 5-UK
     * @return Returns the Integer
     */
    public Integer getColcoCode() {
        return OptionalNullable.getFrom(colcoCode);
    }

    /**
     * Setter for ColcoCode.
     * Collecting company code. Example: 86-Philippines 5-UK
     * @param colcoCode Value for Integer
     */
    @JsonSetter("ColcoCode")
    public void setColcoCode(Integer colcoCode) {
        this.colcoCode = OptionalNullable.of(colcoCode);
    }

    /**
     * UnSetter for ColcoCode.
     * Collecting company code. Example: 86-Philippines 5-UK
     */
    public void unsetColcoCode() {
        colcoCode = null;
    }

    /**
     * Internal Getter for ColCoCountryCode.
     * The 2-character ISO Code for the customer and card owning country
     * @return Returns the Internal String
     */
    @JsonGetter("ColCoCountryCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetColCoCountryCode() {
        return this.colCoCountryCode;
    }

    /**
     * Getter for ColCoCountryCode.
     * The 2-character ISO Code for the customer and card owning country
     * @return Returns the String
     */
    public String getColCoCountryCode() {
        return OptionalNullable.getFrom(colCoCountryCode);
    }

    /**
     * Setter for ColCoCountryCode.
     * The 2-character ISO Code for the customer and card owning country
     * @param colCoCountryCode Value for String
     */
    @JsonSetter("ColCoCountryCode")
    public void setColCoCountryCode(String colCoCountryCode) {
        this.colCoCountryCode = OptionalNullable.of(colCoCountryCode);
    }

    /**
     * UnSetter for ColCoCountryCode.
     * The 2-character ISO Code for the customer and card owning country
     */
    public void unsetColCoCountryCode() {
        colCoCountryCode = null;
    }

    /**
     * Internal Getter for PayerGroupId.
     * Payer Group Id of the payer.
     * @return Returns the Internal Integer
     */
    @JsonGetter("PayerGroupId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPayerGroupId() {
        return this.payerGroupId;
    }

    /**
     * Getter for PayerGroupId.
     * Payer Group Id of the payer.
     * @return Returns the Integer
     */
    public Integer getPayerGroupId() {
        return OptionalNullable.getFrom(payerGroupId);
    }

    /**
     * Setter for PayerGroupId.
     * Payer Group Id of the payer.
     * @param payerGroupId Value for Integer
     */
    @JsonSetter("PayerGroupId")
    public void setPayerGroupId(Integer payerGroupId) {
        this.payerGroupId = OptionalNullable.of(payerGroupId);
    }

    /**
     * UnSetter for PayerGroupId.
     * Payer Group Id of the payer.
     */
    public void unsetPayerGroupId() {
        payerGroupId = null;
    }

    /**
     * Internal Getter for PayerGroup.
     * Payer group of the payer. The value of this parameter will always be null when the input
     * parameter “IncludePayerGroup” is false.
     * @return Returns the Internal String
     */
    @JsonGetter("PayerGroup")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPayerGroup() {
        return this.payerGroup;
    }

    /**
     * Getter for PayerGroup.
     * Payer group of the payer. The value of this parameter will always be null when the input
     * parameter “IncludePayerGroup” is false.
     * @return Returns the String
     */
    public String getPayerGroup() {
        return OptionalNullable.getFrom(payerGroup);
    }

    /**
     * Setter for PayerGroup.
     * Payer group of the payer. The value of this parameter will always be null when the input
     * parameter “IncludePayerGroup” is false.
     * @param payerGroup Value for String
     */
    @JsonSetter("PayerGroup")
    public void setPayerGroup(String payerGroup) {
        this.payerGroup = OptionalNullable.of(payerGroup);
    }

    /**
     * UnSetter for PayerGroup.
     * Payer group of the payer. The value of this parameter will always be null when the input
     * parameter “IncludePayerGroup” is false.
     */
    public void unsetPayerGroup() {
        payerGroup = null;
    }

    /**
     * Internal Getter for PayerId.
     * Payer Id to which the user has access Example: 123456
     * @return Returns the Internal Integer
     */
    @JsonGetter("PayerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPayerId() {
        return this.payerId;
    }

    /**
     * Getter for PayerId.
     * Payer Id to which the user has access Example: 123456
     * @return Returns the Integer
     */
    public Integer getPayerId() {
        return OptionalNullable.getFrom(payerId);
    }

    /**
     * Setter for PayerId.
     * Payer Id to which the user has access Example: 123456
     * @param payerId Value for Integer
     */
    @JsonSetter("PayerId")
    public void setPayerId(Integer payerId) {
        this.payerId = OptionalNullable.of(payerId);
    }

    /**
     * UnSetter for PayerId.
     * Payer Id to which the user has access Example: 123456
     */
    public void unsetPayerId() {
        payerId = null;
    }

    /**
     * Internal Getter for PayerNumber.
     * Payer Number to which the user has access Example: GB000000123
     * @return Returns the Internal String
     */
    @JsonGetter("PayerNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPayerNumber() {
        return this.payerNumber;
    }

    /**
     * Getter for PayerNumber.
     * Payer Number to which the user has access Example: GB000000123
     * @return Returns the String
     */
    public String getPayerNumber() {
        return OptionalNullable.getFrom(payerNumber);
    }

    /**
     * Setter for PayerNumber.
     * Payer Number to which the user has access Example: GB000000123
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = OptionalNullable.of(payerNumber);
    }

    /**
     * UnSetter for PayerNumber.
     * Payer Number to which the user has access Example: GB000000123
     */
    public void unsetPayerNumber() {
        payerNumber = null;
    }

    /**
     * Internal Getter for PayerName.
     * Name of the Payer to which the user has access
     * @return Returns the Internal String
     */
    @JsonGetter("PayerName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPayerName() {
        return this.payerName;
    }

    /**
     * Getter for PayerName.
     * Name of the Payer to which the user has access
     * @return Returns the String
     */
    public String getPayerName() {
        return OptionalNullable.getFrom(payerName);
    }

    /**
     * Setter for PayerName.
     * Name of the Payer to which the user has access
     * @param payerName Value for String
     */
    @JsonSetter("PayerName")
    public void setPayerName(String payerName) {
        this.payerName = OptionalNullable.of(payerName);
    }

    /**
     * UnSetter for PayerName.
     * Name of the Payer to which the user has access
     */
    public void unsetPayerName() {
        payerName = null;
    }

    /**
     * Converts this PayerAccess into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PayerAccess [" + "isDefault=" + isDefault + ", colcoId=" + colcoId + ", colcoCode="
                + colcoCode + ", colCoCountryCode=" + colCoCountryCode + ", payerGroupId="
                + payerGroupId + ", payerGroup=" + payerGroup + ", payerId=" + payerId
                + ", payerNumber=" + payerNumber + ", payerName=" + payerName + "]";
    }

    /**
     * Builds a new {@link PayerAccess.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PayerAccess.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .isDefault(getIsDefault());
        builder.colcoId = internalGetColcoId();
        builder.colcoCode = internalGetColcoCode();
        builder.colCoCountryCode = internalGetColCoCountryCode();
        builder.payerGroupId = internalGetPayerGroupId();
        builder.payerGroup = internalGetPayerGroup();
        builder.payerId = internalGetPayerId();
        builder.payerNumber = internalGetPayerNumber();
        builder.payerName = internalGetPayerName();
        return builder;
    }

    /**
     * Class to build instances of {@link PayerAccess}.
     */
    public static class Builder {
        private Boolean isDefault = false;
        private OptionalNullable<Integer> colcoId;
        private OptionalNullable<Integer> colcoCode;
        private OptionalNullable<String> colCoCountryCode;
        private OptionalNullable<Integer> payerGroupId;
        private OptionalNullable<String> payerGroup;
        private OptionalNullable<Integer> payerId;
        private OptionalNullable<String> payerNumber;
        private OptionalNullable<String> payerName;



        /**
         * Setter for isDefault.
         * @param  isDefault  Boolean value for isDefault.
         * @return Builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * Setter for colcoId.
         * @param  colcoId  Integer value for colcoId.
         * @return Builder
         */
        public Builder colcoId(Integer colcoId) {
            this.colcoId = OptionalNullable.of(colcoId);
            return this;
        }

        /**
         * UnSetter for colcoId.
         * @return Builder
         */
        public Builder unsetColcoId() {
            colcoId = null;
            return this;
        }

        /**
         * Setter for colcoCode.
         * @param  colcoCode  Integer value for colcoCode.
         * @return Builder
         */
        public Builder colcoCode(Integer colcoCode) {
            this.colcoCode = OptionalNullable.of(colcoCode);
            return this;
        }

        /**
         * UnSetter for colcoCode.
         * @return Builder
         */
        public Builder unsetColcoCode() {
            colcoCode = null;
            return this;
        }

        /**
         * Setter for colCoCountryCode.
         * @param  colCoCountryCode  String value for colCoCountryCode.
         * @return Builder
         */
        public Builder colCoCountryCode(String colCoCountryCode) {
            this.colCoCountryCode = OptionalNullable.of(colCoCountryCode);
            return this;
        }

        /**
         * UnSetter for colCoCountryCode.
         * @return Builder
         */
        public Builder unsetColCoCountryCode() {
            colCoCountryCode = null;
            return this;
        }

        /**
         * Setter for payerGroupId.
         * @param  payerGroupId  Integer value for payerGroupId.
         * @return Builder
         */
        public Builder payerGroupId(Integer payerGroupId) {
            this.payerGroupId = OptionalNullable.of(payerGroupId);
            return this;
        }

        /**
         * UnSetter for payerGroupId.
         * @return Builder
         */
        public Builder unsetPayerGroupId() {
            payerGroupId = null;
            return this;
        }

        /**
         * Setter for payerGroup.
         * @param  payerGroup  String value for payerGroup.
         * @return Builder
         */
        public Builder payerGroup(String payerGroup) {
            this.payerGroup = OptionalNullable.of(payerGroup);
            return this;
        }

        /**
         * UnSetter for payerGroup.
         * @return Builder
         */
        public Builder unsetPayerGroup() {
            payerGroup = null;
            return this;
        }

        /**
         * Setter for payerId.
         * @param  payerId  Integer value for payerId.
         * @return Builder
         */
        public Builder payerId(Integer payerId) {
            this.payerId = OptionalNullable.of(payerId);
            return this;
        }

        /**
         * UnSetter for payerId.
         * @return Builder
         */
        public Builder unsetPayerId() {
            payerId = null;
            return this;
        }

        /**
         * Setter for payerNumber.
         * @param  payerNumber  String value for payerNumber.
         * @return Builder
         */
        public Builder payerNumber(String payerNumber) {
            this.payerNumber = OptionalNullable.of(payerNumber);
            return this;
        }

        /**
         * UnSetter for payerNumber.
         * @return Builder
         */
        public Builder unsetPayerNumber() {
            payerNumber = null;
            return this;
        }

        /**
         * Setter for payerName.
         * @param  payerName  String value for payerName.
         * @return Builder
         */
        public Builder payerName(String payerName) {
            this.payerName = OptionalNullable.of(payerName);
            return this;
        }

        /**
         * UnSetter for payerName.
         * @return Builder
         */
        public Builder unsetPayerName() {
            payerName = null;
            return this;
        }

        /**
         * Builds a new {@link PayerAccess} object using the set fields.
         * @return {@link PayerAccess}
         */
        public PayerAccess build() {
            return new PayerAccess(isDefault, colcoId, colcoCode, colCoCountryCode, payerGroupId,
                    payerGroup, payerId, payerNumber, payerName);
        }
    }
}
