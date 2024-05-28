
# Fuel Consumption Data

## Structure

`FuelConsumptionData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | Account Name | String getAccountName() | setAccountName(String accountName) |
| `AccountNumber` | `String` | Optional | Account Number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `PayerName` | `String` | Optional | Payment customer Name | String getPayerName() | setPayerName(String payerName) |
| `PayerNumber` | `String` | Optional | Payment customer number | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `CardNumber` | `String` | Optional | Card PAN | String getCardNumber() | setCardNumber(String cardNumber) |
| `CardGroupId` | `Integer` | Optional | Card group ID | Integer getCardGroupId() | setCardGroupId(Integer cardGroupId) |
| `CardGroupName` | `String` | Optional | Card group name | String getCardGroupName() | setCardGroupName(String cardGroupName) |
| `DriverName` | `String` | Optional | Driver name | String getDriverName() | setDriverName(String driverName) |
| `LicenseNumber` | `String` | Optional | Vehicle registration number | String getLicenseNumber() | setLicenseNumber(String licenseNumber) |
| `InitialOdometer` | `Double` | Optional | First transaction odometer reading | Double getInitialOdometer() | setInitialOdometer(Double initialOdometer) |
| `LastOdometer` | `Double` | Optional | Last transaction odometer reading | Double getLastOdometer() | setLastOdometer(Double lastOdometer) |
| `Distance` | `Double` | Optional | Distance in  KM or Miles based on Customer and Colco Settings | Double getDistance() | setDistance(Double distance) |
| `FuelConsumption` | `Double` | Optional | Total Fuel Consumption. | Double getFuelConsumption() | setFuelConsumption(Double fuelConsumption) |
| `FuelNetAmount` | `Double` | Optional | Net Fuel Amount | Double getFuelNetAmount() | setFuelNetAmount(Double fuelNetAmount) |
| `Discount` | `Double` | Optional | Total Discount | Double getDiscount() | setDiscount(Double discount) |
| `FuelTax` | `Double` | Optional | Fuel Tax Amount | Double getFuelTax() | setFuelTax(Double fuelTax) |
| `FuelVolume` | `Double` | Optional | Total Fuel Volume in Litres | Double getFuelVolume() | setFuelVolume(Double fuelVolume) |
| `GrossNonFuelExpenses` | `Double` | Optional | Gross Nonfuel Amount | Double getGrossNonFuelExpenses() | setGrossNonFuelExpenses(Double grossNonFuelExpenses) |
| `CO2Produced` | `Double` | Optional | Total Co2 produced | Double getCO2Produced() | setCO2Produced(Double cO2Produced) |
| `TransactionCount` | `Double` | Optional | Total Transaction Count | Double getTransactionCount() | setTransactionCount(Double transactionCount) |

## Example (as JSON)

```json
{
  "AccountName": "AccountName0",
  "AccountNumber": "AccountNumber4",
  "PayerName": "PayerName8",
  "PayerNumber": "PayerNumber2",
  "CardNumber": "CardNumber2"
}
```

