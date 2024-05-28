
# Invoice Search Additional Document

Invoice document reference number for the additional invoice files such as KSeF file (Poland). This field is optional, and it will be missing if additional documents are not applicable. Also, it will not be populated if the invoice date is older than 13 months.

## Structure

`InvoiceSearchAdditionalDocument`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reference` | `String` | Optional | Unique ID for the additional invoice document. | String getReference() | setReference(String reference) |
| `Type` | `String` | Optional | Type of the additional document.<br>Mandatory<br>Possible values:<br>•	KSeF - Applicable for Poland market. | String getType() | setType(String type) |
| `IsApplicable` | `String` | Optional | True if a KSeF PDF will be produced for the customer. | String getIsApplicable() | setIsApplicable(String isApplicable) |

## Example (as JSON)

```json
{
  "Reference": "Reference6",
  "Type": "Type4",
  "IsApplicable": "IsApplicable2"
}
```

