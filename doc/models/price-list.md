
# Price List

## Structure

`PriceList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Date` | `String` | Optional | Date on which the price is applicable.<br>Format: yyyyMMdd<br>E.g.: 20180131 | String getDate() | setDate(String date) |
| `Day` | `String` | Optional | Day on which the price is applicable.<br>E.g.: Sunday, Monday etc. | String getDay() | setDay(String day) |
| `Type` | `String` | Optional | Price list type.<br>E.g., List, Shell Standard International List | String getType() | setType(String type) |
| `PriceListId` | `Integer` | Optional | Price list ID | Integer getPriceListId() | setPriceListId(Integer priceListId) |
| `PriceListDescription` | `String` | Optional | Price list description<br>E.g., UK Fuels CRT Reseller List Price | String getPriceListDescription() | setPriceListDescription(String priceListDescription) |
| `PriceRuleId` | `Integer` | Optional | Price Rule Id | Integer getPriceRuleId() | setPriceRuleId(Integer priceRuleId) |
| `PriceRuleName` | `String` | Optional | Price Rule Name | String getPriceRuleName() | setPriceRuleName(String priceRuleName) |
| `DelCoId` | `Integer` | Optional | DelCo Id | Integer getDelCoId() | setDelCoId(Integer delCoId) |
| `CountryCode` | `String` | Optional | Country ISO Code<br>E.g., UK, NL, etc., | String getCountryCode() | setCountryCode(String countryCode) |
| `Country` | `String` | Optional | Country<br>E.g., United Kingdom, Netherlands etc | String getCountry() | setCountry(String country) |
| `ProductGroupId` | `Integer` | Optional | Product Group Id | Integer getProductGroupId() | setProductGroupId(Integer productGroupId) |
| `ProductGroupName` | `String` | Optional | Product Group name | String getProductGroupName() | setProductGroupName(String productGroupName) |
| `ProductCode` | `String` | Optional | Client Product Code | String getProductCode() | setProductCode(String productCode) |
| `ProductId` | `Integer` | Optional | Product Id | Integer getProductId() | setProductId(Integer productId) |
| `ProductName` | `String` | Optional | Product name in English | String getProductName() | setProductName(String productName) |
| `PricePerUnit` | `Double` | Optional | Price per unit | Double getPricePerUnit() | setPricePerUnit(Double pricePerUnit) |
| `CurrencyCode` | `String` | Optional | Currency Code.<br>Format : 3 digit ISO code | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `CurrencySymbol` | `String` | Optional | Currency Symbol<br>Example: £ | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `PriceType` | `String` | Optional | Price Type<br>Possible Values are:<br>•	Country– Price rule defined at country whereas Price Rule DelcoId same as ColcoId.<br>•	TPNDelcoPrice – Price rule defined in the TPN whereas Price Rule DelcoId is different from ColcoId.<br>•	NetworkPrice – Price rule defined at Fuel Network level.<br>•	Other – Price rule defined at either Site or SiteGroup level. | String getPriceType() | setPriceType(String priceType) |
| `SiteGroupId` | `Integer` | Optional | Site-Group ID<br>E.g.: 100007 | Integer getSiteGroupId() | setSiteGroupId(Integer siteGroupId) |
| `SiteGroupName` | `String` | Optional | Site-Group name | String getSiteGroupName() | setSiteGroupName(String siteGroupName) |
| `SiteCode` | `Integer` | Optional | Site Code | Integer getSiteCode() | setSiteCode(Integer siteCode) |
| `SiteId` | `Integer` | Optional | Site ID | Integer getSiteId() | setSiteId(Integer siteId) |
| `SiteName` | `String` | Optional | Site Name | String getSiteName() | setSiteName(String siteName) |
| `FuelNetworkId` | `Integer` | Optional | Fuel Network ID | Integer getFuelNetworkId() | setFuelNetworkId(Integer fuelNetworkId) |
| `NetworkName` | `String` | Optional | Network Name | String getNetworkName() | setNetworkName(String networkName) |
| `PriceRuleDelcoId` | `Integer` | Optional | PriceRuleDelcoId | Integer getPriceRuleDelcoId() | setPriceRuleDelcoId(Integer priceRuleDelcoId) |
| `PriceRuleDelcoName` | `String` | Optional | Company Name of the price rule DelCo.<br><br>E.g.:<br>•	Pilipinas Shell Petroleum Corp<br>•	Shell U.K. Oil Products Limited<br>•	G & V SERVICE STATIONS NV | String getPriceRuleDelcoName() | setPriceRuleDelcoName(String priceRuleDelcoName) |
| `PriceRuleCountry` | `String` | Optional | PriceRuleCountry<br>E.g.: United Kingdom | String getPriceRuleCountry() | setPriceRuleCountry(String priceRuleCountry) |
| `PriceRuleCountryCode` | `String` | Optional | ISO Code of PriceRuleCountry<br>E.g.: UK, NL, etc., | String getPriceRuleCountryCode() | setPriceRuleCountryCode(String priceRuleCountryCode) |
| `PriceRuleBasisId` | `Integer` | Optional | PriceRuleBasisId | Integer getPriceRuleBasisId() | setPriceRuleBasisId(Integer priceRuleBasisId) |
| `DiscountValue` | `Double` | Optional | Discount value | Double getDiscountValue() | setDiscountValue(Double discountValue) |
| `PricePerUnitAfterDiscount` | `Double` | Optional | Price per unit after discount | Double getPricePerUnitAfterDiscount() | setPricePerUnitAfterDiscount(Double pricePerUnitAfterDiscount) |
| `VATPercentage` | `Double` | Optional | VAT Percentage | Double getVATPercentage() | setVATPercentage(Double vATPercentage) |
| `PriceRuleCategoryId` | `Integer` | Optional | PriceRuleCategoryId | Integer getPriceRuleCategoryId() | setPriceRuleCategoryId(Integer priceRuleCategoryId) |
| `Tiers` | [`List<Tier>`](../../doc/models/tier.md) | Optional | - | List<Tier> getTiers() | setTiers(List<Tier> tiers) |

## Example (as JSON)

```json
{
  "Date": "Date8",
  "Day": "Day4",
  "Type": "Type0",
  "PriceListId": 210,
  "PriceListDescription": "PriceListDescription0"
}
```

