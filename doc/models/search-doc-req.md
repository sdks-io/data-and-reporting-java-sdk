
# Search Doc Req

## Structure

`SearchDocReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PayerNumber` | `String` | Required | Payer Number of the selected payer.<br>Mandatory<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br>Mandatory for customer users else optional.<br>This input is a search criterion, if given.<br>Example: GB000000123 | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountNumberList` | `List<String>` | Optional | Account Number of the customers.<br>optional.<br>This input is a search criterion, if given.<br>Example: [“GB00000123”, “GB00000225”] | List<String> getAccountNumberList() | setAccountNumberList(List<String> accountNumberList) |
| `InvoiceNumber` | `String` | Optional | Invoice number.<br>Optional if InvoiceNumberList is passed else Mandatory<br>This input is a search criterion, if given.<br>Example: 0123456789 | String getInvoiceNumber() | setInvoiceNumber(String invoiceNumber) |
| `InvoiceNumberList` | `List<String>` | Optional | List of Invoice number.<br>Optional if InvoiceNumber is passed else Mandatory<br>Example: [“0123456789”, “0123459799”] | List<String> getInvoiceNumberList() | setInvoiceNumberList(List<String> invoiceNumberList) |
| `InvoiceStatus` | `String` | Optional | The status of the invoices<br>Optional<br>One of the following values:<br>•    NEW<br>•    VIEWED<br>•    DOWNLOADED<br>•    RESTORED | String getInvoiceStatus() | setInvoiceStatus(String invoiceStatus) |
| `IssuingDateFrom` | `String` | Optional | Invoice Issuing Date Range/From<br>Optional<br>Format: yyyy/MM/dd | String getIssuingDateFrom() | setIssuingDateFrom(String issuingDateFrom) |
| `IssuingDateTo` | `String` | Optional | Invoice Issuing Date Range/To<br>Optional<br>Format: yyyy/MM/dd | String getIssuingDateTo() | setIssuingDateTo(String issuingDateTo) |
| `DueDateFrom` | `String` | Optional | Invoice Due Date Range/From<br>Optional<br>Format: yyyy/MM/dd | String getDueDateFrom() | setDueDateFrom(String dueDateFrom) |
| `DueDateTo` | `String` | Optional | Invoice Due Date Range/To<br>Optional<br>Format: yyyy/MM/dd | String getDueDateTo() | setDueDateTo(String dueDateTo) |
| `GrossAmount` | `String` | Optional | Gross amount of the bill.<br>Optional | String getGrossAmount() | setGrossAmount(String grossAmount) |
| `GrossAmountOperator` | `String` | Optional | Criteria on the gross amount, for instance use GT when to retrieve the invoices for that gross amount is greater than the given amount on GrossAmount parameter above.<br>Optional<br><br>This parameter will be ignored if GrossAmount parameter is not set.<br><br>One of the following values:<br>•    LT (Less Than)<br>•    LE (Lesser or Equal)<br>•    EQ (equal)<br>•    GE (Greater or equal)<br>•    GT (Greater than) | String getGrossAmountOperator() | setGrossAmountOperator(String grossAmountOperator) |
| `DocumentType` | `String` | Optional | Document Type<br>Optional<br>One of the following values:<br>•    NAT (National)<br>•    INT (International)<br>•    SOA (Statement of Account) | String getDocumentType() | setDocumentType(String documentType) |
| `VATIssuerCountry` | `String` | Optional | Two letter ISO country code. | String getVATIssuerCountry() | setVATIssuerCountry(String vATIssuerCountry) |
| `SortyBy` | `List<String>` | Optional | Collecting Company Code of the selected payer.<br>Mandatory<br>Example:<br>86-Philippines<br>5-UK | List<String> getSortyBy() | setSortyBy(List<String> sortyBy) |
| `ColCoCode` | `Integer` | Required | Collecting Company Code of the selected payer.<br>Mandatory<br>Example:<br>86-Philippines<br>5-UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |

## Example (as JSON)

```json
{
  "PayerNumber": "PayerNumber0",
  "AccountNumber": "AccountNumber2",
  "AccountNumberList": [
    "AccountNumberList0"
  ],
  "InvoiceNumber": "InvoiceNumber0",
  "InvoiceNumberList": [
    "InvoiceNumberList5"
  ],
  "InvoiceStatus": "InvoiceStatus4",
  "ColCoCode": 50
}
```

