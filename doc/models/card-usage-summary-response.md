
# Card Usage Summary Response

## Structure

`CardUsageSummaryResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UsageSummary` | [`List<UsageSummary>`](../../doc/models/usage-summary.md) | Optional | - | List<UsageSummary> getUsageSummary() | setUsageSummary(List<UsageSummary> usageSummary) |
| `RequestId` | `String` | Optional | API Request Id | String getRequestId() | setRequestId(String requestId) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |

## Example (as JSON)

```json
{
  "UsageSummary": [
    {
      "Date": "Date0",
      "ProductId": 198,
      "ProductCode": "ProductCode6",
      "ProductName": "ProductName6",
      "IsFuelProduct": false
    },
    {
      "Date": "Date0",
      "ProductId": 198,
      "ProductCode": "ProductCode6",
      "ProductName": "ProductName6",
      "IsFuelProduct": false
    },
    {
      "Date": "Date0",
      "ProductId": 198,
      "ProductCode": "ProductCode6",
      "ProductName": "ProductName6",
      "IsFuelProduct": false
    }
  ],
  "RequestId": "RequestId2",
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  }
}
```

