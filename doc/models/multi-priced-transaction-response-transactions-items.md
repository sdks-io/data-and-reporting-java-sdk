
# Multi Priced Transaction Response Transactions Items

## Structure

`MultiPricedTransactionResponseTransactionsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | TransactionType is the type of transaction.<br>Example: SalesItem /FeeItem | String getType() | setType(String type) |
| `CardId` | `Integer` | Optional | Unique Card Id in GFN<br>Example: 275549 | Integer getCardId() | setCardId(Integer cardId) |
| `CardPAN` | `String` | Optional | Card PAN<br>Mask PAN if enabled at Microservices configuration (Mask all digits except the Last 6 digits of the PAN)<br>Example: 7002051006629890645 | String getCardPAN() | setCardPAN(String cardPAN) |
| `CardExpiry` | `String` | Optional | Card Expiry Date<br>Format: yyyyMMdd | String getCardExpiry() | setCardExpiry(String cardExpiry) |
| `TransactionDate` | `String` | Optional | Local Transaction Date of where the transaction took place<br>Format: yyyyMMdd<br><br>Note: For a fee item, this parameter will be populated with fee date. | String getTransactionDate() | setTransactionDate(String transactionDate) |
| `TransactionTime` | `String` | Optional | Local Transaction Time of where the transaction took place<br>Format: HH:mm:ss (24 hours format)<br><br>Note: For a fee item, this parameter will be populated with fee date. | String getTransactionTime() | setTransactionTime(String transactionTime) |
| `UTCOffset` | `String` | Optional | UTC Offset extracted from Sales Date time.<br>Note: This may not be accurate for all TPN transactions<br>Format: +/-HH:mm:ss (24 hours format) | String getUTCOffset() | setUTCOffset(String uTCOffset) |
| `FleetIdInput` | `String` | Optional | Fleet Id Input as entered by the drivers at the time of transaction<br>Example: XYZ1234<br>Note: - The value could be null/blank for fees item. | String getFleetIdInput() | setFleetIdInput(String fleetIdInput) |
| `OdometerInput` | `Integer` | Optional | Odometer Input as entered by the drivers at the time of transaction<br>Example: 12345<br>Note: - The value could be null/blank for fees item. | Integer getOdometerInput() | setOdometerInput(Integer odometerInput) |
| `DriverName` | `String` | Optional | Driver Name embossed on the card<br>Example:  ANDREW GILBERRY | String getDriverName() | setDriverName(String driverName) |
| `VehicleRegistration` | `String` | Optional | Vehicle Registration Number embossed on the card | String getVehicleRegistration() | setVehicleRegistration(String vehicleRegistration) |
| `InvoiceCurrencyCode` | `String` | Optional | ISO currency code | String getInvoiceCurrencyCode() | setInvoiceCurrencyCode(String invoiceCurrencyCode) |
| `InvoiceCurrencySymbol` | `String` | Optional | Currency symbol of the Invoice Currency Code<br>Example: £, $ | String getInvoiceCurrencySymbol() | setInvoiceCurrencySymbol(String invoiceCurrencySymbol) |
| `TransactionCurrencyCode` | `String` | Optional | ISO currency code<br>Example: GBP | String getTransactionCurrencyCode() | setTransactionCurrencyCode(String transactionCurrencyCode) |
| `TransactionCurrencySymbol` | `String` | Optional | Currency symbol of the Transaction Currency Code<br>Example: £, $ | String getTransactionCurrencySymbol() | setTransactionCurrencySymbol(String transactionCurrencySymbol) |
| `TransactionNetAmount` | `Integer` | Optional | Net Amount | Integer getTransactionNetAmount() | setTransactionNetAmount(Integer transactionNetAmount) |
| `TransactionTax` | `Integer` | Optional | Tax Amount | Integer getTransactionTax() | setTransactionTax(Integer transactionTax) |
| `TransactionGrossAmount` | `Integer` | Optional | Gross Amount | Integer getTransactionGrossAmount() | setTransactionGrossAmount(Integer transactionGrossAmount) |
| `InvoiceNetAmount` | `Integer` | Optional | Invoiced Net Amount<br>Note: For a fee item, this parameter will be populated with fee InvoiceNetAmount. | Integer getInvoiceNetAmount() | setInvoiceNetAmount(Integer invoiceNetAmount) |
| `InvoiceTax` | `Integer` | Optional | Invoiced Tax Amount | Integer getInvoiceTax() | setInvoiceTax(Integer invoiceTax) |
| `InvoiceGrossAmount` | `Integer` | Optional | Invoice Gross Amount<br>Note: For a fee item, this parameter will be populated with fee InvoiceGrossAmount. | Integer getInvoiceGrossAmount() | setInvoiceGrossAmount(Integer invoiceGrossAmount) |
| `PurchasedInCountry` | `String` | Optional | Country of Purchase<br>Example: France, Germany<br>Note: - The value could be null/blank for fees item. | String getPurchasedInCountry() | setPurchasedInCountry(String purchasedInCountry) |
| `AccountId` | `Integer` | Optional | Account Id | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountName` | `String` | Optional | Account Name | String getAccountName() | setAccountName(String accountName) |
| `AccountShortName` | `String` | Optional | Account Short Name | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `Quantity` | `Integer` | Optional | Quantity/Volume | Integer getQuantity() | setQuantity(Integer quantity) |
| `FuelProduct` | `Boolean` | Optional | True if the product on transaction is listed as a fuel product else return false | Boolean getFuelProduct() | setFuelProduct(Boolean fuelProduct) |
| `UnitPriceInTransactionCurrency` | `Integer` | Optional | Product Unit Price in transaction currency<br>Note: - The value could be null/blank for fees item | Integer getUnitPriceInTransactionCurrency() | setUnitPriceInTransactionCurrency(Integer unitPriceInTransactionCurrency) |
| `UnitPriceInInvoiceCurrency` | `Integer` | Optional | Product Unit Price in invoice currency<br>Note: - The value could be null/blank for fees item | Integer getUnitPriceInInvoiceCurrency() | setUnitPriceInInvoiceCurrency(Integer unitPriceInInvoiceCurrency) |
| `UnitDiscountTransactionCurrency` | `Integer` | Optional | Unit Discount in transaction currency<br>Note: - The value could be null/blank for fees item | Integer getUnitDiscountTransactionCurrency() | setUnitDiscountTransactionCurrency(Integer unitDiscountTransactionCurrency) |
| `UnitDiscountInvoiceCurrency` | `Integer` | Optional | Unit Discount in invoice currency<br>Note: - The value could be null/blank for fees item. | Integer getUnitDiscountInvoiceCurrency() | setUnitDiscountInvoiceCurrency(Integer unitDiscountInvoiceCurrency) |
| `IsInvoiced` | `Boolean` | Optional | True when the transaction is already invoice, else return False | Boolean getIsInvoiced() | setIsInvoiced(Boolean isInvoiced) |
| `InvoiceNumber` | `String` | Optional | Invoice Number if invoiced<br>Example:<br>S04500493<br>S04478304<br>S04490319 | String getInvoiceNumber() | setInvoiceNumber(String invoiceNumber) |
| `InvoiceDate` | `String` | Optional | Invoice Date<br>Format: yyyyMMdd HH:mm:ss | String getInvoiceDate() | setInvoiceDate(String invoiceDate) |
| `SiteCode` | `String` | Optional | Site Code<br>Example:<br>050001 -	CHARNOCK RICHARD NTHBOUND MWSA 0755 | String getSiteCode() | setSiteCode(String siteCode) |
| `SiteName` | `String` | Optional | Site Name<br>Example:<br>050001 -	CHARNOCK RICHARD NTHBOUND MWSA 0755 | String getSiteName() | setSiteName(String siteName) |
| `SiteCountry` | `String` | Optional | Site Country<br>Example: France, Germany | String getSiteCountry() | setSiteCountry(String siteCountry) |
| `Location` | [`List<SiteLocation>`](../../doc/models/site-location.md) | Optional | - | List<SiteLocation> getLocation() | setLocation(List<SiteLocation> location) |
| `CardGroupName` | `String` | Optional | Card Group Name | String getCardGroupName() | setCardGroupName(String cardGroupName) |
| `ReceiptNumber` | `String` | Optional | ReceiptNumber | String getReceiptNumber() | setReceiptNumber(String receiptNumber) |
| `ProductCode` | `String` | Optional | Product Code<br>10	TMF Charges<br>11	Tunnel/Bridges<br>12	Motorway toll | String getProductCode() | setProductCode(String productCode) |
| `ProductName` | `String` | Optional | Product Name<br>Example:<br><br>Unleaded - High octane<br>Unleaded - Medium octane<br>Unleaded - Low octane<br>Unleaded Environmental | String getProductName() | setProductName(String productName) |
| `ProductGroupId` | `Integer` | Optional | Product Group Id<br>Example:<br>1	Parent Product Group<br>2	All Fuels<br>3	Motor gasoline<br>4	2 stroke<br>5	Autogas | Integer getProductGroupId() | setProductGroupId(Integer productGroupId) |
| `ProductGroupName` | `String` | Optional | Product Group Name<br>Example:<br>1	Parent Product Group<br>2	All Fuels<br>3	Motor gasoline<br>4	2 stroke<br>5	Autogas | String getProductGroupName() | setProductGroupName(String productGroupName) |
| `DelCoExchangeRate` | `Double` | Optional | DelCo Exchange Rate (Site exchange rate)<br>Note: - The value could be null/blank for fees item. | Double getDelCoExchangeRate() | setDelCoExchangeRate(Double delCoExchangeRate) |
| `ColCoExchangeRate` | `Integer` | Optional | ColCo Exchange Rate (Customer exchange rate) | Integer getColCoExchangeRate() | setColCoExchangeRate(Integer colCoExchangeRate) |
| `IsShellSite` | `Boolean` | Optional | True when transaction occurred at a Shell site else return False<br>Note: - The value could be null/blank for fees item. | Boolean getIsShellSite() | setIsShellSite(Boolean isShellSite) |
| `Network` | `String` | Optional | Network  (Shell PH, ESSO, etc.,)<br>100013	STEINDORFER<br>100015	S.A. BELGIAN SHELL N.V.<br>100016	ESSO BE<br>Note: - The value could be null/blank for fees item. | String getNetwork() | setNetwork(String network) |
| `SiteGroupId` | `Integer` | Optional | Site Group Id<br>Example: 202<br>Note: - The value could be null/blank for fees item. | Integer getSiteGroupId() | setSiteGroupId(Integer siteGroupId) |
| `SiteGroupName` | `String` | Optional | Site GroupName<br>Example: CZ 9100 ECONOMY NETWORK<br>Note: - The value could be null/blank for fees item. | String getSiteGroupName() | setSiteGroupName(String siteGroupName) |
| `PostingDate` | `String` | Optional | Transaction Posting Date<br>Format: yyyyMMdd HHmmss | String getPostingDate() | setPostingDate(String postingDate) |
| `IssuerCode` | `String` | Optional | First digits of the Card PAN<br>7002 = Fleet | String getIssuerCode() | setIssuerCode(String issuerCode) |
| `PurchasedInCountryCode` | `String` | Optional | ISO code of the country where the transaction took place<br>Example: “NL”<br>Note: - The value could be null/blank for fees item. | String getPurchasedInCountryCode() | setPurchasedInCountryCode(String purchasedInCountryCode) |
| `CustomerCountryCode` | `String` | Optional | ISO code of the Customer Country<br>Example: NL | String getCustomerCountryCode() | setCustomerCountryCode(String customerCountryCode) |
| `CustomerCountry` | `String` | Optional | Name of the Customer Country<br>Example: Netherlands | String getCustomerCountry() | setCustomerCountry(String customerCountry) |
| `ReleaseCode` | `String` | Optional | Release code, 7th Digit of the Card PAN<br>Example: 8 for 7021882 | String getReleaseCode() | setReleaseCode(String releaseCode) |
| `CardGroupId` | `String` | Optional | Card group ID | String getCardGroupId() | setCardGroupId(String cardGroupId) |
| `CardSequenceNumber` | `String` | Optional | 3 digits, Card sequence number and Check digit (Digit 16,17 and 18 on the card pan) | String getCardSequenceNumber() | setCardSequenceNumber(String cardSequenceNumber) |
| `CheckDigit` | `String` | Optional | Check digit, Last number of the card pan | String getCheckDigit() | setCheckDigit(String checkDigit) |
| `FleetIDDescription` | `String` | Optional | FleetId/CRN description in Card Platform configured at the account level | String getFleetIDDescription() | setFleetIDDescription(String fleetIDDescription) |
| `VATRate` | `Double` | Optional | VAT Percentage<br>0.20 for 20%<br>Note: This parameter will be populated in the response for both SalesItem and FeeItem | Double getVATRate() | setVATRate(Double vATRate) |
| `VATCategory` | `String` | Optional | VAT Category Id-Description<br>1-Zero Rated | String getVATCategory() | setVATCategory(String vATCategory) |
| `VATCountry` | `String` | Optional | VAT Country<br>Example: Netherlands | String getVATCountry() | setVATCountry(String vATCountry) |
| `EffectiveDiscountInTrxCurrency` | `Double` | Optional | Effective Discount (excluding VAT, in transaction currency) 4 digits<br>Example: 0.0000 | Double getEffectiveDiscountInTrxCurrency() | setEffectiveDiscountInTrxCurrency(Double effectiveDiscountInTrxCurrency) |
| `TransactionType` | `String` | Optional | Transaction Type<br>Example: Purchase when Card is Present else Blank<br>Note: - The value could be null/blank for fees item. | String getTransactionType() | setTransactionType(String transactionType) |
| `PINIndicator` | `String` | Optional | Pin Indicator (Indicates whether PIN used or not used at the time of transaction)<br>Example: “PIN Used'” or “No PIN” or “Unknown”<br>Note: - The value could be null/blank for fees item | String getPINIndicator() | setPINIndicator(String pINIndicator) |
| `VATApplicable` | `String` | Optional | Is VAT Applicable for this transaction<br>Example: “Y” or “N” | String getVATApplicable() | setVATApplicable(String vATApplicable) |
| `NetInvoiceIndicator` | `String` | Optional | Net Invoice Indicator, Will the customer receive an invoice without VAT?<br>Example: “Y” or “N”<br>Note: - The value could be null/blank for fees item. | String getNetInvoiceIndicator() | setNetInvoiceIndicator(String netInvoiceIndicator) |
| `CustomerCurrencyCode` | `String` | Optional | Customer currency code<br>Example: GBP | String getCustomerCurrencyCode() | setCustomerCurrencyCode(String customerCurrencyCode) |
| `CustomerCurrencySymbol` | `String` | Optional | Customer currency Symbol | String getCustomerCurrencySymbol() | setCustomerCurrencySymbol(String customerCurrencySymbol) |
| `EffectiveUnitDiscountInCustomerCurrency` | `Integer` | Optional | Effective Unit Discount (excluding VAT in Customer currency)<br>Note: - The value could be null/blank for fees item. | Integer getEffectiveUnitDiscountInCustomerCurrency() | setEffectiveUnitDiscountInCustomerCurrency(Integer effectiveUnitDiscountInCustomerCurrency) |
| `EffectiveDiscountInCustomerCurrency` | `Integer` | Optional | Effective Discount (excluding VAT in Customer currency)<br>Note: - The value could be null/blank for fees item. | Integer getEffectiveDiscountInCustomerCurrency() | setEffectiveDiscountInCustomerCurrency(Integer effectiveDiscountInCustomerCurrency) |
| `VATonNetAmountInCustomerCurrency` | `Integer` | Optional | VAT on Net Amount (in Customer currency) | Integer getVATonNetAmountInCustomerCurrency() | setVATonNetAmountInCustomerCurrency(Integer vATonNetAmountInCustomerCurrency) |
| `DiscountType` | `String` | Optional | Discount Type<br>Example: 1-None<br>2-Pence per unit | String getDiscountType() | setDiscountType(String discountType) |
| `TransactionStatus` | `String` | Optional | Transaction status "U" or "I"<br>“U” stands for Uninvoiced<br>“I” stands for Invoiced | String getTransactionStatus() | setTransactionStatus(String transactionStatus) |
| `SalesItemId` | `Integer` | Optional | Unique Sales Item Identifier<br>Example: 18315958002<br>Note: For a fee item, this parameter will be populated with SalesItemId. | Integer getSalesItemId() | setSalesItemId(Integer salesItemId) |
| `PayerGroup` | `String` | Optional | Payer Group applicable for the Large Customer NL+8 digit code | String getPayerGroup() | setPayerGroup(String payerGroup) |
| `PayerGroupName` | `String` | Optional | Payer Group Name | String getPayerGroupName() | setPayerGroupName(String payerGroupName) |
| `RefundFlag` | `String` | Optional | Refund Flag “N” for Not Refunded and “Y” for Refunded.<br>Note: - The value could be null/blank for fees item. | String getRefundFlag() | setRefundFlag(String refundFlag) |
| `OriginalSalesItemId` | `String` | Optional | Shows Sales Item Id of the original item that was refunded | String getOriginalSalesItemId() | setOriginalSalesItemId(String originalSalesItemId) |
| `DelcoName` | `String` | Optional | Delco Name<br>Example: SHELL NEDERLAND VERKOOPMAATSCHAPPIJ BV | String getDelcoName() | setDelcoName(String delcoName) |
| `DelcoCode` | `String` | Optional | Delco Code<br>014, 018, etc., | String getDelcoCode() | setDelcoCode(String delcoCode) |
| `PayerNumber` | `String` | Optional | Payer number (Country code+8 digits)<br>Example: NL10042616 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PayerName` | `String` | Optional | Payer name<br>Example: V.M. LE COMTE | String getPayerName() | setPayerName(String payerName) |
| `CardExpiryPeriod` | `String` | Optional | Year/Month of the Card Expiry captured on the transaction<br>Example: 1901 | String getCardExpiryPeriod() | setCardExpiryPeriod(String cardExpiryPeriod) |
| `AuthorisationCode` | `String` | Optional | Authorisation code of the transaction<br>Example: 011256<br>Note: - The value could be null/blank for fees item. | String getAuthorisationCode() | setAuthorisationCode(String authorisationCode) |
| `TransactionId` | `String` | Optional | Unique id of the transaction that may include one or more salesitems<br>Example: io9KVXk1UkW57XWKyeaHHg<br>Note: - The value could be null/blank for fees item. | String getTransactionId() | setTransactionId(String transactionId) |
| `TransactionLine` | `String` | Optional | Transaction line item number<br>Example: 1<br>Note: - The value could be null/blank for fees item. | String getTransactionLine() | setTransactionLine(String transactionLine) |
| `AllowClearing` | `String` | Optional | Is the Sales Item allowed for clearing? i.e. not written off<br>Example: “Y” or “N”<br>Note: - The value could be null/blank for fees item. | String getAllowClearing() | setAllowClearing(String allowClearing) |
| `CRMNumber` | `String` | Optional | CRM Case number if the sales item is in dispute.<br>Note: - The value could be null/blank for fees item. | String getCRMNumber() | setCRMNumber(String cRMNumber) |
| `DisputeStatus` | `String` | Optional | Sales Item Dispute Status if disputed<br>0	No Dispute<br>1	In Dispute<br>2	Re-Instated<br>3	Adjusted<br>4	Written Off by Colco<br>5	Written Off by Delco<br>6	Charged Back to Site | String getDisputeStatus() | setDisputeStatus(String disputeStatus) |
| `RebateRate` | `Double` | Optional | Unit discount in customer currency.<br>Example: 28.279000 | Double getRebateRate() | setRebateRate(Double rebateRate) |
| `DelCoToColCoExchangeRate` | `Integer` | Optional | Exchange rate from transaction currency to customer currency.<br>Example: 1 | Integer getDelCoToColCoExchangeRate() | setDelCoToColCoExchangeRate(Integer delCoToColCoExchangeRate) |
| `NetEuroAmount` | `Double` | Optional | Net euro amount.<br>Example: 37.93<br>Note: - The value could be null/blank for fees item. | Double getNetEuroAmount() | setNetEuroAmount(Double netEuroAmount) |
| `EuroRebateAmount` | `Integer` | Optional | Euro rebate amount.<br>Example: 0<br>Note: - The value could be null/blank for fees item. | Integer getEuroRebateAmount() | setEuroRebateAmount(Integer euroRebateAmount) |
| `EuroVATAmount` | `Double` | Optional | Euro VAT amount.<br>Example: 7.96<br>Note: - The value could be null/blank for fees item. | Double getEuroVATAmount() | setEuroVATAmount(Double euroVATAmount) |
| `ParentCustomerNumber` | `String` | Optional | Parent customer number | String getParentCustomerNumber() | setParentCustomerNumber(String parentCustomerNumber) |
| `ParentCustomerName` | `String` | Optional | Parent customer name. | String getParentCustomerName() | setParentCustomerName(String parentCustomerName) |
| `ParentCustomerId` | `Integer` | Optional | Parent customer id. | Integer getParentCustomerId() | setParentCustomerId(Integer parentCustomerId) |
| `IncomingSiteNumber` | `String` | Optional | Incoming Site Number<br>Example: 100021<br>Note: - The value could be null/blank for fees item. | String getIncomingSiteNumber() | setIncomingSiteNumber(String incomingSiteNumber) |
| `IncomingSiteDescription` | `String` | Optional | Incoming Site Description<br>Example: HN3 INTI_02-82.02<br>Note: - The value could be null/blank for fees item. | String getIncomingSiteDescription() | setIncomingSiteDescription(String incomingSiteDescription) |
| `IncomingCurrencyCode` | `String` | Optional | Incoming Currency Code<br>Example: GBP<br>Note: - The value could be null/blank for fees item. | String getIncomingCurrencyCode() | setIncomingCurrencyCode(String incomingCurrencyCode) |
| `IncomingProductCode` | `String` | Optional | Incoming Product Code<br>Example: 30 | String getIncomingProductCode() | setIncomingProductCode(String incomingProductCode) |
| `CreditDebitCode` | `String` | Optional | Credit Debit Code<br>Example: “D” or “C”<br>The value could be null/blank for fees item. | String getCreditDebitCode() | setCreditDebitCode(String creditDebitCode) |
| `CorrectionFlag` | `String` | Optional | Correction Flag<br>Example: “Y” or “N”<br>Note: - The value could be null/blank for fees item. | String getCorrectionFlag() | setCorrectionFlag(String correctionFlag) |
| `Additional1` | `String` | Optional | Additional details | String getAdditional1() | setAdditional1(String additional1) |
| `Additional2` | `String` | Optional | Additional details | String getAdditional2() | setAdditional2(String additional2) |
| `Additional3` | `String` | Optional | Additional details | String getAdditional3() | setAdditional3(String additional3) |
| `Additional4` | `String` | Optional | Additional details | String getAdditional4() | setAdditional4(String additional4) |
| `RebateonNetAmountInCustomerCurrency` | `Double` | Optional | Rebate on Net Amount in Customer Currency<br>Example: -0.735000000000<br>Note: - The value could be null/blank for fees item. | Double getRebateonNetAmountInCustomerCurrency() | setRebateonNetAmountInCustomerCurrency(Double rebateonNetAmountInCustomerCurrency) |
| `RebateonNetAmountInTransactionCurrency` | `Double` | Optional | Rebate on Net Amount in Transaction Currency<br>Example: -0.735000000000<br>Note: - The value could be null/blank for fees item. | Double getRebateonNetAmountInTransactionCurrency() | setRebateonNetAmountInTransactionCurrency(Double rebateonNetAmountInTransactionCurrency) |
| `NetworkCode` | `String` | Optional | Network Code<br>Example: AVEE PTUAZONW CUBFAO COSFS<br>Note: - The value could be null/blank for fees item. | String getNetworkCode() | setNetworkCode(String networkCode) |
| `TrnIdentifier` | `String` | Optional | Transaction Identifier | String getTrnIdentifier() | setTrnIdentifier(String trnIdentifier) |
| `CardType` | `String` | Optional | Card Type | String getCardType() | setCardType(String cardType) |
| `DelcoListPriceUnitNet` | `Double` | Optional | Delco List Price Unit Net<br>Example: 30.500000<br>Note: - The value could be null/blank for fees item | Double getDelcoListPriceUnitNet() | setDelcoListPriceUnitNet(Double delcoListPriceUnitNet) |
| `DelcoRetailPriceUnitNet` | `Double` | Optional | Retail Net Price (or pump net price) per Unit in transaction currency<br>Example: 1.921000<br>Note: - The value could be null/blank for fees item | Double getDelcoRetailPriceUnitNet() | setDelcoRetailPriceUnitNet(Double delcoRetailPriceUnitNet) |
| `DelcoRetailPriceUnitGross` | `Double` | Optional | Retail gross price (or pump gross price) per unit in transaction currency<br>Note: - The value could be null/blank for fees item | Double getDelcoRetailPriceUnitGross() | setDelcoRetailPriceUnitGross(Double delcoRetailPriceUnitGross) |
| `DelcoRetailValueTotalNet` | `Double` | Optional | Retail net price (or net pump price) in transaction currency<br>Note: - The value could be null/blank for fees item | Double getDelcoRetailValueTotalNet() | setDelcoRetailValueTotalNet(Double delcoRetailValueTotalNet) |
| `DelcoRetailValueTotalGross` | `Double` | Optional | Retail gross price (or gross pump price) in transaction currency<br>Note: - The value could be null/blank for fees item | Double getDelcoRetailValueTotalGross() | setDelcoRetailValueTotalGross(Double delcoRetailValueTotalGross) |
| `CustomerRetailPriceUnitGross` | `Double` | Optional | Retail gross price (or pump gross price) per unit in customer currency<br>Note: - The value could be null/blank for fees item | Double getCustomerRetailPriceUnitGross() | setCustomerRetailPriceUnitGross(Double customerRetailPriceUnitGross) |
| `CustomerRetailValueTotalGross` | `Double` | Optional | Retail gross price (or gross pump price) in customer currency<br>Note: - The value could be null/blank for fees item | Double getCustomerRetailValueTotalGross() | setCustomerRetailValueTotalGross(Double customerRetailValueTotalGross) |
| `CustomerRetailValueTotalNet` | `Double` | Optional | Retail net price (or net pump price) in customer currency<br>Note: - The value could be null/blank for fees item | Double getCustomerRetailValueTotalNet() | setCustomerRetailValueTotalNet(Double customerRetailValueTotalNet) |
| `TransactionTypeDescription` | `String` | Optional | Transaction Type Description<br>Note: - The value could be null/blank for fees item | String getTransactionTypeDescription() | setTransactionTypeDescription(String transactionTypeDescription) |

## Example (as JSON)

```json
{
  "Type": "Type8",
  "CardId": 146,
  "CardPAN": "CardPAN2",
  "CardExpiry": "CardExpiry6",
  "TransactionDate": "TransactionDate6"
}
```

