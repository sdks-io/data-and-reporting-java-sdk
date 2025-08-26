
# Last Statement of Account 2

## Structure

`LastStatementOfAccount2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AmountDue` | `Double` | Optional | Invoiced amount and due for payment. | Double getAmountDue() | setAmountDue(Double amountDue) |
| `AmountNotOverdue` | `Double` | Optional | Invoiced amount and not overdue for payment. | Double getAmountNotOverdue() | setAmountNotOverdue(Double amountNotOverdue) |
| `AmountOverdue` | `Double` | Optional | Invoiced amount and overdue for payment. | Double getAmountOverdue() | setAmountOverdue(Double amountOverdue) |
| `CreditLimit` | `Integer` | Optional | Credit limit. | Integer getCreditLimit() | setCreditLimit(Integer creditLimit) |
| `CreditLimitCurrencyCode` | `String` | Optional | ISO code of the credit limit’s currency.<br>Example: EUR | String getCreditLimitCurrencyCode() | setCreditLimitCurrencyCode(String creditLimitCurrencyCode) |
| `CreditLimitCurrencySymbol` | `String` | Optional | Symbol of the credit limit’s currency.<br>Example: € | String getCreditLimitCurrencySymbol() | setCreditLimitCurrencySymbol(String creditLimitCurrencySymbol) |
| `CreditLimitInCustomerCurrency` | `Double` | Optional | Credit limit in Customer currency.<br>**Note**: For currency details refer the parameters CurrencyCode & CurrencySymbol in the StatementOfAccount response. | Double getCreditLimitInCustomerCurrency() | setCreditLimitInCustomerCurrency(Double creditLimitInCustomerCurrency) |
| `CurrencyCode` | `String` | Optional | ISO code of SOA currency.<br>Example: EUR | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `CurrencySymbol` | `String` | Optional | Symbol of SOA currency.<br>Example: € | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `LastPaymentCurrencyCode` | `String` | Optional | ISO code of Last Payment currency.<br>Example: EUR | String getLastPaymentCurrencyCode() | setLastPaymentCurrencyCode(String lastPaymentCurrencyCode) |
| `LastPaymentCurrencySymbol` | `String` | Optional | Symbol of Last Payment currency.<br>Example: € | String getLastPaymentCurrencySymbol() | setLastPaymentCurrencySymbol(String lastPaymentCurrencySymbol) |
| `LastPaymentDate` | `String` | Optional | Last payment date. Format: yyyyMMdd | String getLastPaymentDate() | setLastPaymentDate(String lastPaymentDate) |
| `LastPaymentValue` | `Double` | Optional | Last payment value. | Double getLastPaymentValue() | setLastPaymentValue(Double lastPaymentValue) |
| `OutstandingBalance` | `Double` | Optional | Current outstanding balance amount. | Double getOutstandingBalance() | setOutstandingBalance(Double outstandingBalance) |
| `PayerId` | `Integer` | Optional | Payment customer id of the customer. | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payment customer number. | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PaymentDueDate` | `String` | Optional | Due date for payment. Format: yyyyMMdd | String getPaymentDueDate() | setPaymentDueDate(String paymentDueDate) |
| `PaymentMethod` | `String` | Optional | Payment method description of the Payer.<br>Example: Id & Description<br>•    Incoming - Direct Debit<br>•    Incoming - Cheque<br>•    Incoming - Direct Debit A<br>•    Incoming - Bank Transfer<br>•    Incoming - Cash | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `PaymentMethodId` | `Integer` | Optional | Payment method Id of the Payer.<br>Example: Id & Description<br>•    Incoming - Direct Debit<br>•    Incoming - Cheque<br>•    Incoming - Direct Debit A<br>•    Incoming - Bank Transfer<br>•    Incoming - Cash | Integer getPaymentMethodId() | setPaymentMethodId(Integer paymentMethodId) |
| `PaymentTerms` | `String` | Optional | Payment terms description of the Payer.<br>Example: Id & Description<br>•    14 days after Invoice<br>•    15 days after Invoice<br>•    21 days after Invoice<br>•    30 days after Invoice<br>•    45 days after Invoice<br>•    0 days after invoice<br>•    days after invoice<br>•    days after invoice<br>•    7 days after invoice<br>•    10th of the following month | String getPaymentTerms() | setPaymentTerms(String paymentTerms) |
| `PaymentTermsId` | `Integer` | Optional | Payment terms Id of the Payer.<br>Example: Id & Description<br>•    14 days after Invoice<br>•    15 days after Invoice<br>•    21 days after Invoice<br>•    30 days after Invoice<br>•    45 days after Invoice<br>•    0 days after invoice<br>•    days after invoice<br>•    days after invoice<br>•    7 days after invoice<br>•    10th of the following month | Integer getPaymentTermsId() | setPaymentTermsId(Integer paymentTermsId) |
| `SoAReferenceNumber` | `String` | Optional | Statement of account reference number | String getSoAReferenceNumber() | setSoAReferenceNumber(String soAReferenceNumber) |
| `StatementDate` | `String` | Optional | Date on which the SOA was generated.<br>Format: yyyyMMdd | String getStatementDate() | setStatementDate(String statementDate) |
| `StatementOfAccountId` | `Integer` | Optional | Statement of account identifier,<br>Example: 1 | Integer getStatementOfAccountId() | setStatementOfAccountId(Integer statementOfAccountId) |
| `TotalBillingDocuments` | `Integer` | Optional | Total number of billing documents for this Statement of Account | Integer getTotalBillingDocuments() | setTotalBillingDocuments(Integer totalBillingDocuments) |
| `TotalSummaryBillingDocuments` | `Integer` | Optional | Total number of summary billing documents for this Statement of Account | Integer getTotalSummaryBillingDocuments() | setTotalSummaryBillingDocuments(Integer totalSummaryBillingDocuments) |
| `UnallocatedPayment` | `Integer` | Optional | Unallocated payment.<br>When negative, indicates overdue amount. | Integer getUnallocatedPayment() | setUnallocatedPayment(Integer unallocatedPayment) |

## Example (as JSON)

```json
{
  "AmountDue": 213.62,
  "AmountNotOverdue": 49.64,
  "AmountOverdue": 64.72,
  "CreditLimit": 6,
  "CreditLimitCurrencyCode": "CreditLimitCurrencyCode6"
}
```

