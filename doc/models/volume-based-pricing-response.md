
# Volume Based Pricing Response

## Structure

`VolumeBasedPricingResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Configuration` | [`List<BonusConfiguration>`](../../doc/models/bonus-configuration.md) | Optional | - | List<BonusConfiguration> getConfiguration() | setConfiguration(List<BonusConfiguration> configuration) |
| `CurrentPeriodConsumption` | [`List<PricingCurrentVolume>`](../../doc/models/pricing-current-volume.md) | Optional | - | List<PricingCurrentVolume> getCurrentPeriodConsumption() | setCurrentPeriodConsumption(List<PricingCurrentVolume> currentPeriodConsumption) |
| `History` | [`List<PricingHistory>`](../../doc/models/pricing-history.md) | Optional | - | List<PricingHistory> getHistory() | setHistory(List<PricingHistory> history) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |
| `RequestId` | `String` | Optional | API Request Id | String getRequestId() | setRequestId(String requestId) |

## Example (as JSON)

```json
{
  "Configuration": [
    {
      "PricingAccountId": 94,
      "PricingAccountNumber": "PricingAccountNumber0",
      "PricingAccountShortName": "PricingAccountShortName2",
      "PricingAccountFullName": "PricingAccountFullName8",
      "FeeRuleId": 254
    }
  ],
  "CurrentPeriodConsumption": [
    {
      "FeeRuleId": 146,
      "FeeRuleDescription": "FeeRuleDescription8",
      "PriceRuleID": 84,
      "PriceRuleDescription": "PriceRuleDescription8",
      "TotalVolume": 254.28
    },
    {
      "FeeRuleId": 146,
      "FeeRuleDescription": "FeeRuleDescription8",
      "PriceRuleID": 84,
      "PriceRuleDescription": "PriceRuleDescription8",
      "TotalVolume": 254.28
    },
    {
      "FeeRuleId": 146,
      "FeeRuleDescription": "FeeRuleDescription8",
      "PriceRuleID": 84,
      "PriceRuleDescription": "PriceRuleDescription8",
      "TotalVolume": 254.28
    }
  ],
  "History": [
    {
      "FromDate": "FromDate6",
      "ToDate": "ToDate4",
      "FeesRuleID": 136,
      "FeesRuleDescription": "FeesRuleDescription0",
      "TotalVolume": 24.18
    },
    {
      "FromDate": "FromDate6",
      "ToDate": "ToDate4",
      "FeesRuleID": 136,
      "FeesRuleDescription": "FeesRuleDescription0",
      "TotalVolume": 24.18
    }
  ],
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  },
  "RequestId": "RequestId6"
}
```

