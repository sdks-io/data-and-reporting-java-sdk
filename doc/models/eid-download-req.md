
# EID Download Req

## Structure

`EIDDownloadReq`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ColCoCode` | `Integer` | Required | Collecting Company Code of the selected payer.<br>Mandatory | Integer getColCoCode() | setColCoCode(Integer colCoCode) |
| `EIDList` | `List<String>` | Required | - | List<String> getEIDList() | setEIDList(List<String> eIDList) |
| `AccountGroupCountry` | `Integer` | Required | ColCo code associated with the Account Group IDs of the given EID/EDI files.<br>Mandatory | Integer getAccountGroupCountry() | setAccountGroupCountry(Integer accountGroupCountry) |
| `AccountGroupIdList` | `List<String>` | Required | - | List<String> getAccountGroupIdList() | setAccountGroupIdList(List<String> accountGroupIdList) |

## Example (as JSON)

```json
{
  "ColCoCode": 92,
  "EIDList": [
    "EIDList2",
    "EIDList3"
  ],
  "AccountGroupCountry": 8,
  "AccountGroupIdList": [
    "AccountGroupIdList5",
    "AccountGroupIdList4",
    "AccountGroupIdList3"
  ]
}
```

