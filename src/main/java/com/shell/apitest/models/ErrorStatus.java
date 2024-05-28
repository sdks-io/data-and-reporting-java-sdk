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
 * This is a model class for ErrorStatus type.
 */
public class ErrorStatus {
    private String code;
    private String description;

    /**
     * Default constructor.
     */
    public ErrorStatus() {
    }

    /**
     * Initialization constructor.
     * @param  code  String value for code.
     * @param  description  String value for description.
     */
    public ErrorStatus(
            String code,
            String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * Getter for Code.
     * Error Code
     * @return Returns the String
     */
    @JsonGetter("Code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Error Code
     * @param code Value for String
     */
    @JsonSetter("Code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Description.
     * Error Description
     * @return Returns the String
     */
    @JsonGetter("Description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Error Description
     * @param description Value for String
     */
    @JsonSetter("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Converts this ErrorStatus into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ErrorStatus [" + "code=" + code + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link ErrorStatus.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ErrorStatus.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .code(getCode())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link ErrorStatus}.
     */
    public static class Builder {
        private String code;
        private String description;



        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link ErrorStatus} object using the set fields.
         * @return {@link ErrorStatus}
         */
        public ErrorStatus build() {
            return new ErrorStatus(code, description);
        }
    }
}
