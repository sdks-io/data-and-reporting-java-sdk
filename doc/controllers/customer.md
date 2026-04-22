# Customer

APIs for Retrieve and Update customer specific details

```java
CustomerController customerController = client.getCustomerController();
```

## Class Name

`CustomerController`

## Methods

* [User-Loggedinuser](../../doc/controllers/customer.md#user-loggedinuser)
* [Customerpayers](../../doc/controllers/customer.md#customerpayers)
* [Customerdetail](../../doc/controllers/customer.md#customerdetail)
* [Post-Card-Accounts](../../doc/controllers/customer.md#post-card-accounts)
* [Customercardtypev](../../doc/controllers/customer.md#customercardtypev)
* [Cardgroups](../../doc/controllers/customer.md#cardgroups)
* [Audit Report](../../doc/controllers/customer.md#audit-report)
* [Customer Price List](../../doc/controllers/customer.md#customer-price-list)


# User-Loggedinuser

This operation allows querying the user data of the logged in user.
This operation should be called only after successful authentication of the end user in client application. This operation will return the user access details such as payers and/or accounts.
This operation will also validate that logged in user has access to the requested operation, on failure it will return HasAPIAccess flag as false in the response.

```java
CompletableFuture<LoggedInUserRes> userLoggedinuserAsync(
    final String requestId,
    final LoggedInUserReq body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`LoggedInUserReq`](../../doc/models/logged-in-user-req.md) | Body, Required | - |

## Response Type

[`LoggedInUserRes`](../../doc/models/logged-in-user-res.md)

## Example Usage

```java
String requestId = "RequestId8";
LoggedInUserReq body = new LoggedInUserReq.Builder()
    .build();

customerController.userLoggedinuserAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof UserManagementV1Loggedinuser400ErrorException) {
        UserManagementV1Loggedinuser400ErrorException userManagementV1Loggedinuser400ErrorException = (UserManagementV1Loggedinuser400ErrorException) cause;
        userManagementV1Loggedinuser400ErrorException.printStackTrace();
    } else if (cause instanceof UserManagementV1Loggedinuser401ErrorException) {
        UserManagementV1Loggedinuser401ErrorException userManagementV1Loggedinuser401ErrorException = (UserManagementV1Loggedinuser401ErrorException) cause;
        userManagementV1Loggedinuser401ErrorException.printStackTrace();
    } else if (cause instanceof UserManagementV1Loggedinuser403ErrorException) {
        UserManagementV1Loggedinuser403ErrorException userManagementV1Loggedinuser403ErrorException = (UserManagementV1Loggedinuser403ErrorException) cause;
        userManagementV1Loggedinuser403ErrorException.printStackTrace();
    } else if (cause instanceof UserManagementV1Loggedinuser404ErrorException) {
        UserManagementV1Loggedinuser404ErrorException userManagementV1Loggedinuser404ErrorException = (UserManagementV1Loggedinuser404ErrorException) cause;
        userManagementV1Loggedinuser404ErrorException.printStackTrace();
    } else if (cause instanceof UserManagementV1Loggedinuser500ErrorException) {
        UserManagementV1Loggedinuser500ErrorException userManagementV1Loggedinuser500ErrorException = (UserManagementV1Loggedinuser500ErrorException) cause;
        userManagementV1Loggedinuser500ErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`UserManagementV1Loggedinuser400ErrorException`](../../doc/models/user-management-v1-loggedinuser-400-error-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`UserManagementV1Loggedinuser401ErrorException`](../../doc/models/user-management-v1-loggedinuser-401-error-exception.md) |
| 403 | Forbidden | [`UserManagementV1Loggedinuser403ErrorException`](../../doc/models/user-management-v1-loggedinuser-403-error-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`UserManagementV1Loggedinuser404ErrorException`](../../doc/models/user-management-v1-loggedinuser-404-error-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`UserManagementV1Loggedinuser500ErrorException`](../../doc/models/user-management-v1-loggedinuser-500-error-exception.md) |


# Customerpayers

This API allows querying the payer accounts details from the Shell Cards
Platform. It provides flexible search criteria for searching payer
information and supports paging.

Paging is applicable only when all the
payers passed in the input are from the same ColCo.

However, paging will
be ignored and the API will return all the matching data by merging the
data queried from each ColCo when payers passed in the input are from
multiple ColCos.

```java
CompletableFuture<PayerRes> customerpayersAsync(
    final String requestId,
    final PayerReq body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`PayerReq`](../../doc/models/payer-req.md) | Body, Required | - |

## Response Type

[`PayerRes`](../../doc/models/payer-res.md)

## Example Usage

```java
String requestId = "RequestId8";
PayerReq body = new PayerReq.Builder()
    .page(1)
    .pageSize(100)
    .build();

customerController.customerpayersAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof CustomerManagementV1Payers400ErrorException) {
        CustomerManagementV1Payers400ErrorException customerManagementV1Payers400ErrorException = (CustomerManagementV1Payers400ErrorException) cause;
        customerManagementV1Payers400ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Payers401ErrorException) {
        CustomerManagementV1Payers401ErrorException customerManagementV1Payers401ErrorException = (CustomerManagementV1Payers401ErrorException) cause;
        customerManagementV1Payers401ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Payers403ErrorException) {
        CustomerManagementV1Payers403ErrorException customerManagementV1Payers403ErrorException = (CustomerManagementV1Payers403ErrorException) cause;
        customerManagementV1Payers403ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Payers404ErrorException) {
        CustomerManagementV1Payers404ErrorException customerManagementV1Payers404ErrorException = (CustomerManagementV1Payers404ErrorException) cause;
        customerManagementV1Payers404ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Payers500ErrorException) {
        CustomerManagementV1Payers500ErrorException customerManagementV1Payers500ErrorException = (CustomerManagementV1Payers500ErrorException) cause;
        customerManagementV1Payers500ErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`CustomerManagementV1Payers400ErrorException`](../../doc/models/customer-management-v1-payers-400-error-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`CustomerManagementV1Payers401ErrorException`](../../doc/models/customer-management-v1-payers-401-error-exception.md) |
| 403 | Forbidden | [`CustomerManagementV1Payers403ErrorException`](../../doc/models/customer-management-v1-payers-403-error-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`CustomerManagementV1Payers404ErrorException`](../../doc/models/customer-management-v1-payers-404-error-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`CustomerManagementV1Payers500ErrorException`](../../doc/models/customer-management-v1-payers-500-error-exception.md) |


# Customerdetail

This API allows querying the card delivery addresses of a given account from the Shell Cards Platform. Only active delivery addresses will be returned.

```java
CompletableFuture<CustomerRes> customerdetailAsync(
    final String requestId,
    final CustomerReq body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`CustomerReq`](../../doc/models/customer-req.md) | Body, Required | - |

## Response Type

[`CustomerRes`](../../doc/models/customer-res.md)

## Example Usage

```java
String requestId = "RequestId8";
CustomerReq body = new CustomerReq.Builder()
    .build();

customerController.customerdetailAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof CustomerManagementV1Customer400ErrorException) {
        CustomerManagementV1Customer400ErrorException customerManagementV1Customer400ErrorException = (CustomerManagementV1Customer400ErrorException) cause;
        customerManagementV1Customer400ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Customer401ErrorException) {
        CustomerManagementV1Customer401ErrorException customerManagementV1Customer401ErrorException = (CustomerManagementV1Customer401ErrorException) cause;
        customerManagementV1Customer401ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Customer403ErrorException) {
        CustomerManagementV1Customer403ErrorException customerManagementV1Customer403ErrorException = (CustomerManagementV1Customer403ErrorException) cause;
        customerManagementV1Customer403ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Customer404ErrorException) {
        CustomerManagementV1Customer404ErrorException customerManagementV1Customer404ErrorException = (CustomerManagementV1Customer404ErrorException) cause;
        customerManagementV1Customer404ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Customer500ErrorException) {
        CustomerManagementV1Customer500ErrorException customerManagementV1Customer500ErrorException = (CustomerManagementV1Customer500ErrorException) cause;
        customerManagementV1Customer500ErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`CustomerManagementV1Customer400ErrorException`](../../doc/models/customer-management-v1-customer-400-error-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`CustomerManagementV1Customer401ErrorException`](../../doc/models/customer-management-v1-customer-401-error-exception.md) |
| 403 | Forbidden | [`CustomerManagementV1Customer403ErrorException`](../../doc/models/customer-management-v1-customer-403-error-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`CustomerManagementV1Customer404ErrorException`](../../doc/models/customer-management-v1-customer-404-error-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`CustomerManagementV1Customer500ErrorException`](../../doc/models/customer-management-v1-customer-500-error-exception.md) |


# Post-Card-Accounts

This API allows querying the customer account details from the Shell Cards Platform. It provides a flexible search criterion and supports pagination.

```java
CompletableFuture<AccountRes> postCardAccountsAsync(
    final String requestId,
    final AccountReq body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`AccountReq`](../../doc/models/account-req.md) | Body, Required | - |

## Response Type

[`AccountRes`](../../doc/models/account-res.md)

## Example Usage

```java
String requestId = "RequestId8";
AccountReq body = new AccountReq.Builder()
    .page(1)
    .pageSize(100)
    .build();

customerController.postCardAccountsAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof CustomerManagementV1Accounts400ErrorException) {
        CustomerManagementV1Accounts400ErrorException customerManagementV1Accounts400ErrorException = (CustomerManagementV1Accounts400ErrorException) cause;
        customerManagementV1Accounts400ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Accounts401ErrorException) {
        CustomerManagementV1Accounts401ErrorException customerManagementV1Accounts401ErrorException = (CustomerManagementV1Accounts401ErrorException) cause;
        customerManagementV1Accounts401ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Accounts403ErrorException) {
        CustomerManagementV1Accounts403ErrorException customerManagementV1Accounts403ErrorException = (CustomerManagementV1Accounts403ErrorException) cause;
        customerManagementV1Accounts403ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Accounts404ErrorException) {
        CustomerManagementV1Accounts404ErrorException customerManagementV1Accounts404ErrorException = (CustomerManagementV1Accounts404ErrorException) cause;
        customerManagementV1Accounts404ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Accounts500ErrorException) {
        CustomerManagementV1Accounts500ErrorException customerManagementV1Accounts500ErrorException = (CustomerManagementV1Accounts500ErrorException) cause;
        customerManagementV1Accounts500ErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`CustomerManagementV1Accounts400ErrorException`](../../doc/models/customer-management-v1-accounts-400-error-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`CustomerManagementV1Accounts401ErrorException`](../../doc/models/customer-management-v1-accounts-401-error-exception.md) |
| 403 | Forbidden | [`CustomerManagementV1Accounts403ErrorException`](../../doc/models/customer-management-v1-accounts-403-error-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`CustomerManagementV1Accounts404ErrorException`](../../doc/models/customer-management-v1-accounts-404-error-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`CustomerManagementV1Accounts500ErrorException`](../../doc/models/customer-management-v1-accounts-500-error-exception.md) |


# Customercardtypev

This API provides allows querying the active card types that are associated to the given account.

The API returns the card type configurations, purchase categories associated with the card type and the card type restriction limits.

```java
CompletableFuture<CardTypeRes> customercardtypevAsync(
    final String requestId,
    final CardTypeReq body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`CardTypeReq`](../../doc/models/card-type-req.md) | Body, Required | - |

## Response Type

[`CardTypeRes`](../../doc/models/card-type-res.md)

## Example Usage

```java
String requestId = "RequestId8";
CardTypeReq body = new CardTypeReq.Builder()
    .build();

customerController.customercardtypevAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof CustomerManagementV2Cardtype400ErrorException) {
        CustomerManagementV2Cardtype400ErrorException customerManagementV2Cardtype400ErrorException = (CustomerManagementV2Cardtype400ErrorException) cause;
        customerManagementV2Cardtype400ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV2Cardtype401ErrorException) {
        CustomerManagementV2Cardtype401ErrorException customerManagementV2Cardtype401ErrorException = (CustomerManagementV2Cardtype401ErrorException) cause;
        customerManagementV2Cardtype401ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV2Cardtype403ErrorException) {
        CustomerManagementV2Cardtype403ErrorException customerManagementV2Cardtype403ErrorException = (CustomerManagementV2Cardtype403ErrorException) cause;
        customerManagementV2Cardtype403ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV2Cardtype404ErrorException) {
        CustomerManagementV2Cardtype404ErrorException customerManagementV2Cardtype404ErrorException = (CustomerManagementV2Cardtype404ErrorException) cause;
        customerManagementV2Cardtype404ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV2Cardtype500ErrorException) {
        CustomerManagementV2Cardtype500ErrorException customerManagementV2Cardtype500ErrorException = (CustomerManagementV2Cardtype500ErrorException) cause;
        customerManagementV2Cardtype500ErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`CustomerManagementV2Cardtype400ErrorException`](../../doc/models/customer-management-v2-cardtype-400-error-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`CustomerManagementV2Cardtype401ErrorException`](../../doc/models/customer-management-v2-cardtype-401-error-exception.md) |
| 403 | Forbidden | [`CustomerManagementV2Cardtype403ErrorException`](../../doc/models/customer-management-v2-cardtype-403-error-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`CustomerManagementV2Cardtype404ErrorException`](../../doc/models/customer-management-v2-cardtype-404-error-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`CustomerManagementV2Cardtype500ErrorException`](../../doc/models/customer-management-v2-cardtype-500-error-exception.md) |


# Cardgroups

This API allows querying the card group details from the Shell Cards
Platform. It provides flexible search criteria and supports paging.

When the account is not passed in the input and card group type is configured as
â€˜Verticalâ€™ in the cards platform, this API will return all card groups from
the payer as well as from all the accounts under the payer.

When the account is not passed in the input and card group type is configured as
â€˜Horizontalâ€™ in cards platform, this API will return all card groups
configured directly under the payer.

```java
CompletableFuture<CardGroupRes> cardgroupsAsync(
    final String requestId,
    final CardGroupReq body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`CardGroupReq`](../../doc/models/card-group-req.md) | Body, Required | - |

## Response Type

[`CardGroupRes`](../../doc/models/card-group-res.md)

## Example Usage

```java
String requestId = "RequestId8";
CardGroupReq body = new CardGroupReq.Builder()
    .page(1)
    .pageSize(100)
    .build();

customerController.cardgroupsAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof CustomerManagementV1Cardgroups400ErrorException) {
        CustomerManagementV1Cardgroups400ErrorException customerManagementV1Cardgroups400ErrorException = (CustomerManagementV1Cardgroups400ErrorException) cause;
        customerManagementV1Cardgroups400ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Cardgroups401ErrorException) {
        CustomerManagementV1Cardgroups401ErrorException customerManagementV1Cardgroups401ErrorException = (CustomerManagementV1Cardgroups401ErrorException) cause;
        customerManagementV1Cardgroups401ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Cardgroups403ErrorException) {
        CustomerManagementV1Cardgroups403ErrorException customerManagementV1Cardgroups403ErrorException = (CustomerManagementV1Cardgroups403ErrorException) cause;
        customerManagementV1Cardgroups403ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Cardgroups404ErrorException) {
        CustomerManagementV1Cardgroups404ErrorException customerManagementV1Cardgroups404ErrorException = (CustomerManagementV1Cardgroups404ErrorException) cause;
        customerManagementV1Cardgroups404ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Cardgroups500ErrorException) {
        CustomerManagementV1Cardgroups500ErrorException customerManagementV1Cardgroups500ErrorException = (CustomerManagementV1Cardgroups500ErrorException) cause;
        customerManagementV1Cardgroups500ErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`CustomerManagementV1Cardgroups400ErrorException`](../../doc/models/customer-management-v1-cardgroups-400-error-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`CustomerManagementV1Cardgroups401ErrorException`](../../doc/models/customer-management-v1-cardgroups-401-error-exception.md) |
| 403 | Forbidden | [`CustomerManagementV1Cardgroups403ErrorException`](../../doc/models/customer-management-v1-cardgroups-403-error-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`CustomerManagementV1Cardgroups404ErrorException`](../../doc/models/customer-management-v1-cardgroups-404-error-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`CustomerManagementV1Cardgroups500ErrorException`](../../doc/models/customer-management-v1-cardgroups-500-error-exception.md) |


# Audit Report

This operation allows users to fetch audit data of account or card operations performed by users of a given customer
The audit data includes details of below API operations

* Order Card
* Create Card Group
* PIN reminder
* Move Cards
* Update Card Status
* Update Card Group
* Auto renew
* Bulk card order
* Bulk card block
* Bulk Card Order (Multi Account)
* BCOSummary
* BCOMultiAccountSummary
* BCBSummary
* Mobile Payment Registration
* Fund Transfer (Scheduled & Realtime)
* Delivery Address Update.

```java
CompletableFuture<AuditResponse> auditReportAsync(
    final String requestId,
    final AuditReq body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`AuditReq`](../../doc/models/audit-req.md) | Body, Optional | request body |

## Response Type

[`AuditResponse`](../../doc/models/audit-response.md)

## Example Usage

```java
String requestId = "RequestId8";
AuditReq body = new AuditReq.Builder()
    .page(1)
    .pageSize(100)
    .build();

customerController.auditReportAsync(requestId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof CustomerManagementV1Auditreport400ErrorException) {
        CustomerManagementV1Auditreport400ErrorException customerManagementV1Auditreport400ErrorException = (CustomerManagementV1Auditreport400ErrorException) cause;
        customerManagementV1Auditreport400ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Auditreport401ErrorException) {
        CustomerManagementV1Auditreport401ErrorException customerManagementV1Auditreport401ErrorException = (CustomerManagementV1Auditreport401ErrorException) cause;
        customerManagementV1Auditreport401ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Auditreport403ErrorException) {
        CustomerManagementV1Auditreport403ErrorException customerManagementV1Auditreport403ErrorException = (CustomerManagementV1Auditreport403ErrorException) cause;
        customerManagementV1Auditreport403ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Auditreport404ErrorException) {
        CustomerManagementV1Auditreport404ErrorException customerManagementV1Auditreport404ErrorException = (CustomerManagementV1Auditreport404ErrorException) cause;
        customerManagementV1Auditreport404ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Auditreport500ErrorException) {
        CustomerManagementV1Auditreport500ErrorException customerManagementV1Auditreport500ErrorException = (CustomerManagementV1Auditreport500ErrorException) cause;
        customerManagementV1Auditreport500ErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`CustomerManagementV1Auditreport400ErrorException`](../../doc/models/customer-management-v1-auditreport-400-error-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`CustomerManagementV1Auditreport401ErrorException`](../../doc/models/customer-management-v1-auditreport-401-error-exception.md) |
| 403 | Forbidden | [`CustomerManagementV1Auditreport403ErrorException`](../../doc/models/customer-management-v1-auditreport-403-error-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`CustomerManagementV1Auditreport404ErrorException`](../../doc/models/customer-management-v1-auditreport-404-error-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`CustomerManagementV1Auditreport500ErrorException`](../../doc/models/customer-management-v1-auditreport-500-error-exception.md) |


# Customer Price List

- This operation fetches the International and National Price List and discount values set on pump prices & List Prices
- It allows searching price list and discount values set on pump prices that are applicable for a given customer

**Note**: Accounts with cancelled status will not be considered for this operation for the configured

- When the search is based on customer specific price list then the customer price list is returned based on the associated pricing customer.
- The discount values set on pump prices, which are returned by the operation are always customer specific values based on the customer associated price rules.

```java
CompletableFuture<CustomerPriceListRes> customerPriceListAsync(
    final String requestId,
    final CustomerPriceListReq body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `requestId` | `String` | Header, Required | Mandatory UUID (according to RFC 4122 standards) for requests and responses. This will be played back in the response from the request. |
| `body` | [`CustomerPriceListReq`](../../doc/models/customer-price-list-req.md) | Body, Optional | Customerdetails request body |

## Response Type

[`CustomerPriceListRes`](../../doc/models/customer-price-list-res.md)

## Example Usage

```java
String requestId = "RequestId8";
customerController.customerPriceListAsync(requestId, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof CustomerManagementV1Pricelist400ErrorException) {
        CustomerManagementV1Pricelist400ErrorException customerManagementV1Pricelist400ErrorException = (CustomerManagementV1Pricelist400ErrorException) cause;
        customerManagementV1Pricelist400ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Pricelist401ErrorException) {
        CustomerManagementV1Pricelist401ErrorException customerManagementV1Pricelist401ErrorException = (CustomerManagementV1Pricelist401ErrorException) cause;
        customerManagementV1Pricelist401ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Pricelist403ErrorException) {
        CustomerManagementV1Pricelist403ErrorException customerManagementV1Pricelist403ErrorException = (CustomerManagementV1Pricelist403ErrorException) cause;
        customerManagementV1Pricelist403ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Pricelist404ErrorException) {
        CustomerManagementV1Pricelist404ErrorException customerManagementV1Pricelist404ErrorException = (CustomerManagementV1Pricelist404ErrorException) cause;
        customerManagementV1Pricelist404ErrorException.printStackTrace();
    } else if (cause instanceof CustomerManagementV1Pricelist500ErrorException) {
        CustomerManagementV1Pricelist500ErrorException customerManagementV1Pricelist500ErrorException = (CustomerManagementV1Pricelist500ErrorException) cause;
        customerManagementV1Pricelist500ErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). | [`CustomerManagementV1Pricelist400ErrorException`](../../doc/models/customer-management-v1-pricelist-400-error-exception.md) |
| 401 | The request has not been applied because it lacks valid  authentication credentials for the target resource. | [`CustomerManagementV1Pricelist401ErrorException`](../../doc/models/customer-management-v1-pricelist-401-error-exception.md) |
| 403 | Forbidden | [`CustomerManagementV1Pricelist403ErrorException`](../../doc/models/customer-management-v1-pricelist-403-error-exception.md) |
| 404 | The origin server did not find a current representation  for the target resource or is not willing to disclose  that one exists. | [`CustomerManagementV1Pricelist404ErrorException`](../../doc/models/customer-management-v1-pricelist-404-error-exception.md) |
| 500 | The server encountered an unexpected condition that  prevented it from fulfilling the request. | [`CustomerManagementV1Pricelist500ErrorException`](../../doc/models/customer-management-v1-pricelist-500-error-exception.md) |

