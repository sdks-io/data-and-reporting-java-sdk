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
import java.util.List;

/**
 * This is a model class for AuditRequest type.
 */
public class AuditRequest {
    private String status;
    private OptionalNullable<String> payerNumber;
    private OptionalNullable<Integer> payerId;
    private OptionalNullable<String> accountNumber;
    private OptionalNullable<Integer> colCoCode;
    private OptionalNullable<Integer> colCoId;
    private Accounts accounts;
    private Integer pageSize;
    private List<String> requestedOperation;
    private OptionalNullable<String> sortOrder;
    private OptionalNullable<String> searchText;
    private OptionalNullable<Integer> currentPage;
    private OptionalNullable<String> fromDate;
    private OptionalNullable<String> toDate;

    /**
     * Default constructor.
     */
    public AuditRequest() {
    }

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     * @param  payerNumber  String value for payerNumber.
     * @param  payerId  Integer value for payerId.
     * @param  accountNumber  String value for accountNumber.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  colCoId  Integer value for colCoId.
     * @param  accounts  Accounts value for accounts.
     * @param  pageSize  Integer value for pageSize.
     * @param  requestedOperation  List of String value for requestedOperation.
     * @param  sortOrder  String value for sortOrder.
     * @param  searchText  String value for searchText.
     * @param  currentPage  Integer value for currentPage.
     * @param  fromDate  String value for fromDate.
     * @param  toDate  String value for toDate.
     */
    public AuditRequest(
            String status,
            String payerNumber,
            Integer payerId,
            String accountNumber,
            Integer colCoCode,
            Integer colCoId,
            Accounts accounts,
            Integer pageSize,
            List<String> requestedOperation,
            String sortOrder,
            String searchText,
            Integer currentPage,
            String fromDate,
            String toDate) {
        this.status = status;
        this.payerNumber = OptionalNullable.of(payerNumber);
        this.payerId = OptionalNullable.of(payerId);
        this.accountNumber = OptionalNullable.of(accountNumber);
        this.colCoCode = OptionalNullable.of(colCoCode);
        this.colCoId = OptionalNullable.of(colCoId);
        this.accounts = accounts;
        this.pageSize = pageSize;
        this.requestedOperation = requestedOperation;
        this.sortOrder = OptionalNullable.of(sortOrder);
        this.searchText = OptionalNullable.of(searchText);
        this.currentPage = OptionalNullable.of(currentPage);
        this.fromDate = OptionalNullable.of(fromDate);
        this.toDate = OptionalNullable.of(toDate);
    }

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     * @param  payerNumber  String value for payerNumber.
     * @param  payerId  Integer value for payerId.
     * @param  accountNumber  String value for accountNumber.
     * @param  colCoCode  Integer value for colCoCode.
     * @param  colCoId  Integer value for colCoId.
     * @param  accounts  Accounts value for accounts.
     * @param  pageSize  Integer value for pageSize.
     * @param  requestedOperation  List of String value for requestedOperation.
     * @param  sortOrder  String value for sortOrder.
     * @param  searchText  String value for searchText.
     * @param  currentPage  Integer value for currentPage.
     * @param  fromDate  String value for fromDate.
     * @param  toDate  String value for toDate.
     */

    protected AuditRequest(String status, OptionalNullable<String> payerNumber,
            OptionalNullable<Integer> payerId, OptionalNullable<String> accountNumber,
            OptionalNullable<Integer> colCoCode, OptionalNullable<Integer> colCoId,
            Accounts accounts, Integer pageSize, List<String> requestedOperation,
            OptionalNullable<String> sortOrder, OptionalNullable<String> searchText,
            OptionalNullable<Integer> currentPage, OptionalNullable<String> fromDate,
            OptionalNullable<String> toDate) {
        this.status = status;
        this.payerNumber = payerNumber;
        this.payerId = payerId;
        this.accountNumber = accountNumber;
        this.colCoCode = colCoCode;
        this.colCoId = colCoId;
        this.accounts = accounts;
        this.pageSize = pageSize;
        this.requestedOperation = requestedOperation;
        this.sortOrder = sortOrder;
        this.searchText = searchText;
        this.currentPage = currentPage;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    /**
     * Getter for Status.
     * Status of requests to be fetched. • Success • Failed • InProgress • Submitted • Rejected •
     * PendingApproval • All • MailedToCSC Optional If not passed “All” will be considered as the
     * default value.
     * @return Returns the String
     */
    @JsonGetter("Status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status of requests to be fetched. • Success • Failed • InProgress • Submitted • Rejected •
     * PendingApproval • All • MailedToCSC Optional If not passed “All” will be considered as the
     * default value.
     * @param status Value for String
     */
    @JsonSetter("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Internal Getter for PayerNumber.
     * Payer Number of the selected payer. Optional if PayerId is passed else Mandatory
     * @return Returns the Internal String
     */
    @JsonGetter("PayerNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPayerNumber() {
        return this.payerNumber;
    }

    /**
     * Getter for PayerNumber.
     * Payer Number of the selected payer. Optional if PayerId is passed else Mandatory
     * @return Returns the String
     */
    public String getPayerNumber() {
        return OptionalNullable.getFrom(payerNumber);
    }

    /**
     * Setter for PayerNumber.
     * Payer Number of the selected payer. Optional if PayerId is passed else Mandatory
     * @param payerNumber Value for String
     */
    @JsonSetter("PayerNumber")
    public void setPayerNumber(String payerNumber) {
        this.payerNumber = OptionalNullable.of(payerNumber);
    }

    /**
     * UnSetter for PayerNumber.
     * Payer Number of the selected payer. Optional if PayerId is passed else Mandatory
     */
    public void unsetPayerNumber() {
        payerNumber = null;
    }

    /**
     * Internal Getter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory Example:
     * 123456
     * @return Returns the Internal Integer
     */
    @JsonGetter("PayerId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetPayerId() {
        return this.payerId;
    }

    /**
     * Getter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory Example:
     * 123456
     * @return Returns the Integer
     */
    public Integer getPayerId() {
        return OptionalNullable.getFrom(payerId);
    }

    /**
     * Setter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory Example:
     * 123456
     * @param payerId Value for Integer
     */
    @JsonSetter("PayerId")
    public void setPayerId(Integer payerId) {
        this.payerId = OptionalNullable.of(payerId);
    }

    /**
     * UnSetter for PayerId.
     * Payer Id of the selected payer. Optional if PayerNumber is passed else Mandatory Example:
     * 123456
     */
    public void unsetPayerId() {
        payerId = null;
    }

    /**
     * Internal Getter for AccountNumber.
     * @return Returns the Internal String
     */
    @JsonGetter("AccountNumber")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Getter for AccountNumber.
     * @return Returns the String
     */
    public String getAccountNumber() {
        return OptionalNullable.getFrom(accountNumber);
    }

    /**
     * Setter for AccountNumber.
     * @param accountNumber Value for String
     */
    @JsonSetter("AccountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = OptionalNullable.of(accountNumber);
    }

    /**
     * UnSetter for AccountNumber.
     */
    public void unsetAccountNumber() {
        accountNumber = null;
    }

    /**
     * Internal Getter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided. Example: 86 for Philippines 5 for UK
     * @return Returns the Internal Integer
     */
    @JsonGetter("ColCoCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetColCoCode() {
        return this.colCoCode;
    }

    /**
     * Getter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided. Example: 86 for Philippines 5 for UK
     * @return Returns the Integer
     */
    public Integer getColCoCode() {
        return OptionalNullable.getFrom(colCoCode);
    }

    /**
     * Setter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided. Example: 86 for Philippines 5 for UK
     * @param colCoCode Value for Integer
     */
    @JsonSetter("ColCoCode")
    public void setColCoCode(Integer colCoCode) {
        this.colCoCode = OptionalNullable.of(colCoCode);
    }

    /**
     * UnSetter for ColCoCode.
     * Collecting Company Code (Shell Code) of the selected payer. Mandatory for serviced OUs such
     * as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if
     * ColCoID is provided. Example: 86 for Philippines 5 for UK
     */
    public void unsetColCoCode() {
        colCoCode = null;
    }

    /**
     * Internal Getter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
     * @return Returns the Internal Integer
     */
    @JsonGetter("ColCoId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetColCoId() {
        return this.colCoId;
    }

    /**
     * Getter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
     * @return Returns the Integer
     */
    public Integer getColCoId() {
        return OptionalNullable.getFrom(colCoId);
    }

    /**
     * Setter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
     * @param colCoId Value for Integer
     */
    @JsonSetter("ColCoId")
    public void setColCoId(Integer colCoId) {
        this.colCoId = OptionalNullable.of(colCoId);
    }

    /**
     * UnSetter for ColCoId.
     * Collecting Company Id of the selected payer. Optional if ColCoCode is passed else Mandatory.
     * Example: 1 for Philippines 5 for UK
     */
    public void unsetColCoId() {
        colCoId = null;
    }

    /**
     * Getter for Accounts.
     * @return Returns the Accounts
     */
    @JsonGetter("Accounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Accounts getAccounts() {
        return accounts;
    }

    /**
     * Setter for Accounts.
     * @param accounts Value for Accounts
     */
    @JsonSetter("Accounts")
    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    /**
     * Getter for PageSize.
     * Page Size – Number of records to show on a page Optional Default value 50
     * @return Returns the Integer
     */
    @JsonGetter("PageSize")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Setter for PageSize.
     * Page Size – Number of records to show on a page Optional Default value 50
     * @param pageSize Value for Integer
     */
    @JsonSetter("PageSize")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Getter for RequestedOperation.
     * To search for requests submitted until this date. Optional Format: yyyyMMdd Example: 20200130
     * If ToDate is not provided and FromDate is provided, then ToDate will be considered as current
     * date or 30 days from FromDate, whichever is earlier. However, when both FromDate and ToDate
     * is not provided then last 30 days will be considered for filtering.
     * @return Returns the List of String
     */
    @JsonGetter("RequestedOperation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getRequestedOperation() {
        return requestedOperation;
    }

    /**
     * Setter for RequestedOperation.
     * To search for requests submitted until this date. Optional Format: yyyyMMdd Example: 20200130
     * If ToDate is not provided and FromDate is provided, then ToDate will be considered as current
     * date or 30 days from FromDate, whichever is earlier. However, when both FromDate and ToDate
     * is not provided then last 30 days will be considered for filtering.
     * @param requestedOperation Value for List of String
     */
    @JsonSetter("RequestedOperation")
    public void setRequestedOperation(List<String> requestedOperation) {
        this.requestedOperation = requestedOperation;
    }

    /**
     * Internal Getter for SortOrder.
     * Allowed Sorting Options: 1. SubmittedDateDescending 2. SubmittedDateAscending 3.
     * AccountNumberAscending 4. AccountNumberDescending Optional: Default value is 1 Example value
     * to be passed: 1,3
     * @return Returns the Internal String
     */
    @JsonGetter("SortOrder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSortOrder() {
        return this.sortOrder;
    }

    /**
     * Getter for SortOrder.
     * Allowed Sorting Options: 1. SubmittedDateDescending 2. SubmittedDateAscending 3.
     * AccountNumberAscending 4. AccountNumberDescending Optional: Default value is 1 Example value
     * to be passed: 1,3
     * @return Returns the String
     */
    public String getSortOrder() {
        return OptionalNullable.getFrom(sortOrder);
    }

    /**
     * Setter for SortOrder.
     * Allowed Sorting Options: 1. SubmittedDateDescending 2. SubmittedDateAscending 3.
     * AccountNumberAscending 4. AccountNumberDescending Optional: Default value is 1 Example value
     * to be passed: 1,3
     * @param sortOrder Value for String
     */
    @JsonSetter("SortOrder")
    public void setSortOrder(String sortOrder) {
        this.sortOrder = OptionalNullable.of(sortOrder);
    }

    /**
     * UnSetter for SortOrder.
     * Allowed Sorting Options: 1. SubmittedDateDescending 2. SubmittedDateAscending 3.
     * AccountNumberAscending 4. AccountNumberDescending Optional: Default value is 1 Example value
     * to be passed: 1,3
     */
    public void unsetSortOrder() {
        sortOrder = null;
    }

    /**
     * Internal Getter for SearchText.
     * Search text used as criteria to filter the requests. Optional Minimum length is 4 characters
     * (configurable). Else, an error (0007) will be returned. When valid text is provided, MS will
     * return all the records that contains the Search Text within any of the look up fields
     * @return Returns the Internal String
     */
    @JsonGetter("SearchText")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSearchText() {
        return this.searchText;
    }

    /**
     * Getter for SearchText.
     * Search text used as criteria to filter the requests. Optional Minimum length is 4 characters
     * (configurable). Else, an error (0007) will be returned. When valid text is provided, MS will
     * return all the records that contains the Search Text within any of the look up fields
     * @return Returns the String
     */
    public String getSearchText() {
        return OptionalNullable.getFrom(searchText);
    }

    /**
     * Setter for SearchText.
     * Search text used as criteria to filter the requests. Optional Minimum length is 4 characters
     * (configurable). Else, an error (0007) will be returned. When valid text is provided, MS will
     * return all the records that contains the Search Text within any of the look up fields
     * @param searchText Value for String
     */
    @JsonSetter("SearchText")
    public void setSearchText(String searchText) {
        this.searchText = OptionalNullable.of(searchText);
    }

    /**
     * UnSetter for SearchText.
     * Search text used as criteria to filter the requests. Optional Minimum length is 4 characters
     * (configurable). Else, an error (0007) will be returned. When valid text is provided, MS will
     * return all the records that contains the Search Text within any of the look up fields
     */
    public void unsetSearchText() {
        searchText = null;
    }

    /**
     * Internal Getter for CurrentPage.
     * Page Number (as shown to the users) Optional Default value 1
     * @return Returns the Internal Integer
     */
    @JsonGetter("CurrentPage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetCurrentPage() {
        return this.currentPage;
    }

    /**
     * Getter for CurrentPage.
     * Page Number (as shown to the users) Optional Default value 1
     * @return Returns the Integer
     */
    public Integer getCurrentPage() {
        return OptionalNullable.getFrom(currentPage);
    }

    /**
     * Setter for CurrentPage.
     * Page Number (as shown to the users) Optional Default value 1
     * @param currentPage Value for Integer
     */
    @JsonSetter("CurrentPage")
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = OptionalNullable.of(currentPage);
    }

    /**
     * UnSetter for CurrentPage.
     * Page Number (as shown to the users) Optional Default value 1
     */
    public void unsetCurrentPage() {
        currentPage = null;
    }

    /**
     * Internal Getter for FromDate.
     * To search for requests submitted from this date. Optional Maximum of X days duration allowed
     * per search. The X value is configurable and initially set to 180 days. Format: yyyyMMdd
     * Example: 20200101 If FromDate is not provided and ToDate is provided, then FromDate will be
     * considered as 30 days less than ToDate. However, when both FromDate and ToDate is not
     * provided then last 30 days will be considered for filtering.
     * @return Returns the Internal String
     */
    @JsonGetter("FromDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFromDate() {
        return this.fromDate;
    }

    /**
     * Getter for FromDate.
     * To search for requests submitted from this date. Optional Maximum of X days duration allowed
     * per search. The X value is configurable and initially set to 180 days. Format: yyyyMMdd
     * Example: 20200101 If FromDate is not provided and ToDate is provided, then FromDate will be
     * considered as 30 days less than ToDate. However, when both FromDate and ToDate is not
     * provided then last 30 days will be considered for filtering.
     * @return Returns the String
     */
    public String getFromDate() {
        return OptionalNullable.getFrom(fromDate);
    }

    /**
     * Setter for FromDate.
     * To search for requests submitted from this date. Optional Maximum of X days duration allowed
     * per search. The X value is configurable and initially set to 180 days. Format: yyyyMMdd
     * Example: 20200101 If FromDate is not provided and ToDate is provided, then FromDate will be
     * considered as 30 days less than ToDate. However, when both FromDate and ToDate is not
     * provided then last 30 days will be considered for filtering.
     * @param fromDate Value for String
     */
    @JsonSetter("FromDate")
    public void setFromDate(String fromDate) {
        this.fromDate = OptionalNullable.of(fromDate);
    }

    /**
     * UnSetter for FromDate.
     * To search for requests submitted from this date. Optional Maximum of X days duration allowed
     * per search. The X value is configurable and initially set to 180 days. Format: yyyyMMdd
     * Example: 20200101 If FromDate is not provided and ToDate is provided, then FromDate will be
     * considered as 30 days less than ToDate. However, when both FromDate and ToDate is not
     * provided then last 30 days will be considered for filtering.
     */
    public void unsetFromDate() {
        fromDate = null;
    }

    /**
     * Internal Getter for ToDate.
     * To search for requests submitted until this date. Optional Format: yyyyMMdd Example: 20200130
     * If ToDate is not provided and FromDate is provided, then ToDate will be considered as current
     * date or 30 days from FromDate, whichever is earlier. However, when both FromDate and ToDate
     * is not provided then last 30 days will be considered for filtering.
     * @return Returns the Internal String
     */
    @JsonGetter("ToDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetToDate() {
        return this.toDate;
    }

    /**
     * Getter for ToDate.
     * To search for requests submitted until this date. Optional Format: yyyyMMdd Example: 20200130
     * If ToDate is not provided and FromDate is provided, then ToDate will be considered as current
     * date or 30 days from FromDate, whichever is earlier. However, when both FromDate and ToDate
     * is not provided then last 30 days will be considered for filtering.
     * @return Returns the String
     */
    public String getToDate() {
        return OptionalNullable.getFrom(toDate);
    }

    /**
     * Setter for ToDate.
     * To search for requests submitted until this date. Optional Format: yyyyMMdd Example: 20200130
     * If ToDate is not provided and FromDate is provided, then ToDate will be considered as current
     * date or 30 days from FromDate, whichever is earlier. However, when both FromDate and ToDate
     * is not provided then last 30 days will be considered for filtering.
     * @param toDate Value for String
     */
    @JsonSetter("ToDate")
    public void setToDate(String toDate) {
        this.toDate = OptionalNullable.of(toDate);
    }

    /**
     * UnSetter for ToDate.
     * To search for requests submitted until this date. Optional Format: yyyyMMdd Example: 20200130
     * If ToDate is not provided and FromDate is provided, then ToDate will be considered as current
     * date or 30 days from FromDate, whichever is earlier. However, when both FromDate and ToDate
     * is not provided then last 30 days will be considered for filtering.
     */
    public void unsetToDate() {
        toDate = null;
    }

    /**
     * Converts this AuditRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AuditRequest [" + "status=" + status + ", payerNumber=" + payerNumber + ", payerId="
                + payerId + ", accountNumber=" + accountNumber + ", colCoCode=" + colCoCode
                + ", colCoId=" + colCoId + ", accounts=" + accounts + ", pageSize=" + pageSize
                + ", requestedOperation=" + requestedOperation + ", sortOrder=" + sortOrder
                + ", searchText=" + searchText + ", currentPage=" + currentPage + ", fromDate="
                + fromDate + ", toDate=" + toDate + "]";
    }

    /**
     * Builds a new {@link AuditRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AuditRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus())
                .accounts(getAccounts())
                .pageSize(getPageSize())
                .requestedOperation(getRequestedOperation());
        builder.payerNumber = internalGetPayerNumber();
        builder.payerId = internalGetPayerId();
        builder.accountNumber = internalGetAccountNumber();
        builder.colCoCode = internalGetColCoCode();
        builder.colCoId = internalGetColCoId();
        builder.sortOrder = internalGetSortOrder();
        builder.searchText = internalGetSearchText();
        builder.currentPage = internalGetCurrentPage();
        builder.fromDate = internalGetFromDate();
        builder.toDate = internalGetToDate();
        return builder;
    }

    /**
     * Class to build instances of {@link AuditRequest}.
     */
    public static class Builder {
        private String status;
        private OptionalNullable<String> payerNumber;
        private OptionalNullable<Integer> payerId;
        private OptionalNullable<String> accountNumber;
        private OptionalNullable<Integer> colCoCode;
        private OptionalNullable<Integer> colCoId;
        private Accounts accounts;
        private Integer pageSize;
        private List<String> requestedOperation;
        private OptionalNullable<String> sortOrder;
        private OptionalNullable<String> searchText;
        private OptionalNullable<Integer> currentPage;
        private OptionalNullable<String> fromDate;
        private OptionalNullable<String> toDate;



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
         * Setter for payerNumber.
         * @param  payerNumber  String value for payerNumber.
         * @return Builder
         */
        public Builder payerNumber(String payerNumber) {
            this.payerNumber = OptionalNullable.of(payerNumber);
            return this;
        }

        /**
         * UnSetter for payerNumber.
         * @return Builder
         */
        public Builder unsetPayerNumber() {
            payerNumber = null;
            return this;
        }

        /**
         * Setter for payerId.
         * @param  payerId  Integer value for payerId.
         * @return Builder
         */
        public Builder payerId(Integer payerId) {
            this.payerId = OptionalNullable.of(payerId);
            return this;
        }

        /**
         * UnSetter for payerId.
         * @return Builder
         */
        public Builder unsetPayerId() {
            payerId = null;
            return this;
        }

        /**
         * Setter for accountNumber.
         * @param  accountNumber  String value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = OptionalNullable.of(accountNumber);
            return this;
        }

        /**
         * UnSetter for accountNumber.
         * @return Builder
         */
        public Builder unsetAccountNumber() {
            accountNumber = null;
            return this;
        }

        /**
         * Setter for colCoCode.
         * @param  colCoCode  Integer value for colCoCode.
         * @return Builder
         */
        public Builder colCoCode(Integer colCoCode) {
            this.colCoCode = OptionalNullable.of(colCoCode);
            return this;
        }

        /**
         * UnSetter for colCoCode.
         * @return Builder
         */
        public Builder unsetColCoCode() {
            colCoCode = null;
            return this;
        }

        /**
         * Setter for colCoId.
         * @param  colCoId  Integer value for colCoId.
         * @return Builder
         */
        public Builder colCoId(Integer colCoId) {
            this.colCoId = OptionalNullable.of(colCoId);
            return this;
        }

        /**
         * UnSetter for colCoId.
         * @return Builder
         */
        public Builder unsetColCoId() {
            colCoId = null;
            return this;
        }

        /**
         * Setter for accounts.
         * @param  accounts  Accounts value for accounts.
         * @return Builder
         */
        public Builder accounts(Accounts accounts) {
            this.accounts = accounts;
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
         * Setter for requestedOperation.
         * @param  requestedOperation  List of String value for requestedOperation.
         * @return Builder
         */
        public Builder requestedOperation(List<String> requestedOperation) {
            this.requestedOperation = requestedOperation;
            return this;
        }

        /**
         * Setter for sortOrder.
         * @param  sortOrder  String value for sortOrder.
         * @return Builder
         */
        public Builder sortOrder(String sortOrder) {
            this.sortOrder = OptionalNullable.of(sortOrder);
            return this;
        }

        /**
         * UnSetter for sortOrder.
         * @return Builder
         */
        public Builder unsetSortOrder() {
            sortOrder = null;
            return this;
        }

        /**
         * Setter for searchText.
         * @param  searchText  String value for searchText.
         * @return Builder
         */
        public Builder searchText(String searchText) {
            this.searchText = OptionalNullable.of(searchText);
            return this;
        }

        /**
         * UnSetter for searchText.
         * @return Builder
         */
        public Builder unsetSearchText() {
            searchText = null;
            return this;
        }

        /**
         * Setter for currentPage.
         * @param  currentPage  Integer value for currentPage.
         * @return Builder
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = OptionalNullable.of(currentPage);
            return this;
        }

        /**
         * UnSetter for currentPage.
         * @return Builder
         */
        public Builder unsetCurrentPage() {
            currentPage = null;
            return this;
        }

        /**
         * Setter for fromDate.
         * @param  fromDate  String value for fromDate.
         * @return Builder
         */
        public Builder fromDate(String fromDate) {
            this.fromDate = OptionalNullable.of(fromDate);
            return this;
        }

        /**
         * UnSetter for fromDate.
         * @return Builder
         */
        public Builder unsetFromDate() {
            fromDate = null;
            return this;
        }

        /**
         * Setter for toDate.
         * @param  toDate  String value for toDate.
         * @return Builder
         */
        public Builder toDate(String toDate) {
            this.toDate = OptionalNullable.of(toDate);
            return this;
        }

        /**
         * UnSetter for toDate.
         * @return Builder
         */
        public Builder unsetToDate() {
            toDate = null;
            return this;
        }

        /**
         * Builds a new {@link AuditRequest} object using the set fields.
         * @return {@link AuditRequest}
         */
        public AuditRequest build() {
            return new AuditRequest(status, payerNumber, payerId, accountNumber, colCoCode, colCoId,
                    accounts, pageSize, requestedOperation, sortOrder, searchText, currentPage,
                    fromDate, toDate);
        }
    }
}
