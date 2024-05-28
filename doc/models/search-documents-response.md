
# Search Documents Response

## Structure

`SearchDocumentsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Indicates overall status of the request. Allowed values: SUCCES, FAILED | String getStatus() | setStatus(String status) |
| `Data` | [`List<SearchDocumentsInvoice>`](../../doc/models/search-documents-invoice.md) | Optional | - | List<SearchDocumentsInvoice> getData() | setData(List<SearchDocumentsInvoice> data) |
| `TotalRecords` | `Integer` | Optional | Total number of elements corresponding to the request | Integer getTotalRecords() | setTotalRecords(Integer totalRecords) |
| `TotalRecordsOnPage` | `Integer` | Optional | Number of elements in the page content. Will be lesser or equal to the size param. | Integer getTotalRecordsOnPage() | setTotalRecordsOnPage(Integer totalRecordsOnPage) |
| `IsFirstPage` | `Boolean` | Optional | True if it is the first page, false otherwise | Boolean getIsFirstPage() | setIsFirstPage(Boolean isFirstPage) |
| `IsLastPage` | `Boolean` | Optional | True if it is the last page, false, otherwise. | Boolean getIsLastPage() | setIsLastPage(Boolean isLastPage) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId2",
  "Status": "Status8",
  "Data": [
    {
      "DocumentReference": 190,
      "InvoiceNumber": "InvoiceNumber4",
      "PayerName": "PayerName4",
      "AccountNumber": "AccountNumber8",
      "AccountName": "AccountName4"
    },
    {
      "DocumentReference": 190,
      "InvoiceNumber": "InvoiceNumber4",
      "PayerName": "PayerName4",
      "AccountNumber": "AccountNumber8",
      "AccountName": "AccountName4"
    },
    {
      "DocumentReference": 190,
      "InvoiceNumber": "InvoiceNumber4",
      "PayerName": "PayerName4",
      "AccountNumber": "AccountNumber8",
      "AccountName": "AccountName4"
    }
  ],
  "TotalRecords": 250,
  "TotalRecordsOnPage": 108
}
```

