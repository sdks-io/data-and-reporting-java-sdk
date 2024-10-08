
# Statement of Account Resp

## Structure

`StatementOfAccountResp`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LastStatementOfAccount` | [`LastStatementOfAccount2`](../../doc/models/last-statement-of-account-2.md) | Optional | - | LastStatementOfAccount2 getLastStatementOfAccount() | setLastStatementOfAccount(LastStatementOfAccount2 lastStatementOfAccount) |
| `MonthlyInvoiceTrend` | [`List<MonthlyInvoiceTrend>`](../../doc/models/monthly-invoice-trend.md) | Optional | - | List<MonthlyInvoiceTrend> getMonthlyInvoiceTrend() | setMonthlyInvoiceTrend(List<MonthlyInvoiceTrend> monthlyInvoiceTrend) |
| `PastStatementOfAccounts` | [`List<PastStatementOfAccounts>`](../../doc/models/past-statement-of-accounts.md) | Optional | - | List<PastStatementOfAccounts> getPastStatementOfAccounts() | setPastStatementOfAccounts(List<PastStatementOfAccounts> pastStatementOfAccounts) |
| `PaymentsSinceLastSOA` | [`List<PaymentsSinceLastSOA>`](../../doc/models/payments-since-last-soa.md) | Optional | - | List<PaymentsSinceLastSOA> getPaymentsSinceLastSOA() | setPaymentsSinceLastSOA(List<PaymentsSinceLastSOA> paymentsSinceLastSOA) |
| `InvoicesSummaries` | [`List<InvoicesSummaries>`](../../doc/models/invoices-summaries.md) | Optional | - | List<InvoicesSummaries> getInvoicesSummaries() | setInvoicesSummaries(List<InvoicesSummaries> invoicesSummaries) |

## Example (as JSON)

```json
{
  "LastStatementOfAccount": {
    "AmountDue": 220.3,
    "AmountNotOverdue": 42.96,
    "AmountOverdue": 58.04,
    "CreditLimit": 162,
    "CreditLimitCurrencyCode": "CreditLimitCurrencyCode4"
  },
  "MonthlyInvoiceTrend": [
    {
      "CurrencyCode": "CurrencyCode8",
      "CurrencySymbol": "CurrencySymbol4",
      "Month": 36,
      "TotalNetAmount": 98.02,
      "TotalVATAmount": 158.14
    }
  ],
  "PastStatementOfAccounts": [
    {
      "AmountDue": 208.8,
      "AmountNotOverdue": 54.46,
      "AmountOverdue": 69.54,
      "AmountOverdueFromUnallocated": 130.1,
      "AmountPaid": 138.64
    }
  ],
  "PaymentsSinceLastSOA": [
    {
      "AccountId": 0,
      "AccountNumber": "AccountNumber4",
      "AccountShortName": "AccountShortName6",
      "SummaryDocumentId": 92,
      "SummaryDocumentNumber": "SummaryDocumentNumber8"
    },
    {
      "AccountId": 0,
      "AccountNumber": "AccountNumber4",
      "AccountShortName": "AccountShortName6",
      "SummaryDocumentId": 92,
      "SummaryDocumentNumber": "SummaryDocumentNumber8"
    },
    {
      "AccountId": 0,
      "AccountNumber": "AccountNumber4",
      "AccountShortName": "AccountShortName6",
      "SummaryDocumentId": 92,
      "SummaryDocumentNumber": "SummaryDocumentNumber8"
    }
  ],
  "InvoicesSummaries": [
    {
      "AmountDue": 132.62,
      "AmountNotOverdue": 125.36,
      "AmountOverdue": 110.28,
      "AmountPaid": 62.46,
      "BillingCurrencyCode": "BillingCurrencyCode0"
    },
    {
      "AmountDue": 132.62,
      "AmountNotOverdue": 125.36,
      "AmountOverdue": 110.28,
      "AmountPaid": 62.46,
      "BillingCurrencyCode": "BillingCurrencyCode0"
    }
  ]
}
```

