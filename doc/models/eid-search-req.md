
# EID Search Req

## Structure

`EIDSearchReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoCode` | `Integer` | Required | Collecting Company Code of the selected payer.<br>Mandatory | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `AccountGroupCountry` | `Integer` | Required | Country code (colco code) of the account group.<br>Mandatory | Integer getAccountGroupCountry() | setAccountGroupCountry(Integer accountGroupCountry) |
| `AccountGroupId` | `List<String>` | Required | List of IDs of the account groups that user has access to.<br>Mandatory | List<String> getAccountGroupId() | setAccountGroupId(List<String> accountGroupId) |
| `AccountGroupName` | `String` | Optional | Account group name<br>Optional.<br>This input is a search criterion, if given. | String getAccountGroupName() | setAccountGroupName(String accountGroupName) |
| `FromDate` | `String` | Optional | EID date searched from this date.<br>Optional. | String getFromDate() | setFromDate(String fromDate) |
| `ToDate` | `String` | Optional | Invoice date searched until this date.<br>Optional. | String getToDate() | setToDate(String toDate) |
| `InvoiceType` | `String` | Optional | Invoice type.<br>Optional.<br>Possible values:<br>•	NAT (National)<br>•	INT (International) | String getInvoiceType() | setInvoiceType(String invoiceType) |
| `InvoiceStatus` | `String` | Optional | Status of the document.<br>Optional.<br>Possible values:<br>•	NEW<br>•	VIEWED<br>•	DOWNLOADED<br>•	RESTORED | String getInvoiceStatus() | setInvoiceStatus(String invoiceStatus) |
| `SortBy` | `List<String>` | Optional | Sort option –<br>•    InvoiceNumber ASC<br>•    InvoiceDate ASC<br>•    InvoiceNumber DESC<br>•    InvoiceDate DESC<br>Optional | List<String> getSortBy() | setSortBy(List<String> sortBy) |

## Example (as JSON)

```json
{
  "ColCoCode": 222,
  "AccountGroupCountry": 138,
  "AccountGroupId": [
    "AccountGroupId7",
    "AccountGroupId8"
  ],
  "AccountGroupName": "AccountGroupName8",
  "FromDate": "FromDate4",
  "ToDate": "ToDate4",
  "InvoiceType": "InvoiceType6",
  "InvoiceStatus": "InvoiceStatus2"
}
```

