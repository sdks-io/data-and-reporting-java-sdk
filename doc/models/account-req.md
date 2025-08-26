
# Account Req

## Structure

`AccountReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`AccountRequest`](../../doc/models/account-request.md) | Optional | - | AccountRequest getFilters() | setFilters(AccountRequest filters) |
| `Page` | `Integer` | Optional | Page Number (as shown to the users)<br><br>**Default**: `1` | Integer getPage() | setPage(Integer page) |
| `PageSize` | `Integer` | Optional | Page Size – Number of records to show on a page.<br><br>**Default**: `50` | Integer getPageSize() | setPageSize(Integer pageSize) |

## Example (as JSON)

```json
{
  "Page": 1,
  "PageSize": 100,
  "Filters": {
    "Status": "Status6",
    "IncludeCardSummary": false,
    "PayerId": 48,
    "PayerNumber": "PayerNumber0",
    "PageSize": 56
  }
}
```

