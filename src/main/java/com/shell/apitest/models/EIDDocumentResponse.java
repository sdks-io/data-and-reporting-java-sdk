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
 * This is a model class for EIDDocumentResponse type.
 */
public class EIDDocumentResponse {
    private String requestId;
    private String status;
    private List<EIDDocument> data;
    private Integer pageSize;
    private Integer page;
    private Integer totalPages;
    private Integer totalRecords;
    private Boolean isFirstPage;
    private Boolean isLastPage;

    /**
     * Default constructor.
     */
    public EIDDocumentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  requestId  String value for requestId.
     * @param  status  String value for status.
     * @param  data  List of EIDDocument value for data.
     * @param  pageSize  Integer value for pageSize.
     * @param  page  Integer value for page.
     * @param  totalPages  Integer value for totalPages.
     * @param  totalRecords  Integer value for totalRecords.
     * @param  isFirstPage  Boolean value for isFirstPage.
     * @param  isLastPage  Boolean value for isLastPage.
     */
    public EIDDocumentResponse(
            String requestId,
            String status,
            List<EIDDocument> data,
            Integer pageSize,
            Integer page,
            Integer totalPages,
            Integer totalRecords,
            Boolean isFirstPage,
            Boolean isLastPage) {
        this.requestId = requestId;
        this.status = status;
        this.data = data;
        this.pageSize = pageSize;
        this.page = page;
        this.totalPages = totalPages;
        this.totalRecords = totalRecords;
        this.isFirstPage = isFirstPage;
        this.isLastPage = isLastPage;
    }

    /**
     * Getter for RequestId.
     * UUID (according to RFC 4122 standards) for requests and responses. This will be played back
     * in the response from the request.
     * @return Returns the String
     */
    @JsonGetter("RequestId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRequestId() {
        return requestId;
    }

    /**
     * Setter for RequestId.
     * UUID (according to RFC 4122 standards) for requests and responses. This will be played back
     * in the response from the request.
     * @param requestId Value for String
     */
    @JsonSetter("RequestId")
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Getter for Status.
     * Indicates overall status of the request. Allowed values: SUCCESS, FAILED
     * @return Returns the String
     */
    @JsonGetter("Status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Indicates overall status of the request. Allowed values: SUCCESS, FAILED
     * @param status Value for String
     */
    @JsonSetter("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Data.
     * @return Returns the List of EIDDocument
     */
    @JsonGetter("Data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<EIDDocument> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * @param data Value for List of EIDDocument
     */
    @JsonSetter("Data")
    public void setData(List<EIDDocument> data) {
        this.data = data;
    }

    /**
     * Getter for PageSize.
     * Number of records returned in the response
     * @return Returns the Integer
     */
    @JsonGetter("PageSize")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Setter for PageSize.
     * Number of records returned in the response
     * @param pageSize Value for Integer
     */
    @JsonSetter("PageSize")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Getter for Page.
     * Current page
     * @return Returns the Integer
     */
    @JsonGetter("Page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPage() {
        return page;
    }

    /**
     * Setter for Page.
     * Current page
     * @param page Value for Integer
     */
    @JsonSetter("Page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Getter for TotalPages.
     * Total number of pages available for the requested data
     * @return Returns the Integer
     */
    @JsonGetter("TotalPages")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Setter for TotalPages.
     * Total number of pages available for the requested data
     * @param totalPages Value for Integer
     */
    @JsonSetter("TotalPages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * Getter for TotalRecords.
     * Total number of elements corresponding to the request
     * @return Returns the Integer
     */
    @JsonGetter("TotalRecords")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalRecords() {
        return totalRecords;
    }

    /**
     * Setter for TotalRecords.
     * Total number of elements corresponding to the request
     * @param totalRecords Value for Integer
     */
    @JsonSetter("TotalRecords")
    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    /**
     * Getter for IsFirstPage.
     * True if it is the first page, false otherwise
     * @return Returns the Boolean
     */
    @JsonGetter("IsFirstPage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsFirstPage() {
        return isFirstPage;
    }

    /**
     * Setter for IsFirstPage.
     * True if it is the first page, false otherwise
     * @param isFirstPage Value for Boolean
     */
    @JsonSetter("IsFirstPage")
    public void setIsFirstPage(Boolean isFirstPage) {
        this.isFirstPage = isFirstPage;
    }

    /**
     * Getter for IsLastPage.
     * True if it is the last page, false, otherwise.
     * @return Returns the Boolean
     */
    @JsonGetter("IsLastPage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsLastPage() {
        return isLastPage;
    }

    /**
     * Setter for IsLastPage.
     * True if it is the last page, false, otherwise.
     * @param isLastPage Value for Boolean
     */
    @JsonSetter("IsLastPage")
    public void setIsLastPage(Boolean isLastPage) {
        this.isLastPage = isLastPage;
    }

    /**
     * Converts this EIDDocumentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EIDDocumentResponse [" + "requestId=" + requestId + ", status=" + status + ", data="
                + data + ", pageSize=" + pageSize + ", page=" + page + ", totalPages=" + totalPages
                + ", totalRecords=" + totalRecords + ", isFirstPage=" + isFirstPage
                + ", isLastPage=" + isLastPage + "]";
    }

    /**
     * Builds a new {@link EIDDocumentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EIDDocumentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .requestId(getRequestId())
                .status(getStatus())
                .data(getData())
                .pageSize(getPageSize())
                .page(getPage())
                .totalPages(getTotalPages())
                .totalRecords(getTotalRecords())
                .isFirstPage(getIsFirstPage())
                .isLastPage(getIsLastPage());
        return builder;
    }

    /**
     * Class to build instances of {@link EIDDocumentResponse}.
     */
    public static class Builder {
        private String requestId;
        private String status;
        private List<EIDDocument> data;
        private Integer pageSize;
        private Integer page;
        private Integer totalPages;
        private Integer totalRecords;
        private Boolean isFirstPage;
        private Boolean isLastPage;



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
         * @param  data  List of EIDDocument value for data.
         * @return Builder
         */
        public Builder data(List<EIDDocument> data) {
            this.data = data;
            return this;
        }

        /**
         * Setter for pageSize.
         * @param  pageSize  Integer value for pageSize.
         * @return Builder
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Setter for page.
         * @param  page  Integer value for page.
         * @return Builder
         */
        public Builder page(Integer page) {
            this.page = page;
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
         * Setter for totalRecords.
         * @param  totalRecords  Integer value for totalRecords.
         * @return Builder
         */
        public Builder totalRecords(Integer totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }

        /**
         * Setter for isFirstPage.
         * @param  isFirstPage  Boolean value for isFirstPage.
         * @return Builder
         */
        public Builder isFirstPage(Boolean isFirstPage) {
            this.isFirstPage = isFirstPage;
            return this;
        }

        /**
         * Setter for isLastPage.
         * @param  isLastPage  Boolean value for isLastPage.
         * @return Builder
         */
        public Builder isLastPage(Boolean isLastPage) {
            this.isLastPage = isLastPage;
            return this;
        }

        /**
         * Builds a new {@link EIDDocumentResponse} object using the set fields.
         * @return {@link EIDDocumentResponse}
         */
        public EIDDocumentResponse build() {
            return new EIDDocumentResponse(requestId, status, data, pageSize, page, totalPages,
                    totalRecords, isFirstPage, isLastPage);
        }
    }
}
