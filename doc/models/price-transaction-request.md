
# Price Transaction Request

## Structure

`PriceTransactionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1 for Philippines<br>5 for UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code  of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided.<br>Example:<br>86 for Philippines<br>5 for UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerId` | `Integer` | Optional | Payer Id  of the selected payer.<br>Optional if PayerNumber is passed else Mandatory | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number (Ex: GB000000123) of the selected payer.<br>Optional if PayerId is passed else Mandatory<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `Accounts` | [`Accounts`](../../doc/models/accounts.md) | Optional | - | Accounts getAccounts() | setAccounts(Accounts accounts) |
| `CardId` | `Integer` | Optional | Card Id (i.e. Unique Card Id in GFN)<br>Optional<br>When both Card Id and Card PAN are not present on request, the response will have transactions of all cards under the selected payer or account | Integer getCardId() | setCardId(Integer cardId) |
| `CardPAN` | `String` | Optional | Full Card PAN<br>Optional<br>When both Card Id and Card PAN are not present on request, the response will have transactions of all cards under the selected payer or account. | String getCardPAN() | setCardPAN(String cardPAN) |
| `DriverName` | `String` | Optional | Driver Name (of Card record)<br>Optional<br>Minimum of 4 characters should be provided else not considered<br>Transactions of the card having the entered value at any part of the Driver Name will be returned | String getDriverName() | setDriverName(String driverName) |
| `VehicleRegistrationNumber` | `String` | Optional | Vehicle Registration (of Card record)<br>Optional<br>Minimum of 4 characters should be provided else not considered<br>Transactions of the card having the entered value at any part of the VRN will be returned | String getVehicleRegistrationNumber() | setVehicleRegistrationNumber(String vehicleRegistrationNumber) |
| `InvoiceStatus` | `String` | Optional | Invoice status of the transactions.<br>Mandatory<br>Possible options:<br>I - Invoiced<br>U – Un-Invoiced<br>A – All | String getInvoiceStatus() | setInvoiceStatus(String invoiceStatus) |
| `ProductId` | `Integer` | Optional | Product Id<br>Example:<br>21    Unleaded - High octane<br>22    Unleaded - Medium octane<br>23    Unleaded - Low octane<br>24    Unleaded Environmental | Integer getProductId() | setProductId(Integer productId) |
| `ProductCode` | `String` | Optional | Product Code – Global as per GFN configuration<br>Optional<br>Max Length: 8<br>Example:<br>10    TMF Charges<br>11    Tunnel/Bridges<br>12    Motorway toll<br>13    Ferries | String getProductCode() | setProductCode(String productCode) |
| `PurchasedInCountry` | `String` | Optional | ISO Country Code (ex: UK, FR)<br><br>Note: If IncludeFees is true then this filter will be ignored | String getPurchasedInCountry() | setPurchasedInCountry(String purchasedInCountry) |
| `CardGroupId` | `Integer` | Optional | Card Group Id in GFN | Integer getCardGroupId() | setCardGroupId(Integer cardGroupId) |
| `SortOrder` | `String` | Optional | Allowed Sorting Options:<br><br>1. TransactionDateAscending<br>2. TransactionDateDescending<br>3. GrossAmountDescending<br>4. GrossAmountAscending<br>5. DriverNameAscending (If Driver Name is null then VRN value will be considered)<br>6. DriverNameDescending (If Driver Name is null then VRN value will be considered)<br>7. VRNAscending (If VRN is null then Driver Name value will be considered)<br>8. VRNDescending (If VRN is null then Driver Name value will be considered)<br>9. NetAmountAscending<br>10. NetAmountDescensding<br>    Example value to be passed: “1,3” | String getSortOrder() | setSortOrder(String sortOrder) |
| `FromDate` | `String` | Optional | Transactions from Date/Time.<br>Optional – When provided, it should be with in last 24 months.<br><br>Format: yyyyMMdd | String getFromDate() | setFromDate(String fromDate) |
| `ToDate` | `String` | Optional | Transactions to Date/Time.<br>Optional- Refer introduction section of this operation for the priority and sequence of different date and invoice number filters that are conditionally applied.<br>Note:<br><br>1) When the value is blank and FromDate is provided on the input, all transactions took place 210(Configurable) days after the given FromDate is returned.<br>2) Difference between FromDate and ToDate cannot be more than 210 (Configurable) days.<br><br>Format: yyyyMMdd | String getToDate() | setToDate(String toDate) |
| `Period` | `Integer` | Optional | Transactions Period.<br>Possible values are:<br><br>1. Last 7 Days<br>2. Last 30 Days<br>3. Last 90 Days<br>   Optional - Refer introduction section of this operation for the priority and sequence of different date and invoice number filters that are conditionally applied. | Integer getPeriod() | setPeriod(Integer period) |
| `SiteCode` | `String` | Optional | Site Code as configured in GFN<br>Example:<br>050001 -    CHARNOCK RICHARD NTHBOUND MWSA 0755<br>050002 -    CHARNOCK RICHARD STHBOUND MWSA 0755<br>050005 -    HARTSHEAD MOOR EASTBOUND MWSA 0761.<br>050006 -    HARTSHEAD MOOR WESTBOUND MWSA.<br>Note: If IncludeFees is true then this filter will be ignored | String getSiteCode() | setSiteCode(String siteCode) |
| `SiteGroupId` | `Integer` | Optional | Site Group Id in GFN<br>Optional<br>Example: 202<br>Note: If IncludeFees is true then this filter will be ignored | Integer getSiteGroupId() | setSiteGroupId(Integer siteGroupId) |
| `PostingDateFrom` | `String` | Optional | Transaction Posting Date/time in the Cards Platform - From Date/time.<br><br>Note:<br><br>1) When the value of both PostingDateFrom and PostingDateTo are present in the request then the value of PostingDateFrom must be less than PostingDateTo.<br>2) If IncludeFees is true then this filter will be ignored<br>   Format: yyyyMMdd HH:mm:ss | String getPostingDateFrom() | setPostingDateFrom(String postingDateFrom) |
| `PostingDateTo` | `String` | Optional | Transaction Posting Date/time in the Cards Platform – To Date/time.<br><br>Note:<br><br>1) If IncludeFees is true then this filter will be ignored.<br>2) When the value of both PostingDateFrom and PostingDateTo are present in the request then the value of PostingDateFrom must be less than PostingDateTo.<br>   Format: yyyyMMdd HH:mm:ss | String getPostingDateTo() | setPostingDateTo(String postingDateTo) |
| `SalesItemId` | `String` | Optional | Unique SalesItemId (Either Billed on Unbilled)<br>Optional<br>Note: If IncludeFees is true then this filter will be ignored | String getSalesItemId() | setSalesItemId(String salesItemId) |
| `TransactionId` | `String` | Optional | Unique Transaction Id<br>Optional<br>Note: If IncludeFees is true then this filter will be ignored | String getTransactionId() | setTransactionId(String transactionId) |
| `InvoiceDate` | `String` | Optional | Invoice Date.<br>Optional<br>Note:<br><br>1) If value is not blank then the system will ignore the InvoiceStatus parameter and it will return all the billed transactions for the given invoice date.<br><br>Format: yyyyMMdd | String getInvoiceDate() | setInvoiceDate(String invoiceDate) |
| `InvoiceNumber` | `String` | Optional | Invoice Number.<br>Optional<br>Note:<br><br>1) If value is not blank then the system will ignore the InvoiceStatus parameter and it will return all the billed transactions for the given invoice date. | String getInvoiceNumber() | setInvoiceNumber(String invoiceNumber) |
| `ValidInvoiceDateOnly` | `Boolean` | Optional | True/False<br>Optional<br>Default value: True.<br>When passed as ‘True’ the transactions records with report date not equal to 9999-12-30 will be returned.<br>When passed as ‘False’ the above condition will not be checked. | Boolean getValidInvoiceDateOnly() | setValidInvoiceDateOnly(Boolean validInvoiceDateOnly) |
| `InvoiceFromDate` | `String` | Optional | Start date for transaction search by invoice date.<br>Optional<br>Note:<br><br>1) Value should be with in last 24 months (if provided).<br>2) Maximum of 90(Configurable) day’s duration allowed per search.<br>3) When provided, InvoiceFromDate has to be less than or equal to InvoiceToDate.<br>   Format: yyyyMMdd | String getInvoiceFromDate() | setInvoiceFromDate(String invoiceFromDate) |
| `InvoiceToDate` | `String` | Optional | End date for transaction search by invoice date.<br>Optional<br>Note:<br><br>1) When InvoiceFromDate is provided and InvoiceToDate is null, then InvoiceToDate will be calculated as (InvoiceFromDate + 90 days) or (CurrentDate) whichever is lesser.<br>   Format: yyyyMMdd | String getInvoiceToDate() | setInvoiceToDate(String invoiceToDate) |
| `FuelOnly` | `Boolean` | Optional | True/False<br>Optional<br>Default value: False.<br>When passed as ‘True’ Only returned records with Fuel transactions.<br>When passed as ‘False’ the above condition will not be checked. | Boolean getFuelOnly() | setFuelOnly(Boolean fuelOnly) |
| `IncludeFees` | `Boolean` | Optional | True/False<br>Optional<br>Default value: False<br>When passed as ‘True’ then  ignore few filters, all sales items along with fees included on the same response | Boolean getIncludeFees() | setIncludeFees(Boolean includeFees) |
| `UseFieldId` | `Boolean` | Optional | True/False<br>Optional<br>Default value – False.<br>When set to True, the property names in the output will be replaced by Field IDs.<br>This will reduce the output payload size significantly for large data sets and help faster transmission of data over networks. | Boolean getUseFieldId() | setUseFieldId(Boolean useFieldId) |
| `CurrentPage` | `Integer` | Optional | Current Page Number | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `PageSize` | `Integer` | Optional | Page Size – Number of records to show on a page<br>Optional<br>Default value 50 | Integer getPageSize() | setPageSize(Integer pageSize) |

## Example (as JSON)

```json
{
  "ColCoId": 34,
  "ColCoCode": 48,
  "PayerId": 82,
  "PayerNumber": "PayerNumber6",
  "Accounts": {
    "AccountId": 28,
    "AccountNumber": "AccountNumber0"
  }
}
```

