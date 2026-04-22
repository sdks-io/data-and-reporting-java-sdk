
# Getting Started with Shell Data & Reporting APIs

## Introduction

The Shell Card Transaction and Invoice API is part of the Data and Reporting product suite, designed to provide secure and flexible access to transaction and invoice data related to Shell Cards.

### Authentication

- OAuth 2.0 Authentication.

### Architecture

- RESTful API design.
- All endpoints use the `POST` HTTP method for all operations including retrieval, creation, update, and deletion of resources.
- Requests and responses are encoded in JSON format.
- Standard HTTP status codes are used for response handling.

### Platform

- All resources are managed within the **Shell Card Platform**, which integrates multiple internal Shell systems for resource management.

### Features

- Flexible search parameters supported in the request body for data retrieval.
- Designed for integration with enterprise systems requiring Shell Card transaction and invoice data.

### Use Cases

- Retrieve detailed transaction history for Shell Cards.
- Access invoice summaries and line-item details.
- Integrate Shell Card financial data into internal reporting tools.

Go to the Shell Developer Portal: [https://developer.shell.com](https://developer.shell.com)

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.sdks</groupId>
  <artifactId>data-and-reporting-sdk</artifactId>
  <version>3.0.0</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/io.sdks/data-and-reporting-sdk/3.0.0

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project ShellDataReportingAPIsLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| environment | [`Environment`](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/README.md#environments) | The API environment. <br> **Default: `Environment.SIT`** |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| clientCredentialsAuth | [`ClientCredentialsAuth`](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
import com.shell.apitest.Environment;
import com.shell.apitest.ShellDataReportingAPIsClient;
import com.shell.apitest.authentication.ClientCredentialsAuthModel;
import com.shell.apitest.exceptions.ApiException;
import com.shell.apitest.models.OAuthToken;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        ShellDataReportingAPIsClient client = new ShellDataReportingAPIsClient.Builder()
            .httpClientConfig(configBuilder -> configBuilder
                    .timeout(0))
            .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
                    "OAuthClientId",
                    "OAuthClientSecret"
                )
                .build())
            .environment(Environment.SIT)
            .build();

    }
}
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| SIT | **Default** |
| PRODUCTION | - |

## Authorization

This API uses the following authentication schemes.

* [`BearerToken (OAuth 2 Client Credentials Grant)`](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/auth/oauth-2-client-credentials-grant.md)

## List of APIs

* [Customer](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/controllers/customer.md)
* [Transaction](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/controllers/transaction.md)
* [Invoice](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/controllers/invoice.md)

## SDK Infrastructure

### Configuration

* [Configuration Interface](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/http-client-configuration-builder.md)
* [HttpProxyConfiguration](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/http-proxy-configuration.md)
* [HttpProxyConfiguration.Builder](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/http-proxy-configuration-builder.md)

### HTTP

* [Headers](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/headers.md)
* [HttpCallback Interface](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/http-callback-interface.md)
* [HttpContext](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/http-body-request.md)
* [HttpRequest](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/http-request.md)
* [HttpResponse](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/http-string-response.md)

### Utilities

* [ApiException](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/api-exception.md)
* [ApiHelper](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/api-helper.md)
* [FileWrapper](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/file-wrapper.md)
* [DateTimeHelper](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/3.0.0/doc/date-time-helper.md)

