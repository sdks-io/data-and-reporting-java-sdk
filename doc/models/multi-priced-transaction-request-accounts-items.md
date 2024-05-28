
# Multi Priced Transaction Request Accounts Items

## Structure

`MultiPricedTransactionRequestAccountsItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PayerId` | `Integer` | Optional | Payer Id of the selected payer.<br>Optional if PayerNumber is passed else Mandatory<br>Example: 123456 | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number (Ex: GB000000123) of the selected payer.<br>Optional if PayerId is passed else Mandatory<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountId` | `Integer` | Optional | Account Id  of the selected account. | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number (ex: GB000000123) of the selected account. | String getAccountNumber() | setAccountNumber(String accountNumber) |

## Example (as JSON)

```json
{
  "PayerId": 144,
  "PayerNumber": "PayerNumber2",
  "AccountId": 204,
  "AccountNumber": "AccountNumber4"
}
```

