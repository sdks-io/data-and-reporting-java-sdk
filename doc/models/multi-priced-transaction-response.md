
# Multi Priced Transaction Response

## Structure

`MultiPricedTransactionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Transactions` | [`List<MultiPricedTransactionResponseTransactionsItems>`](../../doc/models/multi-priced-transaction-response-transactions-items.md) | Optional | - | List<MultiPricedTransactionResponseTransactionsItems> getTransactions() | setTransactions(List<MultiPricedTransactionResponseTransactionsItems> transactions) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |
| `RequestId` | `String` | Optional | API Request Id | String getRequestId() | setRequestId(String requestId) |
| `CurrentPage` | `Integer` | Optional | Current Page | Integer getCurrentPage() | setCurrentPage(Integer currentPage) |
| `RowCount` | `Integer` | Optional | Total row count matched for the given input criteria | Integer getRowCount() | setRowCount(Integer rowCount) |
| `TotalPages` | `Integer` | Optional | Calculated page count based on page size from the incoming API request and total number of rows matched for the given input criteria | Integer getTotalPages() | setTotalPages(Integer totalPages) |

## Example (as JSON)

```json
{
  "Transactions": [
    {
      "Type": "Type2",
      "CardId": 86,
      "CardPAN": "CardPAN4",
      "CardExpiry": "CardExpiry0",
      "TransactionDate": "TransactionDate0"
    },
    {
      "Type": "Type2",
      "CardId": 86,
      "CardPAN": "CardPAN4",
      "CardExpiry": "CardExpiry0",
      "TransactionDate": "TransactionDate0"
    }
  ],
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  },
  "RequestId": "RequestId8",
  "CurrentPage": 154,
  "RowCount": 52
}
```

