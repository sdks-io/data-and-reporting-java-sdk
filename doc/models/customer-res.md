
# Customer Res

## Structure

`CustomerRes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Unique identifier for the request. This will be played back in the response from the request. | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Status of the request | String getStatus() | setStatus(String status) |
| `Data` | [`List<CustomerDetailResponse>`](../../doc/models/customer-detail-response.md) | Optional | - | List<CustomerDetailResponse> getData() | setData(List<CustomerDetailResponse> data) |

## Example (as JSON)

```json
{
  "RequestId": "0e6fb42a-51b0-43b2-f010-92f822657f6a",
  "Status": "SUCCESS",
  "Data": [
    {
      "AccountId": 62,
      "AccountName": "AccountName4",
      "AccountNumber": "AccountNumber8",
      "AccountShortName": "AccountShortName0",
      "AccountTradingName": "AccountTradingName0"
    }
  ]
}
```

