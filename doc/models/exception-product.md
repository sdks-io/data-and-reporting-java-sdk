
# Exception Product

## Structure

`ExceptionProduct`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Productid` | `Integer` | Optional | Product Id<br>Optional if ProductCode is passed else Mandatory. | Integer getProductid() | setProductid(Integer productid) |
| `ProductCode` | `String` | Optional | Product Code<br>Optional if ProductId is passed else Mandatory. | String getProductCode() | setProductCode(String productCode) |

## Example (as JSON)

```json
{
  "Productid": 62,
  "ProductCode": "ProductCode8"
}
```

