
# Customer Price List Response

## Structure

`CustomerPriceListResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. | String getRequestId() | setRequestId(String requestId) |
| `PriceList` | [`List<PriceList>`](../../doc/models/price-list.md) | Optional | - | List<PriceList> getPriceList() | setPriceList(List<PriceList> priceList) |
| `Error` | [`ErrorStatus`](../../doc/models/error-status.md) | Optional | - | ErrorStatus getError() | setError(ErrorStatus error) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId0",
  "PriceList": [
    {
      "Date": "Date8",
      "Day": "Day4",
      "Type": "Type0",
      "PriceListId": 210,
      "PriceListDescription": "PriceListDescription0"
    },
    {
      "Date": "Date8",
      "Day": "Day4",
      "Type": "Type0",
      "PriceListId": 210,
      "PriceListDescription": "PriceListDescription0"
    },
    {
      "Date": "Date8",
      "Day": "Day4",
      "Type": "Type0",
      "PriceListId": 210,
      "PriceListDescription": "PriceListDescription0"
    }
  ],
  "Error": {
    "Code": "Code4",
    "Description": "Description2"
  }
}
```

