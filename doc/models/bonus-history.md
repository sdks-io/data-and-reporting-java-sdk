
# Bonus History

## Structure

`BonusHistory`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PayerId` | `Integer` | Optional | Payer Id | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PayerShortName` | `String` | Optional | Payer short name. | String getPayerShortName() | setPayerShortName(String payerShortName) |
| `PayerFullName` | `String` | Optional | Payer full name. | String getPayerFullName() | setPayerFullName(String payerFullName) |
| `AccountId` | `Integer` | Optional | Account Id | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the selected payer. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountShortName` | `String` | Optional | Account short name. | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `AccountFullName` | `String` | Optional | Account full name. | String getAccountFullName() | setAccountFullName(String accountFullName) |
| `InvoiceAccountId` | `Integer` | Optional | Invoice Account Id | Integer getInvoiceAccountId() | setInvoiceAccountId(Integer invoiceAccountId) |
| `InvoiceAccountNumber` | `String` | Optional | Invoice Account Number of the selected payer. | String getInvoiceAccountNumber() | setInvoiceAccountNumber(String invoiceAccountNumber) |
| `InvoiceAccountShortName` | `String` | Optional | Invoice Account short name. | String getInvoiceAccountShortName() | setInvoiceAccountShortName(String invoiceAccountShortName) |
| `InvoiceAccountFullName` | `String` | Optional | Invoice Account full name. | String getInvoiceAccountFullName() | setInvoiceAccountFullName(String invoiceAccountFullName) |
| `FeeRuleId` | `String` | Optional | Bonus or association bonus configuration identifier | String getFeeRuleId() | setFeeRuleId(String feeRuleId) |
| `FeeRuleDescription` | `String` | Optional | Bonus or association bonus configuration description that is associated to the bonus fee item | String getFeeRuleDescription() | setFeeRuleDescription(String feeRuleDescription) |
| `FromDate` | `String` | Optional | Bonus was calculated from this date.<br>Format: YYYYMMDD | String getFromDate() | setFromDate(String fromDate) |
| `ToDate` | `String` | Optional | Bonus was calculated till this date.<br>Format: YYYYMMDD | String getToDate() | setToDate(String toDate) |
| `BonusPaidTo` | `String` | Optional | Specifies how the bonus was paid back.<br>Format: ID-Description<br>Example:<br>1-Pay to Payer<br>2-Pay to invoice levels before the payer<br>3-Pay to specific customer<br>4-Pay to Association Customer<br>5-Pay to Associated Customers | String getBonusPaidTo() | setBonusPaidTo(String bonusPaidTo) |
| `FeeItemId` | `Integer` | Optional | Bonus fee item identifier. | Integer getFeeItemId() | setFeeItemId(Integer feeItemId) |
| `FeeRuleBasis` | `String` | Optional | Fee Rule Basis of the bonus fee item.<br>Format: ID-Description<br>Example:<br>1-Currency Per Unit<br>2-Percentage of Uplift<br>3-Lump Sum | String getFeeRuleBasis() | setFeeRuleBasis(String feeRuleBasis) |
| `FeeItemCurrencyCode` | `String` | Optional | ISO currency code of the currency in which Bonus is paid.<br>Example: GBP | String getFeeItemCurrencyCode() | setFeeItemCurrencyCode(String feeItemCurrencyCode) |
| `FeeItemCurrencySymbol` | `String` | Optional | Currency symbol of the currency in which Bonus is paid. | String getFeeItemCurrencySymbol() | setFeeItemCurrencySymbol(String feeItemCurrencySymbol) |
| `ProratedVolume` | `Double` | Optional | Prorated volume considered under the account as  configured for the bonus association. | Double getProratedVolume() | setProratedVolume(Double proratedVolume) |
| `TotalVolume` | `Double` | Optional | Total volume considered for calculating the bonus. | Double getTotalVolume() | setTotalVolume(Double totalVolume) |
| `FeeProduct` | `String` | Optional | Product as shown in the invoice for the bonus paid.<br>Format: ID-Description<br>Example: 1562-Bonus diesel Shell Netherlands on agreed site(s) | String getFeeProduct() | setFeeProduct(String feeProduct) |
| `InvoiceGrossAmount` | `Double` | Optional | Gross Amount – Bonus Paid including VAT as shown on the Invoice | Double getInvoiceGrossAmount() | setInvoiceGrossAmount(Double invoiceGrossAmount) |
| `InvoiceNetAmount` | `Double` | Optional | Net Amount – Bonus Paid excluding VAT as shown on the Invoice | Double getInvoiceNetAmount() | setInvoiceNetAmount(Double invoiceNetAmount) |
| `InvoiceVATAmount` | `Double` | Optional | VAT calculated for the bonus paid as shown on the Invoice | Double getInvoiceVATAmount() | setInvoiceVATAmount(Double invoiceVATAmount) |
| `IsFeeCancelled` | `Boolean` | Optional | True/False<br>True if bonus is generated but cancelled. When true, consider this as not paid. | Boolean getIsFeeCancelled() | setIsFeeCancelled(Boolean isFeeCancelled) |
| `FeeItemTierProratedVolume` | `Double` | Optional | Prorated volume in the bonus fee item tier. | Double getFeeItemTierProratedVolume() | setFeeItemTierProratedVolume(Double feeItemTierProratedVolume) |
| `FeeItemTierTotalVolume` | `Double` | Optional | Total volume in the bonus fee item tier. | Double getFeeItemTierTotalVolume() | setFeeItemTierTotalVolume(Double feeItemTierTotalVolume) |
| `TierMinimum` | `Integer` | Optional | Tier minimum value considered for calculation | Integer getTierMinimum() | setTierMinimum(Integer tierMinimum) |
| `TierRate` | `Double` | Optional | Tier rate considered for calculation | Double getTierRate() | setTierRate(Double tierRate) |

## Example (as JSON)

```json
{
  "PayerId": 240,
  "PayerNumber": "PayerNumber0",
  "PayerShortName": "PayerShortName4",
  "PayerFullName": "PayerFullName0",
  "AccountId": 44
}
```

