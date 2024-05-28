
# Fuel Consumption Request

## Structure

`FuelConsumptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id  of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1 for Philippines<br>5 for UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code  of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided.<br>Example:<br>86 for Philippines<br>5 for UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerId` | `Integer` | Optional | Payer Id  of the selected payer.<br>Optional if PayerNumber is passed else Mandatory | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer.<br>Optional if PayerId is passed else Mandatory | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `Accounts` | [`List<Accounts>`](../../doc/models/accounts.md) | Optional | - | List<Accounts> getAccounts() | setAccounts(List<Accounts> accounts) |
| `CardGroupId` | `Integer` | Optional | Card Group Id in GFN<br>Optional<br>Example: 200 | Integer getCardGroupId() | setCardGroupId(Integer cardGroupId) |
| `CardGroupName` | `String` | Optional | Card Group Name<br>Optional<br>This input is a search criterion, if given. | String getCardGroupName() | setCardGroupName(String cardGroupName) |
| `Cards` | [`List<FuelConsumptionCard>`](../../doc/models/fuel-consumption-card.md) | Optional | - | List<FuelConsumptionCard> getCards() | setCards(List<FuelConsumptionCard> cards) |
| `FromDate` | `String` | Optional | Transactions from Date<br>Optional – ‘Period’ will be considered when this field is not provided. | String getFromDate() | setFromDate(String fromDate) |
| `ToDate` | `String` | Optional | Transactions to Date<br>Optional<br>Format: yyyyMMdd | String getToDate() | setToDate(String toDate) |
| `Period` | `Integer` | Optional | Transactions Period. This is ignored when FromDate is supplied on the request<br>Allowed values :<br><br>1. Last 7 Days<br>2. Last 30 Days<br>3. Last 90 Days<br>   Optional - When FromDate/ToDate and Period are not provided, ‘Last 7 Days’ value is considered as default Period. | Integer getPeriod() | setPeriod(Integer period) |

## Example (as JSON)

```json
{
  "ColCoId": 148,
  "ColCoCode": 162,
  "PayerId": 196,
  "PayerNumber": "PayerNumber4",
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
```

