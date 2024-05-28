
# Bonus Configuration

## Structure

`BonusConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricingAccountId` | `Integer` | Optional | Account identifier of the Pricing Account associated with the Payer. | Integer getPricingAccountId() | setPricingAccountId(Integer pricingAccountId) |
| `PricingAccountNumber` | `String` | Optional | Account number of the Pricing Account associated with the Payer. | String getPricingAccountNumber() | setPricingAccountNumber(String pricingAccountNumber) |
| `PricingAccountShortName` | `String` | Optional | Short name of the Pricing Account associated with the Payer. | String getPricingAccountShortName() | setPricingAccountShortName(String pricingAccountShortName) |
| `PricingAccountFullName` | `String` | Optional | Full name of the Pricing Account associated with the Payer. | String getPricingAccountFullName() | setPricingAccountFullName(String pricingAccountFullName) |
| `FeeRuleId` | `Integer` | Optional | Bonus or association bonus configuration identifier that is associated to the payer. | Integer getFeeRuleId() | setFeeRuleId(Integer feeRuleId) |
| `FeeRuleDescription` | `String` | Optional | Bonus or association bonus configuration description that is associated to the payer. | String getFeeRuleDescription() | setFeeRuleDescription(String feeRuleDescription) |
| `FeeRuleDateEffective` | `String` | Optional | The bonus or association bonus configuration becomes effective on the payer from this date.<br>Format: YYYYMMDD | String getFeeRuleDateEffective() | setFeeRuleDateEffective(String feeRuleDateEffective) |
| `FeeRuleDateTerminated` | `String` | Optional | The bonus or association bonus configuration is terminated for the payer on this date.<br>Format: YYYYMMDD | String getFeeRuleDateTerminated() | setFeeRuleDateTerminated(String feeRuleDateTerminated) |
| `BonusPaidTo` | `String` | Optional | Configuration to specify how the bonus is paid.<br>Format: ID-Description<br>Example:<br>1-Pay to Payer<br>2-Pay to invoice levels before the payer<br>3-Pay to specific customer<br>4-Pay to Association Customer<br>5-Pay to Associated Customers | String getBonusPaidTo() | setBonusPaidTo(String bonusPaidTo) |
| `BonusPaidToAccountId` | `Integer` | Optional | Account identifier of the specific account to which the bonus is paid back | Integer getBonusPaidToAccountId() | setBonusPaidToAccountId(Integer bonusPaidToAccountId) |
| `BonusPaidToAccountNumber` | `String` | Optional | Account number of the specific account to which the bonus is paid back | String getBonusPaidToAccountNumber() | setBonusPaidToAccountNumber(String bonusPaidToAccountNumber) |
| `BonusPaidToAccountShortName` | `String` | Optional | Short name of the specific account to which the bonus is paid back | String getBonusPaidToAccountShortName() | setBonusPaidToAccountShortName(String bonusPaidToAccountShortName) |
| `BonusPaidToAccountFullName` | `String` | Optional | Full name of the specific account to which the bonus is paid back | String getBonusPaidToAccountFullName() | setBonusPaidToAccountFullName(String bonusPaidToAccountFullName) |
| `Frequency` | `String` | Optional | Frequency of the configuration.<br>Format: ID-Description<br>Examples:<br>1-Daily (all days)<br>2-Daily (only working days)<br>3-Weekly – Monday | String getFrequency() | setFrequency(String frequency) |
| `NextCalculationDate` | `String` | Optional | The next bonus is calculated for the payer on this date.<br>Format: YYYYMMDD | String getNextCalculationDate() | setNextCalculationDate(String nextCalculationDate) |
| `PreviousCalculatedDate` | `String` | Optional | The previous bonus was calculated for the payer on this date.<br>Format: YYYYMMDD | String getPreviousCalculatedDate() | setPreviousCalculatedDate(String previousCalculatedDate) |
| `FeeRuleBasis` | `String` | Optional | Fee Rule Basis configured.<br>Format: ID-Description<br>Example:<br>1-Currency Per Unit<br>2-Percentage of Uplift<br>3-Lump Sum | String getFeeRuleBasis() | setFeeRuleBasis(String feeRuleBasis) |
| `FeeRuleCurrencyCode` | `String` | Optional | ISO currency code of the currency configured in the Bonus Configuration, if any. | String getFeeRuleCurrencyCode() | setFeeRuleCurrencyCode(String feeRuleCurrencyCode) |
| `FeeRuleCurrencySymbol` | `String` | Optional | Currency symbol of the currency configured in the Bonus Configuration, if any. | String getFeeRuleCurrencySymbol() | setFeeRuleCurrencySymbol(String feeRuleCurrencySymbol) |
| `FeeRuleAvailableFrom` | `String` | Optional | This bonus or association bonus is available from this date.<br>Format: YYYYMMDD | String getFeeRuleAvailableFrom() | setFeeRuleAvailableFrom(String feeRuleAvailableFrom) |
| `FeeRuleAvailableTo` | `String` | Optional | This bonus or association bonus configuration will not be available from this date.<br>Format: YYYYMMDD | String getFeeRuleAvailableTo() | setFeeRuleAvailableTo(String feeRuleAvailableTo) |
| `FeeRuleLocations` | [`List<FeeRuleLocation>`](../../doc/models/fee-rule-location.md) | Optional | - | List<FeeRuleLocation> getFeeRuleLocations() | setFeeRuleLocations(List<FeeRuleLocation> feeRuleLocations) |
| `FeeRuleTiers` | [`List<FeeRuleTier>`](../../doc/models/fee-rule-tier.md) | Optional | - | List<FeeRuleTier> getFeeRuleTiers() | setFeeRuleTiers(List<FeeRuleTier> feeRuleTiers) |
| `AssociatedAccounts` | [`List<AssociatedAccount>`](../../doc/models/associated-account.md) | Optional | - | List<AssociatedAccount> getAssociatedAccounts() | setAssociatedAccounts(List<AssociatedAccount> associatedAccounts) |
| `FeeRuleProducts` | [`List<FeeRuleProduct>`](../../doc/models/fee-rule-product.md) | Optional | - | List<FeeRuleProduct> getFeeRuleProducts() | setFeeRuleProducts(List<FeeRuleProduct> feeRuleProducts) |

## Example (as JSON)

```json
{
  "PricingAccountId": 80,
  "PricingAccountNumber": "PricingAccountNumber0",
  "PricingAccountShortName": "PricingAccountShortName2",
  "PricingAccountFullName": "PricingAccountFullName8",
  "FeeRuleId": 12
}
```

