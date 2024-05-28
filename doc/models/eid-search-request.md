
# EID Search Request

## Structure

`EIDSearchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`EIDSearchReq`](../../doc/models/eid-search-req.md) | Optional | - | EIDSearchReq getFilters() | setFilters(EIDSearchReq filters) |
| `Page` | `Integer` | Optional | Specify the page of results to be returned. | Integer getPage() | setPage(Integer page) |
| `PageSize` | `Integer` | Optional | Specify the number of records to returned; Max 1000 | Integer getPageSize() | setPageSize(Integer pageSize) |

## Example (as JSON)

```json
{
  "Filters": {
    "ColCoCode": 14,
    "AccountGroupCountry": 186,
    "AccountGroupId": [
      "AccountGroupId5"
    ],
    "AccountGroupName": "AccountGroupName0",
    "FromDate": "FromDate6",
    "ToDate": "ToDate4",
    "InvoiceType": "InvoiceType2",
    "InvoiceStatus": "InvoiceStatus4"
  },
  "Page": 74,
  "PageSize": 54
}
```

