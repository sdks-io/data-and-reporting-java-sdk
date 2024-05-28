
# Multi Priced Transaction Request

## Structure

`MultiPricedTransactionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1 for Philippines<br>5 for UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `int` | Required | Collecting Company Code of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided.<br>Example:<br>86 for Philippines<br>5 for UK | int getColCoCode() | setColCoCode(int colCoCode) |
| `Accounts` | [`List<MultiPricedTransactionRequestAccountsItems>`](../../doc/models/multi-priced-transaction-request-accounts-items.md) | Required | List of Payers/Accounts entity.<br>Mandatory.<br>•	Max number of payers allowed in the input is 10, if it exceeds in the input it will throw an error.<br>•	This value is configurable. Initial configuration will be 100 and will change to 10 once SFH changes are integrated.<br>Note:<br><br>1. At least one payer should be present.<br>   Accounts information are optional. | List<MultiPricedTransactionRequestAccountsItems> getAccounts() | setAccounts(List<MultiPricedTransactionRequestAccountsItems> accounts) |
| `InvoiceStatus` | `String` | Optional | Invoice status of the transactions<br>Mandatory<br>Possible options:<br>I - Invoiced<br>U – Un-Invoiced<br>A – All<br>Max Length: 1 | String getInvoiceStatus() | setInvoiceStatus(String invoiceStatus) |
| `PurchasedInCountry` | `String` | Optional | ISO Country Code (ex: UK, FR)<br>Optional<br><br>Note: If IncludeFees is true then this filter will be ignored | String getPurchasedInCountry() | setPurchasedInCountry(String purchasedInCountry) |
| `FromDate` | `String` | Optional | Transactions from Date/Time.<br>Optional – When provided, it should be with in last 24 months.<br><br>Format: yyyyMMdd | String getFromDate() | setFromDate(String fromDate) |
| `ToDate` | `String` | Optional | Transactions to Date/Time.<br><br>1) When the value is blank and FromDate is provided on the input, all transactions took place 210(Configurable) days after the given FromDate is returned.<br>2) Difference between FromDate and ToDate cannot be more than 210 (Configurable) days.<br><br>Format: yyyyMMdd | String getToDate() | setToDate(String toDate) |
| `Period` | `Integer` | Optional | Transactions Period.<br>Possible values are:<br><br>1. Last 7 Days<br>2. Last 30 Days<br>3. Last 90 Days | Integer getPeriod() | setPeriod(Integer period) |
| `PostingDateFrom` | `String` | Optional | Transaction Posting Date/time in the Cards Platform - From Date/time.<br><br>Note:<br><br>1) When the value of both PostingDateFrom and PostingDateTo are present in the request then the value of PostingDateFrom must be less than PostingDateTo.<br>2) If IncludeFees is true then this filter will be ignored<br><br>Format: yyyyMMdd HH:mm:ss | String getPostingDateFrom() | setPostingDateFrom(String postingDateFrom) |
| `PostingDateTo` | `String` | Optional | Transaction Posting Date/time in the Cards Platform – To Date/time.<br><br>Note:<br><br>1) If IncludeFees is true then this filter will be ignored.<br>2) When the value of both PostingDateFrom and PostingDateTo are present in the request then the value of PostingDateFrom must be less than PostingDateTo.<br><br>Format: yyyyMMdd HH:mm:ss | String getPostingDateTo() | setPostingDateTo(String postingDateTo) |
| `InvoiceDate` | `String` | Optional | Invoice Date.<br>Optional<br><br>Note:<br><br>1) If value is not blank then the system will ignore the InvoiceStatus parameter and it will return all the billed transactions for the given invoice date.<br><br>2) If IncludeFees is true then this filter will be ignored<br><br>Format: yyyyMMdd | String getInvoiceDate() | setInvoiceDate(String invoiceDate) |
| `InvoiceNumber` | `String` | Optional | Invoice Number.<br>Optional<br>Note:<br><br>1) If value is not blank then the system will ignore the InvoiceStatus parameter and it will return all the billed transactions for the given invoice date. | String getInvoiceNumber() | setInvoiceNumber(String invoiceNumber) |
| `ValidInvoiceDateOnly` | `Boolean` | Optional | True/False<br>Optional<br>Default value: True.<br>When passed as ‘True’ the transactions records with report date not equal to 9999-12-30 will be returned.<br>When passed as ‘False’ the above condition will not be checked.<br>Note: If IncludeFees is ‘True’ then this filter will be ignored | Boolean getValidInvoiceDateOnly() | setValidInvoiceDateOnly(Boolean validInvoiceDateOnly) |
| `InvoiceFromDate` | `String` | Optional | Start date for transaction search by invoice date.<br>Optional<br>Note:<br><br>1) Value should be with in last 24 months (if provided).<br>2) Maximum of 90(Configurable) days duration allowed per search.<br>3) When provided, InvoiceFromDate has to be less than or equal to InvoiceToDate.<br><br>Format: yyyyMMdd | String getInvoiceFromDate() | setInvoiceFromDate(String invoiceFromDate) |
| `InvoiceToDate` | `String` | Optional | End date for transaction search by invoice date.<br>Optional<br>Note:<br><br>1) When InvoiceFromDate is provided and InvoiceToDate is null, then InvoiceToDate will be calculated as (InvoiceFromDate + 90 days) or (CurrentDate) whichever is lesser.<br><br>Format: yyyyMMdd | String getInvoiceToDate() | setInvoiceToDate(String invoiceToDate) |
| `FuelOnly` | `Boolean` | Optional | True/False<br>Optional<br>Default value: False.<br>When passed as ‘True’ Only returned records with Fuel transactions.<br>When passed as ‘False’ the above condition will not be checked.<br>Note: If IncludeFees is ‘True’ then this filter will be ignored | Boolean getFuelOnly() | setFuelOnly(Boolean fuelOnly) |
| `IncludeFees` | `Boolean` | Optional | True/False<br>Optional<br>Default value: False<br>When passed as ‘True’ then  ignore complex filters, all sales items along with fees included on the same response | Boolean getIncludeFees() | setIncludeFees(Boolean includeFees) |
| `SortOrder` | `String` | Optional | Allowed Sorting Options:<br><br>1. TransactionDateAscending<br>2. TransactionDateDescending<br>3. GrossAmountDescending<br>4. GrossAmountAscending<br>5. NetAmountAscending<br>6. NetAmountDescensding<br>   Example value to be passed: 1,3<br>   Note: If IncludeFees is ‘True’ then sorting is not allowed. This parameter will be ignored. | String getSortOrder() | setSortOrder(String sortOrder) |
| `CurrentPage` | `Integer` | Optional | Page Number (as shown to the users)<br>Optional<br>Default value 1<br>Note: If IncludeFees is ‘True’ then pagination is not allowed. This parameter will be ignored. | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `PageSize` | `Integer` | Optional | Page Size – Number of records to show on a page<br>Optional<br>Default value 50<br><br>Note: If IncludeFees is ‘True’ then pagination is not allowed. This parameter will be ignored. | Integer getPageSize() | setPageSize(Integer pageSize) |

## Example (as JSON)

```json
{
  "ColCoCode": 72,
  "Accounts": [
    {
      "PayerId": 224,
      "PayerNumber": "PayerNumber8",
      "AccountId": 28,
      "AccountNumber": "AccountNumber0"
    }
  ],
  "ColCoId": 58,
  "InvoiceStatus": "InvoiceStatus4",
  "PurchasedInCountry": "PurchasedInCountry8",
  "FromDate": "FromDate6",
  "ToDate": "ToDate4"
}
```

