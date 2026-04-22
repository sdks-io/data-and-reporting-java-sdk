
# Cart Type Account

## Structure

`CartTypeAccount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `Integer` | Optional | Account Id of the customer. | Integer getAccountId() | setAccountId(Integer accountId) |
| `AccountNumber` | `String` | Optional | Account Number of the customer. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `IsDefault` | `Boolean` | Optional | Whether card type is default or not. | Boolean getIsDefault() | setIsDefault(Boolean isDefault) |
| `CustomerCardTypeId` | `Integer` | Optional | Customer Card Type Id in Cards Platform. | Integer getCustomerCardTypeId() | setCustomerCardTypeId(Integer customerCardTypeId) |
| `IsVisibleToCustomers` | `Boolean` | Optional | True/False – Whether the card type can be used for card ordering. <br><br> Note - IsVisibleToCustomers will be set as ‘false’ when the card type is not active or. configured in MS to be not visible. | Boolean getIsVisibleToCustomers() | setIsVisibleToCustomers(Boolean isVisibleToCustomers) |
| `EmbossAccountName` | `String` | Optional | Default Name to be embossed on the card. | String getEmbossAccountName() | setEmbossAccountName(String embossAccountName) |
| `DefaultPurchaseCategoryId` | `Integer` | Optional | Default Purchase category of the card type. | Integer getDefaultPurchaseCategoryId() | setDefaultPurchaseCategoryId(Integer defaultPurchaseCategoryId) |
| `UsageRestrictions` | [`CardUsageRestrictions`](../../doc/models/card-usage-restrictions.md) | Optional | - | CardUsageRestrictions getUsageRestrictions() | setUsageRestrictions(CardUsageRestrictions usageRestrictions) |
| `DayTimeRestrictions` | [`CardDayTimeRestrictions`](../../doc/models/card-day-time-restrictions.md) | Optional | - | CardDayTimeRestrictions getDayTimeRestrictions() | setDayTimeRestrictions(CardDayTimeRestrictions dayTimeRestrictions) |

## Example (as JSON)

```json
{
  "AccountId": 1234,
  "AccountNumber": "GB000000123",
  "IsDefault": true,
  "CustomerCardTypeId": 1,
  "IsVisibleToCustomers": true,
  "EmbossAccountName": "abcd1234",
  "DefaultPurchaseCategoryId": 34
}
```

