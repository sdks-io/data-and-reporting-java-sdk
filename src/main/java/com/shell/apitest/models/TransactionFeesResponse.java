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
 * This is a model class for TransactionFeesResponse type.
 */
public class TransactionFeesResponse {
    private List<FeeItem> feeItems;
    private Integer currentPage;
    private Integer rowCount;
    private Integer totalPages;
    private ErrorStatus error;
    private String requestId;

    /**
     * Default constructor.
     */
    public TransactionFeesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  feeItems  List of FeeItem value for feeItems.
     * @param  currentPage  Integer value for currentPage.
     * @param  rowCount  Integer value for rowCount.
     * @param  totalPages  Integer value for totalPages.
     * @param  error  ErrorStatus value for error.
     * @param  requestId  String value for requestId.
     */
    public TransactionFeesResponse(
            List<FeeItem> feeItems,
            Integer currentPage,
            Integer rowCount,
            Integer totalPages,
            ErrorStatus error,
            String requestId) {
        this.feeItems = feeItems;
        this.currentPage = currentPage;
        this.rowCount = rowCount;
        this.totalPages = totalPages;
        this.error = error;
        this.requestId = requestId;
    }

    /**
     * Getter for FeeItems.
     * @return Returns the List of FeeItem
     */
    @JsonGetter("FeeItems")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<FeeItem> getFeeItems() {
        return feeItems;
    }

    /**
     * Setter for FeeItems.
     * @param feeItems Value for List of FeeItem
     */
    @JsonSetter("FeeItems")
    public void setFeeItems(List<FeeItem> feeItems) {
        this.feeItems = feeItems;
    }

    /**
     * Getter for CurrentPage.
     * Current Page
     * @return Returns the Integer
     */
    @JsonGetter("CurrentPage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCurrentPage() {
        return currentPage;
    }

    /**
     * Setter for CurrentPage.
     * Current Page
     * @param currentPage Value for Integer
     */
    @JsonSetter("CurrentPage")
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * Getter for RowCount.
     * Total row count matched for the given input criteria
     * @return Returns the Integer
     */
    @JsonGetter("RowCount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRowCount() {
        return rowCount;
    }

    /**
     * Setter for RowCount.
     * Total row count matched for the given input criteria
     * @param rowCount Value for Integer
     */
    @JsonSetter("RowCount")
    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    /**
     * Getter for TotalPages.
     * Calculated page count based on page size from the incoming API request and total number of
     * rows matched for the given input criteria
     * @return Returns the Integer
     */
    @JsonGetter("TotalPages")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Setter for TotalPages.
     * Calculated page count based on page size from the incoming API request and total number of
     * rows matched for the given input criteria
     * @param totalPages Value for Integer
     */
    @JsonSetter("TotalPages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
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
     * Converts this TransactionFeesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TransactionFeesResponse [" + "feeItems=" + feeItems + ", currentPage=" + currentPage
                + ", rowCount=" + rowCount + ", totalPages=" + totalPages + ", error=" + error
                + ", requestId=" + requestId + "]";
    }

    /**
     * Builds a new {@link TransactionFeesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TransactionFeesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .feeItems(getFeeItems())
                .currentPage(getCurrentPage())
                .rowCount(getRowCount())
                .totalPages(getTotalPages())
                .error(getError())
                .requestId(getRequestId());
        return builder;
    }

    /**
     * Class to build instances of {@link TransactionFeesResponse}.
     */
    public static class Builder {
        private List<FeeItem> feeItems;
        private Integer currentPage;
        private Integer rowCount;
        private Integer totalPages;
        private ErrorStatus error;
        private String requestId;



        /**
         * Setter for feeItems.
         * @param  feeItems  List of FeeItem value for feeItems.
         * @return Builder
         */
        public Builder feeItems(List<FeeItem> feeItems) {
            this.feeItems = feeItems;
            return this;
        }

        /**
         * Setter for currentPage.
         * @param  currentPage  Integer value for currentPage.
         * @return Builder
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Setter for rowCount.
         * @param  rowCount  Integer value for rowCount.
         * @return Builder
         */
        public Builder rowCount(Integer rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        /**
         * Setter for totalPages.
         * @param  totalPages  Integer value for totalPages.
         * @return Builder
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
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
         * Builds a new {@link TransactionFeesResponse} object using the set fields.
         * @return {@link TransactionFeesResponse}
         */
        public TransactionFeesResponse build() {
            return new TransactionFeesResponse(feeItems, currentPage, rowCount, totalPages, error,
                    requestId);
        }
    }
}
