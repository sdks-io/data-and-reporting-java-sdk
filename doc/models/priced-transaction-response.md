
# Priced Transaction Response

## Structure

`PricedTransactionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Transactions` | [`List<PricedTransactionResponseTransactionsItems>`](../../doc/models/priced-transaction-response-transactions-items.md) | Optional | - | List<PricedTransactionResponseTransactionsItems> getTransactions() | setTransactions(List<PricedTransactionResponseTransactionsItems> transactions) |

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
    }
  ]
}
```

