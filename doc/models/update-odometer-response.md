
# Update Odometer Response

## Structure

`UpdateOdometerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ServiceReference` | `Integer` | Optional | Main reference number for tracking. | Integer getServiceReference() | setServiceReference(Integer serviceReference) |
| `UpdateOdometerReferences` | [`List<UpdateOdometerReference>`](../../doc/models/update-odometer-reference.md) | Optional | - | List<UpdateOdometerReference> getUpdateOdometerReferences() | setUpdateOdometerReferences(List<UpdateOdometerReference> updateOdometerReferences) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |
| `RequestId` | `String` | Optional | API Request Id | String getRequestId() | setRequestId(String requestId) |

## Example (as JSON)

```json
{
  "ServiceReference": 140,
  "UpdateOdometerReferences": [
    {
      "SalesItemId": 206,
      "UpdateOdometerReferenceId": 242
    },
    {
      "SalesItemId": 206,
      "UpdateOdometerReferenceId": 242
    },
    {
      "SalesItemId": 206,
      "UpdateOdometerReferenceId": 242
    }
  ],
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  },
  "RequestId": "RequestId4"
}
```

