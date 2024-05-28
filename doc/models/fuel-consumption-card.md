
# Fuel Consumption Card

## Structure

`FuelConsumptionCard`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardId` | `Integer` | Optional | Card Id<br>Optional, when PAN is provided else mandatory. | Integer getCardId() | setCardId(Integer cardId) |
| `PAN` | `String` | Optional | Full Card PAN<br>Optional, when CardId is provided else mandatory. | String getPAN() | setPAN(String pAN) |
| `ExpiryDate` | `String` | Optional | Card Expiry Date<br>Format: yyyyMMdd | String getExpiryDate() | setExpiryDate(String expiryDate) |

## Example (as JSON)

```json
{
  "CardId": 54,
  "PAN": "PAN4",
  "ExpiryDate": "ExpiryDate4"
}
```

