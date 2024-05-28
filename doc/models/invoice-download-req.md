
# Invoice Download Req

## Structure

`InvoiceDownloadReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoCode` | `Integer` | Required | Collecting Company Code of the selected payer.<br>Mandatory | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerNumber` | `String` | Required | Payer Number of the selected payer.<br>Mandatory<br>Example: GB000000123 | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountNumber` | `List<String>` | Optional | List of Account Numbers of the invoices.<br>Mandatory for customer users else optional. | List<String> getAccountNumber() | setAccountNumber(List<String> accountNumber) |
| `DocumentReference` | `List<Integer>` | Optional | Unique reference ids of invoice document (of zip file).<br>Optional if InvoiceOrSOANumber is passed else Mandatory. | List<Integer> getDocumentReference() | setDocumentReference(List<Integer> documentReference) |
| `InvoiceOrSOANumber` | `String` | Optional | Invoice or the SOA document reference number issued by Card s Platform. | String getInvoiceOrSOANumber() | setInvoiceOrSOANumber(String invoiceOrSOANumber) |

## Example (as JSON)

```json
{
  "ColCoCode": 126,
  "PayerNumber": "PayerNumber0",
  "AccountNumber": [
    "AccountNumber4",
    "AccountNumber5",
    "AccountNumber6"
  ],
  "DocumentReference": [
    117,
    116,
    115
  ],
  "InvoiceOrSOANumber": "InvoiceOrSOANumber0"
}
```

