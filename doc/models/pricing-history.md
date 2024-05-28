
# Pricing History

## Structure

`PricingHistory`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FromDate` | `String` | Optional | Pricing History Period Start date and should be the first date of the month.<br>Format: YYYYMMDD | String getFromDate() | setFromDate(String fromDate) |
| `ToDate` | `String` | Optional | Pricing History Period end date and should be the last date of the period month.<br>Format: YYYYMMDD | String getToDate() | setToDate(String toDate) |
| `FeesRuleID` | `Integer` | Optional | Pricing History Period Fees Rule ID that is associated to the period of that associated payer.  <br>Example: 8101 | Integer getFeesRuleID() | setFeesRuleID(Integer feesRuleID) |
| `FeesRuleDescription` | `String` | Optional | Pricing History Period Fees Rule Description that is associated to the period of that associated payer. | String getFeesRuleDescription() | setFeesRuleDescription(String feesRuleDescription) |
| `TotalVolume` | `Double` | Optional | Total Quantity for the Pricing History Period that is associated to that payer. | Double getTotalVolume() | setTotalVolume(Double totalVolume) |

## Example (as JSON)

```json
{
  "FromDate": "FromDate0",
  "ToDate": "ToDate0",
  "FeesRuleID": 44,
  "FeesRuleDescription": "FeesRuleDescription4",
  "TotalVolume": 153.82
}
```

