
# Recent Transactions

## Structure

`RecentTransactions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoCode` | `Integer` | Optional | ColCoCode | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerNumber` | `String` | Optional | PayerNumber | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountNumber` | `String` | Optional | Account Number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `CardIssueNumber` | `String` | Optional | Card Issue Number | String getCardIssueNumber() | setCardIssueNumber(String cardIssueNumber) |
| `CollectingCompanyCurrencyCode` | `String` | Optional | Collecting Company Currency IsoCode | String getCollectingCompanyCurrencyCode() | setCollectingCompanyCurrencyCode(String collectingCompanyCurrencyCode) |
| `CustDataCustomerEntered` | `String` | Optional | Customer entered data for reference. | String getCustDataCustomerEntered() | setCustDataCustomerEntered(String custDataCustomerEntered) |
| `CustDataDriverId` | `String` | Optional | Customer Data DriverId | String getCustDataDriverId() | setCustDataDriverId(String custDataDriverId) |
| `CustDataFleetDescription` | `String` | Optional | Cust Data Fleet Description | String getCustDataFleetDescription() | setCustDataFleetDescription(String custDataFleetDescription) |
| `FleetIdInput` | `String` | Optional | Fleet Id Input | String getFleetIdInput() | setFleetIdInput(String fleetIdInput) |
| `Amount` | `Double` | Optional | Amount | Double getAmount() | setAmount(Double amount) |
| `EuroshellSiteNumber` | `String` | Optional | EuroshellSiteNumber | String getEuroshellSiteNumber() | setEuroshellSiteNumber(String euroshellSiteNumber) |
| `IncomingProductCode` | `String` | Optional | IncomingProductCode | String getIncomingProductCode() | setIncomingProductCode(String incomingProductCode) |
| `ProductCode` | `String` | Optional | ProductCode | String getProductCode() | setProductCode(String productCode) |
| `ProductName` | `String` | Optional | ProductName | String getProductName() | setProductName(String productName) |
| `SiteCode` | `Integer` | Optional | SiteCode | Integer getSiteCode() | setSiteCode(Integer siteCode) |
| `HostingCollectingCompanyName` | `String` | Optional | HostingCollectingCompanyName | String getHostingCollectingCompanyName() | setHostingCollectingCompanyName(String hostingCollectingCompanyName) |
| `HostingCollectingCompanyNumber` | `String` | Optional | HostingCollectingCompanyNumber | String getHostingCollectingCompanyNumber() | setHostingCollectingCompanyNumber(String hostingCollectingCompanyNumber) |
| `IccdataTranTypeCode` | `String` | Optional | Transaction type code | String getIccdataTranTypeCode() | setIccdataTranTypeCode(String iccdataTranTypeCode) |
| `TransactionType` | `String` | Optional | Transaction type description. | String getTransactionType() | setTransactionType(String transactionType) |
| `Latitude` | `String` | Optional | Latitude of the Coordinate 3.11573 | String getLatitude() | setLatitude(String latitude) |
| `Longitude` | `String` | Optional | Longitude of the Coordinate | String getLongitude() | setLongitude(String longitude) |
| `MerchantCategory` | `String` | Optional | Merchant category | String getMerchantCategory() | setMerchantCategory(String merchantCategory) |
| `MerchantCategoryDescription` | `String` | Optional | Merchant category description | String getMerchantCategoryDescription() | setMerchantCategoryDescription(String merchantCategoryDescription) |
| `PurchasedInCountry` | `String` | Optional | Purchased in country | String getPurchasedInCountry() | setPurchasedInCountry(String purchasedInCountry) |
| `MerchantId` | `String` | Optional | Merchant Id | String getMerchantId() | setMerchantId(String merchantId) |
| `SiteName` | `String` | Optional | Site name | String getSiteName() | setSiteName(String siteName) |
| `Network` | `String` | Optional | Network | String getNetwork() | setNetwork(String network) |
| `DelcoCode` | `String` | Optional | Three character DelcoCode | String getDelcoCode() | setDelcoCode(String delcoCode) |
| `OdometerInput` | `String` | Optional | Odometer input | String getOdometerInput() | setOdometerInput(String odometerInput) |
| `OdometerReadingKm` | `String` | Optional | Odometer reading in Kms | String getOdometerReadingKm() | setOdometerReadingKm(String odometerReadingKm) |
| `OdometerReadingMiles` | `String` | Optional | Odometer reading in miles | String getOdometerReadingMiles() | setOdometerReadingMiles(String odometerReadingMiles) |
| `CardPAN` | `String` | Optional | Masked Card PAN | String getCardPAN() | setCardPAN(String cardPAN) |
| `PINIndicator` | `String` | Optional | PIN indicator | String getPINIndicator() | setPINIndicator(String pINIndicator) |
| `POIReceiptNumber` | `String` | Optional | POIReceiptNumber | String getPOIReceiptNumber() | setPOIReceiptNumber(String pOIReceiptNumber) |
| `ProductsCodeAdditional` | `String` | Optional | Additinal Products Code | String getProductsCodeAdditional() | setProductsCodeAdditional(String productsCodeAdditional) |
| `ProductsTaxCode` | `String` | Optional | Products tax code | String getProductsTaxCode() | setProductsTaxCode(String productsTaxCode) |
| `FuelVolume` | `Double` | Optional | Fuel volume | Double getFuelVolume() | setFuelVolume(Double fuelVolume) |
| `SfgwCardDateOfExpiry` | `String` | Optional | SfgwCard expiry date | String getSfgwCardDateOfExpiry() | setSfgwCardDateOfExpiry(String sfgwCardDateOfExpiry) |
| `SiteCurrencyISOCode` | `String` | Optional | Three character Site currency ISO code | String getSiteCurrencyISOCode() | setSiteCurrencyISOCode(String siteCurrencyISOCode) |
| `CardId` | `String` | Optional | Card ID | String getCardId() | setCardId(String cardId) |
| `TransactionDate` | `LocalDate` | Optional | ISO8601-compliant UTC datetime of the last update of the EVSE | LocalDate getTransactionDate() | setTransactionDate(LocalDate transactionDate) |
| `TransactionDateTime` | `String` | Optional | ISO8601-compliant UTC datetime of the last update of the EVSE | String getTransactionDateTime() | setTransactionDateTime(String transactionDateTime) |
| `TransactionId` | `String` | Optional | TransactionId | String getTransactionId() | setTransactionId(String transactionId) |
| `TransactionStatus` | `String` | Optional | Type of the connector in the EVSE unit. | String getTransactionStatus() | setTransactionStatus(String transactionStatus) |
| `UnitOfMeasure` | `String` | Optional | Unit of measure | String getUnitOfMeasure() | setUnitOfMeasure(String unitOfMeasure) |
| `VehicleRegistrationNumber` | `String` | Optional | VehicleRegistrationNumber | String getVehicleRegistrationNumber() | setVehicleRegistrationNumber(String vehicleRegistrationNumber) |
| `NetworkDelcoName` | `String` | Optional | Network Delco name | String getNetworkDelcoName() | setNetworkDelcoName(String networkDelcoName) |
| `ProductGroupName` | `String` | Optional | ProductGroupName | String getProductGroupName() | setProductGroupName(String productGroupName) |
| `FuelProduct` | `String` | Optional | FuelProduct | String getFuelProduct() | setFuelProduct(String fuelProduct) |
| `AccountCustomerName` | `String` | Optional | AccountCustomerName | String getAccountCustomerName() | setAccountCustomerName(String accountCustomerName) |
| `PayerName` | `String` | Optional | PayerName | String getPayerName() | setPayerName(String payerName) |
| `TransactionTime` | `String` | Optional | ISO8601-compliant UTC datetime of the last update of the EVSE | String getTransactionTime() | setTransactionTime(String transactionTime) |
| `TransactionCurrency` | `String` | Optional | TransactionCurrencySymbol | String getTransactionCurrency() | setTransactionCurrency(String transactionCurrency) |
| `UnitPrice` | `Double` | Optional | UnitPrice | Double getUnitPrice() | setUnitPrice(Double unitPrice) |
| `AuthorisedFlag` | `String` | Optional | AuthorisedFlag | String getAuthorisedFlag() | setAuthorisedFlag(String authorisedFlag) |
| `TransactionTimeGMT` | `String` | Optional | TransactionTimeGMT update of the EVSE | String getTransactionTimeGMT() | setTransactionTimeGMT(String transactionTimeGMT) |
| `ReasonCode` | `String` | Optional | ReasonCode | String getReasonCode() | setReasonCode(String reasonCode) |
| `IssuerActionCode` | `String` | Optional | IssuerActionCode | String getIssuerActionCode() | setIssuerActionCode(String issuerActionCode) |
| `IssuerActionCodeDescription` | `String` | Optional | IssuerActionCodeDescription. | String getIssuerActionCodeDescription() | setIssuerActionCodeDescription(String issuerActionCodeDescription) |
| `DeclinedReason` | `String` | Optional | DeclinedReason. | String getDeclinedReason() | setDeclinedReason(String declinedReason) |
| `CardStatusReasonDescription` | `String` | Optional | CardStatusReasonDescription. | String getCardStatusReasonDescription() | setCardStatusReasonDescription(String cardStatusReasonDescription) |
| `TransactionCountry` | `String` | Optional | TransactionCountry | String getTransactionCountry() | setTransactionCountry(String transactionCountry) |
| `IssuingCollectingCompanyName` | `String` | Optional | IssuingCollectingCompanyName. | String getIssuingCollectingCompanyName() | setIssuingCollectingCompanyName(String issuingCollectingCompanyName) |
| `CardIssuerName` | `String` | Optional | CardIssuerName. | String getCardIssuerName() | setCardIssuerName(String cardIssuerName) |
| `DriverName` | `String` | Optional | DriverName. | String getDriverName() | setDriverName(String driverName) |
| `BearerDescription` | `String` | Optional | BearerDescription. | String getBearerDescription() | setBearerDescription(String bearerDescription) |
| `CardCategoryDescription` | `String` | Optional | CardCategoryDescription. | String getCardCategoryDescription() | setCardCategoryDescription(String cardCategoryDescription) |
| `CardTypeDescription` | `String` | Optional | CardTypeDescription. | String getCardTypeDescription() | setCardTypeDescription(String cardTypeDescription) |
| `CardTokenTypeDescription` | `String` | Optional | CardTokenTypeDescription. | String getCardTokenTypeDescription() | setCardTokenTypeDescription(String cardTokenTypeDescription) |
| `EmbossType` | `String` | Optional | EmbossType. | String getEmbossType() | setEmbossType(String embossType) |
| `EVPrintedNumber` | `String` | Optional | The EVPrintedNumber which can be found on the Shell EV Card | String getEVPrintedNumber() | setEVPrintedNumber(String eVPrintedNumber) |
| `IsRFID` | `Boolean` | Optional | Whether the card type is enabled for RFID (Radio Frequency Identification) | Boolean getIsRFID() | setIsRFID(Boolean isRFID) |

## Example (as JSON)

```json
{
  "ColCoCode": 84,
  "PayerNumber": "MY00200653",
  "AccountNumber": "MY00200653",
  "CardIssueNumber": "1",
  "CollectingCompanyCurrencyCode": "MYR",
  "CustDataCustomerEntered": "PartnerId",
  "CustDataDriverId": "D123",
  "CustDataFleetDescription": "Fleet-Truck",
  "FleetIdInput": "AS2344",
  "Amount": 62.47,
  "EuroshellSiteNumber": "1231",
  "IncomingProductCode": "10",
  "ProductCode": "23",
  "ProductName": "Unleaded - Low octane",
  "SiteCode": 3350,
  "HostingCollectingCompanyName": "Shell Malaysia Trading Sdn Bhd",
  "HostingCollectingCompanyNumber": "84",
  "IccdataTranTypeCode": "1",
  "TransactionType": "Transaction Type description",
  "Latitude": "52.143814",
  "Longitude": "101.72869",
  "MerchantCategory": "5542",
  "MerchantCategoryDescription": "Description",
  "PurchasedInCountry": "MY",
  "MerchantId": "MY1737000000000",
  "SiteName": "ShellPT3895 BATU 4    KUALA LUMPUR MY",
  "Network": "458",
  "DelcoCode": "084",
  "OdometerInput": "201620",
  "OdometerReadingKm": "201620",
  "OdometerReadingMiles": "201620",
  "CardPAN": "700214*******780061",
  "PINIndicator": "Y",
  "POIReceiptNumber": "417662",
  "ProductsCodeAdditional": "Additional Code",
  "ProductsTaxCode": "0",
  "FuelVolume": 34.15,
  "SfgwCardDateOfExpiry": "2024-12",
  "SiteCurrencyISOCode": "MYR",
  "CardId": "330743",
  "TransactionDate": "2021-11-11",
  "TransactionDateTime": "2021-11-11 16:32:09.000",
  "TransactionId": "864220307",
  "TransactionStatus": "Approved",
  "UnitOfMeasure": "L",
  "VehicleRegistrationNumber": "WD33637",
  "NetworkDelcoName": "Shell Malaysia Trading Sdn Bhd",
  "ProductGroupName": "Motor gasoline",
  "FuelProduct": "All Fuels",
  "AccountCustomerName": "WCT BERHAD",
  "PayerName": "WCT BERHAD",
  "TransactionTime": "2021-11-11",
  "TransactionCurrency": "RM",
  "UnitPrice": 0.0205007320644217,
  "AuthorisedFlag": "Y",
  "TransactionTimeGMT": "08:41:02",
  "ReasonCode": "10",
  "IssuerActionCode": "2",
  "IssuerActionCodeDescription": "Approved, partial",
  "DeclinedReason": "partial",
  "CardStatusReasonDescription": "Approved, partial",
  "TransactionCountry": "458",
  "IssuingCollectingCompanyName": "Partner Name",
  "CardIssuerName": "John",
  "DriverName": "PAK PAK",
  "BearerDescription": "Description",
  "CardCategoryDescription": "Driver Card",
  "CardTypeDescription": "SHELL FLEET- HONG KONG 7002821",
  "CardTokenTypeDescription": "HK FLE NAT SIN R1 - CHIP",
  "EmbossType": "Driver",
  "EVPrintedNumber": "NL-TNM-C00122045-K",
  "IsRFID": false
}
```

