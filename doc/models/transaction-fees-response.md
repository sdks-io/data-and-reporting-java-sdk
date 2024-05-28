
# Transaction Fees Response

## Structure

`TransactionFeesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FeeItems` | [`List<FeeItem>`](../../doc/models/fee-item.md) | Optional | - | List<FeeItem> getFeeItems() | setFeeItems(List<FeeItem> feeItems) |
| `CurrentPage` | `Integer` | Optional | Current Page | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `RowCount` | `Integer` | Optional | Total row count matched for the given input criteria | Integer getRowCount() | setRowCount(Integer rowCount) |
| `TotalPages` | `Integer` | Optional | Calculated page count based on page size from the incoming API request and total number of rows matched for the given input criteria | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |
| `RequestId` | `String` | Optional | API Request Id | String getRequestId() | setRequestId(String requestId) |

## Example (as JSON)

```json
{
  "FeeItems": [
    {
      "FeeItemId": 18,
      "AccountId": 106,
      "AccountNumber": "AccountNumber0",
      "AccountShortName": "AccountShortName2",
      "InvoiceAccountId": 66
    },
    {
      "FeeItemId": 18,
      "AccountId": 106,
      "AccountNumber": "AccountNumber0",
      "AccountShortName": "AccountShortName2",
      "InvoiceAccountId": 66
    }
  ],
  "CurrentPage": 222,
  "RowCount": 120,
  "TotalPages": 32,
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  }
}
```

