
# Invoice Download Request

## Structure

`InvoiceDownloadRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Filters` | [`InvoiceDownloadReq`](../../doc/models/invoice-download-req.md) | Optional | - | InvoiceDownloadReq getFilters() | setFilters(InvoiceDownloadReq filters) |

## Example (as JSON)

```json
{
  "Filters": {
    "ColCoCode": 14,
    "PayerNumber": "PayerNumber0",
    "AccountNumber": [
      "AccountNumber4",
      "AccountNumber5"
    ],
    "DocumentReference": [
      59,
      60,
      61
    ],
    "InvoiceOrSOANumber": "InvoiceOrSOANumber0"
  }
}
```

