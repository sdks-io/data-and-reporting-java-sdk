
# Transaction Fees Summary Req

## Structure

`TransactionFeesSummaryReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`TransactionFeesRequest`](../../doc/models/transaction-fees-request.md) | Optional | - | TransactionFeesRequest getFilters() | setFilters(TransactionFeesRequest filters) |

## Example (as JSON)

```json
{
  "Filters": {
    "ColCoId": 0,
    "ColCoCode": 14,
    "PayerId": 48,
    "PayerNumber": "PayerNumber0",
    "Accounts": [
      {
        "AccountId": 28,
        "AccountNumber": "AccountNumber0"
      },
      {
        "AccountId": 28,
        "AccountNumber": "AccountNumber0"
      },
      {
        "AccountId": 28,
        "AccountNumber": "AccountNumber0"
      }
    ]
  }
}
```

