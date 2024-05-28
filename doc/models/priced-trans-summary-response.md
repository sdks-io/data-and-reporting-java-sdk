
# Priced Trans Summary Response

## Structure

`PricedTransSummaryResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionsSummary` | [`List<PricedTransSummaryResponseTransactionsSummaryItems>`](../../doc/models/priced-trans-summary-response-transactions-summary-items.md) | Optional | - | List<PricedTransSummaryResponseTransactionsSummaryItems> getTransactionsSummary() | setTransactionsSummary(List<PricedTransSummaryResponseTransactionsSummaryItems> transactionsSummary) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |
| `RequestId` | `String` | Optional | API Request Id | String getRequestId() | setRequestId(String requestId) |

## Example (as JSON)

```json
{
  "TransactionsSummary": [
    {
      "ProductId": 184,
      "ProductCode": "ProductCode8",
      "ProductName": "ProductName8",
      "ProductGroupId": 112,
      "ProductGroupName": "ProductGroupName0"
    },
    {
      "ProductId": 184,
      "ProductCode": "ProductCode8",
      "ProductName": "ProductName8",
      "ProductGroupId": 112,
      "ProductGroupName": "ProductGroupName0"
    },
    {
      "ProductId": 184,
      "ProductCode": "ProductCode8",
      "ProductName": "ProductName8",
      "ProductGroupId": 112,
      "ProductGroupName": "ProductGroupName0"
    }
  ],
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  },
  "RequestId": "RequestId2"
}
```

