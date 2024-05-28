
# EID Download Request

## Structure

`EIDDownloadRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`EIDDownloadReq`](../../doc/models/eid-download-req.md) | Optional | - | EIDDownloadReq getFilters() | setFilters(EIDDownloadReq filters) |

## Example (as JSON)

```json
{
  "Filters": {
    "ColCoCode": 14,
    "EIDList": [
      "EIDList8"
    ],
    "AccountGroupCountry": 186,
    "AccountGroupIdList": [
      "AccountGroupIdList1",
      "AccountGroupIdList2",
      "AccountGroupIdList3"
    ]
  }
}
```

