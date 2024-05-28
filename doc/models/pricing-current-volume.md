
# Pricing Current Volume

## Structure

`PricingCurrentVolume`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FeeRuleId` | `Integer` | Optional | Bonus or association bonus configuration identifier  that is associated to the payer. | Integer getFeeRuleId() | setFeeRuleId(Integer feeRuleId) |
| `FeeRuleDescription` | `String` | Optional | Bonus or association bonus configuration description that is associated to the payer | String getFeeRuleDescription() | setFeeRuleDescription(String feeRuleDescription) |
| `PriceRuleID` | `Integer` | Optional | Pricing current period Pricing Price Rule ID that is associated to the payer. | Integer getPriceRuleID() | setPriceRuleID(Integer priceRuleID) |
| `PriceRuleDescription` | `String` | Optional | Pricing current period pricing rule description that is associated to the payer | String getPriceRuleDescription() | setPriceRuleDescription(String priceRuleDescription) |
| `TotalVolume` | `Double` | Optional | Total volume consumption for the current period. | Double getTotalVolume() | setTotalVolume(Double totalVolume) |
| `NextFeeCreationDate` | `String` | Optional | Next Fee Rule Creation Date for that is associated to the payer.<br>Format: YYYYMMDD | String getNextFeeCreationDate() | setNextFeeCreationDate(String nextFeeCreationDate) |

## Example (as JSON)

```json
{
  "FeeRuleId": 134,
  "FeeRuleDescription": "FeeRuleDescription4",
  "PriceRuleID": 96,
  "PriceRuleDescription": "PriceRuleDescription6",
  "TotalVolume": 64.96
}
```

