
# Invoice Summary Request

## Structure

`InvoiceSummaryRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`InvoiceSummaryRequestFilters`](../../doc/models/invoice-summary-request-filters.md) | Optional | - | InvoiceSummaryRequestFilters getFilters() | setFilters(InvoiceSummaryRequestFilters filters) |

## Example (as JSON)

```json
{
  "Filters": {
    "ColCoId": 0,
    "PayerId": 48,
    "PayerNumber": "PayerNumber0",
    "InvoiceId": 188,
    "InvoiceNumber": "InvoiceNumber0"
  }
}
```

