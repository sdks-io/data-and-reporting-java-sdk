
# Invoice Dates Data

## Structure

`InvoiceDatesData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `InvoiceNumbers` | `List<String>` | Optional | List of Invoice numbers. | List<String> getInvoiceNumbers() | setInvoiceNumbers(List<String> invoiceNumbers) |
| `InvoiceDates` | `List<String>` | Optional | List of Invoicing dates.<br>Format: yyyyMMdd | List<String> getInvoiceDates() | setInvoiceDates(List<String> invoiceDates) |

## Example (as JSON)

```json
{
  "InvoiceNumbers": [
    "InvoiceNumbers5",
    "InvoiceNumbers6",
    "InvoiceNumbers7"
  ],
  "InvoiceDates": [
    "InvoiceDates4",
    "InvoiceDates3",
    "InvoiceDates2"
  ]
}
```

