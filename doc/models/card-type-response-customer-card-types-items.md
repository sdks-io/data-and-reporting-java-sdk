
# Card Type Response Customer Card Types Items

## Structure

`CardTypeResponseCustomerCardTypesItems`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardTypeId` | `Integer` | Optional | Card Type Id in Cards Platform. | Integer getCardTypeId() | setCardTypeId(Integer cardTypeId) |
| `TokenTypeId` | `Integer` | Optional | Token type identifier. | Integer getTokenTypeId() | setTokenTypeId(Integer tokenTypeId) |
| `CardTypeName` | `String` | Optional | Card Type Name. | String getCardTypeName() | setCardTypeName(String cardTypeName) |
| `TokenTypeName` | `String` | Optional | Token Type Name. | String getTokenTypeName() | setTokenTypeName(String tokenTypeName) |
| `PANLength` | `Integer` | Optional | PAN Length. | Integer getPANLength() | setPANLength(Integer pANLength) |
| `ExpiryPeriod` | `Integer` | Optional | Default Expiry period. | Integer getExpiryPeriod() | setExpiryPeriod(Integer expiryPeriod) |
| `IsNational` | `Boolean` | Optional | True/False – Whether it is a National Card type or not. | Boolean getIsNational() | setIsNational(Boolean isNational) |
| `IsInternational` | `Boolean` | Optional | True/False – Whether it is an International Card type or not. | Boolean getIsInternational() | setIsInternational(Boolean isInternational) |
| `IsCRT` | `Boolean` | Optional | True/False – Wether it is a CRT Card type or not. | Boolean getIsCRT() | setIsCRT(Boolean isCRT) |
| `IsFleet` | `Boolean` | Optional | True/False – Whether it is it a Fleet Card typeor not. | Boolean getIsFleet() | setIsFleet(Boolean isFleet) |
| `IsShellSitesOnly` | `Boolean` | Optional | True/False – Whether it is only allowed in Shell Stations or not. | Boolean getIsShellSitesOnly() | setIsShellSitesOnly(Boolean isShellSitesOnly) |
| `IsPartnerSitesIncluded` | `Boolean` | Optional | True/False – Whether this card type is allowed in partner Stations. | Boolean getIsPartnerSitesIncluded() | setIsPartnerSitesIncluded(Boolean isPartnerSitesIncluded) |
| `CanHavePIN` | `Boolean` | Optional | True/False – Whether the cards of this card type can have PIN. | Boolean getCanHavePIN() | setCanHavePIN(Boolean canHavePIN) |
| `IsVirtual` | `Boolean` | Optional | True/False - Whether it is a Virtual Card type or not. | Boolean getIsVirtual() | setIsVirtual(Boolean isVirtual) |
| `IsActive` | `Boolean` | Optional | Whether card type is active or not. | Boolean getIsActive() | setIsActive(Boolean isActive) |
| `IsCardAvailableForDownload` | `Boolean` | Optional | Whether card type is available for download. | Boolean getIsCardAvailableForDownload() | setIsCardAvailableForDownload(Boolean isCardAvailableForDownload) |
| `ColCoCurrencyCode` | `String` | Optional | ISO currency code of the country. | String getColCoCurrencyCode() | setColCoCurrencyCode(String colCoCurrencyCode) |
| `ColCoCurrencySymbol` | `String` | Optional | Currency symbol of the country. | String getColCoCurrencySymbol() | setColCoCurrencySymbol(String colCoCurrencySymbol) |
| `EMVContactless` | `Boolean` | Optional | Is Europay, MasterCard, and Visa Contactless enabled or not. | Boolean getEMVContactless() | setEMVContactless(Boolean eMVContactless) |
| `RFID` | `Boolean` | Optional | Whether the card type is enabled for RFID (Radio Frequency Identification) | Boolean getRFID() | setRFID(Boolean rFID) |
| `PINChangeSupported` | `Boolean` | Optional | PIN change supported or not. | Boolean getPINChangeSupported() | setPINChangeSupported(Boolean pINChangeSupported) |
| `RequirePIN` | `Boolean` | Optional | Whether a PIN is mandatory for the cards of this card type. | Boolean getRequirePIN() | setRequirePIN(Boolean requirePIN) |
| `OfflinePIN` | `Boolean` | Optional | Whether offline PIN is enabled or not. | Boolean getOfflinePIN() | setOfflinePIN(Boolean offlinePIN) |
| `MediumTypeID` | `Integer` | Optional | Id of the medium type identifier. <br><br> Full list below - <br> 1 - Fuel Card <br> 2 - Fuel Card with EV <br> 3 - EV only  <br> 4 - Fuel Card and Key Fob <br> 5 - Key Fob <br> 6 - Virtual Card <br> 7 - NPII Token <br> 8 – Smartpay Token | Integer getMediumTypeID() | setMediumTypeID(Integer mediumTypeID) |
| `MediumType` | `String` | Optional | Name of the medium type identifier. <br><br> Full list below - <br> 1 - Fuel Card <br> 2 - Fuel Card with EV <br> 3 - EV only  <br> 4 - Fuel Card and Key Fob <br> 5 - Key Fob <br> 6 - Virtual Card <br> 7 - NPII Token <br> 8 – Smartpay Token | String getMediumType() | setMediumType(String mediumType) |
| `CartTypeAccounts` | [`List<CartTypeAccount>`](../../doc/models/cart-type-account.md) | Optional | List of accounts. | List<CartTypeAccount> getCartTypeAccounts() | setCartTypeAccounts(List<CartTypeAccount> cartTypeAccounts) |
| `PurchaseCategories` | [`List<PurchaseCategories>`](../../doc/models/purchase-categories.md) | Optional | - | List<PurchaseCategories> getPurchaseCategories() | setPurchaseCategories(List<PurchaseCategories> purchaseCategories) |

## Example (as JSON)

```json
{
  "CardTypeId": 7077861,
  "TokenTypeId": 1234,
  "CardTypeName": "Philippines CRT",
  "TokenTypeName": "PH FLE NAT SIN R1",
  "PANLength": 12,
  "ExpiryPeriod": 30,
  "IsNational": true,
  "IsInternational": true,
  "IsCRT": true,
  "IsFleet": true,
  "IsShellSitesOnly": true,
  "IsPartnerSitesIncluded": true,
  "CanHavePIN": true,
  "IsVirtual": true,
  "IsActive": true,
  "IsCardAvailableForDownload": true,
  "ColCoCurrencyCode": "GBP",
  "ColCoCurrencySymbol": "£",
  "EMVContactless": true,
  "RFID": true,
  "PINChangeSupported": true,
  "RequirePIN": true,
  "OfflinePIN": true,
  "MediumTypeID": 8,
  "MediumType": "Smartpay Token"
}
```

