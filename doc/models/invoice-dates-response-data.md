
# Invoice Dates Response Data

## Structure

`InvoiceDatesResponseData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Unique request identifier passed from end user. This identifier helps in tracing a transaction | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Indicates overall status of the request. Allowed values: SUCCES, FAILED | String getStatus() | setStatus(String status) |
| `Data` | [`List<InvoiceDatesData>`](../../doc/models/invoice-dates-data.md) | Optional | - | List<InvoiceDatesData> getData() | setData(List<InvoiceDatesData> data) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId6",
  "Status": "Status2",
  "Data": [
    {
      "InvoiceNumbers": [
        "InvoiceNumbers7",
        "InvoiceNumbers8"
      ],
      "InvoiceDates": [
        "InvoiceDates0",
        "InvoiceDates1",
        "InvoiceDates2"
      ]
    },
    {
      "InvoiceNumbers": [
        "InvoiceNumbers7",
        "InvoiceNumbers8"
      ],
      "InvoiceDates": [
        "InvoiceDates0",
        "InvoiceDates1",
        "InvoiceDates2"
      ]
    },
    {
      "InvoiceNumbers": [
        "InvoiceNumbers7",
        "InvoiceNumbers8"
      ],
      "InvoiceDates": [
        "InvoiceDates0",
        "InvoiceDates1",
        "InvoiceDates2"
      ]
    }
  ]
}
```

