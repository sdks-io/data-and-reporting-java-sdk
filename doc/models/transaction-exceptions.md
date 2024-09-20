
# Transaction Exceptions

## Structure

`TransactionExceptions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SalesItemId` | `Double` | Optional | Unique Sales Item Identifier | Double getSalesItemId() | setSalesItemId(Double salesItemId) |
| `CardId` | `Integer` | Optional | Unique Card Identifier | Integer getCardId() | setCardId(Integer cardId) |
| `ProductId` | `Integer` | Optional | Product Id | Integer getProductId() | setProductId(Integer productId) |
| `TransactionGUID` | `String` | Optional | Transaction Unique Identifier | String getTransactionGUID() | setTransactionGUID(String transactionGUID) |
| `TransactionDate` | `String` | Optional | Local Transaction Date  of where the transaction took place<br>Format: yyyyMMdd | String getTransactionDate() | setTransactionDate(String transactionDate) |
| `CustomerInvoiceValueTotalGross` | `Double` | Optional | Total Gross Amount for the Invoice Customer | Double getCustomerInvoiceValueTotalGross() | setCustomerInvoiceValueTotalGross(Double customerInvoiceValueTotalGross) |
| `CardPAN` | `String` | Optional | Card PAN number<br>Returns masked PAN number when masking is enabled at the Microservices configuration (Mask all digits except the last 6 digits of the PAN) | String getCardPAN() | setCardPAN(String cardPAN) |
| `CardExpiry` | `String` | Optional | Card Expiry Date<br>Format: yyyyMMdd | String getCardExpiry() | setCardExpiry(String cardExpiry) |
| `TransactionTime` | `String` | Optional | Local Transaction Time of where the transaction took place<br>Format: HH:mm:ss (24 hours format) | String getTransactionTime() | setTransactionTime(String transactionTime) |
| `UTCOffset` | `String` | Optional | UTC Offset extracted from GFN Sales Date time. Note: This may not be accurate for all TPN transactions<br>Format: +/-HH:mm:ss (24 hours format) | String getUTCOffset() | setUTCOffset(String uTCOffset) |
| `FleetIdInput` | `String` | Optional | Fleet Id Input as entered by the drivers at the time of transaction | String getFleetIdInput() | setFleetIdInput(String fleetIdInput) |
| `OdometerInput` | `Integer` | Optional | Odometer Input as entered by the drivers at the time of transaction | Integer getOdometerInput() | setOdometerInput(Integer odometerInput) |
| `DriverName` | `String` | Optional | Driver Name embossed on the card | String getDriverName() | setDriverName(String driverName) |
| `VehicleRegistration` | `String` | Optional | Vehicle Registration Number embossed on the card | String getVehicleRegistration() | setVehicleRegistration(String vehicleRegistration) |
| `InvoiceCurrencyCode` | `String` | Optional | ISO currency code (Example: GBP) | String getInvoiceCurrencyCode() | setInvoiceCurrencyCode(String invoiceCurrencyCode) |
| `InvoiceCurrencySymbol` | `String` | Optional | Currency symbol of the Invoice Currency Code (i.e. £, $, etc.,) | String getInvoiceCurrencySymbol() | setInvoiceCurrencySymbol(String invoiceCurrencySymbol) |
| `TransactionCurrencyCode` | `String` | Optional | ISO currency code | String getTransactionCurrencyCode() | setTransactionCurrencyCode(String transactionCurrencyCode) |
| `TransactionCurrencySymbol` | `String` | Optional | Currency symbol of the Transaction Currency Code (i.e. £, $, etc.,) | String getTransactionCurrencySymbol() | setTransactionCurrencySymbol(String transactionCurrencySymbol) |
| `TransactionNetAmount` | `Double` | Optional | Net Amount | Double getTransactionNetAmount() | setTransactionNetAmount(Double transactionNetAmount) |
| `TransactionTax` | `Double` | Optional | Tax Amount | Double getTransactionTax() | setTransactionTax(Double transactionTax) |
| `TransactionGrossAmount` | `Double` | Optional | Gross Amount | Double getTransactionGrossAmount() | setTransactionGrossAmount(Double transactionGrossAmount) |
| `InvoiceNetAmount` | `Double` | Optional | Invoiced Net Amount | Double getInvoiceNetAmount() | setInvoiceNetAmount(Double invoiceNetAmount) |
| `InvoiceTax` | `Double` | Optional | Invoiced Tax Amount | Double getInvoiceTax() | setInvoiceTax(Double invoiceTax) |
| `InvoiceGrossAmount` | `Double` | Optional | Invoice Gross Amount | Double getInvoiceGrossAmount() | setInvoiceGrossAmount(Double invoiceGrossAmount) |
| `PurchasedInCountry` | `String` | Optional | Country of Purchase (Ex: France, Germany, etc.,) | String getPurchasedInCountry() | setPurchasedInCountry(String purchasedInCountry) |
| `AccountId` | `Integer` | Optional | Account Id | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountName` | `String` | Optional | Account Name | String getAccountName() | setAccountName(String accountName) |
| `AccountShortName` | `String` | Optional | Account Short Name | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `Quantity` | `Double` | Optional | Quantity/Volume | Double getQuantity() | setQuantity(Double quantity) |
| `FuelProduct` | `Boolean` | Optional | True if the product on transaction is listed as a fuel product else return false | Boolean getFuelProduct() | setFuelProduct(Boolean fuelProduct) |
| `UnitPriceInTransactionCurrency` | `Double` | Optional | Product Unit Price in transaction currency | Double getUnitPriceInTransactionCurrency() | setUnitPriceInTransactionCurrency(Double unitPriceInTransactionCurrency) |
| `UnitPriceInInvoiceCurrency` | `Double` | Optional | Product Unit Price in invoice currency | Double getUnitPriceInInvoiceCurrency() | setUnitPriceInInvoiceCurrency(Double unitPriceInInvoiceCurrency) |
| `UnitDiscountTransactionCurrency` | `Double` | Optional | Unit Discount in transaction currency | Double getUnitDiscountTransactionCurrency() | setUnitDiscountTransactionCurrency(Double unitDiscountTransactionCurrency) |
| `UnitDiscountInvoiceCurrency` | `Double` | Optional | Unit Discount in invoice currency | Double getUnitDiscountInvoiceCurrency() | setUnitDiscountInvoiceCurrency(Double unitDiscountInvoiceCurrency) |
| `IsInvoiced` | `Boolean` | Optional | True when the transaction is already invoice, else return False | Boolean getIsInvoiced() | setIsInvoiced(Boolean isInvoiced) |
| `InvoiceNumber` | `String` | Optional | Invoice Number if invoiced | String getInvoiceNumber() | setInvoiceNumber(String invoiceNumber) |
| `InvoiceDate` | `String` | Optional | Invoice Date<br>Format: yyyyMMdd HH:mm:ss | String getInvoiceDate() | setInvoiceDate(String invoiceDate) |
| `SiteCode` | `String` | Optional | Site Code | String getSiteCode() | setSiteCode(String siteCode) |
| `SiteName` | `String` | Optional | Site Name | String getSiteName() | setSiteName(String siteName) |
| `SiteCountry` | `String` | Optional | Site Country | String getSiteCountry() | setSiteCountry(String siteCountry) |
| `Location` | [`Location`](../../doc/models/location.md) | Optional | - | Location getLocation() | setLocation(Location location) |
| `CardGroupName` | `String` | Optional | Card Group Name | String getCardGroupName() | setCardGroupName(String cardGroupName) |
| `ReceiptNumber` | `String` | Optional | Receipt Number | String getReceiptNumber() | setReceiptNumber(String receiptNumber) |
| `ProductCode` | `String` | Optional | Product Code | String getProductCode() | setProductCode(String productCode) |
| `ProductName` | `String` | Optional | Product Name | String getProductName() | setProductName(String productName) |
| `ProductGroupId` | `Integer` | Optional | Product Group Id | Integer getProductGroupId() | setProductGroupId(Integer productGroupId) |
| `ProductGroupName` | `String` | Optional | Product Group Name | String getProductGroupName() | setProductGroupName(String productGroupName) |
| `DelCoExchangeRate` | `Double` | Optional | DelCo Exchange Rate (Site exchange rate) | Double getDelCoExchangeRate() | setDelCoExchangeRate(Double delCoExchangeRate) |
| `ColCoExchangeRate` | `Double` | Optional | ColCo Exchange Rate (Customer exchange rate) | Double getColCoExchangeRate() | setColCoExchangeRate(Double colCoExchangeRate) |
| `IsShellSite` | `Boolean` | Optional | True when transaction occurred at a Shell site else return False | Boolean getIsShellSite() | setIsShellSite(Boolean isShellSite) |
| `Network` | `String` | Optional | Network as configured | String getNetwork() | setNetwork(String network) |
| `SiteGroupId` | `Integer` | Optional | Site Group Id | Integer getSiteGroupId() | setSiteGroupId(Integer siteGroupId) |
| `SiteGroupName` | `String` | Optional | Site GroupName | String getSiteGroupName() | setSiteGroupName(String siteGroupName) |
| `PostingDate` | `String` | Optional | Site GroupName | String getPostingDate() | setPostingDate(String postingDate) |
| `IssuerCode` | `String` | Optional | First digits of the Card PAN<br>7002 = Fleet  <br>7077 = CRT | String getIssuerCode() | setIssuerCode(String issuerCode) |
| `PurchasedInCountryCode` | `String` | Optional | ISO code of the country where the transaction took place | String getPurchasedInCountryCode() | setPurchasedInCountryCode(String purchasedInCountryCode) |
| `CustomerCountryCode` | `String` | Optional | ISO code of the  Customer Country | String getCustomerCountryCode() | setCustomerCountryCode(String customerCountryCode) |
| `CustomerCountry` | `String` | Optional | Name of the Customer Country | String getCustomerCountry() | setCustomerCountry(String customerCountry) |
| `ReleaseCode` | `String` | Optional | Release code, 7th Digit of the Card PAN | String getReleaseCode() | setReleaseCode(String releaseCode) |
| `CardGroupId` | `String` | Optional | Card group ID | String getCardGroupId() | setCardGroupId(String cardGroupId) |
| `CardSequenceNumber` | `String` | Optional | 3 digits, Card sequence number and Check digit  (Digit 16,17 and 18 on the card pan) | String getCardSequenceNumber() | setCardSequenceNumber(String cardSequenceNumber) |
| `CheckDigit` | `String` | Optional | Check digit, Last number of the card pan | String getCheckDigit() | setCheckDigit(String checkDigit) |
| `FleetIDDescription` | `String` | Optional | FleetId/CRN description in Card Platform configured at the account level | String getFleetIDDescription() | setFleetIDDescription(String fleetIDDescription) |
| `VATRate` | `Double` | Optional | VAT Percentage | Double getVATRate() | setVATRate(Double vATRate) |
| `VATCategory` | `String` | Optional | VAT Category Id-Description<br>1-Zero Rated<br>2-A1 PH-O 12% Sales Domestic<br>3-VAT exempt | String getVATCategory() | setVATCategory(String vATCategory) |
| `EffectiveDiscountInTrxCurrency` | `String` | Optional | Effective Discount (excluding VAT, in transaction currency)  4 digits | String getEffectiveDiscountInTrxCurrency() | setEffectiveDiscountInTrxCurrency(String effectiveDiscountInTrxCurrency) |
| `TransactionType` | `String` | Optional | Transaction Type | String getTransactionType() | setTransactionType(String transactionType) |
| `PINIndicator` | `String` | Optional | Pin Indicator (Indicates whether PIN used or not used at the time of transaction) | String getPINIndicator() | setPINIndicator(String pINIndicator) |
| `VATApplicable` | `String` | Optional | Is VAT Applicable for this transaction<br>“Y” or “N” | String getVATApplicable() | setVATApplicable(String vATApplicable) |
| `NetInvoiceIndicator` | `String` | Optional | Net Invoice Indicator, Will the customer receive an invoice without VAT?<br>Example: “Y” or “N” | String getNetInvoiceIndicator() | setNetInvoiceIndicator(String netInvoiceIndicator) |
| `CustomerCurrencyCode` | `String` | Optional | Customer currency code | String getCustomerCurrencyCode() | setCustomerCurrencyCode(String customerCurrencyCode) |
| `CustomerCurrencySymbol` | `String` | Optional | Customer currency Symbol | String getCustomerCurrencySymbol() | setCustomerCurrencySymbol(String customerCurrencySymbol) |
| `EffectiveUnitDiscountInCustomerCurrency` | `Double` | Optional | Effective Unit Discount | Double getEffectiveUnitDiscountInCustomerCurrency() | setEffectiveUnitDiscountInCustomerCurrency(Double effectiveUnitDiscountInCustomerCurrency) |
| `EffectiveDiscountInCustomerCurrency` | `Double` | Optional | Effective Discount | Double getEffectiveDiscountInCustomerCurrency() | setEffectiveDiscountInCustomerCurrency(Double effectiveDiscountInCustomerCurrency) |
| `VATonNetAmountInCustomerCurrency` | `Double` | Optional | VAT on Net Amount | Double getVATonNetAmountInCustomerCurrency() | setVATonNetAmountInCustomerCurrency(Double vATonNetAmountInCustomerCurrency) |
| `DiscountType` | `String` | Optional | Discount Type<br>Example: 1-None<br>2-Pence per unit<br>3-Percentage | String getDiscountType() | setDiscountType(String discountType) |
| `TransactionStatus` | `String` | Optional | Transaction status  "U" or "I"<br>“U” stands for Uninvoiced<br>“I” stands for Invoiced | String getTransactionStatus() | setTransactionStatus(String transactionStatus) |
| `PayerGroup` | `String` | Optional | Payer Group applicable for the Large Customer NL+8 digit code | String getPayerGroup() | setPayerGroup(String payerGroup) |
| `RefundFlag` | `String` | Optional | Refund Flag “N” for Not Refunded and “Y” for Refunded. | String getRefundFlag() | setRefundFlag(String refundFlag) |
| `OriginalSalesItemId` | `Double` | Optional | Shows Sales Item Id of the original item that was refunded | Double getOriginalSalesItemId() | setOriginalSalesItemId(Double originalSalesItemId) |
| `DelcoName` | `String` | Optional | Delco Name | String getDelcoName() | setDelcoName(String delcoName) |
| `DelcoCode` | `String` | Optional | Delco Code | String getDelcoCode() | setDelcoCode(String delcoCode) |
| `PayerNumber` | `String` | Optional | Payer number | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PayerName` | `String` | Optional | Payer name | String getPayerName() | setPayerName(String payerName) |
| `CardExpiryPeriod` | `String` | Optional | Year/Month of the Card Expiry captured on the transaction | String getCardExpiryPeriod() | setCardExpiryPeriod(String cardExpiryPeriod) |
| `AuthorisationCode` | `String` | Optional | Authorisation code of the transaction | String getAuthorisationCode() | setAuthorisationCode(String authorisationCode) |
| `TransactionId` | `String` | Optional | Unique id of the transaction that may include one or more salesitems | String getTransactionId() | setTransactionId(String transactionId) |
| `TransactionLine` | `String` | Optional | Transaction line item number | String getTransactionLine() | setTransactionLine(String transactionLine) |
| `AllowClearing` | `String` | Optional | Is the Sales Item allowed for clearing? i.e. not written off<br>Example: “Y” or “N” | String getAllowClearing() | setAllowClearing(String allowClearing) |
| `CRMNumber` | `String` | Optional | CRM Case number if the sales item is in dispute | String getCRMNumber() | setCRMNumber(String cRMNumber) |
| `DisputeStatus` | `String` | Optional | Sales Item Dispute Status if disputed<br>0    No Dispute<br>1    In Dispute<br>2    Re-Instated<br>3    Adjusted<br>4    Written Off by Colco<br>5    Written Off by Delco<br>6    Charged Back to Site | String getDisputeStatus() | setDisputeStatus(String disputeStatus) |
| `RebateRate` | `Double` | Optional | Unit discount in customer currency | Double getRebateRate() | setRebateRate(Double rebateRate) |
| `DelCoToColCoExchangeRate` | `Double` | Optional | Exchange rate from transaction currency to customer currency. | Double getDelCoToColCoExchangeRate() | setDelCoToColCoExchangeRate(Double delCoToColCoExchangeRate) |
| `NetEuroAmount` | `Double` | Optional | Net euro amount. | Double getNetEuroAmount() | setNetEuroAmount(Double netEuroAmount) |
| `EuroRebateAmount` | `Double` | Optional | Euro rebate amount. | Double getEuroRebateAmount() | setEuroRebateAmount(Double euroRebateAmount) |
| `EuroVATAmount` | `Double` | Optional | Euro VAT amount. | Double getEuroVATAmount() | setEuroVATAmount(Double euroVATAmount) |
| `ParentCustomerNumber` | `String` | Optional | Parent customer number | String getParentCustomerNumber() | setParentCustomerNumber(String parentCustomerNumber) |
| `VATonNetAmount` | `Double` | Optional | VAT on Net Amount (in transaction currency) 2 decimals | Double getVATonNetAmount() | setVATonNetAmount(Double vATonNetAmount) |
| `VATCountry` | `String` | Optional | VAT Country | String getVATCountry() | setVATCountry(String vATCountry) |

## Example (as JSON)

```json
{
  "SalesItemId": 113.2,
  "CardId": 104,
  "ProductId": 220,
  "TransactionGUID": "TransactionGUID2",
  "TransactionDate": "TransactionDate6"
}
```

