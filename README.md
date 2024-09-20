
# Getting Started with Shell Data & Reporting APIs

## Introduction

Data And Reporting product consists of API's which provides details of transaction and invoice informations about shell cards.
The Shell Card Transaction and Invoice API is REST-based and employs Basic authentication in Version 1 and Oauth authentication in Version 2 end points. The API endpoints accept JSON-encoded request bodies, return JSON-encoded responses and use standard HTTP response codes.
All resources are located in the Shell Card Platform.  The Shell Card Platform is the overall platform that encompasses all the internal Shell systems used to manage resources.
All endpoints use the `POST` verb for retrieving, updating, creating and deleting resources in the Shell Card Platform. The endpoints that retrieve resources from the Shell Card Platform allow flexible search parameters in the API request body.

Go to the Shell Developer Portal: [https://developer.shell.com](https://developer.shell.com)

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.sdks</groupId>
  <artifactId>data-and-reporting-sdk</artifactId>
  <version>1.1.0</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/io.sdks/data-and-reporting-sdk/1.1.0

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project ShellDataReportingAPIsLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.SIT`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `basicAuthCredentials` | [`BasicAuthCredentials`](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/auth/basic-authentication.md) | The Credentials Setter for Basic Authentication |
| `bearerTokenCredentials` | [`BearerTokenCredentials`](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

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

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| SIT | **Default** |
| Production | - |

## Authorization

This API uses the following authentication schemes.

* [`BasicAuth (Basic Authentication)`](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/auth/basic-authentication.md)
* [`BearerToken (OAuth 2 Client Credentials Grant)`](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/auth/oauth-2-client-credentials-grant.md)

## List of APIs

* [Customer](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/controllers/customer.md)
* [Transaction](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/controllers/transaction.md)
* [Invoice](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/controllers/invoice.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/http-request.md)
* [HttpResponse](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/http-string-response.md)
* [HttpContext](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/http-callback-interface.md)
* [Headers](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/headers.md)
* [ApiException](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sdks-io/data-and-reporting-java-sdk/tree/1.1.0/doc/http-client-configuration-builder.md)

