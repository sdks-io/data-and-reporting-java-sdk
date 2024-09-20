
# Priced Trans Summary Response Transactions Summary Items

## Structure

`PricedTransSummaryResponseTransactionsSummaryItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductId` | `Integer` | Optional | Product Id | Integer getProductId() | setProductId(Integer productId) |
| `ProductCode` | `String` | Optional | Product Code<br>Examples:<br>10    TMF Charges<br>11    Tunnel/Bridges<br>12    Motorway toll<br>13    Ferries | String getProductCode() | setProductCode(String productCode) |
| `ProductName` | `String` | Optional | Product Name<br>Examples:<br>Unleaded - High octane<br>Unleaded - Medium octane<br>Unleaded - Low octane<br>Unleaded Environmental | String getProductName() | setProductName(String productName) |
| `ProductGroupId` | `Integer` | Optional | Product Group Id<br>Example:<br>1    Parent Product Group<br>2    All Fuels<br>3    Motor gasoline<br>4    2 stroke<br>5    Autogas<br>6    CNG | Integer getProductGroupId() | setProductGroupId(Integer productGroupId) |
| `ProductGroupName` | `String` | Optional | Product Group Name<br>Example:<br>1    Parent Product Group<br>2    All Fuels<br>3    Motor gasoline<br>4    2 stroke<br>5    Autogas<br>6    CNG<br>7    Automotive Gas Oil | String getProductGroupName() | setProductGroupName(String productGroupName) |
| `SiteGroupId` | `Integer` | Optional | Site Group Id<br>Example: 202 | Integer getSiteGroupId() | setSiteGroupId(Integer siteGroupId) |
| `SiteGroupName` | `String` | Optional | Site Group Name<br>Example: CZ 9100 ECONOMY NETWORK | String getSiteGroupName() | setSiteGroupName(String siteGroupName) |
| `TotalFuelQuantity` | `Integer` | Optional | Total Fuel Quantity | Integer getTotalFuelQuantity() | setTotalFuelQuantity(Integer totalFuelQuantity) |
| `TotalNetAmount` | `Integer` | Optional | Total Net amount in invoice currency | Integer getTotalNetAmount() | setTotalNetAmount(Integer totalNetAmount) |
| `TotalGrossAmount` | `Integer` | Optional | Total Gross amount in invoice currency | Integer getTotalGrossAmount() | setTotalGrossAmount(Integer totalGrossAmount) |
| `InvoiceCurrencyCode` | `String` | Optional | ISO currency code<br>Example: GBP | String getInvoiceCurrencyCode() | setInvoiceCurrencyCode(String invoiceCurrencyCode) |
| `InvoiceCurrencySymbol` | `String` | Optional | Currency symbol of the Invoice Currency Code<br>Example: £, $ | String getInvoiceCurrencySymbol() | setInvoiceCurrencySymbol(String invoiceCurrencySymbol) |
| `CustomerRetailValueTotalNet` | `Double` | Optional | Sum of the retail net price | Double getCustomerRetailValueTotalNet() | setCustomerRetailValueTotalNet(Double customerRetailValueTotalNet) |
| `CustomerRetailValueTotalGross` | `Double` | Optional | Sum of the retail gross price | Double getCustomerRetailValueTotalGross() | setCustomerRetailValueTotalGross(Double customerRetailValueTotalGross) |

## Example (as JSON)

```json
{
  "ProductId": 164,
  "ProductCode": "ProductCode2",
  "ProductName": "ProductName8",
  "ProductGroupId": 92,
  "ProductGroupName": "ProductGroupName4"
}
```

