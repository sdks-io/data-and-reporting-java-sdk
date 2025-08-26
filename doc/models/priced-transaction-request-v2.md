
# Priced Transaction Request V2

## Structure

`PricedTransactionRequestV2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`Filters`](../../doc/models/filters.md) | Optional | - | Filters getFilters() | setFilters(Filters filters) |
| `Page` | `Integer` | Optional | Specify the page of results to be returned. | Integer getPage() | setPage(Integer page) |
| `PageSize` | `Integer` | Optional | Specify the number of records to returned; Max 1000 | Integer getPageSize() | setPageSize(Integer pageSize) |

## Example (as JSON)

```json
{
  "Filters": {
    "ColCoCode": "ColCoCode8",
    "ColCoId": 0,
    "InvoiceStatus": "U",
    "PayerNumber": "PayerNumber0",
    "AccountId": 108,
    "AccountNumber": "AccountNumber2",
    "DriverName": "DriverName8",
    "CardId": 14
  },
  "Page": 230,
  "PageSize": 210
}
```

