
# EID Document Response

## Structure

`EIDDocumentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Indicates overall status of the request. Allowed values: SUCCESS, FAILED | String getStatus() | setStatus(String status) |
| `Document` | [`List<EIDDocument>`](../../doc/models/eid-document.md) | Optional | - | List<EIDDocument> getDocument() | setDocument(List<EIDDocument> document) |
| `PageSize` | `Integer` | Optional | Number of records returned in the response | Integer getPageSize() | setPageSize(Integer pageSize) |
| `Page` | `Integer` | Optional | Current page | Integer getPage() | setPage(Integer page) |
| `TotalPages` | `Integer` | Optional | Total number of pages available for the requested data | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `TotalRecords` | `Integer` | Optional | Total number of elements corresponding to the request | Integer getTotalRecords() | setTotalRecords(Integer totalRecords) |
| `IsFirstPage` | `Boolean` | Optional | True if it is the first page, false otherwise | Boolean getIsFirstPage() | setIsFirstPage(Boolean isFirstPage) |
| `IsLastPage` | `Boolean` | Optional | True if it is the last page, false, otherwise. | Boolean getIsLastPage() | setIsLastPage(Boolean isLastPage) |

## Example (as JSON)

```json
{
  "RequestId": "RequestId8",
  "Status": "Status4",
  "Document": [
    {
      "DocumentId": 66,
      "AccountGroupId": "AccountGroupId0",
      "AccountGroupName": "AccountGroupName8",
      "DocumentType": "DocumentType6",
      "DocumentFormat": "DocumentFormat2"
    }
  ],
  "PageSize": 188,
  "Page": 208
}
```

