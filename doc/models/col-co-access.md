
# Col Co Access

## Structure

`ColCoAccess`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoId` | `Integer` | Optional | Collecting company ID. | Integer getColCoId() | setColCoId(Integer colCoId) |
| `ColCoCode` | `Integer` | Optional | Collecting company code. | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `ColCoCountryName` | `String` | Optional | Collecting company’s Country name. ex: United Kingdom | String getColCoCountryName() | setColCoCountryName(String colCoCountryName) |
| `IssuingCountryNumber` | `String` | Optional | Issuing Country Number.<br><br>ex: 032 - Czech Republic | String getIssuingCountryNumber() | setIssuingCountryNumber(String issuingCountryNumber) |

## Example (as JSON)

```json
{
  "ColCoId": 14,
  "ColCoCode": 14,
  "ColCoCountryName": "DE",
  "IssuingCountryNumber": "DE"
}
```

