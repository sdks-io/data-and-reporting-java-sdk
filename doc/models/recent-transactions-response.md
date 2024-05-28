
# Recent Transactions Response

## Structure

`RecentTransactionsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | RequestID is unique identifier value that is attached to requests and messages that allow reference to a particular transaction or event chain. | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | status of the API call | String getStatus() | setStatus(String status) |
| `Page` | `Integer` | Optional | CurrentPage | Integer getPage() | setPage(Integer page) |
| `RowCount` | `Integer` | Optional | RowCount | Integer getRowCount() | setRowCount(Integer rowCount) |
| `TotalPages` | `Integer` | Optional | TotalPages | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `Data` | [`List<RecentTransactions>`](../../doc/models/recent-transactions.md) | Optional | API Response | List<RecentTransactions> getData() | setData(List<RecentTransactions> data) |

## Example (as JSON)

```json
{
  "RequestId": "9d2dee33-7803-485a-a2b1-2c7538e597ee",
  "Status": "SUCCESS",
  "Page": 1,
  "RowCount": 2,
  "TotalPages": 1
}
```

