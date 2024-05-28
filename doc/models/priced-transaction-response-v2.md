
# Priced Transaction Response V2

## Structure

`PricedTransactionResponseV2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the req | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Indicates overall status of the request | String getStatus() | setStatus(String status) |
| `Data` | [`List<PricedResponseData>`](../../doc/models/priced-response-data.md) | Optional | - | List<PricedResponseData> getData() | setData(List<PricedResponseData> data) |
| `Page` | `Integer` | Optional | Current page | Integer getPage() | setPage(Integer page) |
| `PageSize` | `Integer` | Optional | Number of records returned in the response | Integer getPageSize() | setPageSize(Integer pageSize) |
| `TotalPages` | `Integer` | Optional | Total number of pages available for the requested data | Integer getTotalPages() | setTotalPages(Integer totalPages) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId6",
  "Status": "Status0",
  "Data": [
    {
      "AccountName": "AccountName4",
      "AccountId": 62,
      "AccountNumber": "AccountNumber8",
      "AccountShortName": "AccountShortName0",
      "Additional1": "Additional10"
    }
  ],
  "Page": 122,
  "PageSize": 102
}
```

