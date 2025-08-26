
# Audit Req

## Structure

`AuditReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`AuditRequest`](../../doc/models/audit-request.md) | Optional | - | AuditRequest getFilters() | setFilters(AuditRequest filters) |
| `Page` | `Integer` | Optional | Page Number (as shown to the users)<br><br>**Default**: `1` | Integer getPage() | setPage(Integer page) |
| `PageSize` | `Integer` | Optional | Page Size – Number of records to show on a page.<br><br>**Default**: `50` | Integer getPageSize() | setPageSize(Integer pageSize) |

## Example (as JSON)

```json
{
  "Page": 1,
  "PageSize": 100,
  "Filters": {
    "Status": "Status6",
    "PayerNumber": "PayerNumber0",
    "PayerId": 48,
    "AccountNumber": "AccountNumber2",
    "ColCoCode": 14
  }
}
```

