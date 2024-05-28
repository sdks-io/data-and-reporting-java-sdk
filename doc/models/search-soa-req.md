
# Search SOA Req

## Structure

`SearchSOAReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code of the selected payer. | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer.<br>Optional if PayerId is passed else Mandatory. | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `InvoiceNumber` | `String` | Optional | Invoice number.<br>Optional.<br>This input is a search criterion, if given. | String getInvoiceNumber() | setInvoiceNumber(String invoiceNumber) |
| `FromDate` | `String` | Optional | SOA searched from this date.<br>Optional.<br>This input is a search criterion, if given.<br>Date format: yyyy/MM/dd | String getFromDate() | setFromDate(String fromDate) |
| `ToDate` | `String` | Optional | Invoice date searched until this date.<br>Optional.<br>This input is a search criterion, if given. | String getToDate() | setToDate(String toDate) |
| `Period` | `Integer` | Optional | Invoice date search period. Valid values -<br>Last 7 days – Issued in last 7 days.<br>Last 30 days – Issued in last 30 days.<br>Last 90 days – Issued in last 90 days.<br>Optional.<br>This input is a search criterion, if given. | Integer getPeriod() | setPeriod(Integer period) |
| `InvoiceDate` | `String` | Optional | Date of invoicing.<br>Optional.<br>This input is a search criterion, if given. | String getInvoiceDate() | setInvoiceDate(String invoiceDate) |
| `InvoiceStatus` | `List<String>` | Optional | Possible options are:<br><br>1. StatementDate ASC<br>2. StatementDate DESC<br>   Optional<br>   Note:<br>   This option uses a column name with a combination of “ASC or DESC” for sorting.<br>   If only the column name is provided, it is sorted by ascending.<br>   Sorting is allowed only ASC or DESC, If both provided in the input ASC will be taken as precedence. | List<String> getInvoiceStatus() | setInvoiceStatus(List<String> invoiceStatus) |
| `SortBy` | `List<Integer>` | Optional | Possible options are:<br><br>1. StatementDate ASC<br>2. StatementDate DESC<br>   Optional<br>   Note:<br>   This option uses a column name with a combination of “ASC or DESC” for sorting.<br>   If only the column name is provided, it is sorted by ascending.<br>   Sorting is allowed only ASC or DESC, If both provided in the input ASC will be taken as precedence. | List<Integer> getSortBy() | setSortBy(List<Integer> sortBy) |
| `ColCoId` | `Integer` | Optional | Collecting Company Id  of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1-Philippines<br>5-UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `PayerId` | `Integer` | Optional | Payer Id  of the selected payer. | Integer getPayerId() | setPayerId(Integer payerId) |

## Example (as JSON)

```json
{
  "ColCoCode": 206,
  "PayerNumber": "PayerNumber2",
  "InvoiceNumber": "InvoiceNumber8",
  "FromDate": "FromDate2",
  "ToDate": "ToDate2"
}
```

