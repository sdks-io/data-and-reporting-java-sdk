/*
 * ShellDataReportingAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.shell.apitest.models.Fault;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for FleetmanagementV1CustomerPayers500ErrorException type.
 */
public class FleetmanagementV1CustomerPayers500ErrorException extends ApiException {
    private static final long serialVersionUID = -63965807066177139L;
    private Fault fault;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public FleetmanagementV1CustomerPayers500ErrorException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Fault.
     * @return Returns the Fault
     */
    @JsonGetter("fault")
    public Fault getFault() {
        return this.fault;
    }

    /**
     * Setter for Fault.
     * @param fault Value for Fault
     */
    @JsonSetter("fault")
    private void setFault(Fault fault) {
        this.fault = fault;
    }
}
