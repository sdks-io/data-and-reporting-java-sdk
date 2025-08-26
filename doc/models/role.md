
# Role

## Structure

`Role`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RoleName` | `String` | Optional | Role Name of the user | String getRoleName() | setRoleName(String roleName) |
| `IsCustomerAdmin` | `Boolean` | Optional | Whether the role is an administrator.<br><br>**Default**: `true` | Boolean getIsCustomerAdmin() | setIsCustomerAdmin(Boolean isCustomerAdmin) |
| `IsCustomerUser` | `Boolean` | Optional | Whether the role is a customer user.<br><br>**Default**: `false` | Boolean getIsCustomerUser() | setIsCustomerUser(Boolean isCustomerUser) |
| `IsShellAdmin` | `Boolean` | Optional | True if the role is Shell user, else false.<br><br>**Default**: `false` | Boolean getIsShellAdmin() | setIsShellAdmin(Boolean isShellAdmin) |
| `IsServiceAccount` | `Boolean` | Optional | True/False.<br>True if the role is Service accounts, else false.<br><br>**Default**: `false` | Boolean getIsServiceAccount() | setIsServiceAccount(Boolean isServiceAccount) |
| `IsUserAdmin` | `Boolean` | Optional | True/False.<br>True, if the role allows user administration, else false.<br><br>**Default**: `true` | Boolean getIsUserAdmin() | setIsUserAdmin(Boolean isUserAdmin) |

## Example (as JSON)

```json
{
  "RoleName": "FleetManager",
  "IsCustomerAdmin": true,
  "IsCustomerUser": false,
  "IsShellAdmin": false,
  "IsServiceAccount": false,
  "IsUserAdmin": true
}
```

