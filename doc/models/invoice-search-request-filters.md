
# Invoice Search Request Filters

## Structure

`InvoiceSearchRequestFilters`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional.<br>Example:<br>1-Philippines<br>5-UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `PayerId` | `Integer` | Optional | Payer Id of the selected payer.<br>Optional if PayerNumber is passed else Mandatory<br>Example: 123456 | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer.<br>Optional if PayerId is passed else Mandatory<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `InvoiceId` | `Integer` | Optional | Invoice id.<br>Optional.<br>This input is a search criterion, if given.<br>Example: 1 | Integer getInvoiceId() | setInvoiceId(Integer invoiceId) |
| `InvoiceNumber` | `String` | Optional | Invoice number.<br>Optional.<br>This input is a search criterion, if given.<br>Example: 0123456789 | String getInvoiceNumber() | setInvoiceNumber(String invoiceNumber) |
| `FromDate` | `String` | Optional | Invoice date searched from this date.<br>Optional.<br>This input is a search criterion, if given.<br>Date format: yyyyMMdd<br>Example: 20170830<br>Note: This criterion is ignored if ‘Period’ is given.<br>Also, this criterion is ignored if ‘ToDate’ is not provided. | String getFromDate() | setFromDate(String fromDate) |
| `ToDate` | `String` | Optional | Invoice date searched until this date.<br>Optional.<br>This input is a search criterion, if given.<br>Date format: yyyyMMdd<br>Example: 20170830<br>Note: This criterion is ignored if ‘Period’ is given.<br>Also, this criterion is ignored if ‘FromDate’ is not provided. | String getToDate() | setToDate(String toDate) |
| `InvoiceDate` | `String` | Optional | Date of invoicing.<br>Optional.<br>This input is a search criterion, if given.<br>Date format: yyyyMMdd<br>Example: 20170830 | String getInvoiceDate() | setInvoiceDate(String invoiceDate) |
| `SummaryDocumentId` | `Integer` | Optional | Summary document id<br>Optional.<br>This input is a search criterion, if given.<br>Example: 1 | Integer getSummaryDocumentId() | setSummaryDocumentId(Integer summaryDocumentId) |
| `SummaryDocumentNumber` | `String` | Optional | Summary document number<br>Optional.<br>This input is a search criterion, if given.<br>Example: ‘0/CZ0000000123456/2017’ | String getSummaryDocumentNumber() | setSummaryDocumentNumber(String summaryDocumentNumber) |
| `StatementOfAccountId` | `String` | Optional | Statement of Account Id of the payment customer.<br>Optional.<br>This input is a search criterion, if given.<br>Example: 1 | String getStatementOfAccountId() | setStatementOfAccountId(String statementOfAccountId) |
| `SoAReferenceNumber` | `String` | Optional | Statement of Account reference number of the payment customer.<br>Optional.<br>This input is a search criterion, if given.<br>Example: 123 | String getSoAReferenceNumber() | setSoAReferenceNumber(String soAReferenceNumber) |
| `Period` | `Integer` | Optional | Invoice date search period. Valid values –<br><br>1. Last 7 days – Issued in last 7 days.<br>2. Last 30 days – Issued in last 30 days.<br>3. Last 90 days – Issued in last 90 days.<br>   Optional.<br>   This input is a search criterion, if given.<br>   Example: 1 | Integer getPeriod() | setPeriod(Integer period) |
| `InvoiceStatus` | `String` | Optional | Status of the invoice. Valid values –<br>•    Due – Invoices due for payment and is within the due date.<br>•    Paid – Fully paid Invoices.<br>•    Overdue – Invoices due of payment and has crossed the due date.<br>•    CreditNote – Credit notes<br>•    CreditStatement<br>Optional.<br>This input is a search criterion, if given. | String getInvoiceStatus() | setInvoiceStatus(String invoiceStatus) |
| `InvoicedOnBehalfOf` | `String` | Optional | ISO code of the country i.e., UK, DE, MY, etc.<br>Optional | String getInvoicedOnBehalfOf() | setInvoicedOnBehalfOf(String invoicedOnBehalfOf) |
| `IncludeEInvoiceDetails` | `Boolean` | Optional | Whether to include the additional invoice details in the API response.<br>Optional. Default value “False”.<br>The parameters that are populated<br>•    DocumentReference<br>•    AdditionalDocuments<br>The above fields will not be present in the response when the respective data is not available in the source system. | Boolean getIncludeEInvoiceDetails() | setIncludeEInvoiceDetails(Boolean includeEInvoiceDetails) |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code of the selected payer.<br>Mandatory - It is mandatory field to external source ATOS for E-invoicing.<br>Example:<br>86-Philippines<br>5-UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `Accounts` | [`List<Accounts>`](../../doc/models/accounts.md) | Optional | - | List<Accounts> getAccounts() | setAccounts(List<Accounts> accounts) |
| `Type` | `String` | Optional | Invoice type. Allowed values –<br>•    Original – Original document.<br>•    Reversal – Reversed document.<br>•    Replacement – Replaced document.<br>Optional. (When not passed all invoice, types are considered for search)<br>This input is a search criterion, if given.<br>Example: Original | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "ColCoId": 170,
  "PayerId": 218,
  "PayerNumber": "PayerNumber0",
  "InvoiceId": 102,
  "InvoiceNumber": "InvoiceNumber0"
}
```

