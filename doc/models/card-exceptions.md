
# Card Exceptions

## Structure

`CardExceptions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account Id | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountShortName` | `String` | Optional | Account Short Name | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `CardId` | `Integer` | Optional | Unique Card Id | Integer getCardId() | setCardId(Integer cardId) |
| `CurrencyCode` | `String` | Optional | ISO currency code | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `CurrencySymbol` | `String` | Optional | Currency symbol of the Invoice Currency Code | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `Day` | `Integer` | Optional | Summary Day: Populated when the Period is passed as ‘Day’. | Integer getDay() | setDay(Integer day) |
| `DriverName` | `String` | Optional | Driver name | String getDriverName() | setDriverName(String driverName) |
| `Month` | `Integer` | Optional | Summary Month: Populated when the Value of Period is Passed as ‘Month’. | Integer getMonth() | setMonth(Integer month) |
| `PAN` | `String` | Optional | Card PAN | String getPAN() | setPAN(String pAN) |
| `PayerId` | `Integer` | Optional | Payment customer id of the customer | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payment customer number | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PayerShortName` | `String` | Optional | Payer Short Name | String getPayerShortName() | setPayerShortName(String payerShortName) |
| `TotalAmount` | `Double` | Optional | Total Amount (In Customer Currency) of Transactions met with the given exceptions criteria. | Double getTotalAmount() | setTotalAmount(Double totalAmount) |
| `TotalQuantity` | `Integer` | Optional | Total Quantity of Transactions met with the given exceptions criteria. | Integer getTotalQuantity() | setTotalQuantity(Integer totalQuantity) |
| `TotalSalesItems` | `Integer` | Optional | Total number of Sales Items met with the given exception criteria. | Integer getTotalSalesItems() | setTotalSalesItems(Integer totalSalesItems) |
| `TotalTransactions` | `Integer` | Optional | Total number of Transactions met with the given exception criteria. | Integer getTotalTransactions() | setTotalTransactions(Integer totalTransactions) |
| `VRN` | `String` | Optional | Vehicle Registration Number | String getVRN() | setVRN(String vRN) |
| `Week` | `Integer` | Optional | Summary Week Number with in the given date range. Populated when the Value of Period is Passed as ‘Week’. | Integer getWeek() | setWeek(Integer week) |
| `Year` | `Integer` | Optional | Summary Year: Populated when the Value of Period is Passed as ‘Month’. | Integer getYear() | setYear(Integer year) |

## Example (as JSON)

```json
{
  "AccountId": 224,
  "AccountNumber": "AccountNumber4",
  "AccountShortName": "AccountShortName6",
  "CardId": 130,
  "CurrencyCode": "CurrencyCode2"
}
```

