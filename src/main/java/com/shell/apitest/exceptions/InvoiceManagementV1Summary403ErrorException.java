/*
 * ShellDataReportingAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.shell.apitest.models.ErrorDetails;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for InvoiceManagementV1Summary403ErrorException type.
 */
public class InvoiceManagementV1Summary403ErrorException extends ApiException {
    private static final long serialVersionUID = -2509443330666146199L;
    private String requestId;
    private String status;
    private List<ErrorDetails> errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public InvoiceManagementV1Summary403ErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for RequestId.
     * Unique request identifier passed from end user. This identifier helps in tracing a
     * transaction
     * @return Returns the String
     */
    @JsonGetter("RequestId")
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Setter for RequestId.
     * Unique request identifier passed from end user. This identifier helps in tracing a
     * transaction
     * @param requestId Value for String
     */
    @JsonSetter("RequestId")
    private void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for Status.
     * Indicates overall status of the request. Allowed values: SUCCES, FAILED, PARTIAL_SUCCESS
     * @return Returns the String
     */
    @JsonGetter("Status")
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for Status.
     * Indicates overall status of the request. Allowed values: SUCCES, FAILED, PARTIAL_SUCCESS
     * @param status Value for String
     */
    @JsonSetter("Status")
    private void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Errors.
     * @return Returns the List of ErrorDetails
     */
    @JsonGetter("Errors")
    public List<ErrorDetails> getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for List of ErrorDetails
     */
    @JsonSetter("Errors")
    private void setErrors(List<ErrorDetails> errors) {
        this.errors = errors;
    }
}
