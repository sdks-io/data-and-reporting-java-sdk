
# Update Odometer Response

## Structure

`UpdateOdometerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ServiceReference` | `Integer` | Optional | Main reference number for tracking. | Integer getServiceReference() | setServiceReference(Integer serviceReference) |
| `UpdateOdometerReferences` | [`List<UpdateOdometerReference>`](../../doc/models/update-odometer-reference.md) | Optional | - | List<UpdateOdometerReference> getUpdateOdometerReferences() | setUpdateOdometerReferences(List<UpdateOdometerReference> updateOdometerReferences) |

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
  ]
}
```

