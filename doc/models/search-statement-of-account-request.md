
# Search Statement of Account Request

## Structure

`SearchStatementOfAccountRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`SearchSOAReq`](../../doc/models/search-soa-req.md) | Optional | - | SearchSOAReq getFilters() | setFilters(SearchSOAReq filters) |
| `Page` | `Integer` | Optional | Page number | Integer getPage() | setPage(Integer page) |
| `PageSize` | `Integer` | Optional | Number of records in page | Integer getPageSize() | setPageSize(Integer pageSize) |

## Example (as JSON)

```json
{
  "Filters": {
    "ColCoCode": 14,
    "PayerNumber": "PayerNumber0",
    "InvoiceNumber": "InvoiceNumber0",
    "FromDate": "FromDate6",
    "ToDate": "ToDate4"
  },
  "Page": 114,
  "PageSize": 94
}
```

