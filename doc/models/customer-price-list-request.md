
# Customer Price List Request

## Structure

`CustomerPriceListRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | - | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | - | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `PayerId` | `Integer` | Optional | Payer Id of the selected payer.<br>Optional if PayerNumber is passed else Mandatory | Integer getPayerId() | setPayerId(Integer payerId) |
| `PayerNumber` | `String` | Optional | Payer Number of the selected payer.<br>Optional if PayerId is passed else Mandatory | String getPayerNumber() | setPayerNumber(String payerNumber) |
| `AccountId` | `Integer` | Optional | Account Id of the customer.<br>Optional | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the customer.<br>Optional | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `CustomerSpecificList` | `Integer` | Optional | Whether customer specific price lists and customer specific discount values set on pump prices are to be returned or not. | Integer getCustomerSpecificList() | setCustomerSpecificList(Integer customerSpecificList) |
| `PriceListType` | `Integer` | Optional | Specifies the type of price lists to be included in the response.<br>Optional – default value is zero.<br><br>Allowed values:<br>0 – All<br>1 – National Only<br>2 – International Only | Integer getPriceListType() | setPriceListType(Integer priceListType) |
| `DelCoId` | `Integer` | Optional | Delivering Company ID<br>Optional. | Integer getDelCoId() | setDelCoId(Integer delCoId) |
| `FromDate` | `String` | Required | Start date to fetch the price lists, discount values on pump prices and VAT rates.<br>Mandatory<br>Format: yyyyMMdd | String getFromDate() | setFromDate(String fromDate) |
| `ToDate` | `String` | Required | End date to fetch the price lists, discount values on pump prices and VAT rates.<br>Mandatory and greater than or equal to FromDate.<br>Maximum of 30 (configurable) day’s duration is allowed between ‘From’ and ‘To’ dates.<br>Format: yyyyMMdd | String getToDate() | setToDate(String toDate) |
| `IncludePumpPriceDiscounts` | `Boolean` | Optional | True / False.<br>A flag to request the discount information set on pump prices for the customer to be included in the response.<br>Optional<br>Default value: False | Boolean getIncludePumpPriceDiscounts() | setIncludePumpPriceDiscounts(Boolean includePumpPriceDiscounts) |

## Example (as JSON)

```json
{
  "ColCoId": 82,
  "ColCoCode": 96,
  "PayerId": 130,
  "PayerNumber": "PayerNumber6",
  "AccountId": 190,
  "FromDate": "FromDate2",
  "ToDate": "ToDate8"
}
```

