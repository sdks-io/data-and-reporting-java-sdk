
# Invoice Dates Request Filters

## Structure

`InvoiceDatesRequestFilters`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoCode` | `Integer` | Optional | Collecting Company Code of the selected payer.<br>Mandatory for serviced OUs such as Romania, Latvia, Lithuania, Estonia, Ukraine etc. It is optional for other countries if ColCoID is provided.<br>Example:<br>86-Philippines<br>5-UK | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `ColCoId` | `Integer` | Optional | Collecting Company Id of the selected payer.<br>Optional if ColCoCode is passed else Mandatory.<br>Example:<br>1-Philippines<br>5-UK | Integer getColCoId() | setColCoId(Integer colCoId) |
| `PayerId` | `Integer` | Optional | Payer Id of the selected payer.<br>Optional if PayerNumber is passed else Mandatory | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer.<br>Optional if PayerId is passed else Mandatory | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `FromDate` | `String` | Optional | Invoice date searched from this date.<br>Optional.<br>This input is a search criterion, if given.<br>Date format: yyyyMMdd | String getFromDate() | setFromDate(String fromDate) |
| `ToDate` | `String` | Optional | Invoice date searched until this date.<br>Optional.<br>This input is a search criterion, if given.<br>Date format: yyyyMMdd | String getToDate() | setToDate(String toDate) |
| `Accounts` | [`List<Accounts>`](../../doc/models/accounts.md) | Optional | - | List<Accounts> getAccounts() | setAccounts(List<Accounts> accounts) |

## Example (as JSON)

```json
{
  "ColCoCode": 184,
  "ColCoId": 170,
  "PayerId": 218,
  "PayerNumber": "PayerNumber4",
  "FromDate": "FromDate0"
}
```

