
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.SIT`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `basicAuthCredentials` | [`BasicAuthCredentials`](auth/basic-authentication.md) | The Credentials Setter for Basic Authentication |
| `bearerTokenCredentials` | [`BearerTokenCredentials`](auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
ShellDataReportingAPIsClient client = new ShellDataReportingAPIsClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .basicAuthCredentials(new BasicAuthModel.Builder(
            "Username",
            "Password"
        )
        .build())
    .bearerTokenCredentials(new BearerTokenModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .build())
    .environment(Environment.SIT)
    .build();
```

## Shell Data & Reporting APIsClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getCustomerController()` | Provides access to Customer controller. | `CustomerController` |
| `getTransactionController()` | Provides access to Transaction controller. | `TransactionController` |
| `getInvoiceController()` | Provides access to Invoice controller. | `InvoiceController` |
| `getOAuthAuthorizationController()` | Provides access to OAuthAuthorization controller. | `OAuthAuthorizationController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBasicAuthCredentials()` | The credentials to use with BasicAuth. | [`BasicAuthCredentials`](auth/basic-authentication.md) |
| `getBearerTokenCredentials()` | The credentials to use with BearerToken. | [`BearerTokenCredentials`](auth/oauth-2-client-credentials-grant.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

