
# Search Documents Invoice

## Structure

`SearchDocumentsInvoice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DocumentReference` | `Integer` | Optional | Unique Invoice Reference id of the invoice for downloading the zip file containing PDF and proofing elements.<br>Example: 123456 | Integer getDocumentReference() | setDocumentReference(Integer documentReference) |
| `InvoiceNumber` | `String` | Optional | Payment customer number.<br>Example: GB000000123 | String getInvoiceNumber() | setInvoiceNumber(String invoiceNumber) |
| `PayerName` | `String` | Optional | Customer payer name | String getPayerName() | setPayerName(String payerName) |
| `AccountNumber` | `String` | Optional | Account Number<br>Example: GB99215176 | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountName` | `String` | Optional | Invoice account name | String getAccountName() | setAccountName(String accountName) |
| `DocumentType` | `String` | Optional | Document type<br>String containing one of the following values:<br>•	NAT (National)<br>•	INT (International)<br>•	SOA (Statement of Account) | String getDocumentType() | setDocumentType(String documentType) |
| `GrossAmount` | `Double` | Optional | Included tax amount in the invoice | Double getGrossAmount() | setGrossAmount(Double grossAmount) |
| `NetAmount` | `Double` | Optional | - | Double getNetAmount() | setNetAmount(Double netAmount) |
| `TaxAmount` | `Double` | Optional | - | Double getTaxAmount() | setTaxAmount(Double taxAmount) |
| `CurrencyCode` | `String` | Optional | - | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `InvoiceStatus` | `String` | Optional | - | String getInvoiceStatus() | setInvoiceStatus(String invoiceStatus) |
| `InvoiceDate` | `String` | Optional | - | String getInvoiceDate() | setInvoiceDate(String invoiceDate) |
| `DueDate` | `String` | Optional | - | String getDueDate() | setDueDate(String dueDate) |
| `VATCountryISOCode` | `String` | Optional | - | String getVATCountryISOCode() | setVATCountryISOCode(String vATCountryISOCode) |

## Example (as JSON)

```json
{
  "DocumentReference": 10,
  "InvoiceNumber": "InvoiceNumber0",
  "PayerName": "PayerName0",
  "AccountNumber": "AccountNumber2",
  "AccountName": "AccountName8"
}
```

