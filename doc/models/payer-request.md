
# Payer Request

## Structure

`PayerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payers` | [`List<Payers>`](../../doc/models/payers.md) | Optional | List of Payer entity.<br>Optional.<br>Note:<br>•    Max number of payers allowed in the input is 10, if it exceeds in the input it will throw an error.<br>•    This value is configurable. Initial configuration will be 1000 and will change to 10 once SFH changes are integrated. | List<Payers> getPayers() | setPayers(List<Payers> payers) |
| `ReturnBasicDetailsOnly` | `Boolean` | Optional | Returns only the high-level basic details of payers. Set this field to ‘true’ when only the basic details are required to get the result quicker.<br><br>**Default**: `false` | Boolean getReturnBasicDetailsOnly() | setReturnBasicDetailsOnly(Boolean returnBasicDetailsOnly) |
| `IncludeAddresses` | `Boolean` | Optional | Include address related fields on the response. Set this field to ‘False’ when Address fields are not required to get the result quicker.<br><br>**Default**: `false` | Boolean getIncludeAddresses() | setIncludeAddresses(Boolean includeAddresses) |
| `IncludeBonusParameters` | `Boolean` | Optional | Include the Finance Currency, used for Finance Widget, in the response<br><br>**Default**: `false` | Boolean getIncludeBonusParameters() | setIncludeBonusParameters(Boolean includeBonusParameters) |

## Example (as JSON)

```json
{
  "ReturnBasicDetailsOnly": false,
  "IncludeAddresses": false,
  "IncludeBonusParameters": false,
  "Payers": [
    {
      "ColCoId": 78,
      "ColCoCode": 92,
      "PayerId": 126,
      "PayerNumber": "PayerNumber0",
      "PayerName": "PayerName0"
    }
  ]
}
```

