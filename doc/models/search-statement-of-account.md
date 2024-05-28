
# Search Statement of Account

## Structure

`SearchStatementOfAccount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatementOfAccountId` | `Integer` | Optional | Statement of account identifier | Integer getStatementOfAccountId() | setStatementOfAccountId(Integer statementOfAccountId) |
| `SoAReferenceNumber` | `String` | Optional | Statement of account reference | String getSoAReferenceNumber() | setSoAReferenceNumber(String soAReferenceNumber) |
| `StatementDate` | `String` | Optional | Date on which the SOA was generated.<br>Format: yyyyMMdd | String getStatementDate() | setStatementDate(String statementDate) |
| `PayerId` | `Integer` | Optional | Payment customer id of the customer. | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payment customer number. | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AmountDue` | `Double` | Optional | Invoiced amount and due for payment | Double getAmountDue() | setAmountDue(Double amountDue) |
| `AmountOverdue` | `Double` | Optional | Invoiced amount and overdue for payment. | Double getAmountOverdue() | setAmountOverdue(Double amountOverdue) |
| `CurrencyCode` | `String` | Optional | ISO code of SOA currency. | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `CurrencySymbol` | `String` | Optional | Symbol of SOA currency.<br>Example: € | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `DueDate` | `String` | Optional | Due date for payment. Format: yyyyMMdd<br>Note:<br>•	Clients to convert this to appropriate DateTime type.<br>•	SoA due date is considered as the latest due date of the invoices within the SoA | String getDueDate() | setDueDate(String dueDate) |
| `InvoicedOnBehalfOf` | `String` | Optional | ISO code of the country i.e., UK, DE, MY, etc.<br>This is the value of the first invoice within the SoA. It may not be same for all the invoices within the SoA. | String getInvoicedOnBehalfOf() | setInvoicedOnBehalfOf(String invoicedOnBehalfOf) |
| `Status` | `String` | Optional | Status of the document. Valid values –<br><br>1. Paid – Fully paid all Invoices with in the SOA.<br>2. Overdue – At least one invoice payment due date is less than current date with in the SOA.<br>3. Due – At least one invoice is due for payment and is within the due date. There is no invoice overdue for payment. | String getStatus() | setStatus(String status) |
| `GrossAmountCustomerCurrency` | `Double` | Optional | Total gross amount in customer currency. | Double getGrossAmountCustomerCurrency() | setGrossAmountCustomerCurrency(Double grossAmountCustomerCurrency) |
| `DocumentReferenceNumber` | `String` | Optional | Document reference number fetched | String getDocumentReferenceNumber() | setDocumentReferenceNumber(String documentReferenceNumber) |

## Example (as JSON)

```json
{
  "StatementOfAccountId": 120,
  "SoAReferenceNumber": "SoAReferenceNumber4",
  "StatementDate": "StatementDate2",
  "PayerId": 18,
  "PayerNumber": "PayerNumber6"
}
```

