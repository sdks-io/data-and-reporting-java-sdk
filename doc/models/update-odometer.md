
# Update Odometer

## Structure

`UpdateOdometer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SalesItemId` | `String` | Required | Unique SalesItemId (Either Billed on Unbilled)<br>Mandatory | String getSalesItemId() | setSalesItemId(String salesItemId) |
| `NewOdometerValue` | `Integer` | Required | NewOdometerValue that needs to be updated | Integer getNewOdometerValue() | setNewOdometerValue(Integer newOdometerValue) |

## Example (as JSON)

```json
{
  "SalesItemId": "SalesItemId2",
  "NewOdometerValue": 158
}
```

