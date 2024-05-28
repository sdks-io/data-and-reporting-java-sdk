
# Statement of Account Request Filters

## Structure

`StatementOfAccountRequestFilters`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code (Shell Code) of the selected payer.<br>Optional If ColCo Id is passed else Mandatory. | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerId` | `Integer` | Optional | Payer Id of the selected payer.<br>Optional if PayerNumber is passed else Mandatory. | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer.<br>Optional if PayerId is passed else Mandatory. | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `IncludeMonthlyInvoiceTrend` | `Boolean` | Optional | True/False.<br>Optional. Default is False.<br>True if the past 13 monthly invoice trend to be included as part of the response. Else false. | Boolean getIncludeMonthlyInvoiceTrend() | setIncludeMonthlyInvoiceTrend(Boolean includeMonthlyInvoiceTrend) |
| `IncludePastStatementOfAccounts` | `Boolean` | Optional | True/False.<br>Optional. Default is False.<br>True if the past X SOA documents are to be included as part of the response. Else false. | Boolean getIncludePastStatementOfAccounts() | setIncludePastStatementOfAccounts(Boolean includePastStatementOfAccounts) |
| `DueOrOverDueSOADocumentsOnly` | `Boolean` | Optional | True/False<br>Optional Default is False.<br>If true PastStatementOfAccounts entity on this API output should contain the SOA documents that are due or overdue only. | Boolean getDueOrOverDueSOADocumentsOnly() | setDueOrOverDueSOADocumentsOnly(Boolean dueOrOverDueSOADocumentsOnly) |
| `NumberOfSOADocuments` | `Integer` | Optional | This parameter is only applicable when “IncludePastStatementOfAccounts” parameter is set to True. | Integer getNumberOfSOADocuments() | setNumberOfSOADocuments(Integer numberOfSOADocuments) |
| `IncludeAccountInvoicesSummary` | `Boolean` | Optional | True/False<br>Optional.<br>Default value is false.<br>When true InvoicesSummaries list will be returned in the API output. | Boolean getIncludeAccountInvoicesSummary() | setIncludeAccountInvoicesSummary(Boolean includeAccountInvoicesSummary) |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional If ColCo Code is passed else Mandatory. | Integer getColCoId() | setColCoId(Integer colCoId) |
| `Accounts` | [`List<Accounts>`](../../doc/models/accounts.md) | Optional | - | List<Accounts> getAccounts() | setAccounts(List<Accounts> accounts) |

## Example (as JSON)

```json
{
  "ColCoCode": 14,
  "PayerId": 48,
  "PayerNumber": "PayerNumber8",
  "IncludeMonthlyInvoiceTrend": false,
  "IncludePastStatementOfAccounts": false
}
```

