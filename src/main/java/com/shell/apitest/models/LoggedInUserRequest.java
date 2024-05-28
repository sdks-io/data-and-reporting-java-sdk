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
 * This is a model class for LoggedInUserRequest type.
 */
public class LoggedInUserRequest {
    private Boolean includePayerGroup;
    private Boolean includeEIDDetails;
    private OptionalNullable<String> requestedAPIName;
    private OptionalNullable<Integer> payerId;
    private OptionalNullable<String> payerNumber;

    /**
     * Default constructor.
     */
    public LoggedInUserRequest() {
        includePayerGroup = false;
        includeEIDDetails = false;
    }

    /**
     * Initialization constructor.
     * @param  includePayerGroup  Boolean value for includePayerGroup.
     * @param  includeEIDDetails  Boolean value for includeEIDDetails.
     * @param  requestedAPIName  String value for requestedAPIName.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     */
    public LoggedInUserRequest(
            Boolean includePayerGroup,
            Boolean includeEIDDetails,
            String requestedAPIName,
            Integer payerId,
            String payerNumber) {
        this.includePayerGroup = includePayerGroup;
        this.includeEIDDetails = includeEIDDetails;
        this.requestedAPIName = OptionalNullable.of(requestedAPIName);
        this.payerId = OptionalNullable.of(payerId);
        this.payerNumber = OptionalNullable.of(payerNumber);
    }

    /**
     * Initialization constructor.
     * @param  includePayerGroup  Boolean value for includePayerGroup.
     * @param  includeEIDDetails  Boolean value for includeEIDDetails.
     * @param  requestedAPIName  String value for requestedAPIName.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     */

    protected LoggedInUserRequest(Boolean includePayerGroup, Boolean includeEIDDetails,
            OptionalNullable<String> requestedAPIName, OptionalNullable<Integer> payerId,
            OptionalNullable<String> payerNumber) {
        this.includePayerGroup = includePayerGroup;
        this.includeEIDDetails = includeEIDDetails;
        this.requestedAPIName = requestedAPIName;
        this.payerId = payerId;
        this.payerNumber = payerNumber;
    }

    /**
     * Getter for IncludePayerGroup.
     * True/False. The output will include the payer group information only when true is passed.
     * @return Returns the Boolean
     */
    @JsonGetter("IncludePayerGroup")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludePayerGroup() {
        return includePayerGroup;
    }

    /**
     * Setter for IncludePayerGroup.
     * True/False. The output will include the payer group information only when true is passed.
     * @param includePayerGroup Value for Boolean
     */
    @JsonSetter("IncludePayerGroup")
    public void setIncludePayerGroup(Boolean includePayerGroup) {
        this.includePayerGroup = includePayerGroup;
    }

    /**
     * Getter for IncludeEIDDetails.
     * True/False. The output will include the EID (Electronic Invoice data) information only when
     * true is passed..
     * @return Returns the Boolean
     */
    @JsonGetter("IncludeEIDDetails")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeEIDDetails() {
        return includeEIDDetails;
    }

    /**
     * Setter for IncludeEIDDetails.
     * True/False. The output will include the EID (Electronic Invoice data) information only when
     * true is passed..
     * @param includeEIDDetails Value for Boolean
     */
    @JsonSetter("IncludeEIDDetails")
    public void setIncludeEIDDetails(Boolean includeEIDDetails) {
        this.includeEIDDetails = includeEIDDetails;
    }

    /**
     * Internal Getter for RequestedAPIName.
     * Name of the API on which user access needs to be validated Optional.
     * @return Returns the Internal String
     */
    @JsonGetter("RequestedAPIName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetRequestedAPIName() {
        return this.requestedAPIName;
    }

    /**
     * Getter for RequestedAPIName.
     * Name of the API on which user access needs to be validated Optional.
     * @return Returns the String
     */
    public String getRequestedAPIName() {
        return OptionalNullable.getFrom(requestedAPIName);
    }

    /**
     * Setter for RequestedAPIName.
     * Name of the API on which user access needs to be validated Optional.
     * @param requestedAPIName Value for String
     */
    @JsonSetter("RequestedAPIName")
    public void setRequestedAPIName(String requestedAPIName) {
        this.requestedAPIName = OptionalNullable.of(requestedAPIName);
    }

    /**
     * UnSetter for RequestedAPIName.
     * Name of the API on which user access needs to be validated Optional.
     */
    public void unsetRequestedAPIName() {
        requestedAPIName = null;
    }

    /**
     * Internal Getter for PayerId.
     * Payer id of the customer.&lt;/br&gt; Optional.&lt;/br&gt; This input is a search criterion.&lt;/br&gt; Note: If
     * PayerId or PayerNumber is provided in the input, the given payer will be available in the
     * output if the user has access to the given payer.
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
     * Payer id of the customer.&lt;/br&gt; Optional.&lt;/br&gt; This input is a search criterion.&lt;/br&gt; Note: If
     * PayerId or PayerNumber is provided in the input, the given payer will be available in the
     * output if the user has access to the given payer.
     * @return Returns the Integer
     */
    public Integer getPayerId() {
        return OptionalNullable.getFrom(payerId);
    }

    /**
     * Setter for PayerId.
     * Payer id of the customer.&lt;/br&gt; Optional.&lt;/br&gt; This input is a search criterion.&lt;/br&gt; Note: If
     * PayerId or PayerNumber is provided in the input, the given payer will be available in the
     * output if the user has access to the given payer.
     * @param payerId Value for Integer
     */
    @JsonSetter("PayerId")
    public void setPayerId(Integer payerId) {
        this.payerId = OptionalNullable.of(payerId);
    }

    /**
     * UnSetter for PayerId.
     * Payer id of the customer.&lt;/br&gt; Optional.&lt;/br&gt; This input is a search criterion.&lt;/br&gt; Note: If
     * PayerId or PayerNumber is provided in the input, the given payer will be available in the
     * output if the user has access to the given payer.
     */
    public void unsetPayerId() {
        payerId = null;
    }

    /**
     * Internal Getter for PayerNumber.
     * PayerNumber of the customer.&lt;/br&gt; Optional&lt;/br&gt; This input is a search criterion.&lt;/br&gt; Note:
     * If Payerid or PayerNumber is provided in the input, the given payer will be available in the
     * output if the user has access to the given payer.
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
     * PayerNumber of the customer.&lt;/br&gt; Optional&lt;/br&gt; This input is a search criterion.&lt;/br&gt; Note:
     * If Payerid or PayerNumber is provided in the input, the given payer will be available in the
     * output if the user has access to the given payer.
     * @return Returns the String
     */
    public String getPayerNumber() {
        return OptionalNullable.getFrom(payerNumber);
    }

    /**
     * Setter for PayerNumber.
     * PayerNumber of the customer.&lt;/br&gt; Optional&lt;/br&gt; This input is a search criterion.&lt;/br&gt; Note:
     * If Payerid or PayerNumber is provided in the input, the given payer will be available in the
     * output if the user has access to the given payer.
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = OptionalNullable.of(payerNumber);
    }

    /**
     * UnSetter for PayerNumber.
     * PayerNumber of the customer.&lt;/br&gt; Optional&lt;/br&gt; This input is a search criterion.&lt;/br&gt; Note:
     * If Payerid or PayerNumber is provided in the input, the given payer will be available in the
     * output if the user has access to the given payer.
     */
    public void unsetPayerNumber() {
        payerNumber = null;
    }

    /**
     * Converts this LoggedInUserRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LoggedInUserRequest [" + "includePayerGroup=" + includePayerGroup
                + ", includeEIDDetails=" + includeEIDDetails + ", requestedAPIName="
                + requestedAPIName + ", payerId=" + payerId + ", payerNumber=" + payerNumber + "]";
    }

    /**
     * Builds a new {@link LoggedInUserRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LoggedInUserRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .includePayerGroup(getIncludePayerGroup())
                .includeEIDDetails(getIncludeEIDDetails());
        builder.requestedAPIName = internalGetRequestedAPIName();
        builder.payerId = internalGetPayerId();
        builder.payerNumber = internalGetPayerNumber();
        return builder;
    }

    /**
     * Class to build instances of {@link LoggedInUserRequest}.
     */
    public static class Builder {
        private Boolean includePayerGroup = false;
        private Boolean includeEIDDetails = false;
        private OptionalNullable<String> requestedAPIName;
        private OptionalNullable<Integer> payerId;
        private OptionalNullable<String> payerNumber;



        /**
         * Setter for includePayerGroup.
         * @param  includePayerGroup  Boolean value for includePayerGroup.
         * @return Builder
         */
        public Builder includePayerGroup(Boolean includePayerGroup) {
            this.includePayerGroup = includePayerGroup;
            return this;
        }

        /**
         * Setter for includeEIDDetails.
         * @param  includeEIDDetails  Boolean value for includeEIDDetails.
         * @return Builder
         */
        public Builder includeEIDDetails(Boolean includeEIDDetails) {
            this.includeEIDDetails = includeEIDDetails;
            return this;
        }

        /**
         * Setter for requestedAPIName.
         * @param  requestedAPIName  String value for requestedAPIName.
         * @return Builder
         */
        public Builder requestedAPIName(String requestedAPIName) {
            this.requestedAPIName = OptionalNullable.of(requestedAPIName);
            return this;
        }

        /**
         * UnSetter for requestedAPIName.
         * @return Builder
         */
        public Builder unsetRequestedAPIName() {
            requestedAPIName = null;
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
         * Builds a new {@link LoggedInUserRequest} object using the set fields.
         * @return {@link LoggedInUserRequest}
         */
        public LoggedInUserRequest build() {
            return new LoggedInUserRequest(includePayerGroup, includeEIDDetails, requestedAPIName,
                    payerId, payerNumber);
        }
    }
}
