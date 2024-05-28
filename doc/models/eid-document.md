
# EID Document

## Structure

`EIDDocument`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DocumentId` | `Integer` | Optional | Technical identifier for the EID file. Should not be stored in database as it is not guaranteed to stay unchanged over time. | Integer getDocumentId() | setDocumentId(Integer documentId) |
| `AccountGroupId` | `String` | Optional | Account Group Id | String getAccountGroupId() | setAccountGroupId(String accountGroupId) |
| `AccountGroupName` | `String` | Optional | Account group name | String getAccountGroupName() | setAccountGroupName(String accountGroupName) |
| `DocumentType` | `String` | Optional | Document type.<br>Possible values:<br>•	NAT (National)<br>•	INT (International) | String getDocumentType() | setDocumentType(String documentType) |
| `DocumentFormat` | `String` | Optional | Document format (CHORUS, DIFI etc.) | String getDocumentFormat() | setDocumentFormat(String documentFormat) |
| `DocumentDate` | `String` | Optional | Document date.<br>Example: 20170101 | String getDocumentDate() | setDocumentDate(String documentDate) |
| `NumberOfInvoices` | `Integer` | Optional | Number of invoices | Integer getNumberOfInvoices() | setNumberOfInvoices(Integer numberOfInvoices) |
| `FileSize` | `Integer` | Optional | Document size | Integer getFileSize() | setFileSize(Integer fileSize) |
| `DocumentStatus` | `String` | Optional | Document status.<br>Possible values:<br>•	NEW<br>•	VIEWED<br>•	DOWNLOADED<br>•	RESTORED | String getDocumentStatus() | setDocumentStatus(String documentStatus) |
| `DocumentName` | `String` | Optional | Document file name. | String getDocumentName() | setDocumentName(String documentName) |

## Example (as JSON)

```json
{
  "DocumentId": 250,
  "AccountGroupId": "AccountGroupId2",
  "AccountGroupName": "AccountGroupName0",
  "DocumentType": "DocumentType8",
  "DocumentFormat": "DocumentFormat4"
}
```

