/*
 * ShellDataReportingAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for VolumeBasedBonusResponse type.
 */
public class VolumeBasedBonusResponse {
    private List<BonusConfiguration> configuration;
    private List<CurrentVolume> currentPeriodConsumption;
    private List<BonusHistory> historicalBonusPaid;
    private ErrorStatus error;
    private String requestId;

    /**
     * Default constructor.
     */
    public VolumeBasedBonusResponse() {
    }

    /**
     * Initialization constructor.
     * @param  configuration  List of BonusConfiguration value for configuration.
     * @param  currentPeriodConsumption  List of CurrentVolume value for currentPeriodConsumption.
     * @param  historicalBonusPaid  List of BonusHistory value for historicalBonusPaid.
     * @param  error  ErrorStatus value for error.
     * @param  requestId  String value for requestId.
     */
    public VolumeBasedBonusResponse(
            List<BonusConfiguration> configuration,
            List<CurrentVolume> currentPeriodConsumption,
            List<BonusHistory> historicalBonusPaid,
            ErrorStatus error,
            String requestId) {
        this.configuration = configuration;
        this.currentPeriodConsumption = currentPeriodConsumption;
        this.historicalBonusPaid = historicalBonusPaid;
        this.error = error;
        this.requestId = requestId;
    }

    /**
     * Getter for Configuration.
     * @return Returns the List of BonusConfiguration
     */
    @JsonGetter("Configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BonusConfiguration> getConfiguration() {
        return configuration;
    }

    /**
     * Setter for Configuration.
     * @param configuration Value for List of BonusConfiguration
     */
    @JsonSetter("Configuration")
    public void setConfiguration(List<BonusConfiguration> configuration) {
        this.configuration = configuration;
    }

    /**
     * Getter for CurrentPeriodConsumption.
     * @return Returns the List of CurrentVolume
     */
    @JsonGetter("CurrentPeriodConsumption")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CurrentVolume> getCurrentPeriodConsumption() {
        return currentPeriodConsumption;
    }

    /**
     * Setter for CurrentPeriodConsumption.
     * @param currentPeriodConsumption Value for List of CurrentVolume
     */
    @JsonSetter("CurrentPeriodConsumption")
    public void setCurrentPeriodConsumption(List<CurrentVolume> currentPeriodConsumption) {
        this.currentPeriodConsumption = currentPeriodConsumption;
    }

    /**
     * Getter for HistoricalBonusPaid.
     * @return Returns the List of BonusHistory
     */
    @JsonGetter("HistoricalBonusPaid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BonusHistory> getHistoricalBonusPaid() {
        return historicalBonusPaid;
    }

    /**
     * Setter for HistoricalBonusPaid.
     * @param historicalBonusPaid Value for List of BonusHistory
     */
    @JsonSetter("HistoricalBonusPaid")
    public void setHistoricalBonusPaid(List<BonusHistory> historicalBonusPaid) {
        this.historicalBonusPaid = historicalBonusPaid;
    }

    /**
     * Getter for Error.
     * @return Returns the ErrorStatus
     */
    @JsonGetter("Error")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ErrorStatus getError() {
        return error;
    }

    /**
     * Setter for Error.
     * @param error Value for ErrorStatus
     */
    @JsonSetter("Error")
    public void setError(ErrorStatus error) {
        this.error = error;
    }

    /**
     * Getter for RequestId.
     * API Request Id
     * @return Returns the String
     */
    @JsonGetter("RequestId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * API Request Id
     * @param requestId Value for String
     */
    @JsonSetter("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Converts this VolumeBasedBonusResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VolumeBasedBonusResponse [" + "configuration=" + configuration
                + ", currentPeriodConsumption=" + currentPeriodConsumption
                + ", historicalBonusPaid=" + historicalBonusPaid + ", error=" + error
                + ", requestId=" + requestId + "]";
    }

    /**
     * Builds a new {@link VolumeBasedBonusResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VolumeBasedBonusResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .configuration(getConfiguration())
                .currentPeriodConsumption(getCurrentPeriodConsumption())
                .historicalBonusPaid(getHistoricalBonusPaid())
                .error(getError())
                .requestId(getRequestId());
        return builder;
    }

    /**
     * Class to build instances of {@link VolumeBasedBonusResponse}.
     */
    public static class Builder {
        private List<BonusConfiguration> configuration;
        private List<CurrentVolume> currentPeriodConsumption;
        private List<BonusHistory> historicalBonusPaid;
        private ErrorStatus error;
        private String requestId;



        /**
         * Setter for configuration.
         * @param  configuration  List of BonusConfiguration value for configuration.
         * @return Builder
         */
        public Builder configuration(List<BonusConfiguration> configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * Setter for currentPeriodConsumption.
         * @param  currentPeriodConsumption  List of CurrentVolume value for
         *         currentPeriodConsumption.
         * @return Builder
         */
        public Builder currentPeriodConsumption(List<CurrentVolume> currentPeriodConsumption) {
            this.currentPeriodConsumption = currentPeriodConsumption;
            return this;
        }

        /**
         * Setter for historicalBonusPaid.
         * @param  historicalBonusPaid  List of BonusHistory value for historicalBonusPaid.
         * @return Builder
         */
        public Builder historicalBonusPaid(List<BonusHistory> historicalBonusPaid) {
            this.historicalBonusPaid = historicalBonusPaid;
            return this;
        }

        /**
         * Setter for error.
         * @param  error  ErrorStatus value for error.
         * @return Builder
         */
        public Builder error(ErrorStatus error) {
            this.error = error;
            return this;
        }

        /**
         * Setter for requestId.
         * @param  requestId  String value for requestId.
         * @return Builder
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Builds a new {@link VolumeBasedBonusResponse} object using the set fields.
         * @return {@link VolumeBasedBonusResponse}
         */
        public VolumeBasedBonusResponse build() {
            return new VolumeBasedBonusResponse(configuration, currentPeriodConsumption,
                    historicalBonusPaid, error, requestId);
        }
    }
}
