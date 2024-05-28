
# Invoice Dates Request

## Structure

`InvoiceDatesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`InvoiceDatesRequestFilters`](../../doc/models/invoice-dates-request-filters.md) | Optional | - | InvoiceDatesRequestFilters getFilters() | setFilters(InvoiceDatesRequestFilters filters) |

## Example (as JSON)

```json
{
  "Filters": {
    "ColCoCode": 14,
    "ColCoId": 0,
    "PayerId": 48,
    "PayerNumber": "PayerNumber0",
    "FromDate": "FromDate6"
  }
}
```

