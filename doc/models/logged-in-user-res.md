
# Logged in User Res

## Structure

`LoggedInUserRes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | Unique identifier for the request. This will be played back in the response from the request. | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | Status of the request | String getStatus() | setStatus(String status) |
| `Data` | [`List<LoggedInUserResponse>`](../../doc/models/logged-in-user-response.md) | Optional | - | List<LoggedInUserResponse> getData() | setData(List<LoggedInUserResponse> data) |

## Example (as JSON)

```json
{
  "RequestId": "0e6fb42a-51b0-43b2-f010-92f822657f6a",
  "Status": "SUCCESS",
  "Data": [
    {
      "UserName": "UserName0",
      "DisplayName": "DisplayName2",
      "IdMSSOID": "IdMSSOID8",
      "PreferredLanguage": "PreferredLanguage0",
      "IsSuperAdmin": false
    },
    {
      "UserName": "UserName0",
      "DisplayName": "DisplayName2",
      "IdMSSOID": "IdMSSOID8",
      "PreferredLanguage": "PreferredLanguage0",
      "IsSuperAdmin": false
    },
    {
      "UserName": "UserName0",
      "DisplayName": "DisplayName2",
      "IdMSSOID": "IdMSSOID8",
      "PreferredLanguage": "PreferredLanguage0",
      "IsSuperAdmin": false
    }
  ]
}
```

