
# Fee Item Summary All of 0

## Structure

`FeeItemSummaryAllOf0`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FeeTypeGroup` | `String` | Optional | Fee type group in under which the Fee item is generated. | String getFeeTypeGroup() | setFeeTypeGroup(String feeTypeGroup) |
| `FeeTypeId` | `String` | Optional | Fee Type Id ID  Description | String getFeeTypeId() | setFeeTypeId(String feeTypeId) |
| `ProductId` | `Integer` | Optional | Product Id | Integer getProductId() | setProductId(Integer productId) |
| `ProductCode` | `String` | Optional | Product Code | String getProductCode() | setProductCode(String productCode) |
| `ProductName` | `String` | Optional | Product Name | String getProductName() | setProductName(String productName) |
| `ProductGroupId` | `Integer` | Optional | Product Group Id | Integer getProductGroupId() | setProductGroupId(Integer productGroupId) |
| `ProductGroupName` | `String` | Optional | Product Group Name | String getProductGroupName() | setProductGroupName(String productGroupName) |
| `TotalQuantity` | `Double` | Optional | Total Quantity | Double getTotalQuantity() | setTotalQuantity(Double totalQuantity) |
| `TotalInvoiceNetAmount` | `Double` | Optional | Total Net amount in invoice currency | Double getTotalInvoiceNetAmount() | setTotalInvoiceNetAmount(Double totalInvoiceNetAmount) |
| `TotalInvoiceGrossAmount` | `Double` | Optional | Total Gross amount in invoice currency | Double getTotalInvoiceGrossAmount() | setTotalInvoiceGrossAmount(Double totalInvoiceGrossAmount) |
| `TotalInvoiceVATAmount` | `Double` | Optional | Total VAT amount in invoice currency | Double getTotalInvoiceVATAmount() | setTotalInvoiceVATAmount(Double totalInvoiceVATAmount) |
| `InvoiceCurrencyCode` | `String` | Optional | ISO 4217 currency code of the country | String getInvoiceCurrencyCode() | setInvoiceCurrencyCode(String invoiceCurrencyCode) |
| `InvoiceCurrencySymbol` | `String` | Optional | Currency symbol of the Invoice Currency Code | String getInvoiceCurrencySymbol() | setInvoiceCurrencySymbol(String invoiceCurrencySymbol) |

## Example (as JSON)

```json
{
  "FeeTypeGroup": "Account",
  "FeeTypeId": "1",
  "ProductId": 102,
  "ProductCode": "Invoice production fee",
  "ProductName": "Invoice production fee",
  "ProductGroupId": 22,
  "ProductGroupName": "Card related fees",
  "TotalQuantity": 2,
  "TotalInvoiceNetAmount": 22.23,
  "TotalInvoiceGrossAmount": 28.92,
  "TotalInvoiceVATAmount": 10.02,
  "InvoiceCurrencyCode": "GBP",
  "InvoiceCurrencySymbol": "Ã‚Â£"
}
```

