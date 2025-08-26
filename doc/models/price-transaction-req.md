
# Price Transaction Req

## Structure

`PriceTransactionReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`PriceTransactionRequest`](../../doc/models/price-transaction-request.md) | Optional | - | PriceTransactionRequest getFilters() | setFilters(PriceTransactionRequest filters) |
| `Page` | `Integer` | Optional | Page Number (as shown to the users)<br><br>**Default**: `1` | Integer getPage() | setPage(Integer page) |
| `PageSize` | `Integer` | Optional | Page Size – Number of records to show on a page.<br><br>**Default**: `50` | Integer getPageSize() | setPageSize(Integer pageSize) |

## Example (as JSON)

```json
{
  "Page": 1,
  "PageSize": 100,
  "Filters": {
    "ColCoId": 0,
    "ColCoCode": 14,
    "PayerId": 48,
    "PayerNumber": "PayerNumber0",
    "Accounts": {
      "AccountId": 28,
      "AccountNumber": "AccountNumber0"
    }
  }
}
```

