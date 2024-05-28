
# Volume Based Bonus Request

## Structure

`VolumeBasedBonusRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1 for Philippines<br>5 for UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided.<br>Example:<br>86 for Philippines<br>5 for UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerId` | `Integer` | Optional | Payer Id of the selected payer.<br>Optional if PayerNumber is passed else Mandatory | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer.<br>Optional if PayerId is passed else Mandatory | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `IncludeHistory` | `Boolean` | Optional | The API will return the details of the previously calculated/paid bonus and fuel consumption (Volume) in the response when this flag is ‘True’. | Boolean getIncludeHistory() | setIncludeHistory(Boolean includeHistory) |
| `IncludeCurrentPeriodVolume` | `Boolean` | Optional | The API will return the details of the monthly breakup of current period fuel consumption (Volume) in the response when this flag is ‘True’. | Boolean getIncludeCurrentPeriodVolume() | setIncludeCurrentPeriodVolume(Boolean includeCurrentPeriodVolume) |

## Example (as JSON)

```json
{
  "ColCoId": 174,
  "ColCoCode": 188,
  "PayerId": 222,
  "PayerNumber": "PayerNumber6",
  "IncludeHistory": false
}
```

