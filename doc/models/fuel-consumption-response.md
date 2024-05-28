
# Fuel Consumption Response

## Structure

`FuelConsumptionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FuelConsumption` | [`List<FuelConsumptionData>`](../../doc/models/fuel-consumption-data.md) | Optional | - | List<FuelConsumptionData> getFuelConsumption() | setFuelConsumption(List<FuelConsumptionData> fuelConsumption) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |
| `RequestId` | `String` | Optional | API Request Id | String getRequestId() | setRequestId(String requestId) |

## Example (as JSON)

```json
{
  "FuelConsumption": [
    {
      "AccountName": "AccountName6",
      "AccountNumber": "AccountNumber0",
      "PayerName": "PayerName2",
      "PayerNumber": "PayerNumber8",
      "CardNumber": "CardNumber8"
    }
  ],
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  },
  "RequestId": "RequestId4"
}
```

