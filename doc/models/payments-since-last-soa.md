
# Payments Since Last SOA

List of payments made by the customer after the latest Statement of Account.
Note: All the payments made by the customer will be returned when there is no Statement of Account available for customer.

## Structure

`PaymentsSinceLastSOA`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account Identifier for which payment is made.<br>Example: 12345 | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account number for which payment is made.<br>Example: GB000000123 | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountShortName` | `String` | Optional | Account Short Name<br>Example: GB Earth Movers-SN | String getAccountShortName() | setAccountShortName(String accountShortName) |
| `SummaryDocumentId` | `Integer` | Optional | Summary billing document reference id.<br>Example: 2 | Integer getSummaryDocumentId() | setSummaryDocumentId(Integer summaryDocumentId) |
| `SummaryDocumentNumber` | `String` | Optional | Summary billing document reference number. | String getSummaryDocumentNumber() | setSummaryDocumentNumber(String summaryDocumentNumber) |
| `SummaryDocumentDate` | `String` | Optional | Summary billing document date.<br>Format: YYYYMMDD | String getSummaryDocumentDate() | setSummaryDocumentDate(String summaryDocumentDate) |
| `SummaryDocumentPaymentDueDate` | `String` | Optional | Payment due date of the Summary billing document.<br>Format: YYYYMMDD | String getSummaryDocumentPaymentDueDate() | setSummaryDocumentPaymentDueDate(String summaryDocumentPaymentDueDate) |
| `SummaryDocumentTotalValue` | `Double` | Optional | Total value in the Summary billing document. | Double getSummaryDocumentTotalValue() | setSummaryDocumentTotalValue(Double summaryDocumentTotalValue) |
| `SummaryDocumentTotalVAT` | `Double` | Optional | Total VAT in the Summary billing document. | Double getSummaryDocumentTotalVAT() | setSummaryDocumentTotalVAT(Double summaryDocumentTotalVAT) |
| `SummaryDocumentDDAmount` | `Double` | Optional | Total DD amount in the Summary billing document. | Double getSummaryDocumentDDAmount() | setSummaryDocumentDDAmount(Double summaryDocumentDDAmount) |
| `PaymentDate` | `String` | Optional | Date of payment.<br>Format: YYYYMMDD | String getPaymentDate() | setPaymentDate(String paymentDate) |
| `PaymentReference` | `String` | Optional | Reference text of the payment. | String getPaymentReference() | setPaymentReference(String paymentReference) |
| `PaymentCurrencyCode` | `String` | Optional | ISO code of payment currency.<br>Example: EUR | String getPaymentCurrencyCode() | setPaymentCurrencyCode(String paymentCurrencyCode) |
| `PaymentCurrencySymbol` | `String` | Optional | Symbol of payment currency.<br>Example: € | String getPaymentCurrencySymbol() | setPaymentCurrencySymbol(String paymentCurrencySymbol) |
| `AmountPaid` | `Double` | Optional | Amount paid. | Double getAmountPaid() | setAmountPaid(Double amountPaid) |
| `Balance` | `Double` | Optional | Balance amount to be settled for the Summary document. | Double getBalance() | setBalance(Double balance) |
| `TruePayment` | `String` | Optional | True Payment. | String getTruePayment() | setTruePayment(String truePayment) |
| `PrepaidBalance` | `Double` | Optional | Balance in the pre-paid amount. | Double getPrepaidBalance() | setPrepaidBalance(Double prepaidBalance) |
| `LocalCurrencyCode` | `String` | Optional | Currency ISO code of the local country. It is derived based on CountryCode from microservice configuration. This field is expected to have different value than the previously mentioned field CurrencyCode, only in the case of serviced OUs.<br>Example: EUR | String getLocalCurrencyCode() | setLocalCurrencyCode(String localCurrencyCode) |
| `LocalCurrencySymbol` | `String` | Optional | Currency Symbol of the local country. It is derived based on CountryCode from microservice configuration. This field is expected to have different value than the previously mentioned field CurrencySymbol, only in the case of serviced OUs.<br>Example: € | String getLocalCurrencySymbol() | setLocalCurrencySymbol(String localCurrencySymbol) |
| `LocalCurrencyExchangeRate` | `String` | Optional | Exchange rate from Payment currency to local currency. | String getLocalCurrencyExchangeRate() | setLocalCurrencyExchangeRate(String localCurrencyExchangeRate) |

## Example (as JSON)

```json
{
  "AccountId": 0,
  "AccountNumber": "AccountNumber4",
  "AccountShortName": "AccountShortName6",
  "SummaryDocumentId": 92,
  "SummaryDocumentNumber": "SummaryDocumentNumber8"
}
```

