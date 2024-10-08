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
 * This is a model class for StatementOfAccountResponse type.
 */
public class StatementOfAccountResponse {
    private String requestId;
    private String status;
    private List<StatementOfAccountResp> data;

    /**
     * Default constructor.
     */
    public StatementOfAccountResponse() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     * @param  status  String value for status.
     * @param  data  List of StatementOfAccountResp value for data.
     */
    public StatementOfAccountResponse(
            String requestId,
            String status,
            List<StatementOfAccountResp> data) {
        this.requestId = requestId;
        this.status = status;
        this.data = data;
    }

    /**
     * Getter for RequestId.
     * Unique request identifier passed from end user. This identifier helps in tracing a
     * transaction
     * @return Returns the String
     */
    @JsonGetter("RequestId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * Unique request identifier passed from end user. This identifier helps in tracing a
     * transaction
     * @param requestId Value for String
     */
    @JsonSetter("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for Status.
     * Indicates overall status of the request. Allowed values: SUCCES, FAILED
     * @return Returns the String
     */
    @JsonGetter("Status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Indicates overall status of the request. Allowed values: SUCCES, FAILED
     * @param status Value for String
     */
    @JsonSetter("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Data.
     * @return Returns the List of StatementOfAccountResp
     */
    @JsonGetter("Data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<StatementOfAccountResp> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for List of StatementOfAccountResp
     */
    @JsonSetter("Data")
    public void setData(List<StatementOfAccountResp> data) {
        this.data = data;
    }

    /**
     * Converts this StatementOfAccountResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "StatementOfAccountResponse [" + "requestId=" + requestId + ", status=" + status
                + ", data=" + data + "]";
    }

    /**
     * Builds a new {@link StatementOfAccountResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link StatementOfAccountResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .requestId(getRequestId())
                .status(getStatus())
                .data(getData());
        return builder;
    }

    /**
     * Class to build instances of {@link StatementOfAccountResponse}.
     */
    public static class Builder {
        private String requestId;
        private String status;
        private List<StatementOfAccountResp> data;



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
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  List of StatementOfAccountResp value for data.
         * @return Builder
         */
        public Builder data(List<StatementOfAccountResp> data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link StatementOfAccountResponse} object using the set fields.
         * @return {@link StatementOfAccountResponse}
         */
        public StatementOfAccountResponse build() {
            return new StatementOfAccountResponse(requestId, status, data);
        }
    }
}
