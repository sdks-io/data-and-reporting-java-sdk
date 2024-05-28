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
 * This is a model class for FeesFeeRuleTiers type.
 */
public class FeesFeeRuleTiers {
    private OptionalNullable<Integer> tierMin;
    private OptionalNullable<Integer> tierMax;
    private OptionalNullable<String> dateEffective;
    private OptionalNullable<String> dateTerminated;
    private OptionalNullable<Double> tierValue;
    private OptionalNullable<Integer> feeRuleBasisID;
    private OptionalNullable<String> feeRuleBasisDescription;

    /**
     * Default constructor.
     */
    public FeesFeeRuleTiers() {
    }

    /**
     * Initialization constructor.
     * @param  tierMin  Integer value for tierMin.
     * @param  tierMax  Integer value for tierMax.
     * @param  dateEffective  String value for dateEffective.
     * @param  dateTerminated  String value for dateTerminated.
     * @param  tierValue  Double value for tierValue.
     * @param  feeRuleBasisID  Integer value for feeRuleBasisID.
     * @param  feeRuleBasisDescription  String value for feeRuleBasisDescription.
     */
    public FeesFeeRuleTiers(
            Integer tierMin,
            Integer tierMax,
            String dateEffective,
            String dateTerminated,
            Double tierValue,
            Integer feeRuleBasisID,
            String feeRuleBasisDescription) {
        this.tierMin = OptionalNullable.of(tierMin);
        this.tierMax = OptionalNullable.of(tierMax);
        this.dateEffective = OptionalNullable.of(dateEffective);
        this.dateTerminated = OptionalNullable.of(dateTerminated);
        this.tierValue = OptionalNullable.of(tierValue);
        this.feeRuleBasisID = OptionalNullable.of(feeRuleBasisID);
        this.feeRuleBasisDescription = OptionalNullable.of(feeRuleBasisDescription);
    }

    /**
     * Initialization constructor.
     * @param  tierMin  Integer value for tierMin.
     * @param  tierMax  Integer value for tierMax.
     * @param  dateEffective  String value for dateEffective.
     * @param  dateTerminated  String value for dateTerminated.
     * @param  tierValue  Double value for tierValue.
     * @param  feeRuleBasisID  Integer value for feeRuleBasisID.
     * @param  feeRuleBasisDescription  String value for feeRuleBasisDescription.
     */

    protected FeesFeeRuleTiers(OptionalNullable<Integer> tierMin, OptionalNullable<Integer> tierMax,
            OptionalNullable<String> dateEffective, OptionalNullable<String> dateTerminated,
            OptionalNullable<Double> tierValue, OptionalNullable<Integer> feeRuleBasisID,
            OptionalNullable<String> feeRuleBasisDescription) {
        this.tierMin = tierMin;
        this.tierMax = tierMax;
        this.dateEffective = dateEffective;
        this.dateTerminated = dateTerminated;
        this.tierValue = tierValue;
        this.feeRuleBasisID = feeRuleBasisID;
        this.feeRuleBasisDescription = feeRuleBasisDescription;
    }

    /**
     * Internal Getter for TierMin.
     * @return Returns the Internal Integer
     */
    @JsonGetter("TierMin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetTierMin() {
        return this.tierMin;
    }

    /**
     * Getter for TierMin.
     * @return Returns the Integer
     */
    public Integer getTierMin() {
        return OptionalNullable.getFrom(tierMin);
    }

    /**
     * Setter for TierMin.
     * @param tierMin Value for Integer
     */
    @JsonSetter("TierMin")
    public void setTierMin(Integer tierMin) {
        this.tierMin = OptionalNullable.of(tierMin);
    }

    /**
     * UnSetter for TierMin.
     */
    public void unsetTierMin() {
        tierMin = null;
    }

    /**
     * Internal Getter for TierMax.
     * @return Returns the Internal Integer
     */
    @JsonGetter("TierMax")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetTierMax() {
        return this.tierMax;
    }

    /**
     * Getter for TierMax.
     * @return Returns the Integer
     */
    public Integer getTierMax() {
        return OptionalNullable.getFrom(tierMax);
    }

    /**
     * Setter for TierMax.
     * @param tierMax Value for Integer
     */
    @JsonSetter("TierMax")
    public void setTierMax(Integer tierMax) {
        this.tierMax = OptionalNullable.of(tierMax);
    }

    /**
     * UnSetter for TierMax.
     */
    public void unsetTierMax() {
        tierMax = null;
    }

    /**
     * Internal Getter for DateEffective.
     * @return Returns the Internal String
     */
    @JsonGetter("DateEffective")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDateEffective() {
        return this.dateEffective;
    }

    /**
     * Getter for DateEffective.
     * @return Returns the String
     */
    public String getDateEffective() {
        return OptionalNullable.getFrom(dateEffective);
    }

    /**
     * Setter for DateEffective.
     * @param dateEffective Value for String
     */
    @JsonSetter("DateEffective")
    public void setDateEffective(String dateEffective) {
        this.dateEffective = OptionalNullable.of(dateEffective);
    }

    /**
     * UnSetter for DateEffective.
     */
    public void unsetDateEffective() {
        dateEffective = null;
    }

    /**
     * Internal Getter for DateTerminated.
     * @return Returns the Internal String
     */
    @JsonGetter("DateTerminated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDateTerminated() {
        return this.dateTerminated;
    }

    /**
     * Getter for DateTerminated.
     * @return Returns the String
     */
    public String getDateTerminated() {
        return OptionalNullable.getFrom(dateTerminated);
    }

    /**
     * Setter for DateTerminated.
     * @param dateTerminated Value for String
     */
    @JsonSetter("DateTerminated")
    public void setDateTerminated(String dateTerminated) {
        this.dateTerminated = OptionalNullable.of(dateTerminated);
    }

    /**
     * UnSetter for DateTerminated.
     */
    public void unsetDateTerminated() {
        dateTerminated = null;
    }

    /**
     * Internal Getter for TierValue.
     * @return Returns the Internal Double
     */
    @JsonGetter("TierValue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Double> internalGetTierValue() {
        return this.tierValue;
    }

    /**
     * Getter for TierValue.
     * @return Returns the Double
     */
    public Double getTierValue() {
        return OptionalNullable.getFrom(tierValue);
    }

    /**
     * Setter for TierValue.
     * @param tierValue Value for Double
     */
    @JsonSetter("TierValue")
    public void setTierValue(Double tierValue) {
        this.tierValue = OptionalNullable.of(tierValue);
    }

    /**
     * UnSetter for TierValue.
     */
    public void unsetTierValue() {
        tierValue = null;
    }

    /**
     * Internal Getter for FeeRuleBasisID.
     * @return Returns the Internal Integer
     */
    @JsonGetter("FeeRuleBasisID")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetFeeRuleBasisID() {
        return this.feeRuleBasisID;
    }

    /**
     * Getter for FeeRuleBasisID.
     * @return Returns the Integer
     */
    public Integer getFeeRuleBasisID() {
        return OptionalNullable.getFrom(feeRuleBasisID);
    }

    /**
     * Setter for FeeRuleBasisID.
     * @param feeRuleBasisID Value for Integer
     */
    @JsonSetter("FeeRuleBasisID")
    public void setFeeRuleBasisID(Integer feeRuleBasisID) {
        this.feeRuleBasisID = OptionalNullable.of(feeRuleBasisID);
    }

    /**
     * UnSetter for FeeRuleBasisID.
     */
    public void unsetFeeRuleBasisID() {
        feeRuleBasisID = null;
    }

    /**
     * Internal Getter for FeeRuleBasisDescription.
     * @return Returns the Internal String
     */
    @JsonGetter("FeeRuleBasisDescription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFeeRuleBasisDescription() {
        return this.feeRuleBasisDescription;
    }

    /**
     * Getter for FeeRuleBasisDescription.
     * @return Returns the String
     */
    public String getFeeRuleBasisDescription() {
        return OptionalNullable.getFrom(feeRuleBasisDescription);
    }

    /**
     * Setter for FeeRuleBasisDescription.
     * @param feeRuleBasisDescription Value for String
     */
    @JsonSetter("FeeRuleBasisDescription")
    public void setFeeRuleBasisDescription(String feeRuleBasisDescription) {
        this.feeRuleBasisDescription = OptionalNullable.of(feeRuleBasisDescription);
    }

    /**
     * UnSetter for FeeRuleBasisDescription.
     */
    public void unsetFeeRuleBasisDescription() {
        feeRuleBasisDescription = null;
    }

    /**
     * Converts this FeesFeeRuleTiers into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FeesFeeRuleTiers [" + "tierMin=" + tierMin + ", tierMax=" + tierMax
                + ", dateEffective=" + dateEffective + ", dateTerminated=" + dateTerminated
                + ", tierValue=" + tierValue + ", feeRuleBasisID=" + feeRuleBasisID
                + ", feeRuleBasisDescription=" + feeRuleBasisDescription + "]";
    }

    /**
     * Builds a new {@link FeesFeeRuleTiers.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FeesFeeRuleTiers.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.tierMin = internalGetTierMin();
        builder.tierMax = internalGetTierMax();
        builder.dateEffective = internalGetDateEffective();
        builder.dateTerminated = internalGetDateTerminated();
        builder.tierValue = internalGetTierValue();
        builder.feeRuleBasisID = internalGetFeeRuleBasisID();
        builder.feeRuleBasisDescription = internalGetFeeRuleBasisDescription();
        return builder;
    }

    /**
     * Class to build instances of {@link FeesFeeRuleTiers}.
     */
    public static class Builder {
        private OptionalNullable<Integer> tierMin;
        private OptionalNullable<Integer> tierMax;
        private OptionalNullable<String> dateEffective;
        private OptionalNullable<String> dateTerminated;
        private OptionalNullable<Double> tierValue;
        private OptionalNullable<Integer> feeRuleBasisID;
        private OptionalNullable<String> feeRuleBasisDescription;



        /**
         * Setter for tierMin.
         * @param  tierMin  Integer value for tierMin.
         * @return Builder
         */
        public Builder tierMin(Integer tierMin) {
            this.tierMin = OptionalNullable.of(tierMin);
            return this;
        }

        /**
         * UnSetter for tierMin.
         * @return Builder
         */
        public Builder unsetTierMin() {
            tierMin = null;
            return this;
        }

        /**
         * Setter for tierMax.
         * @param  tierMax  Integer value for tierMax.
         * @return Builder
         */
        public Builder tierMax(Integer tierMax) {
            this.tierMax = OptionalNullable.of(tierMax);
            return this;
        }

        /**
         * UnSetter for tierMax.
         * @return Builder
         */
        public Builder unsetTierMax() {
            tierMax = null;
            return this;
        }

        /**
         * Setter for dateEffective.
         * @param  dateEffective  String value for dateEffective.
         * @return Builder
         */
        public Builder dateEffective(String dateEffective) {
            this.dateEffective = OptionalNullable.of(dateEffective);
            return this;
        }

        /**
         * UnSetter for dateEffective.
         * @return Builder
         */
        public Builder unsetDateEffective() {
            dateEffective = null;
            return this;
        }

        /**
         * Setter for dateTerminated.
         * @param  dateTerminated  String value for dateTerminated.
         * @return Builder
         */
        public Builder dateTerminated(String dateTerminated) {
            this.dateTerminated = OptionalNullable.of(dateTerminated);
            return this;
        }

        /**
         * UnSetter for dateTerminated.
         * @return Builder
         */
        public Builder unsetDateTerminated() {
            dateTerminated = null;
            return this;
        }

        /**
         * Setter for tierValue.
         * @param  tierValue  Double value for tierValue.
         * @return Builder
         */
        public Builder tierValue(Double tierValue) {
            this.tierValue = OptionalNullable.of(tierValue);
            return this;
        }

        /**
         * UnSetter for tierValue.
         * @return Builder
         */
        public Builder unsetTierValue() {
            tierValue = null;
            return this;
        }

        /**
         * Setter for feeRuleBasisID.
         * @param  feeRuleBasisID  Integer value for feeRuleBasisID.
         * @return Builder
         */
        public Builder feeRuleBasisID(Integer feeRuleBasisID) {
            this.feeRuleBasisID = OptionalNullable.of(feeRuleBasisID);
            return this;
        }

        /**
         * UnSetter for feeRuleBasisID.
         * @return Builder
         */
        public Builder unsetFeeRuleBasisID() {
            feeRuleBasisID = null;
            return this;
        }

        /**
         * Setter for feeRuleBasisDescription.
         * @param  feeRuleBasisDescription  String value for feeRuleBasisDescription.
         * @return Builder
         */
        public Builder feeRuleBasisDescription(String feeRuleBasisDescription) {
            this.feeRuleBasisDescription = OptionalNullable.of(feeRuleBasisDescription);
            return this;
        }

        /**
         * UnSetter for feeRuleBasisDescription.
         * @return Builder
         */
        public Builder unsetFeeRuleBasisDescription() {
            feeRuleBasisDescription = null;
            return this;
        }

        /**
         * Builds a new {@link FeesFeeRuleTiers} object using the set fields.
         * @return {@link FeesFeeRuleTiers}
         */
        public FeesFeeRuleTiers build() {
            return new FeesFeeRuleTiers(tierMin, tierMax, dateEffective, dateTerminated, tierValue,
                    feeRuleBasisID, feeRuleBasisDescription);
        }
    }
}
