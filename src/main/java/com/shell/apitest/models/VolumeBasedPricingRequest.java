/*
 * ShellDataReportingAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for VolumeBasedPricingRequest type.
 */
public class VolumeBasedPricingRequest {
    private Integer colCoId;
    private Integer colCoCode;
    private Integer payerId;
    private String payerNumber;
    private Boolean includeHistory;

    /**
     * Default constructor.
     */
    public VolumeBasedPricingRequest() {
    }

    /**
     * Initialization constructor.
     * @param  colCoId  Integer value for colCoId.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  payerId  Integer value for payerId.
     * @param  payerNumber  String value for payerNumber.
     * @param  includeHistory  Boolean value for includeHistory.
     */
    public VolumeBasedPricingRequest(
            Integer colCoId,
            Integer colCoCode,
            Integer payerId,
            String payerNumber,
            Boolean includeHistory) {
        this.colCoId = colCoId;
        this.colCoCode = colCoCode;
        this.payerId = payerId;
        this.payerNumber = payerNumber;
        this.includeHistory = includeHistory;
    }

    /**
     * Getter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
     * @return Returns the Integer
     */
    @JsonGetter("ColCoId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getColCoId() {
        return colCoId;
    }

    /**
     * Setter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
     * @param colCoId Value for Integer
     */
    @JsonSetter("ColCoId")
    public void setColCoId(Integer colCoId) {
        this.colCoId = colCoId;
    }

    /**
     * Getter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory for serviced OUs such as Romania,
     * Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is
     * provided. Example: 86 for Philippines 5 for UK
     * @return Returns the Integer
     */
    @JsonGetter("ColCoCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getColCoCode() {
        return colCoCode;
    }

    /**
     * Setter for ColCoCode.
     * Collecting Company Code of the selected payer. Mandatory for serviced OUs such as Romania,
     * Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is
     * provided. Example: 86 for Philippines 5 for UK
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = colCoCode;
    }

    /**
     * Getter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory
     * @return Returns the Integer
     */
    @JsonGetter("PayerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPayerId() {
        return payerId;
    }

    /**
     * Setter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory
     * @param payerId Value for Integer
     */
    @JsonSetter("PayerId")
    public void setPayerId(Integer payerId) {
        this.payerId = payerId;
    }

    /**
     * Getter for PayerNumber.
     * Payer Number of the selected payer. Optional if PayerId is passed else Mandatory
     * @return Returns the String
     */
    @JsonGetter("PayerNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayerNumber() {
        return payerNumber;
    }

    /**
     * Setter for PayerNumber.
     * Payer Number of the selected payer. Optional if PayerId is passed else Mandatory
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = payerNumber;
    }

    /**
     * Getter for IncludeHistory.
     * The API will return the details of the previously calculated/paid bonus and fuel consumption
     * (Volume) in the response when this flag is ‘True’.
     * @return Returns the Boolean
     */
    @JsonGetter("IncludeHistory")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeHistory() {
        return includeHistory;
    }

    /**
     * Setter for IncludeHistory.
     * The API will return the details of the previously calculated/paid bonus and fuel consumption
     * (Volume) in the response when this flag is ‘True’.
     * @param includeHistory Value for Boolean
     */
    @JsonSetter("IncludeHistory")
    public void setIncludeHistory(Boolean includeHistory) {
        this.includeHistory = includeHistory;
    }

    /**
     * Converts this VolumeBasedPricingRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VolumeBasedPricingRequest [" + "colCoId=" + colCoId + ", colCoCode=" + colCoCode
                + ", payerId=" + payerId + ", payerNumber=" + payerNumber + ", includeHistory="
                + includeHistory + "]";
    }

    /**
     * Builds a new {@link VolumeBasedPricingRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VolumeBasedPricingRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .colCoId(getColCoId())
                .colCoCode(getColCoCode())
                .payerId(getPayerId())
                .payerNumber(getPayerNumber())
                .includeHistory(getIncludeHistory());
        return builder;
    }

    /**
     * Class to build instances of {@link VolumeBasedPricingRequest}.
     */
    public static class Builder {
        private Integer colCoId;
        private Integer colCoCode;
        private Integer payerId;
        private String payerNumber;
        private Boolean includeHistory;



        /**
         * Setter for colCoId.
         * @param  colCoId  Integer value for colCoId.
         * @return Builder
         */
        public Builder colCoId(Integer colCoId) {
            this.colCoId = colCoId;
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
         * Setter for payerId.
         * @param  payerId  Integer value for payerId.
         * @return Builder
         */
        public Builder payerId(Integer payerId) {
            this.payerId = payerId;
            return this;
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
         * Setter for includeHistory.
         * @param  includeHistory  Boolean value for includeHistory.
         * @return Builder
         */
        public Builder includeHistory(Boolean includeHistory) {
            this.includeHistory = includeHistory;
            return this;
        }

        /**
         * Builds a new {@link VolumeBasedPricingRequest} object using the set fields.
         * @return {@link VolumeBasedPricingRequest}
         */
        public VolumeBasedPricingRequest build() {
            return new VolumeBasedPricingRequest(colCoId, colCoCode, payerId, payerNumber,
                    includeHistory);
        }
    }
}
