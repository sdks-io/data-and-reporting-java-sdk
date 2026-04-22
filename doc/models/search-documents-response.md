
# Search Documents Response

## Structure

`SearchDocumentsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Indicates overall status of the request. Allowed values: SUCCES, FAILED | String getStatus() | setStatus(String status) |
| `Invoices` | [`List<SearchDocumentsInvoice>`](../../doc/models/search-documents-invoice.md) | Optional | - | List<SearchDocumentsInvoice> getInvoices() | setInvoices(List<SearchDocumentsInvoice> invoices) |
| `TotalRecords` | `Integer` | Optional | Total number of elements corresponding to the request | Integer getTotalRecords() | setTotalRecords(Integer totalRecords) |
| `TotalRecordsOnPage` | `Integer` | Optional | Number of elements in the page content. Will be lesser or equal to the size param. | Integer getTotalRecordsOnPage() | setTotalRecordsOnPage(Integer totalRecordsOnPage) |
| `IsFirstPage` | `Boolean` | Optional | True if it is the first page, false otherwise | Boolean getIsFirstPage() | setIsFirstPage(Boolean isFirstPage) |
| `IsLastPage` | `Boolean` | Optional | True if it is the last page, false, otherwise. | Boolean getIsLastPage() | setIsLastPage(Boolean isLastPage) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId2",
  "Status": "Status8",
  "Invoices": [
    {
      "DocumentReference": 162,
      "InvoiceNumber": "InvoiceNumber6",
      "PayerName": "PayerName6",
      "AccountNumber": "AccountNumber6",
      "AccountName": "AccountName2"
    },
    {
      "DocumentReference": 162,
      "InvoiceNumber": "InvoiceNumber6",
      "PayerName": "PayerName6",
      "AccountNumber": "AccountNumber6",
      "AccountName": "AccountName2"
    }
  ],
  "TotalRecords": 250,
  "TotalRecordsOnPage": 108
}
```

