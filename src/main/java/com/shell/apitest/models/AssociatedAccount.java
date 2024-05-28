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
 * This is a model class for AssociatedAccount type.
 */
public class AssociatedAccount {
    private OptionalNullable<Integer> associatedAccountId;
    private OptionalNullable<String> associatedAccountNumber;
    private OptionalNullable<String> associatedAccountShortName;
    private OptionalNullable<String> associatedAccountFullName;

    /**
     * Default constructor.
     */
    public AssociatedAccount() {
    }

    /**
     * Initialization constructor.
     * @param  associatedAccountId  Integer value for associatedAccountId.
     * @param  associatedAccountNumber  String value for associatedAccountNumber.
     * @param  associatedAccountShortName  String value for associatedAccountShortName.
     * @param  associatedAccountFullName  String value for associatedAccountFullName.
     */
    public AssociatedAccount(
            Integer associatedAccountId,
            String associatedAccountNumber,
            String associatedAccountShortName,
            String associatedAccountFullName) {
        this.associatedAccountId = OptionalNullable.of(associatedAccountId);
        this.associatedAccountNumber = OptionalNullable.of(associatedAccountNumber);
        this.associatedAccountShortName = OptionalNullable.of(associatedAccountShortName);
        this.associatedAccountFullName = OptionalNullable.of(associatedAccountFullName);
    }

    /**
     * Initialization constructor.
     * @param  associatedAccountId  Integer value for associatedAccountId.
     * @param  associatedAccountNumber  String value for associatedAccountNumber.
     * @param  associatedAccountShortName  String value for associatedAccountShortName.
     * @param  associatedAccountFullName  String value for associatedAccountFullName.
     */

    protected AssociatedAccount(OptionalNullable<Integer> associatedAccountId,
            OptionalNullable<String> associatedAccountNumber,
            OptionalNullable<String> associatedAccountShortName,
            OptionalNullable<String> associatedAccountFullName) {
        this.associatedAccountId = associatedAccountId;
        this.associatedAccountNumber = associatedAccountNumber;
        this.associatedAccountShortName = associatedAccountShortName;
        this.associatedAccountFullName = associatedAccountFullName;
    }

    /**
     * Internal Getter for AssociatedAccountId.
     * Account identifier of the Associated Account associated with the Payer.
     * @return Returns the Internal Integer
     */
    @JsonGetter("AssociatedAccountId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetAssociatedAccountId() {
        return this.associatedAccountId;
    }

    /**
     * Getter for AssociatedAccountId.
     * Account identifier of the Associated Account associated with the Payer.
     * @return Returns the Integer
     */
    public Integer getAssociatedAccountId() {
        return OptionalNullable.getFrom(associatedAccountId);
    }

    /**
     * Setter for AssociatedAccountId.
     * Account identifier of the Associated Account associated with the Payer.
     * @param associatedAccountId Value for Integer
     */
    @JsonSetter("AssociatedAccountId")
    public void setAssociatedAccountId(Integer associatedAccountId) {
        this.associatedAccountId = OptionalNullable.of(associatedAccountId);
    }

    /**
     * UnSetter for AssociatedAccountId.
     * Account identifier of the Associated Account associated with the Payer.
     */
    public void unsetAssociatedAccountId() {
        associatedAccountId = null;
    }

    /**
     * Internal Getter for AssociatedAccountNumber.
     * Account number of the Associated Account associated with the Payer.
     * @return Returns the Internal String
     */
    @JsonGetter("AssociatedAccountNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAssociatedAccountNumber() {
        return this.associatedAccountNumber;
    }

    /**
     * Getter for AssociatedAccountNumber.
     * Account number of the Associated Account associated with the Payer.
     * @return Returns the String
     */
    public String getAssociatedAccountNumber() {
        return OptionalNullable.getFrom(associatedAccountNumber);
    }

    /**
     * Setter for AssociatedAccountNumber.
     * Account number of the Associated Account associated with the Payer.
     * @param associatedAccountNumber Value for String
     */
    @JsonSetter("AssociatedAccountNumber")
    public void setAssociatedAccountNumber(String associatedAccountNumber) {
        this.associatedAccountNumber = OptionalNullable.of(associatedAccountNumber);
    }

    /**
     * UnSetter for AssociatedAccountNumber.
     * Account number of the Associated Account associated with the Payer.
     */
    public void unsetAssociatedAccountNumber() {
        associatedAccountNumber = null;
    }

    /**
     * Internal Getter for AssociatedAccountShortName.
     * Account associated with the Payer.
     * @return Returns the Internal String
     */
    @JsonGetter("AssociatedAccountShortName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAssociatedAccountShortName() {
        return this.associatedAccountShortName;
    }

    /**
     * Getter for AssociatedAccountShortName.
     * Account associated with the Payer.
     * @return Returns the String
     */
    public String getAssociatedAccountShortName() {
        return OptionalNullable.getFrom(associatedAccountShortName);
    }

    /**
     * Setter for AssociatedAccountShortName.
     * Account associated with the Payer.
     * @param associatedAccountShortName Value for String
     */
    @JsonSetter("AssociatedAccountShortName")
    public void setAssociatedAccountShortName(String associatedAccountShortName) {
        this.associatedAccountShortName = OptionalNullable.of(associatedAccountShortName);
    }

    /**
     * UnSetter for AssociatedAccountShortName.
     * Account associated with the Payer.
     */
    public void unsetAssociatedAccountShortName() {
        associatedAccountShortName = null;
    }

    /**
     * Internal Getter for AssociatedAccountFullName.
     * Full name of the Associated Account associated with the Payer.
     * @return Returns the Internal String
     */
    @JsonGetter("AssociatedAccountFullName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAssociatedAccountFullName() {
        return this.associatedAccountFullName;
    }

    /**
     * Getter for AssociatedAccountFullName.
     * Full name of the Associated Account associated with the Payer.
     * @return Returns the String
     */
    public String getAssociatedAccountFullName() {
        return OptionalNullable.getFrom(associatedAccountFullName);
    }

    /**
     * Setter for AssociatedAccountFullName.
     * Full name of the Associated Account associated with the Payer.
     * @param associatedAccountFullName Value for String
     */
    @JsonSetter("AssociatedAccountFullName")
    public void setAssociatedAccountFullName(String associatedAccountFullName) {
        this.associatedAccountFullName = OptionalNullable.of(associatedAccountFullName);
    }

    /**
     * UnSetter for AssociatedAccountFullName.
     * Full name of the Associated Account associated with the Payer.
     */
    public void unsetAssociatedAccountFullName() {
        associatedAccountFullName = null;
    }

    /**
     * Converts this AssociatedAccount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AssociatedAccount [" + "associatedAccountId=" + associatedAccountId
                + ", associatedAccountNumber=" + associatedAccountNumber
                + ", associatedAccountShortName=" + associatedAccountShortName
                + ", associatedAccountFullName=" + associatedAccountFullName + "]";
    }

    /**
     * Builds a new {@link AssociatedAccount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AssociatedAccount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.associatedAccountId = internalGetAssociatedAccountId();
        builder.associatedAccountNumber = internalGetAssociatedAccountNumber();
        builder.associatedAccountShortName = internalGetAssociatedAccountShortName();
        builder.associatedAccountFullName = internalGetAssociatedAccountFullName();
        return builder;
    }

    /**
     * Class to build instances of {@link AssociatedAccount}.
     */
    public static class Builder {
        private OptionalNullable<Integer> associatedAccountId;
        private OptionalNullable<String> associatedAccountNumber;
        private OptionalNullable<String> associatedAccountShortName;
        private OptionalNullable<String> associatedAccountFullName;



        /**
         * Setter for associatedAccountId.
         * @param  associatedAccountId  Integer value for associatedAccountId.
         * @return Builder
         */
        public Builder associatedAccountId(Integer associatedAccountId) {
            this.associatedAccountId = OptionalNullable.of(associatedAccountId);
            return this;
        }

        /**
         * UnSetter for associatedAccountId.
         * @return Builder
         */
        public Builder unsetAssociatedAccountId() {
            associatedAccountId = null;
            return this;
        }

        /**
         * Setter for associatedAccountNumber.
         * @param  associatedAccountNumber  String value for associatedAccountNumber.
         * @return Builder
         */
        public Builder associatedAccountNumber(String associatedAccountNumber) {
            this.associatedAccountNumber = OptionalNullable.of(associatedAccountNumber);
            return this;
        }

        /**
         * UnSetter for associatedAccountNumber.
         * @return Builder
         */
        public Builder unsetAssociatedAccountNumber() {
            associatedAccountNumber = null;
            return this;
        }

        /**
         * Setter for associatedAccountShortName.
         * @param  associatedAccountShortName  String value for associatedAccountShortName.
         * @return Builder
         */
        public Builder associatedAccountShortName(String associatedAccountShortName) {
            this.associatedAccountShortName = OptionalNullable.of(associatedAccountShortName);
            return this;
        }

        /**
         * UnSetter for associatedAccountShortName.
         * @return Builder
         */
        public Builder unsetAssociatedAccountShortName() {
            associatedAccountShortName = null;
            return this;
        }

        /**
         * Setter for associatedAccountFullName.
         * @param  associatedAccountFullName  String value for associatedAccountFullName.
         * @return Builder
         */
        public Builder associatedAccountFullName(String associatedAccountFullName) {
            this.associatedAccountFullName = OptionalNullable.of(associatedAccountFullName);
            return this;
        }

        /**
         * UnSetter for associatedAccountFullName.
         * @return Builder
         */
        public Builder unsetAssociatedAccountFullName() {
            associatedAccountFullName = null;
            return this;
        }

        /**
         * Builds a new {@link AssociatedAccount} object using the set fields.
         * @return {@link AssociatedAccount}
         */
        public AssociatedAccount build() {
            return new AssociatedAccount(associatedAccountId, associatedAccountNumber,
                    associatedAccountShortName, associatedAccountFullName);
        }
    }
}
