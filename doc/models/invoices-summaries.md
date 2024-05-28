
# Invoices Summaries

## Structure

`InvoicesSummaries`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AmountDue` | `Double` | Optional | Amount due from last summary document date. | Double getAmountDue() | setAmountDue(Double amountDue) |
| `AmountNotOverdue` | `Double` | Optional | Amount that are due from past summary documents. | Double getAmountNotOverdue() | setAmountNotOverdue(Double amountNotOverdue) |
| `AmountOverdue` | `Double` | Optional | Amount that are overdue from past summary documents. | Double getAmountOverdue() | setAmountOverdue(Double amountOverdue) |
| `AmountPaid` | `Double` | Optional | Total amount paid in billing currency. | Double getAmountPaid() | setAmountPaid(Double amountPaid) |
| `BillingCurrencyCode` | `String` | Optional | Billing currency ISO code. | String getBillingCurrencyCode() | setBillingCurrencyCode(String billingCurrencyCode) |
| `BillingCurrencySymbol` | `String` | Optional | Billing currency symbol.<br>Example: € | String getBillingCurrencySymbol() | setBillingCurrencySymbol(String billingCurrencySymbol) |
| `OutstandingBalance` | `Double` | Optional | Current outstanding balance amount | Double getOutstandingBalance() | setOutstandingBalance(Double outstandingBalance) |
| `PaymentDueDate` | `String` | Optional | Payment due date.<br>Format: YYYYMMDD | String getPaymentDueDate() | setPaymentDueDate(String paymentDueDate) |
| `SummaryDocumentDate` | `String` | Optional | Summary document date.<br>Format: YYYYMMDD | String getSummaryDocumentDate() | setSummaryDocumentDate(String summaryDocumentDate) |
| `TotalBillingDocuments` | `Integer` | Optional | Total number of invoices generated on this date. | Integer getTotalBillingDocuments() | setTotalBillingDocuments(Integer totalBillingDocuments) |
| `TotalGrossAmountBillingCurrency` | `Double` | Optional | Total gross amount in billing currency. | Double getTotalGrossAmountBillingCurrency() | setTotalGrossAmountBillingCurrency(Double totalGrossAmountBillingCurrency) |
| `TotalNetAmountBillingCurrency` | `Double` | Optional | Total net amount in billing currency. | Double getTotalNetAmountBillingCurrency() | setTotalNetAmountBillingCurrency(Double totalNetAmountBillingCurrency) |
| `TotalSummaryDocuments` | `Integer` | Optional | Total number of summary documents generated on this date. | Integer getTotalSummaryDocuments() | setTotalSummaryDocuments(Integer totalSummaryDocuments) |
| `TotalVATAmountBillingCurrency` | `Double` | Optional | Total VAT amount in billing currency. | Double getTotalVATAmountBillingCurrency() | setTotalVATAmountBillingCurrency(Double totalVATAmountBillingCurrency) |

## Example (as JSON)

```json
{
  "AmountDue": 132.62,
  "AmountNotOverdue": 125.36,
  "AmountOverdue": 110.28,
  "AmountPaid": 62.46,
  "BillingCurrencyCode": "BillingCurrencyCode0"
}
```

