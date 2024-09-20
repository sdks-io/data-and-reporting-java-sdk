
# Invoice Management V1 Eidsearch 404 Error Exception

## Structure

`InvoiceManagementV1Eidsearch404ErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Unique request identifier passed from end user. This identifier helps in tracing a transaction | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Indicates overall status of the request. Allowed values: SUCCES, FAILED, PARTIAL_SUCCESS | String getStatus() | setStatus(String status) |
| `Errors` | [`List<ErrorDetails>`](../../doc/models/error-details.md) | Optional | - | List<ErrorDetails> getErrors() | setErrors(List<ErrorDetails> errors) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId0",
  "Status": "Status6",
  "Errors": [
    {
      "Code": "Code4",
      "Title": "Title6",
      "Detail": "Detail6",
      "AdditionalInfo": {
        "key0": "AdditionalInfo0",
        "key1": "AdditionalInfo1",
        "key2": "AdditionalInfo2"
      }
    }
  ]
}
```

