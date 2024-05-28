
# Search Statement of Account Response

## Structure

`SearchStatementOfAccountResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the req | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Indicates overall status of the request | String getStatus() | setStatus(String status) |
| `Data` | [`List<SearchStatementOfAccount>`](../../doc/models/search-statement-of-account.md) | Optional | - | List<SearchStatementOfAccount> getData() | setData(List<SearchStatementOfAccount> data) |
| `Page` | `Integer` | Optional | Current page | Integer getPage() | setPage(Integer page) |
| `TotalRecords` | `Integer` | Optional | Total Number of records in response | Integer getTotalRecords() | setTotalRecords(Integer totalRecords) |
| `TotalPages` | `Integer` | Optional | Total number of pages available for the requested data | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `PageSize` | `Integer` | Optional | Number of records returned in the response | Integer getPageSize() | setPageSize(Integer pageSize) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId6",
  "Status": "Status2",
  "Data": [
    {
      "StatementOfAccountId": 152,
      "SoAReferenceNumber": "SoAReferenceNumber6",
      "StatementDate": "StatementDate2",
      "PayerId": 2,
      "PayerNumber": "PayerNumber6"
    },
    {
      "StatementOfAccountId": 152,
      "SoAReferenceNumber": "SoAReferenceNumber6",
      "StatementDate": "StatementDate2",
      "PayerId": 2,
      "PayerNumber": "PayerNumber6"
    },
    {
      "StatementOfAccountId": 152,
      "SoAReferenceNumber": "SoAReferenceNumber6",
      "StatementDate": "StatementDate2",
      "PayerId": 2,
      "PayerNumber": "PayerNumber6"
    }
  ],
  "Page": 214,
  "TotalRecords": 118
}
```

