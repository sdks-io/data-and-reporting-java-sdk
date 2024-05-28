
# Fee Rule Tier

## Structure

`FeeRuleTier`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TierMinimum` | `Integer` | Optional | Minimum consumption configured in the tier. | Integer getTierMinimum() | setTierMinimum(Integer tierMinimum) |
| `Value` | `Double` | Optional | Bonus value for the tier. | Double getValue() | setValue(Double value) |
| `TierMaximum` | `Integer` | Optional | Maximum consumption configured in the tier. | Integer getTierMaximum() | setTierMaximum(Integer tierMaximum) |

## Example (as JSON)

```json
{
  "TierMinimum": 238,
  "Value": 239.26,
  "TierMaximum": 16
}
```

