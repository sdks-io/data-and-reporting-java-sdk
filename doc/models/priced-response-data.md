
# Priced Response Data

## Structure

`PricedResponseData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | Name of the account<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `36` | String getAccountName() | setAccountName(String accountName) |
| `AccountId` | `Integer` | Optional | Account Id (i.e. Customer Id of the Sub Account in GFN) of the selected account. | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | AccountNumber of the selected account. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountShortName` | `String` | Optional | Nick name of the account<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `25` | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `Additional1` | `String` | Optional | Addtional SerialId or endpoint Id<br>**Constraints**: *Minimum Length*: `14`, *Maximum Length*: `20` | String getAdditional1() | setAdditional1(String additional1) |
| `Additional2` | `String` | Optional | Addtional SerialId or endpoint Id<br>**Constraints**: *Minimum Length*: `14`, *Maximum Length*: `20` | String getAdditional2() | setAdditional2(String additional2) |
| `Additional3` | `String` | Optional | Addtional SerialId or endpoint Id<br>**Constraints**: *Minimum Length*: `14`, *Maximum Length*: `20` | String getAdditional3() | setAdditional3(String additional3) |
| `Additional4` | `String` | Optional | Addtional SerialId or endpoint Id<br>**Constraints**: *Minimum Length*: `14`, *Maximum Length*: `20` | String getAdditional4() | setAdditional4(String additional4) |
| `AllowClearing` | `String` | Optional | Allow clearings<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `25` | String getAllowClearing() | setAllowClearing(String allowClearing) |
| `AuthorisationCode` | `Integer` | Optional | Autorization code<br>**Constraints**: `>= 1`, `<= 999999` | Integer getAuthorisationCode() | setAuthorisationCode(Integer authorisationCode) |
| `TransactionStatus` | `String` | Optional | Status of the transaction<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | String getTransactionStatus() | setTransactionStatus(String transactionStatus) |
| `DriverName` | `String` | Optional | Driver Name of Card record<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `25` | String getDriverName() | setDriverName(String driverName) |
| `CardExpiryPeriod` | `Integer` | Optional | Expiry period of the card<br>**Constraints**: `>= 1`, `<= 9999` | Integer getCardExpiryPeriod() | setCardExpiryPeriod(Integer cardExpiryPeriod) |
| `CardExpiry` | `String` | Optional | Card Expiry Date | String getCardExpiry() | setCardExpiry(String cardExpiry) |
| `CardGroupId` | `Integer` | Optional | Card Group Code<br>**Constraints**: `>= 1`, `<= 99999` | Integer getCardGroupId() | setCardGroupId(Integer cardGroupId) |
| `CardGroupName` | `String` | Optional | Group nmae of the card | String getCardGroupName() | setCardGroupName(String cardGroupName) |
| `IssuerCode` | `Integer` | Optional | Issuer code<br>**Constraints**: `>= 1`, `<= 9999` | Integer getIssuerCode() | setIssuerCode(Integer issuerCode) |
| `CardPAN` | `String` | Optional | Full Card PAN<br>**Constraints**: *Minimum Length*: `19`, *Maximum Length*: `19` | String getCardPAN() | setCardPAN(String cardPAN) |
| `ReleaseCode` | `Integer` | Optional | Release code<br>**Constraints**: `>= 1`, `<= 10` | Integer getReleaseCode() | setReleaseCode(Integer releaseCode) |
| `CardSequenceNumber` | `Integer` | Optional | Sequesnce number of the card<br>**Constraints**: `>= 1`, `<= 999` | Integer getCardSequenceNumber() | setCardSequenceNumber(Integer cardSequenceNumber) |
| `CardType` | `String` | Optional | Type of card<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50` | String getCardType() | setCardType(String cardType) |
| `ColCoCode` | `String` | Optional | Collecting Company Code (Shell Code) of the selected payer.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3` | String getColCoCode() | setColCoCode(String colCoCode) |
| `UnitDiscountInvoiceCurrency` | `Double` | Optional | Unit discount Invoice currency | Double getUnitDiscountInvoiceCurrency() | setUnitDiscountInvoiceCurrency(Double unitDiscountInvoiceCurrency) |
| `ColCoExchangeRate` | `Double` | Optional | Colco exchange rate | Double getColCoExchangeRate() | setColCoExchangeRate(Double colCoExchangeRate) |
| `InvoiceCurrencySymbol` | `String` | Optional | Currency symbol on which the invoice was raised<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3` | String getInvoiceCurrencySymbol() | setInvoiceCurrencySymbol(String invoiceCurrencySymbol) |
| `CorrectionFlag` | `Boolean` | Optional | Is there any correction | Boolean getCorrectionFlag() | setCorrectionFlag(Boolean correctionFlag) |
| `CRMNumber` | `Double` | Optional | CRM number<br>**Constraints**: `>= 10`, `<= 10` | Double getCRMNumber() | setCRMNumber(Double cRMNumber) |
| `CustomerCountry` | `String` | Optional | Customer country<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `30` | String getCustomerCountry() | setCustomerCountry(String customerCountry) |
| `CustomerCurrencyCode` | `String` | Optional | Curreny which customer uses to transact.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3` | String getCustomerCurrencyCode() | setCustomerCurrencyCode(String customerCurrencyCode) |
| `CustomerCurrencySymbol` | `String` | Optional | Custome currency symbol<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | String getCustomerCurrencySymbol() | setCustomerCurrencySymbol(String customerCurrencySymbol) |
| `RebateonNetAmountInCustomerCurrency` | `Double` | Optional | Rebate on net amount in customer currency | Double getRebateonNetAmountInCustomerCurrency() | setRebateonNetAmountInCustomerCurrency(Double rebateonNetAmountInCustomerCurrency) |
| `EffectiveDiscountInCustomerCurrency` | `Double` | Optional | Effective discount in customers currency | Double getEffectiveDiscountInCustomerCurrency() | setEffectiveDiscountInCustomerCurrency(Double effectiveDiscountInCustomerCurrency) |
| `EffectiveUnitDiscountInCustomerCurrency` | `Double` | Optional | effectiive unit discount in customers currency | Double getEffectiveUnitDiscountInCustomerCurrency() | setEffectiveUnitDiscountInCustomerCurrency(Double effectiveUnitDiscountInCustomerCurrency) |
| `UnitPriceInInvoiceCurrency` | `Double` | Optional | Unitpricing in invoice currency | Double getUnitPriceInInvoiceCurrency() | setUnitPriceInInvoiceCurrency(Double unitPriceInInvoiceCurrency) |
| `InvoiceTax` | `Double` | Optional | Invoice tax | Double getInvoiceTax() | setInvoiceTax(Double invoiceTax) |
| `InvoiceGrossAmount` | `Double` | Optional | Invoice amount befor tax | Double getInvoiceGrossAmount() | setInvoiceGrossAmount(Double invoiceGrossAmount) |
| `InvoiceNetAmount` | `Double` | Optional | Invoice amount after tax | Double getInvoiceNetAmount() | setInvoiceNetAmount(Double invoiceNetAmount) |
| `VATonNetAmountInCustomerCurrency` | `Double` | Optional | Vat on net amount in customer currency | Double getVATonNetAmountInCustomerCurrency() | setVATonNetAmountInCustomerCurrency(Double vATonNetAmountInCustomerCurrency) |
| `CustomerRetailPriceUnitGross` | `Double` | Optional | Customer retail unit price before tax | Double getCustomerRetailPriceUnitGross() | setCustomerRetailPriceUnitGross(Double customerRetailPriceUnitGross) |
| `CustomerRetailValueTotalGross` | `Double` | Optional | Total Customer retail value before tax | Double getCustomerRetailValueTotalGross() | setCustomerRetailValueTotalGross(Double customerRetailValueTotalGross) |
| `CustomerRetailValueTotalNet` | `Double` | Optional | Total customer retail value after tax | Double getCustomerRetailValueTotalNet() | setCustomerRetailValueTotalNet(Double customerRetailValueTotalNet) |
| `TransactionTypeDescription` | `Double` | Optional | Trasaction type description | Double getTransactionTypeDescription() | setTransactionTypeDescription(Double transactionTypeDescription) |
| `RebateonNetAmountInTransactionCurrency` | `Double` | Optional | Rebate give to net amountin transaction currency that is used | Double getRebateonNetAmountInTransactionCurrency() | setRebateonNetAmountInTransactionCurrency(Double rebateonNetAmountInTransactionCurrency) |
| `EffectiveDiscountInTrxCurrency` | `Double` | Optional | Currency used to giveEffective discount on transactions | Double getEffectiveDiscountInTrxCurrency() | setEffectiveDiscountInTrxCurrency(Double effectiveDiscountInTrxCurrency) |
| `DelCoToColCoExchangeRate` | `Integer` | Optional | Exchange rate between Delco and Colco | Integer getDelCoToColCoExchangeRate() | setDelCoToColCoExchangeRate(Integer delCoToColCoExchangeRate) |
| `Cards` | `List<Integer>` | Optional | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `500` | List<Integer> getCards() | setCards(List<Integer> cards) |
| `UnitDiscountTransactionCurrency` | `Double` | Optional | Currency used forto provide unit Transaction discount | Double getUnitDiscountTransactionCurrency() | setUnitDiscountTransactionCurrency(Double unitDiscountTransactionCurrency) |
| `TransactionGrossAmount` | `Double` | Optional | Transactional amount before tax | Double getTransactionGrossAmount() | setTransactionGrossAmount(Double transactionGrossAmount) |
| `TransactionNetAmount` | `Double` | Optional | Transaction net amount after tax | Double getTransactionNetAmount() | setTransactionNetAmount(Double transactionNetAmount) |
| `TransactionTax` | `Double` | Optional | Transaction tax | Double getTransactionTax() | setTransactionTax(Double transactionTax) |
| `VATonNetAmount` | `Double` | Optional | Transactinal tax rates | Double getVATonNetAmount() | setVATonNetAmount(Double vATonNetAmount) |
| `DelcoListPriceUnitNet` | `Double` | Optional | Priv | Double getDelcoListPriceUnitNet() | setDelcoListPriceUnitNet(Double delcoListPriceUnitNet) |
| `DelcoRetailPriceUnitGross` | `Double` | Optional | Delco retail price per unit before tax | Double getDelcoRetailPriceUnitGross() | setDelcoRetailPriceUnitGross(Double delcoRetailPriceUnitGross) |
| `UnitPriceInTransactionCurrency` | `Double` | Optional | Delco retail price per unit after tax | Double getUnitPriceInTransactionCurrency() | setUnitPriceInTransactionCurrency(Double unitPriceInTransactionCurrency) |
| `DelcoRetailPriceUnitNet` | `Double` | Optional | Delco retail price per unit | Double getDelcoRetailPriceUnitNet() | setDelcoRetailPriceUnitNet(Double delcoRetailPriceUnitNet) |
| `DelcoRetailValueTotalGross` | `Double` | Optional | Delco retail price before tax | Double getDelcoRetailValueTotalGross() | setDelcoRetailValueTotalGross(Double delcoRetailValueTotalGross) |
| `DelcoRetailValueTotalNet` | `Double` | Optional | Delco per unit price after tax | Double getDelcoRetailValueTotalNet() | setDelcoRetailValueTotalNet(Double delcoRetailValueTotalNet) |
| `TransactionCurrencySymbol` | `String` | Optional | Currency used for transaction. | String getTransactionCurrencySymbol() | setTransactionCurrencySymbol(String transactionCurrencySymbol) |
| `DiscountType` | `String` | Optional | Type of discount available | String getDiscountType() | setDiscountType(String discountType) |
| `DisputeStatus` | `Boolean` | Optional | Is there any dispute status?True or False<br>**Default**: `false` | Boolean getDisputeStatus() | setDisputeStatus(Boolean disputeStatus) |
| `IsShellSite` | `Boolean` | Optional | Is it a shell sites?True or False<br>**Default**: `false` | Boolean getIsShellSite() | setIsShellSite(Boolean isShellSite) |
| `FleetIdInput` | `String` | Optional | Fleet identifier | String getFleetIdInput() | setFleetIdInput(String fleetIdInput) |
| `IncomingProductCode` | `Integer` | Optional | In coming product code | Integer getIncomingProductCode() | setIncomingProductCode(Integer incomingProductCode) |
| `PostingDate` | `String` | Optional | Date of Posting | String getPostingDate() | setPostingDate(String postingDate) |
| `PostingTime` | `String` | Optional | Time whern posting happened | String getPostingTime() | setPostingTime(String postingTime) |
| `ProductCode` | `Integer` | Optional | Product Code - 21 Unleaded - High octane,22 Unleaded - Medium octane,23 Unleaded - Low octane,24 Unleaded Environmental | Integer getProductCode() | setProductCode(Integer productCode) |
| `ProductName` | `String` | Optional | Name of the product<br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `30` | String getProductName() | setProductName(String productName) |
| `ProductGroupId` | `Integer` | Optional | Id of the product to which group it belongs | Integer getProductGroupId() | setProductGroupId(Integer productGroupId) |
| `IncomingCurrencyCode` | `String` | Optional | In coming currecncy code<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3` | String getIncomingCurrencyCode() | setIncomingCurrencyCode(String incomingCurrencyCode) |
| `IncomingSiteDescription` | `String` | Optional | In coming Site description | String getIncomingSiteDescription() | setIncomingSiteDescription(String incomingSiteDescription) |
| `Location` | `String` | Optional | Location of the Shell site<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `50` | String getLocation() | setLocation(String location) |
| `SiteName` | `String` | Optional | Shell site name<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `50` | String getSiteName() | setSiteName(String siteName) |
| `SiteCode` | `Integer` | Optional | Shell site code | Integer getSiteCode() | setSiteCode(Integer siteCode) |
| `IncomingSiteNumber` | `Integer` | Optional | In coming site number | Integer getIncomingSiteNumber() | setIncomingSiteNumber(Integer incomingSiteNumber) |
| `InvoiceCurrencyCode` | `String` | Optional | Currency code on which the invoice is raised<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3` | String getInvoiceCurrencyCode() | setInvoiceCurrencyCode(String invoiceCurrencyCode) |
| `InvoiceDate` | `String` | Optional | Date on which the invoice was raised | String getInvoiceDate() | setInvoiceDate(String invoiceDate) |
| `InvoiceNumber` | `Double` | Optional | Invoice number | Double getInvoiceNumber() | setInvoiceNumber(Double invoiceNumber) |
| `FuelProduct` | `Boolean` | Optional | Is it a fuel product? True or False | Boolean getFuelProduct() | setFuelProduct(Boolean fuelProduct) |
| `VATApplicable` | `String` | Optional | Is VAT applicable?Y or N<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | String getVATApplicable() | setVATApplicable(String vATApplicable) |
| `PayerName` | `String` | Optional | Name of the payer<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `50` | String getPayerName() | setPayerName(String payerName) |
| `PayerNumber` | `String` | Optional | Payer account number<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `15` | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `ParentCustomerNumber` | `String` | Optional | Parent account number of the payer<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `15` | String getParentCustomerNumber() | setParentCustomerNumber(String parentCustomerNumber) |
| `PayerGroup` | `String` | Optional | The group which the payer belongs to | String getPayerGroup() | setPayerGroup(String payerGroup) |
| `PayerGroupName` | `String` | Optional | Name of the group to which the payer belongs to.<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `50` | String getPayerGroupName() | setPayerGroupName(String payerGroupName) |
| `CheckDigit` | `Integer` | Optional | Check digit | Integer getCheckDigit() | setCheckDigit(Integer checkDigit) |
| `NetInvoiceIndicator` | `String` | Optional | After tax net invoice number | String getNetInvoiceIndicator() | setNetInvoiceIndicator(String netInvoiceIndicator) |
| `DelcoCode` | `Integer` | Optional | Delco code | Integer getDelcoCode() | setDelcoCode(Integer delcoCode) |
| `NetworkCode` | `Integer` | Optional | Network  code of the payer<br>**Constraints**: `>= 3`, `<= 3` | Integer getNetworkCode() | setNetworkCode(Integer networkCode) |
| `PurchasedInCountry` | `String` | Optional | Country of purchase<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `50` | String getPurchasedInCountry() | setPurchasedInCountry(String purchasedInCountry) |
| `SiteCountry` | `String` | Optional | Country where the site exists<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `50` | String getSiteCountry() | setSiteCountry(String siteCountry) |
| `VATCountry` | `String` | Optional | Country where VAT is applicable<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `50` | String getVATCountry() | setVATCountry(String vATCountry) |
| `DelcoName` | `String` | Optional | Name of the delivery company<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `50` | String getDelcoName() | setDelcoName(String delcoName) |
| `Network` | `String` | Optional | Network of the Delivery company<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `25` | String getNetwork() | setNetwork(String network) |
| `OdometerInput` | `Integer` | Optional | Odometet input | Integer getOdometerInput() | setOdometerInput(Integer odometerInput) |
| `OriginalSalesItemId` | `String` | Optional | Original item identifier for sales<br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `25` | String getOriginalSalesItemId() | setOriginalSalesItemId(String originalSalesItemId) |
| `FleetIDDescription` | `String` | Optional | Fleet identifier description | String getFleetIDDescription() | setFleetIDDescription(String fleetIDDescription) |
| `ParentCustomerId` | `Integer` | Optional | Identifier of parent customer | Integer getParentCustomerId() | setParentCustomerId(Integer parentCustomerId) |
| `PINIndicator` | `String` | Optional | PIN indicator | String getPINIndicator() | setPINIndicator(String pINIndicator) |
| `ProductGroupName` | `String` | Optional | Name og the group the product belongs to | String getProductGroupName() | setProductGroupName(String productGroupName) |
| `PurchasedInCountryCode` | `String` | Optional | The countroy code where the purchase was made | String getPurchasedInCountryCode() | setPurchasedInCountryCode(String purchasedInCountryCode) |
| `Quantity` | `Double` | Optional | Quantity of the product | Double getQuantity() | setQuantity(Double quantity) |
| `RebateRate` | `Double` | Optional | Rebate rate if any | Double getRebateRate() | setRebateRate(Double rebateRate) |
| `ReceiptNumber` | `Integer` | Optional | Reciept number | Integer getReceiptNumber() | setReceiptNumber(Integer receiptNumber) |
| `RefundFlag` | [`PricedTransactionRespV2RefundFlagEnum`](../../doc/models/priced-transaction-resp-v2-refund-flag-enum.md) | Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | PricedTransactionRespV2RefundFlagEnum getRefundFlag() | setRefundFlag(PricedTransactionRespV2RefundFlagEnum refundFlag) |
| `SiteGroupId` | `Integer` | Optional | Group identifier for the site | Integer getSiteGroupId() | setSiteGroupId(Integer siteGroupId) |
| `SiteGroupName` | `String` | Optional | Name of the Site group | String getSiteGroupName() | setSiteGroupName(String siteGroupName) |
| `Latitude` | `Double` | Optional | Latitude of the site | Double getLatitude() | setLatitude(Double latitude) |
| `Longitude` | `Double` | Optional | Longitude of the site | Double getLongitude() | setLongitude(Double longitude) |
| `DelCoExchangeRate` | `Double` | Optional | Delivery company exchange rate | Double getDelCoExchangeRate() | setDelCoExchangeRate(Double delCoExchangeRate) |
| `EuroRebateAmount` | `Double` | Optional | Rebate amount in Euros | Double getEuroRebateAmount() | setEuroRebateAmount(Double euroRebateAmount) |
| `NetEuroAmount` | `Double` | Optional | Net amount in Euros | Double getNetEuroAmount() | setNetEuroAmount(Double netEuroAmount) |
| `EuroVATAmount` | `Double` | Optional | Vat amount in Euros | Double getEuroVATAmount() | setEuroVATAmount(Double euroVATAmount) |
| `ParentCustomerName` | `String` | Optional | Customers parent name<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `50` | String getParentCustomerName() | setParentCustomerName(String parentCustomerName) |
| `IsInvoiced` | `Boolean` | Optional | Is invoice raised<br>**Default**: `false` | Boolean getIsInvoiced() | setIsInvoiced(Boolean isInvoiced) |
| `TransactionCurrencyCode` | `String` | Optional | Transaction currency code | String getTransactionCurrencyCode() | setTransactionCurrencyCode(String transactionCurrencyCode) |
| `CreditDebitCode` | `String` | Optional | Is it Credit or debit C for credit D for Debit | String getCreditDebitCode() | setCreditDebitCode(String creditDebitCode) |
| `TransactionDate` | `String` | Optional | Date of transaction | String getTransactionDate() | setTransactionDate(String transactionDate) |
| `TransactionTime` | `String` | Optional | Time of transaction | String getTransactionTime() | setTransactionTime(String transactionTime) |
| `TransactionItemId` | `String` | Optional | Identifier of the Iem in transaction | String getTransactionItemId() | setTransactionItemId(String transactionItemId) |
| `TrnIdentifier` | `String` | Optional | Transaction identifier | String getTrnIdentifier() | setTrnIdentifier(String trnIdentifier) |
| `Type` | `String` | Optional | Transaction type for Delco | String getType() | setType(String type) |
| `TransactionLine` | `Integer` | Optional | - | Integer getTransactionLine() | setTransactionLine(Integer transactionLine) |
| `TransactionType` | `String` | Optional | Transaction type Colco | String getTransactionType() | setTransactionType(String transactionType) |
| `UTCOffset` | `String` | Optional | Leaving country | String getUTCOffset() | setUTCOffset(String uTCOffset) |
| `VATCategory` | `String` | Optional | To which category and counry does the  VAT come under | String getVATCategory() | setVATCategory(String vATCategory) |
| `VATRate` | `Double` | Optional | VAT rate | Double getVATRate() | setVATRate(Double vATRate) |
| `VehicleRegistration` | `String` | Optional | Vehicle registration number | String getVehicleRegistration() | setVehicleRegistration(String vehicleRegistration) |
| `IsCancelled` | `String` | Optional | Check if the pruchase is cancelled<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | String getIsCancelled() | setIsCancelled(String isCancelled) |
| `ColCoGrossAmount` | `Double` | Optional | Gross amount from Colco | Double getColCoGrossAmount() | setColCoGrossAmount(Double colCoGrossAmount) |
| `ColCoNetAmount` | `Double` | Optional | Net amount from Colco | Double getColCoNetAmount() | setColCoNetAmount(Double colCoNetAmount) |
| `ColCoVATAmount` | `Double` | Optional | Colco VAT amount | Double getColCoVATAmount() | setColCoVATAmount(Double colCoVATAmount) |
| `OriginalCurrencySymbol` | `String` | Optional | Original currency code<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | String getOriginalCurrencySymbol() | setOriginalCurrencySymbol(String originalCurrencySymbol) |
| `OriginalCurrencyCode` | `String` | Optional | Original currency code<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | String getOriginalCurrencyCode() | setOriginalCurrencyCode(String originalCurrencyCode) |
| `OriginalVATAmount` | `Double` | Optional | Original VAT amount | Double getOriginalVATAmount() | setOriginalVATAmount(Double originalVATAmount) |
| `EmbossText` | `String` | Optional | Comapany name embosses in text<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `50` | String getEmbossText() | setEmbossText(String embossText) |
| `OriginalExchangeRate` | `Double` | Optional | Orginal exchange rate | Double getOriginalExchangeRate() | setOriginalExchangeRate(Double originalExchangeRate) |
| `OriginalTransactionItemInvoiceDate` | `String` | Optional | Original treansaction date | String getOriginalTransactionItemInvoiceDate() | setOriginalTransactionItemInvoiceDate(String originalTransactionItemInvoiceDate) |
| `FeeTypeId` | `Integer` | Optional | Fee type identifier<br>**Constraints**: `>= 1`, `<= 1` | Integer getFeeTypeId() | setFeeTypeId(Integer feeTypeId) |
| `LineItemDescription` | `Boolean` | Optional | Line item identifier of the product<br>**Default**: `false` | Boolean getLineItemDescription() | setLineItemDescription(Boolean lineItemDescription) |
| `FeeRuleDescription` | `String` | Optional | Fee rule description<br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `25` | String getFeeRuleDescription() | setFeeRuleDescription(String feeRuleDescription) |
| `Frequency` | `Integer` | Optional | Frequency of transaction<br>**Constraints**: `>= 1`, `<= 1` | Integer getFrequency() | setFrequency(Integer frequency) |
| `FeeRuleId` | `Integer` | Optional | Fee rule identifier<br>**Constraints**: `>= 1`, `<= 1` | Integer getFeeRuleId() | setFeeRuleId(Integer feeRuleId) |
| `SystemEntryDate` | `String` | Optional | Entry date in the system | String getSystemEntryDate() | setSystemEntryDate(String systemEntryDate) |
| `SystemEntryTime` | `String` | Optional | Entry time in the system | String getSystemEntryTime() | setSystemEntryTime(String systemEntryTime) |
| `IsManual` | `String` | Optional | Checking if its manual<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | String getIsManual() | setIsManual(String isManual) |
| `OriginalTransactionItemId` | `String` | Optional | Is it manual<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | String getOriginalTransactionItemId() | setOriginalTransactionItemId(String originalTransactionItemId) |
| `OriginalTransactionItemInvoiceNumber` | `Integer` | Optional | Original invoice transaction number | Integer getOriginalTransactionItemInvoiceNumber() | setOriginalTransactionItemInvoiceNumber(Integer originalTransactionItemInvoiceNumber) |
| `OriginalTransactionItemInvoiceId` | `Integer` | Optional | Original Invoice transaction Identifier | Integer getOriginalTransactionItemInvoiceId() | setOriginalTransactionItemInvoiceId(Integer originalTransactionItemInvoiceId) |
| `PayerShortName` | `String` | Optional | Payers short name<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `50` | String getPayerShortName() | setPayerShortName(String payerShortName) |
| `ReverseCharge` | `String` | Optional | Is reverse charge?<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | String getReverseCharge() | setReverseCharge(String reverseCharge) |
| `OriginalGrossAmount` | `Double` | Optional | Original gross amount | Double getOriginalGrossAmount() | setOriginalGrossAmount(Double originalGrossAmount) |
| `OriginalNetAmount` | `Double` | Optional | Original Net amount | Double getOriginalNetAmount() | setOriginalNetAmount(Double originalNetAmount) |
| `UnitOfMeasure` | `String` | Optional | Unit of measure<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1` | String getUnitOfMeasure() | setUnitOfMeasure(String unitOfMeasure) |
| `RoadType` | `String` | Optional | Type of road<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `50` | String getRoadType() | setRoadType(String roadType) |
| `CustomerCountryIsoCode` | `String` | Optional | Customer country ISO Code<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2` | String getCustomerCountryIsoCode() | setCustomerCountryIsoCode(String customerCountryIsoCode) |
| `EVOperator` | `String` | Optional | EvOperator Name<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `20` | String getEVOperator() | setEVOperator(String eVOperator) |
| `EVSerialId` | `String` | Optional | Ev Operator identifier<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `50` | String getEVSerialId() | setEVSerialId(String eVSerialId) |
| `EVChargePointSerial` | `String` | Optional | EV Charging point iserial identifier<br>**Constraints**: *Minimum Length*: `5`, *Maximum Length*: `50` | String getEVChargePointSerial() | setEVChargePointSerial(String eVChargePointSerial) |
| `EVChargePointConnectorType` | `Integer` | Optional | Ev chariging connector type | Integer getEVChargePointConnectorType() | setEVChargePointConnectorType(Integer eVChargePointConnectorType) |
| `EVChargePointConnectorTypeDescription` | `String` | Optional | EV charging point connector type description | String getEVChargePointConnectorTypeDescription() | setEVChargePointConnectorTypeDescription(String eVChargePointConnectorTypeDescription) |
| `EVChargeDuration` | `String` | Optional | Ev charging Duration | String getEVChargeDuration() | setEVChargeDuration(String eVChargeDuration) |
| `EVChargeStartDate` | `String` | Optional | EvCharging start Date | String getEVChargeStartDate() | setEVChargeStartDate(String eVChargeStartDate) |
| `EVChargeStartTime` | `String` | Optional | EvCharging start time | String getEVChargeStartTime() | setEVChargeStartTime(String eVChargeStartTime) |
| `EVChargeEndDate` | `String` | Optional | EvCharging End Date | String getEVChargeEndDate() | setEVChargeEndDate(String eVChargeEndDate) |
| `EVChargeEndTime` | `String` | Optional | EvCharging End time | String getEVChargeEndTime() | setEVChargeEndTime(String eVChargeEndTime) |
| `HostingCollectingCompanyNumber` | `Integer` | Optional | - | Integer getHostingCollectingCompanyNumber() | setHostingCollectingCompanyNumber(Integer hostingCollectingCompanyNumber) |
| `TransactionId` | `Double` | Optional | - | Double getTransactionId() | setTransactionId(Double transactionId) |
| `FuelOnly` | `Boolean` | Optional | - | Boolean getFuelOnly() | setFuelOnly(Boolean fuelOnly) |

## Example (as JSON)

```json
{
  "AccountName": "Blue Colour Ltd",
  "AccountId": 29484,
  "AccountNumber": "DE26667080",
  "AccountShortName": "Mathew",
  "Additional1": "GBALLEGO0002452",
  "Additional2": "GBALLEGO0002452",
  "Additional3": "GBALLEGO0002452",
  "Additional4": "GBALLEGO0002452",
  "AllowClearing": "Null",
  "AuthorisationCode": 300796,
  "TransactionStatus": "Y",
  "DriverName": "SATTY BHAMRA",
  "CardExpiryPeriod": 2204,
  "CardExpiry": "2022-01-01",
  "CardGroupId": 40000,
  "CardGroupName": "006240 FIRE BRIGHT SOLUTIONS",
  "IssuerCode": 7002,
  "CardPAN": "7002053465789891000",
  "ReleaseCode": 9,
  "CardSequenceNumber": 617,
  "CardType": "GB STD FLT NAT SINGLE R9",
  "ColCoCode": "014",
  "UnitDiscountInvoiceCurrency": -0.0051,
  "ColCoExchangeRate": 0.851858,
  "InvoiceCurrencySymbol": "GBP",
  "CustomerCountry": "United Kingdom",
  "CustomerCurrencyCode": "GBP",
  "CustomerCurrencySymbol": "£",
  "EffectiveDiscountInCustomerCurrency": -0.22,
  "EffectiveUnitDiscountInCustomerCurrency": -0.0051,
  "UnitPriceInInvoiceCurrency": 1.1024,
  "InvoiceTax": 0,
  "InvoiceGrossAmount": 57.25,
  "InvoiceNetAmount": 47.71,
  "VATonNetAmountInCustomerCurrency": 9.54,
  "CustomerRetailPriceUnitGross": 0,
  "CustomerRetailValueTotalGross": 57.52,
  "CustomerRetailValueTotalNet": 47.93,
  "TransactionTypeDescription": 9.59,
  "RebateonNetAmountInTransactionCurrency": -0.22,
  "EffectiveDiscountInTrxCurrency": -0.22,
  "UnitDiscountTransactionCurrency": -0.005,
  "TransactionGrossAmount": 57.25,
  "TransactionNetAmount": 47.71,
  "TransactionTax": 9.54,
  "VATonNetAmount": 9.54,
  "DelcoListPriceUnitNet": 0,
  "DelcoRetailPriceUnitGross": 1.32888,
  "UnitPriceInTransactionCurrency": 1.1074,
  "DelcoRetailPriceUnitNet": 1.1074,
  "DelcoRetailValueTotalGross": 57.52,
  "DelcoRetailValueTotalNet": 47.93,
  "TransactionCurrencySymbol": "$",
  "DiscountType": "Retail",
  "DisputeStatus": false,
  "IsShellSite": false,
  "FleetIdInput": "YG67OUM",
  "IncomingProductCode": 23,
  "PostingDate": "2021-08-02",
  "ProductCode": 30,
  "ProductName": "Unleaded - Medium octane",
  "ProductGroupId": 22,
  "IncomingCurrencyCode": "GBP",
  "IncomingSiteDescription": "Shell Broadway Ring",
  "Location": "Shell Broadway Ring",
  "SiteName": "Shell Broadway Ring",
  "SiteCode": 32,
  "IncomingSiteNumber": 15,
  "InvoiceCurrencyCode": "GBP",
  "InvoiceDate": "2021-08-02",
  "InvoiceNumber": 3201016193,
  "VATApplicable": "Y",
  "PayerName": "Colours Services Ltd",
  "PayerNumber": "GB12121212",
  "ParentCustomerNumber": "GB12121212",
  "PayerGroup": "H312066",
  "PayerGroupName": "12162566 - FUEL CARD SERVICE",
  "CheckDigit": 6,
  "NetInvoiceIndicator": "Y",
  "DelcoCode": 5,
  "NetworkCode": 3,
  "PurchasedInCountry": "United Kingdom",
  "SiteCountry": "United Kingdom",
  "VATCountry": "United Kingdom",
  "DelcoName": "Shell U.K. Oil Products Limited",
  "Network": "Shell",
  "OdometerInput": 0,
  "OriginalSalesItemId": "Null",
  "FleetIDDescription": "YG67OUM",
  "ParentCustomerId": 6494,
  "PINIndicator": "Y, N",
  "ProductGroupName": "Fees",
  "PurchasedInCountryCode": "GB",
  "Quantity": 43.28,
  "RebateRate": 0.0022,
  "ReceiptNumber": 6803,
  "SiteGroupId": 202,
  "SiteGroupName": "CZ 9100 ECONOMY NETWORK",
  "Latitude": 53.83606,
  "Longitude": -1.61854,
  "DelCoExchangeRate": 0.851858,
  "EuroRebateAmount": -0.258259,
  "NetEuroAmount": 56.01,
  "EuroVATAmount": 11.2,
  "ParentCustomerName": "FUEL CARD SERVICES LTD",
  "IsInvoiced": false,
  "TransactionCurrencyCode": "GBP",
  "CreditDebitCode": "D or C",
  "TransactionDate": "2021-08-01",
  "TransactionTime": "01/01/0001 12:16:58",
  "TransactionItemId": "H305908971030",
  "TrnIdentifier": "H305908971030",
  "Type": "SALE",
  "TransactionLine": 1,
  "TransactionType": "Purchase",
  "UTCOffset": "Europe/London",
  "VATCategory": "United Kingdom Standard VAT Rate",
  "VATRate": 0.2,
  "VehicleRegistration": "YG67OUM",
  "IsCancelled": "Y",
  "ColCoGrossAmount": 57.25,
  "ColCoNetAmount": 47.71,
  "ColCoVATAmount": 9.54,
  "OriginalCurrencySymbol": "$",
  "OriginalCurrencyCode": "$",
  "OriginalVATAmount": 0,
  "EmbossText": "PARKLANE PROPERTIES LTD",
  "OriginalExchangeRate": 0,
  "OriginalTransactionItemInvoiceDate": "2022-02-02",
  "FeeTypeId": 1,
  "LineItemDescription": true,
  "FeeRuleDescription": "Simple Fee",
  "Frequency": 1,
  "FeeRuleId": 1,
  "SystemEntryDate": "2021-08-28",
  "SystemEntryTime": "01/01/0001 20:21:08",
  "IsManual": "Y",
  "OriginalTransactionItemId": "Y",
  "OriginalTransactionItemInvoiceNumber": 6750802,
  "OriginalTransactionItemInvoiceId": 234,
  "PayerShortName": "FUEL CARD SERVICES LTD",
  "ReverseCharge": "Y",
  "OriginalGrossAmount": 57.25,
  "OriginalNetAmount": 57.25,
  "UnitOfMeasure": "L",
  "RoadType": "National Road",
  "CustomerCountryIsoCode": "DE",
  "EVOperator": "Shell Recharge",
  "EVSerialId": "GBALLEGO0002452",
  "EVChargePointSerial": "GBALLEGO0002452",
  "EVChargePointConnectorType": 5,
  "EVChargePointConnectorTypeDescription": "DC 50 kW",
  "EVChargeDuration": "PT3205S",
  "EVChargeStartDate": "2021-08-01",
  "EVChargeStartTime": "01/01/0001 20:08:01",
  "EVChargeEndDate": "2022-08-01",
  "EVChargeEndTime": "01/01/0001 20:08:01"
}
```

