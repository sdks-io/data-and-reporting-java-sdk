
# Priced Request Data

This endpoint allows querying the transaction data (i.e. Priced, Billed and Unbilled sales items) from SFSBI. It provides a flexible search criteria and supports paging

## Structure

`PricedRequestData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoCode` | `String` | Required | Collecting Company Code (Shell Code) of the selected payer. | String getColCoCode() | setColCoCode(String colCoCode) |
| `InvoiceStatus` | `Object` | Required | - | Object getInvoiceStatus() | setInvoiceStatus(Object invoiceStatus) |
| `PayerNumber` | `String` | Required | Payer Number of the selected payer.<br>**Constraints**: *Minimum Length*: `1` | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountId` | `Integer` | Optional | Account Id (GFN customer id) | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the selected account. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `DriverName` | `String` | Optional | Driver Name (of Card record)<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `40` | String getDriverName() | setDriverName(String driverName) |
| `CardGroupId` | `Integer` | Optional | Card Group Id in GFN | Integer getCardGroupId() | setCardGroupId(Integer cardGroupId) |
| `CardPAN` | `String` | Optional | Full Card PAN | String getCardPAN() | setCardPAN(String cardPAN) |
| `ProductCode` | `String` | Optional | Product Code – Global as per GFN configuration<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `8` | String getProductCode() | setProductCode(String productCode) |
| `ProductName` | `String` | Optional | Product Name – Global as per GFN configuration<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getProductName() | setProductName(String productName) |
| `SiteCode` | `String` | Optional | Site Code in GFN<br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `87` | String getSiteCode() | setSiteCode(String siteCode) |
| `IncomingSiteNumber` | `String` | Optional | Site Code as configured in GFN<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `10` | String getIncomingSiteNumber() | setIncomingSiteNumber(String incomingSiteNumber) |
| `InvoiceDate` | `String` | Optional | Returns the billed transaction for the given invoice date | String getInvoiceDate() | setInvoiceDate(String invoiceDate) |
| `InvoiceNumber` | `String` | Optional | Returns the billed transaction for the given invoice number<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `10` | String getInvoiceNumber() | setInvoiceNumber(String invoiceNumber) |
| `PurchasedInCountryCode` | `String` | Optional | Purchased InCountryCode<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2` | String getPurchasedInCountryCode() | setPurchasedInCountryCode(String purchasedInCountryCode) |
| `PurchasedInCountry` | `String` | Optional | Network Delco PurchasedCountryName | String getPurchasedInCountry() | setPurchasedInCountry(String purchasedInCountry) |
| `SiteGroupId` | `Integer` | Optional | Site Group Id in GFN | Integer getSiteGroupId() | setSiteGroupId(Integer siteGroupId) |
| `VehicleRegistrationNumber` | `String` | Optional | Vehicle Registration (of Card record)<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `128` | String getVehicleRegistrationNumber() | setVehicleRegistrationNumber(String vehicleRegistrationNumber) |
| `FeeTypeId` | `Integer` | Optional | Card Id (i.e. Unique Card Id in GFN) | Integer getFeeTypeId() | setFeeTypeId(Integer feeTypeId) |
| `LineItemDescription` | `String` | Optional | Item identifier in the transaction.<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `128` | String getLineItemDescription() | setLineItemDescription(String lineItemDescription) |
| `Cards` | `List<Integer>` | Optional | This entity accepts the list of CardId to filter in the response.<br>Note: The number of cardId allowed to be passed in the request is configurable to a maximum of 500 cards.<br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `500` | List<Integer> getCards() | setCards(List<Integer> cards) |
| `SortOrder` | [`PricedTransactionReqV2SortOrderEnum`](../../doc/models/priced-transaction-req-v2-sort-order-enum.md) | Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | PricedTransactionReqV2SortOrderEnum getSortOrder() | setSortOrder(PricedTransactionReqV2SortOrderEnum sortOrder) |
| `FromDate` | `String` | Optional | From transaction delivery date<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `19` | String getFromDate() | setFromDate(String fromDate) |
| `ToDate` | `String` | Optional | To transaction delivery date<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `19` | String getToDate() | setToDate(String toDate) |
| `Period` | [`PricedTransactionReqV2PeriodEnum`](../../doc/models/priced-transaction-req-v2-period-enum.md) | Optional | - | PricedTransactionReqV2PeriodEnum getPeriod() | setPeriod(PricedTransactionReqV2PeriodEnum period) |
| `PostingDateFrom` | `String` | Optional | Transaction posting start date and time<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `19` | String getPostingDateFrom() | setPostingDateFrom(String postingDateFrom) |
| `PostingDateTo` | `String` | Optional | Transaction posting end date and time<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `19` | String getPostingDateTo() | setPostingDateTo(String postingDateTo) |
| `TransactionItemId` | `String` | Optional | Unique id of the transaction that may include one or more salesitems | String getTransactionItemId() | setTransactionItemId(String transactionItemId) |
| `FuelOnly` | `Boolean` | Optional | Is FuelOnly indicator<br>**Default**: `false` | Boolean getFuelOnly() | setFuelOnly(Boolean fuelOnly) |
| `IncludeFees` | `Boolean` | Optional | When passed as ‘true’ then all sales items along with fees will be included in the response and the follwoing filteres will be ignored<br><br>* InvoiceNumber<br>* InvoiceDate<br>* PostingDateFrom<br>* PostingDateTo | Boolean getIncludeFees() | setIncludeFees(Boolean includeFees) |
| `IsMultipayer` | `Boolean` | Optional | If true then returns all the data linked tothe payer group of the provided PayerNumberin the request | Boolean getIsMultipayer() | setIsMultipayer(Boolean isMultipayer) |
| `ValidInvoiceDateOnly` | `Boolean` | Optional | When passed as ‘True’ the transactions records with report date not equal to 9999-12-30 will be returned. When passed as ‘False’ the above condition will not be checked.<br>**Default**: `false` | Boolean getValidInvoiceDateOnly() | setValidInvoiceDateOnly(Boolean validInvoiceDateOnly) |
| `InvoiceFromDate` | `String` | Optional | Invoice From Date, this is a search criterion to filter invoiced transactions with invoice date from this date.<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `19` | String getInvoiceFromDate() | setInvoiceFromDate(String invoiceFromDate) |
| `InvoiceToDate` | `String` | Optional | Invoice To Date, this is a search criterion to filter invoiced transactions with invoice date until this date.<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `19` | String getInvoiceToDate() | setInvoiceToDate(String invoiceToDate) |
| `HostingCollectingCompanyNumber` | `String` | Optional | Hosting Collecting Company Number of the selected payer. | String getHostingCollectingCompanyNumber() | setHostingCollectingCompanyNumber(String hostingCollectingCompanyNumber) |
| `Search` | `String` | Optional | Search based on DriverName or VRN | String getSearch() | setSearch(String search) |
| `TransactionId` | `String` | Optional | Unique id of the transaction that may include one or more salesitems | String getTransactionId() | setTransactionId(String transactionId) |

## Example (as JSON)

```json
{
  "ColCoCode": "032",
  "InvoiceStatus": {
    "key1": "val1",
    "key2": "val2"
  },
  "PayerNumber": "DE26685263",
  "AccountId": 29484,
  "AccountNumber": "DE26667080",
  "DriverName": "HH NX 508",
  "CardGroupId": 40000,
  "CardPAN": "7002051006629890645",
  "ProductCode": "10",
  "ProductName": "Diesel AGO",
  "SiteCode": "05000100",
  "IncomingSiteNumber": "100021",
  "InvoiceDate": "2022-01-01 00:00:00",
  "InvoiceNumber": "3201016193",
  "PurchasedInCountryCode": "GB",
  "PurchasedInCountry": "United Kingdom",
  "SiteGroupId": 202,
  "FeeTypeId": 275549,
  "LineItemDescription": "ABC3",
  "FromDate": "2022-01-01 00:00:00",
  "ToDate": "2022-01-01 00:00:00",
  "PostingDateFrom": "2022-01-01 00:00:00",
  "PostingDateTo": "2022-01-01 00:00:00",
  "TransactionItemId": "io9KVXk1UkW57XWKyeaHHg",
  "FuelOnly": false,
  "ValidInvoiceDateOnly": false,
  "InvoiceFromDate": "2022-01-01 00:00:00",
  "InvoiceToDate": "2022-01-01 00:00:00",
  "HostingCollectingCompanyNumber": "032",
  "Search": "2K89909",
  "TransactionId": "io9KVXk1UkW57XWKyeaHHg"
}
```

