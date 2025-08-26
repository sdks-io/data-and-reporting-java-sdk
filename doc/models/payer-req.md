
# Payer Req

## Structure

`PayerReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`PayerRequest`](../../doc/models/payer-request.md) | Optional | - | PayerRequest getFilters() | setFilters(PayerRequest filters) |
| `Page` | `Integer` | Optional | Page Number (as shown to the users)<br><br>**Default**: `1` | Integer getPage() | setPage(Integer page) |
| `PageSize` | `Integer` | Optional | Page Size – Number of records to show on a page.<br><br>**Default**: `50` | Integer getPageSize() | setPageSize(Integer pageSize) |

## Example (as JSON)

```json
{
  "Page": 1,
  "PageSize": 100,
  "Filters": {
    "Payers": [
      {
        "ColCoId": 78,
        "ColCoCode": 92,
        "PayerId": 126,
        "PayerNumber": "PayerNumber0",
        "PayerName": "PayerName0"
      }
    ],
    "ReturnBasicDetailsOnly": false,
    "IncludeAddresses": false,
    "IncludeBonusParameters": false
  }
}
```

