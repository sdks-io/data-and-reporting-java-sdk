
# Current Volume

## Structure

`CurrentVolume`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FeeRuleId` | `Integer` | Optional | Bonus or association bonus configuration identifier that is associated to the payer | Integer getFeeRuleId() | setFeeRuleId(Integer feeRuleId) |
| `FeeRuleDescription` | `String` | Optional | Bonus or association bonus configuration description that is associated to the payer. | String getFeeRuleDescription() | setFeeRuleDescription(String feeRuleDescription) |
| `Month` | `Integer` | Optional | Consumption(Volume) of the month. | Integer getMonth() | setMonth(Integer month) |
| `Year` | `String` | Optional | Consumption (Volume) of the year. | String getYear() | setYear(String year) |
| `TotalVolume` | `Double` | Optional | Total volume consumption for the month/year above. | Double getTotalVolume() | setTotalVolume(Double totalVolume) |

## Example (as JSON)

```json
{
  "FeeRuleId": 74,
  "FeeRuleDescription": "FeeRuleDescription8",
  "Month": 138,
  "Year": "Year2",
  "TotalVolume": 115.68
}
```

