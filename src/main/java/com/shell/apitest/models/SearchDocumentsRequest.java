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
 * This is a model class for SearchDocumentsRequest type.
 */
public class SearchDocumentsRequest {
    private SearchDocReq filters;
    private String page;
    private String pageSize;

    /**
     * Default constructor.
     */
    public SearchDocumentsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  filters  SearchDocReq value for filters.
     * @param  page  String value for page.
     * @param  pageSize  String value for pageSize.
     */
    public SearchDocumentsRequest(
            SearchDocReq filters,
            String page,
            String pageSize) {
        this.filters = filters;
        this.page = page;
        this.pageSize = pageSize;
    }

    /**
     * Getter for Filters.
     * @return Returns the SearchDocReq
     */
    @JsonGetter("Filters")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SearchDocReq getFilters() {
        return filters;
    }

    /**
     * Setter for Filters.
     * @param filters Value for SearchDocReq
     */
    @JsonSetter("Filters")
    public void setFilters(SearchDocReq filters) {
        this.filters = filters;
    }

    /**
     * Getter for Page.
     * Specify the page of results to be returned.
     * @return Returns the String
     */
    @JsonGetter("Page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPage() {
        return page;
    }

    /**
     * Setter for Page.
     * Specify the page of results to be returned.
     * @param page Value for String
     */
    @JsonSetter("Page")
    public void setPage(String page) {
        this.page = page;
    }

    /**
     * Getter for PageSize.
     * Specify the number of records to returned; Max 1000
     * @return Returns the String
     */
    @JsonGetter("PageSize")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPageSize() {
        return pageSize;
    }

    /**
     * Setter for PageSize.
     * Specify the number of records to returned; Max 1000
     * @param pageSize Value for String
     */
    @JsonSetter("PageSize")
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Converts this SearchDocumentsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SearchDocumentsRequest [" + "filters=" + filters + ", page=" + page + ", pageSize="
                + pageSize + "]";
    }

    /**
     * Builds a new {@link SearchDocumentsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SearchDocumentsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .filters(getFilters())
                .page(getPage())
                .pageSize(getPageSize());
        return builder;
    }

    /**
     * Class to build instances of {@link SearchDocumentsRequest}.
     */
    public static class Builder {
        private SearchDocReq filters;
        private String page;
        private String pageSize;



        /**
         * Setter for filters.
         * @param  filters  SearchDocReq value for filters.
         * @return Builder
         */
        public Builder filters(SearchDocReq filters) {
            this.filters = filters;
            return this;
        }

        /**
         * Setter for page.
         * @param  page  String value for page.
         * @return Builder
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Setter for pageSize.
         * @param  pageSize  String value for pageSize.
         * @return Builder
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Builds a new {@link SearchDocumentsRequest} object using the set fields.
         * @return {@link SearchDocumentsRequest}
         */
        public SearchDocumentsRequest build() {
            return new SearchDocumentsRequest(filters, page, pageSize);
        }
    }
}
