
# Warning

## Structure

`Warning`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Message` | `String` | Required | A custom message giving the detailed outage information. The message will contain the duration and the reason for the outage. | String getMessage() | setMessage(String message) |
| `Type` | `String` | Required | Type of warning | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "Message": "System is down for upgradation.",
  "Type": "System Outage"
}
```

