
# Logged in User Req

## Structure

`LoggedInUserReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`FleetmanagementV1UserLoggedinuserRequest`](../../doc/models/fleetmanagement-v1-user-loggedinuser-request.md) | Optional | - | FleetmanagementV1UserLoggedinuserRequest getFilters() | setFilters(FleetmanagementV1UserLoggedinuserRequest filters) |

## Example (as JSON)

```json
{
  "Filters": {
    "IncludePayerGroup": false,
    "IncludeEIDDetails": false,
    "RequestedAPIName": "RequestedAPIName0",
    "PayerId": 48,
    "PayerNumber": "PayerNumber0"
  }
}
```

