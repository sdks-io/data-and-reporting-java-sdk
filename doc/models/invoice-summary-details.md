
# Invoice Summary Details

## Structure

`InvoiceSummaryDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalInvoices` | `Integer` | Optional | Total number of invoices matching with the given search criteria. | Integer getTotalInvoices() | setTotalInvoices(Integer totalInvoices) |
| `TotalGrossAmountCustomerCurrency` | `Double` | Optional | Total gross amount in customer currency combined from all the invoices matching with the given search criteria. | Double getTotalGrossAmountCustomerCurrency() | setTotalGrossAmountCustomerCurrency(Double totalGrossAmountCustomerCurrency) |
| `TotalNetAmountCustomerCurrency` | `Double` | Optional | Total net amount in customer currency combined from all the invoices matching with the given search criteria. | Double getTotalNetAmountCustomerCurrency() | setTotalNetAmountCustomerCurrency(Double totalNetAmountCustomerCurrency) |
| `TotalVATAmountCustomerCurrency` | `Double` | Optional | Total VAT amount in customer currency combined from all the invoices matching with the given search criteria. | Double getTotalVATAmountCustomerCurrency() | setTotalVATAmountCustomerCurrency(Double totalVATAmountCustomerCurrency) |
| `CustomerCurrencyCode` | `String` | Optional | Customer currency ISO code.<br>Example: EUR | String getCustomerCurrencyCode() | setCustomerCurrencyCode(String customerCurrencyCode) |
| `CustomerCurrencySymbol` | `String` | Optional | Customer currency code.<br>Example: € | String getCustomerCurrencySymbol() | setCustomerCurrencySymbol(String customerCurrencySymbol) |

## Example (as JSON)

```json
{
  "TotalInvoices": 122,
  "TotalGrossAmountCustomerCurrency": 134.06,
  "TotalNetAmountCustomerCurrency": 45.3,
  "TotalVATAmountCustomerCurrency": 48.56,
  "CustomerCurrencyCode": "CustomerCurrencyCode2"
}
```

