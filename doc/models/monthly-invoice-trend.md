
# Monthly Invoice Trend

## Structure

`MonthlyInvoiceTrend`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyCode` | `String` | Optional | ISO code of invoice currency.<br>Example: EUR | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `CurrencySymbol` | `String` | Optional | Symbol of invoice currency.<br>Example: € | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `Month` | `Integer` | Optional | Month. | Integer getMonth() | setMonth(Integer month) |
| `TotalNetAmount` | `Double` | Optional | Total net amount invoiced in this month. | Double getTotalNetAmount() | setTotalNetAmount(Double totalNetAmount) |
| `TotalVATAmount` | `Double` | Optional | Total VAT amount invoiced in this month. | Double getTotalVATAmount() | setTotalVATAmount(Double totalVATAmount) |
| `Year` | `Integer` | Optional | Year. | Integer getYear() | setYear(Integer year) |

## Example (as JSON)

```json
{
  "CurrencyCode": "CurrencyCode8",
  "CurrencySymbol": "CurrencySymbol4",
  "Month": 36,
  "TotalNetAmount": 98.02,
  "TotalVATAmount": 158.14
}
```

