
# Multi Priced Transaction Response

## Structure

`MultiPricedTransactionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Transactions` | [`List<MultiPricedTransactionResponseTransactionsItems>`](../../doc/models/multi-priced-transaction-response-transactions-items.md) | Optional | - | List<MultiPricedTransactionResponseTransactionsItems> getTransactions() | setTransactions(List<MultiPricedTransactionResponseTransactionsItems> transactions) |

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
  ]
}
```

