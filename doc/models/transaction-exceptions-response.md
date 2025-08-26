
# Transaction Exceptions Response

## Structure

`TransactionExceptionsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardExceptions` | [`List<CardExceptions>`](../../doc/models/card-exceptions.md) | Optional | - | List<CardExceptions> getCardExceptions() | setCardExceptions(List<CardExceptions> cardExceptions) |
| `TransactionExceptions` | [`List<TransactionExceptions>`](../../doc/models/transaction-exceptions.md) | Optional | - | List<TransactionExceptions> getTransactionExceptions() | setTransactionExceptions(List<TransactionExceptions> transactionExceptions) |

## Example (as JSON)

```json
{
  "CardExceptions": [
    {
      "AccountId": 224,
      "AccountNumber": "AccountNumber4",
      "AccountShortName": "AccountShortName6",
      "CardId": 130,
      "CurrencyCode": "CurrencyCode2"
    }
  ],
  "TransactionExceptions": [
    {
      "SalesItemId": 113.2,
      "CardId": 104,
      "ProductId": 220,
      "TransactionGUID": "TransactionGUID2",
      "TransactionDate": "TransactionDate6"
    },
    {
      "SalesItemId": 113.2,
      "CardId": 104,
      "ProductId": 220,
      "TransactionGUID": "TransactionGUID2",
      "TransactionDate": "TransactionDate6"
    }
  ]
}
```

