
# Usage Summary

## Structure

`UsageSummary`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Date` | `String` | Optional | Transaction date.<br>The records will be sorted by this field in ascending order.<br><br>Format: yyyyMMdd | String getDate() | setDate(String date) |
| `ProductId` | `Integer` | Optional | Product Id | Integer getProductId() | setProductId(Integer productId) |
| `ProductCode` | `String` | Optional | Client Product code | String getProductCode() | setProductCode(String productCode) |
| `ProductName` | `String` | Optional | Product name in English | String getProductName() | setProductName(String productName) |
| `IsFuelProduct` | `Boolean` | Optional | Whether the product is fuel or non-fuel | Boolean getIsFuelProduct() | setIsFuelProduct(Boolean isFuelProduct) |
| `SiteGroupId` | `Integer` | Optional | Site Group Id | Integer getSiteGroupId() | setSiteGroupId(Integer siteGroupId) |
| `SiteGroupName` | `String` | Optional | Site Group Name | String getSiteGroupName() | setSiteGroupName(String siteGroupName) |
| `TotalVolume` | `Double` | Optional | Total Volume | Double getTotalVolume() | setTotalVolume(Double totalVolume) |
| `TotalGross` | `Double` | Optional | Total Gross in Customer Currency | Double getTotalGross() | setTotalGross(Double totalGross) |
| `TotalNet` | `Double` | Optional | Total Net in Customer Currency | Double getTotalNet() | setTotalNet(Double totalNet) |
| `CurrencyCode` | `String` | Optional | Customer Currency Code | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `CurrencySymbol` | `String` | Optional | Customer Currency Symbol | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `ProductGroupID` | `Integer` | Optional | Product group ID | Integer getProductGroupID() | setProductGroupID(Integer productGroupID) |
| `ProductGroupName` | `String` | Optional | Product group Name | String getProductGroupName() | setProductGroupName(String productGroupName) |

## Example (as JSON)

```json
{
  "Date": "Date0",
  "ProductId": 198,
  "ProductCode": "ProductCode6",
  "ProductName": "ProductName6",
  "IsFuelProduct": false
}
```

