
# Past Statement of Accounts

## Structure

`PastStatementOfAccounts`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AmountDue` | `Double` | Optional | Invoiced amount under this statement of account and due for payment. | Double getAmountDue() | setAmountDue(Double amountDue) |
| `AmountNotOverdue` | `Double` | Optional | Total Invoiced amount until this SOA and not overdue for payment. | Double getAmountNotOverdue() | setAmountNotOverdue(Double amountNotOverdue) |
| `AmountOverdue` | `Double` | Optional | Overdue amount from the previously generated statement of accounts. | Double getAmountOverdue() | setAmountOverdue(Double amountOverdue) |
| `AmountOverdueFromUnallocated` | `Double` | Optional | Overdue amount calculated from unallocated payment. | Double getAmountOverdueFromUnallocated() | setAmountOverdueFromUnallocated(Double amountOverdueFromUnallocated) |
| `AmountPaid` | `Double` | Optional | Amount settled for this Statement. | Double getAmountPaid() | setAmountPaid(Double amountPaid) |
| `BalanceOnThisStatement` | `Double` | Optional | Balance amount to be settled on this SOA. | Double getBalanceOnThisStatement() | setBalanceOnThisStatement(Double balanceOnThisStatement) |
| `BillingCurrencyCode` | `String` | Optional | Billing currency ISO code.<br>Example: EUR | String getBillingCurrencyCode() | setBillingCurrencyCode(String billingCurrencyCode) |
| `BillingCurrencySymbol` | `String` | Optional | Billing currency symbol.<br>Example: € | String getBillingCurrencySymbol() | setBillingCurrencySymbol(String billingCurrencySymbol) |
| `CreditLimit` | `Double` | Optional | Credit limit. | Double getCreditLimit() | setCreditLimit(Double creditLimit) |
| `CreditLimitCurrencyCode` | `String` | Optional | ISO code of the credit limit’s currency.<br>Example: EUR | String getCreditLimitCurrencyCode() | setCreditLimitCurrencyCode(String creditLimitCurrencyCode) |
| `CreditLimitCurrencySymbol` | `String` | Optional | Symbol of the credit limit’s currency.<br>Example: € | String getCreditLimitCurrencySymbol() | setCreditLimitCurrencySymbol(String creditLimitCurrencySymbol) |
| `CreditLimitInCustomerCurrency` | `Double` | Optional | Credit limit in Customer currency.<br>Note: For currency details refer the parameters CurrencyCode & CurrencySymbol in the SOADetail response. | Double getCreditLimitInCustomerCurrency() | setCreditLimitInCustomerCurrency(Double creditLimitInCustomerCurrency) |
| `CurrencyCode` | `String` | Optional | ISO code of SOA currency.<br>Example: EUR | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `CurrencySymbol` | `String` | Optional | Symbol of SOA currency.<br>Example: € | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `FullyPaid` | `Boolean` | Optional | True If all summary billing documents under this SOA are fully paid (i.e., the fully paid flag is set to true for all documents or the amount allocated is greater than or equal to the amount due under this SOA. | Boolean getFullyPaid() | setFullyPaid(Boolean fullyPaid) |
| `LastPaymentCurrencyCode` | `String` | Optional | ISO code of last payment currency.<br>Example: EUR | String getLastPaymentCurrencyCode() | setLastPaymentCurrencyCode(String lastPaymentCurrencyCode) |
| `LastPaymentCurrencySymbol` | `String` | Optional | Symbol of last payment currency.<br>Example: € | String getLastPaymentCurrencySymbol() | setLastPaymentCurrencySymbol(String lastPaymentCurrencySymbol) |
| `LastPaymentDate` | `String` | Optional | Last payment date. Format: yyyyMMdd | String getLastPaymentDate() | setLastPaymentDate(String lastPaymentDate) |
| `LastPaymentValue` | `Double` | Optional | Last payment value. | Double getLastPaymentValue() | setLastPaymentValue(Double lastPaymentValue) |
| `OutstandingBalance` | `Double` | Optional | Total outstanding balance at the time of this SOA generation. | Double getOutstandingBalance() | setOutstandingBalance(Double outstandingBalance) |
| `PayerId` | `Integer` | Optional | Payment customer id of the customer. | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payment customer number. | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `PaymentDueDate` | `String` | Optional | Due date for payment. Format: yyyyMMdd | String getPaymentDueDate() | setPaymentDueDate(String paymentDueDate) |
| `SoAReferenceNumber` | `String` | Optional | Statement of account reference number. | String getSoAReferenceNumber() | setSoAReferenceNumber(String soAReferenceNumber) |
| `StatementDate` | `String` | Optional | Date on which the SOA was generated.<br>Format: yyyyMMdd | String getStatementDate() | setStatementDate(String statementDate) |
| `StatementOfAccountId` | `Integer` | Optional | Statement of account identifier, | Integer getStatementOfAccountId() | setStatementOfAccountId(Integer statementOfAccountId) |
| `TotalBillingDocuments` | `Integer` | Optional | Total number of billing documents generated under this Statement of Account. | Integer getTotalBillingDocuments() | setTotalBillingDocuments(Integer totalBillingDocuments) |
| `TotalNetAmountBillingCurrency` | `Double` | Optional | Total NET amount from all billing documents in this SOA. | Double getTotalNetAmountBillingCurrency() | setTotalNetAmountBillingCurrency(Double totalNetAmountBillingCurrency) |
| `TotalSummaryBillingDocuments` | `Double` | Optional | Total number of summary billing documents for this Statement of Account | Double getTotalSummaryBillingDocuments() | setTotalSummaryBillingDocuments(Double totalSummaryBillingDocuments) |
| `TotalVATAmountBillingCurrency` | `Double` | Optional | Total VAT amount from all billing documents in this SOA. | Double getTotalVATAmountBillingCurrency() | setTotalVATAmountBillingCurrency(Double totalVATAmountBillingCurrency) |
| `UnallocatedPayment` | `Double` | Optional | Amount paid but not allocated to any invoices at the time of this SOA generation. | Double getUnallocatedPayment() | setUnallocatedPayment(Double unallocatedPayment) |
| `LocalCurrencyCode` | `String` | Optional | Currency ISO code of the local country. It is derived based on CountryCode from microservice configuration. This field is expected to have different value than the previously mentioned field CurrencyCode, only in the case of serviced OUs.<br>Example: EUR | String getLocalCurrencyCode() | setLocalCurrencyCode(String localCurrencyCode) |
| `LocalCurrencySymbol` | `String` | Optional | Currency Symbol of the local country. It is derived based on CountryCode from microservice configuration. This field is expected to have different value than the previously mentioned field CurrencySymbol, only in the case of serviced OUs.<br>Example: € | String getLocalCurrencySymbol() | setLocalCurrencySymbol(String localCurrencySymbol) |
| `LocalCurrencyExchangeRate` | `Double` | Optional | Exchange rate from Billing currency to local currency.<br>Example: 1.2 | Double getLocalCurrencyExchangeRate() | setLocalCurrencyExchangeRate(Double localCurrencyExchangeRate) |

## Example (as JSON)

```json
{
  "AmountDue": 208.8,
  "AmountNotOverdue": 54.46,
  "AmountOverdue": 69.54,
  "AmountOverdueFromUnallocated": 130.1,
  "AmountPaid": 138.64
}
```

