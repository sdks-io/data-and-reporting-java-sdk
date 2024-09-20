
# Fee Item

## Structure

`FeeItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FeeItemId` | `Integer` | Optional | Fee Item unique identifier in the H3 Cards Platform | Integer getFeeItemId() | setFeeItemId(Integer feeItemId) |
| `AccountId` | `Integer` | Optional | Account Id | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountShortName` | `String` | Optional | Account short Number | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `InvoiceAccountId` | `Integer` | Optional | Invoice Account Id | Integer getInvoiceAccountId() | setInvoiceAccountId(Integer invoiceAccountId) |
| `InvoiceAccountNumber` | `String` | Optional | Invoice Account Number | String getInvoiceAccountNumber() | setInvoiceAccountNumber(String invoiceAccountNumber) |
| `InvoiceAccountShortName` | `String` | Optional | Invoice Account short Name | String getInvoiceAccountShortName() | setInvoiceAccountShortName(String invoiceAccountShortName) |
| `PayerId` | `Integer` | Optional | Payer Id | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PayerShortName` | `String` | Optional | Payer short Name | String getPayerShortName() | setPayerShortName(String payerShortName) |
| `CardId` | `Integer` | Optional | Unique Card Id | Integer getCardId() | setCardId(Integer cardId) |
| `PAN` | `String` | Optional | Card PAN | String getPAN() | setPAN(String pAN) |
| `CardGroupId` | `Integer` | Optional | Card Group Id | Integer getCardGroupId() | setCardGroupId(Integer cardGroupId) |
| `CardGroupName` | `String` | Optional | Card Group Name | String getCardGroupName() | setCardGroupName(String cardGroupName) |
| `FeeTypeId` | `Integer` | Optional | Fee type identifier. | Integer getFeeTypeId() | setFeeTypeId(Integer feeTypeId) |
| `FeeType` | `String` | Optional | Fee type description | String getFeeType() | setFeeType(String feeType) |
| `FeeTypeGroup` | `String` | Optional | Fee type group in under which the Fee item is generated.<br>Example:<br>Account<br>Card<br>Others | String getFeeTypeGroup() | setFeeTypeGroup(String feeTypeGroup) |
| `FeeRuleId` | `Integer` | Optional | Fee rule identifier | Integer getFeeRuleId() | setFeeRuleId(Integer feeRuleId) |
| `FeeRuleDescription` | `String` | Optional | Fee rule description | String getFeeRuleDescription() | setFeeRuleDescription(String feeRuleDescription) |
| `FeeRuleTiers` | [`List<FeesFeeRuleTiers>`](../../doc/models/fees-fee-rule-tiers.md) | Optional | - | List<FeesFeeRuleTiers> getFeeRuleTiers() | setFeeRuleTiers(List<FeesFeeRuleTiers> feeRuleTiers) |
| `FeeItemDate` | `String` | Optional | Local Fee Item Date of when the transaction took place<br>Format: yyyyMMdd | String getFeeItemDate() | setFeeItemDate(String feeItemDate) |
| `FeeItemTime` | `String` | Optional | Local Fee Item Time of where the transaction took place<br>Format: HH:mm:ss (24 hours format) | String getFeeItemTime() | setFeeItemTime(String feeItemTime) |
| `IsManual` | `Boolean` | Optional | True/False.<br>Is manual | Boolean getIsManual() | setIsManual(Boolean isManual) |
| `IsCancelled` | `Boolean` | Optional | True/False.<br>Is cancelled | Boolean getIsCancelled() | setIsCancelled(Boolean isCancelled) |
| `CustomerCurrencyCode` | `String` | Optional | ISO currency code<br>Example: GBP | String getCustomerCurrencyCode() | setCustomerCurrencyCode(String customerCurrencyCode) |
| `CustomerCurrencySymbol` | `String` | Optional | Currency symbol of the Currency Code<br>Example: £, $ | String getCustomerCurrencySymbol() | setCustomerCurrencySymbol(String customerCurrencySymbol) |
| `ProductId` | `Integer` | Optional | Product Id<br>Example: Sample list of product ids and description.<br>100 Service fee<br>102 Invoice production fee<br>103 Account fee<br>104 Transaction fee<br>105 Card membership fee | Integer getProductId() | setProductId(Integer productId) |
| `ProductCode` | `String` | Optional | Product Code – Global as per GFN configuration<br>Example:<br>2 Service fee<br>4 Invoice production fee<br>5 Account fee<br>6 Transaction fee<br>7 Card membership fee | String getProductCode() | setProductCode(String productCode) |
| `ProductName` | `String` | Optional | Product Name<br>Example: Sample list of product ids and description.<br>Service fee<br>Invoice production fee | String getProductName() | setProductName(String productName) |
| `ProductGroupId` | `Integer` | Optional | Product Group Id<br>Example: Sample list<br>22    Card related fees<br>23    Monetary Adjustment | Integer getProductGroupId() | setProductGroupId(Integer productGroupId) |
| `ProductGroupName` | `String` | Optional | Product Group Name<br>Example: Sample list<br>22    Card related fees<br>23    Monetary Adjustment | String getProductGroupName() | setProductGroupName(String productGroupName) |
| `LineItemDescription` | `String` | Optional | Line Item Description generally the quantity as printed on Invoice or the manually keyed in description for manual fees | String getLineItemDescription() | setLineItemDescription(String lineItemDescription) |
| `Quantity` | `Integer` | Optional | Quantity | Integer getQuantity() | setQuantity(Integer quantity) |
| `IsInvoiced` | `Boolean` | Optional | True/False.<br>Is fee item invoiced | Boolean getIsInvoiced() | setIsInvoiced(Boolean isInvoiced) |
| `VATCountryCode` | `String` | Optional | VAT country ISO code | String getVATCountryCode() | setVATCountryCode(String vATCountryCode) |
| `VATCountryName` | `String` | Optional | VAT country name | String getVATCountryName() | setVATCountryName(String vATCountryName) |
| `VATPercentage` | `Double` | Optional | VAT percentage | Double getVATPercentage() | setVATPercentage(Double vATPercentage) |
| `VATCategoryID` | `Integer` | Optional | VAT Category identifier | Integer getVATCategoryID() | setVATCategoryID(Integer vATCategoryID) |
| `VATCategoryDescription` | `String` | Optional | VAT Category description | String getVATCategoryDescription() | setVATCategoryDescription(String vATCategoryDescription) |
| `LegislativeRegionId` | `Integer` | Optional | Legislative region id | Integer getLegislativeRegionId() | setLegislativeRegionId(Integer legislativeRegionId) |
| `LegislativeRegionName` | `String` | Optional | Legislative region name | String getLegislativeRegionName() | setLegislativeRegionName(String legislativeRegionName) |
| `SystemEntryDate` | `String` | Optional | System entry date | String getSystemEntryDate() | setSystemEntryDate(String systemEntryDate) |
| `SystemEntryTime` | `String` | Optional | System entry time | String getSystemEntryTime() | setSystemEntryTime(String systemEntryTime) |
| `ColCoNetAmount` | `Double` | Optional | ColCo net amount | Double getColCoNetAmount() | setColCoNetAmount(Double colCoNetAmount) |
| `ColCoVATAmount` | `Double` | Optional | ColCoVAT amount | Double getColCoVATAmount() | setColCoVATAmount(Double colCoVATAmount) |
| `ColCoGrossAmount` | `Double` | Optional | ColCo gross amount | Double getColCoGrossAmount() | setColCoGrossAmount(Double colCoGrossAmount) |
| `InterimInvoiceId` | `Integer` | Optional | Interim invoice id | Integer getInterimInvoiceId() | setInterimInvoiceId(Integer interimInvoiceId) |
| `InterimInvoiceNumber` | `String` | Optional | Interim invoice number | String getInterimInvoiceNumber() | setInterimInvoiceNumber(String interimInvoiceNumber) |
| `InvoiceId` | `Integer` | Optional | Invoice id | Integer getInvoiceId() | setInvoiceId(Integer invoiceId) |
| `InvoiceNumber` | `String` | Optional | Invoice number | String getInvoiceNumber() | setInvoiceNumber(String invoiceNumber) |
| `InvoiceDate` | `String` | Optional | Invoice date<br>Format: yyyyMMdd | String getInvoiceDate() | setInvoiceDate(String invoiceDate) |
| `CustomerExchangeRate` | `Double` | Optional | Customer exchange rate | Double getCustomerExchangeRate() | setCustomerExchangeRate(Double customerExchangeRate) |
| `InvoiceNetAmount` | `Double` | Optional | Invoice net amount | Double getInvoiceNetAmount() | setInvoiceNetAmount(Double invoiceNetAmount) |
| `InvoiceGrossAmount` | `Double` | Optional | Invoice gross amount | Double getInvoiceGrossAmount() | setInvoiceGrossAmount(Double invoiceGrossAmount) |
| `InvoiceVATAmount` | `Double` | Optional | Invoice VAT amount | Double getInvoiceVATAmount() | setInvoiceVATAmount(Double invoiceVATAmount) |
| `ReverseCharge` | `Boolean` | Optional | True/False.<br>Reverse charge. | Boolean getReverseCharge() | setReverseCharge(Boolean reverseCharge) |
| `OriginalFeeItemId` | `Integer` | Optional | Original Fee Item id. | Integer getOriginalFeeItemId() | setOriginalFeeItemId(Integer originalFeeItemId) |
| `OriginalCurrencyCode` | `String` | Optional | Original FeeItem Currency ISO code. | String getOriginalCurrencyCode() | setOriginalCurrencyCode(String originalCurrencyCode) |
| `OriginalCurrencySymbol` | `String` | Optional | Original FeeItem currency symbol | String getOriginalCurrencySymbol() | setOriginalCurrencySymbol(String originalCurrencySymbol) |
| `OriginalUnitPrice` | `Double` | Optional | Original FeeItem unit price | Double getOriginalUnitPrice() | setOriginalUnitPrice(Double originalUnitPrice) |
| `OriginalNetAmount` | `Double` | Optional | Original FeeItem net amount | Double getOriginalNetAmount() | setOriginalNetAmount(Double originalNetAmount) |
| `OriginalVATAmount` | `Double` | Optional | Original FeeItem VAT amount | Double getOriginalVATAmount() | setOriginalVATAmount(Double originalVATAmount) |
| `OriginalGrossAmount` | `Double` | Optional | Original FeeItem gross amount | Double getOriginalGrossAmount() | setOriginalGrossAmount(Double originalGrossAmount) |
| `OriginalExchangeRate` | `Double` | Optional | Original FeeItem exchange rate | Double getOriginalExchangeRate() | setOriginalExchangeRate(Double originalExchangeRate) |
| `OriginalLegislativeRegionId` | `Integer` | Optional | Original legislative region id | Integer getOriginalLegislativeRegionId() | setOriginalLegislativeRegionId(Integer originalLegislativeRegionId) |
| `OriginalLegislativeRegionName` | `String` | Optional | Original legislative region name | String getOriginalLegislativeRegionName() | setOriginalLegislativeRegionName(String originalLegislativeRegionName) |
| `Frequency` | `String` | Optional | Fee frequency derived from Fee rules if applicable<br>Returns ID-Description in one field<br>Example:<br>1- Daily (all days)<br>2-Daily (only working days)<br>3-Weekly – Monday<br>4-Weekly - Tuesday | String getFrequency() | setFrequency(String frequency) |
| `FeeItemCardLevelBreakup` | `String` | Optional | Fee breakup at card level for Fee Items where applicable. | String getFeeItemCardLevelBreakup() | setFeeItemCardLevelBreakup(String feeItemCardLevelBreakup) |
| `OriginalFeeItemInvoiceId` | `Integer` | Optional | Invoice Id/ Billing Document Id of the original fee item (when not null).<br>Applicable only for fee items that are refund to an original fee item that is already invoiced. | Integer getOriginalFeeItemInvoiceId() | setOriginalFeeItemInvoiceId(Integer originalFeeItemInvoiceId) |
| `OriginalFeeItemInvoiceNumber` | `String` | Optional | Invoice Number of the original fee item (when not null).<br>Applicable only for fee items that are refund to an original fee item that is already invoiced. | String getOriginalFeeItemInvoiceNumber() | setOriginalFeeItemInvoiceNumber(String originalFeeItemInvoiceNumber) |
| `OriginalFeeItemInvoiceDate` | `String` | Optional | Invoice Date of the original fee item (when not null).<br>Applicable only for fee items that are refund to an original fee item that is already invoiced.<br>Format: yyyyMMdd | String getOriginalFeeItemInvoiceDate() | setOriginalFeeItemInvoiceDate(String originalFeeItemInvoiceDate) |
| `DriverName` | `String` | Optional | Driver name embossed on the Card | String getDriverName() | setDriverName(String driverName) |
| `EmbossText` | `String` | Optional | Text embossed on the Card | String getEmbossText() | setEmbossText(String embossText) |
| `VRN` | `String` | Optional | Reg. Number embossed on the Card | String getVRN() | setVRN(String vRN) |

## Example (as JSON)

```json
{
  "FeeItemId": 156,
  "AccountId": 244,
  "AccountNumber": "AccountNumber6",
  "AccountShortName": "AccountShortName8",
  "InvoiceAccountId": 204
}
```

