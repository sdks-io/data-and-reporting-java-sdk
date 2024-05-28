
# Invoice Summary Response

## Structure

`InvoiceSummaryResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | API Request Id | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Indicates overall status of the request. Allowed values: SUCCES, FAILED | String getStatus() | setStatus(String status) |
| `Data` | [`List<InvoiceSummaryDetails>`](../../doc/models/invoice-summary-details.md) | Optional | - | List<InvoiceSummaryDetails> getData() | setData(List<InvoiceSummaryDetails> data) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId6",
  "Status": "Status2",
  "Data": [
    {
      "TotalInvoices": 230,
      "TotalGrossAmountCustomerCurrency": 149.02,
      "TotalNetAmountCustomerCurrency": 18.22,
      "TotalVATAmountCustomerCurrency": 21.48,
      "CustomerCurrencyCode": "CustomerCurrencyCode4"
    },
    {
      "TotalInvoices": 230,
      "TotalGrossAmountCustomerCurrency": 149.02,
      "TotalNetAmountCustomerCurrency": 18.22,
      "TotalVATAmountCustomerCurrency": 21.48,
      "CustomerCurrencyCode": "CustomerCurrencyCode4"
    }
  ]
}
```

