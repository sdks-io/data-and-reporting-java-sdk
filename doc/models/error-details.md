
# Error Details

## Structure

`ErrorDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | Error code representing the error encountered | String getCode() | setCode(String code) |
| `Title` | `String` | Optional | Error type description | String getTitle() | setTitle(String title) |
| `Detail` | `String` | Optional | Detailed inforamtion about the error | String getDetail() | setDetail(String detail) |
| `AdditionalInfo` | `Map<String, String>` | Optional | Applicable when more details related to error to be returned | Map<String, String> getAdditionalInfo() | setAdditionalInfo(Map<String, String> additionalInfo) |

## Example (as JSON)

```json
{
  "Code": "Code2",
  "Title": "Title8",
  "Detail": "Detail4",
  "AdditionalInfo": {
    "key0": "AdditionalInfo2"
  }
}
```

