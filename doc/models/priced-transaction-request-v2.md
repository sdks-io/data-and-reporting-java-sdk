
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
    "InvoiceStatus": {
      "key1": "val1",
      "key2": "val2"
    },
    "PayerNumber": "PayerNumber0",
    "AccountId": 108,
    "AccountNumber": "AccountNumber2",
    "DriverName": "DriverName8",
    "CardGroupId": 154,
    "CardPAN": "CardPAN8"
  },
  "Page": 230,
  "PageSize": 210
}
```

