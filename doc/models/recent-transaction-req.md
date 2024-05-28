
# Recent Transaction Req

## Structure

`RecentTransactionReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoCode` | `Integer` | Required | Three character Collecting Company Code (Shell Code) of the selected payer | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerNumber` | `String` | Required | Unique Identifier for the customer at payment point.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `10` | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountNumber` | `String` | Optional | Customer account number. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `ProductCode` | `String` | Optional | Global product code | String getProductCode() | setProductCode(String productCode) |
| `PurchasedInCountry` | `String` | Optional | Delco country<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2` | String getPurchasedInCountry() | setPurchasedInCountry(String purchasedInCountry) |
| `CardPAN` | `String` | Optional | Card identifier number masked | String getCardPAN() | setCardPAN(String cardPAN) |
| `FromDateTime` | `String` | Optional | Start date and time of transactions | String getFromDateTime() | setFromDateTime(String fromDateTime) |
| `ToDateTime` | `String` | Optional | End date and time of transactions. Mandatory if FromDateTime is provided. | String getToDateTime() | setToDateTime(String toDateTime) |
| `TransactionStatus` | `String` | Optional | Status of transaction. DO NOT pass the value if includeDeclines is passed | String getTransactionStatus() | setTransactionStatus(String transactionStatus) |
| `FuelOnly` | `String` | Optional | When passed as ‘true’ Only returned records with Fuel transactions.(All Fuels).When passed as ‘false’ the above condition will not be checked. (Both All Fuels and Non-Fuel) | String getFuelOnly() | setFuelOnly(String fuelOnly) |
| `ProductGroupName` | `String` | Optional | Product group name | String getProductGroupName() | setProductGroupName(String productGroupName) |
| `VehicleRegistrationNumber` | `String` | Optional | Vehicle registration number embossed on the card | String getVehicleRegistrationNumber() | setVehicleRegistrationNumber(String vehicleRegistrationNumber) |
| `IncludeDeclines` | `Boolean` | Optional | Flag to enable to get declined records | Boolean getIncludeDeclines() | setIncludeDeclines(Boolean includeDeclines) |
| `CardIssuerName` | `String` | Optional | Card issuer name | String getCardIssuerName() | setCardIssuerName(String cardIssuerName) |
| `ColumnList` | `String` | Optional | Column list to be part of response, it can be 'All' to return all possible column. E.g. 'All'<br><br>To get specific columns pass multiple columns name separated by comma along with 'PayerNumber'. E.g. "PayerNumber,ProductCode" | String getColumnList() | setColumnList(String columnList) |

## Example (as JSON)

```json
{
  "ColCoCode": 14,
  "PayerNumber": "GB00001232",
  "AccountNumber": "GB00001233",
  "ProductCode": "22",
  "PurchasedInCountry": "GB",
  "CardPAN": "700205******890645",
  "FromDateTime": "2020-11-09 13:56:03.000",
  "ToDateTime": "2020-12-09 13:56:03.000",
  "TransactionStatus": "APPROVED",
  "FuelOnly": "False",
  "ProductGroupName": "Motor gasoline",
  "VehicleRegistrationNumber": "YG67OUM",
  "IncludeDeclines": true,
  "CardIssuerName": "Mathew",
  "ColumnList": "PayerNumber,AccountNumber,ProductName,FuelVolume,PAN"
}
```

