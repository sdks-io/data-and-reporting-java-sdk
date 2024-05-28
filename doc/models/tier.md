
# Tier

## Structure

`Tier`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TierPriceListId` | `Integer` | Optional | The price list if reference price is list price.<br>Only used when the Price Rule category is set to.<br>‘Tiered Pricing’. | Integer getTierPriceListId() | setTierPriceListId(Integer tierPriceListId) |
| `PriceListDescription` | `String` | Optional | Price list description of the tier. | String getPriceListDescription() | setPriceListDescription(String priceListDescription) |
| `TierMin` | `Integer` | Optional | Minimum tier volume<br>E.g., 500 | Integer getTierMin() | setTierMin(Integer tierMin) |
| `TierMax` | `Integer` | Optional | Maximum tier volume<br>E.g., 1000 | Integer getTierMax() | setTierMax(Integer tierMax) |
| `TieredPricingGroupName` | `String` | Optional | Pricing group name of tier | String getTieredPricingGroupName() | setTieredPricingGroupName(String tieredPricingGroupName) |
| `TieredPricingGroupPeriod` | `String` | Optional | Tiered pricing group period.<br>Possible Values<br><br>1. Monthly<br>2. Quarterly<br>3. Semi Annually<br>4. Annual | String getTieredPricingGroupPeriod() | setTieredPricingGroupPeriod(String tieredPricingGroupPeriod) |
| `DiscountValue` | `Double` | Optional | Discount value to be applied to the List price or pump price. | Double getDiscountValue() | setDiscountValue(Double discountValue) |
| `PricePerUnit` | `Double` | Optional | Price per unit after discount<br>Note: This field will not contain any value for discounts on retail prices. | Double getPricePerUnit() | setPricePerUnit(Double pricePerUnit) |
| `PricePerUnitAfterDiscount` | `Double` | Optional | Price per unit (List Price)<br>Note: This field will not contain any value for discounts on retail prices. | Double getPricePerUnitAfterDiscount() | setPricePerUnitAfterDiscount(Double pricePerUnitAfterDiscount) |

## Example (as JSON)

```json
{
  "TierPriceListId": 46,
  "PriceListDescription": "PriceListDescription4",
  "TierMin": 186,
  "TierMax": 250,
  "TieredPricingGroupName": "TieredPricingGroupName2"
}
```

