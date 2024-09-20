/*
 * ShellDataReportingAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.shell.apitest.models.ErrorUserAccessError;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for FleetmanagementV1CustomerCustomer403ErrorException type.
 */
public class FleetmanagementV1CustomerCustomer403ErrorException extends ApiException {
    private static final long serialVersionUID = -43449170798643130L;
    private ErrorUserAccessError error;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public FleetmanagementV1CustomerCustomer403ErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Error.
     * @return Returns the ErrorUserAccessError
     */
    @JsonGetter("Error")
    public ErrorUserAccessError getError() {
        return this.error;
    }

    /**
     * Setter for Error.
     * @param error Value for ErrorUserAccessError
     */
    @JsonSetter("Error")
    private void setError(ErrorUserAccessError error) {
        this.error = error;
    }
}
