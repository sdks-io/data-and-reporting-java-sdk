/*
 * ShellDataReportingAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.controllers;

import com.shell.apitest.Environment;
import com.shell.apitest.ShellDataReportingAPIsClient;
import com.shell.apitest.authentication.BasicAuthModel;
import com.shell.apitest.authentication.BearerTokenModel;
import com.shell.apitest.testing.HttpCallbackCatcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 * Base class for all test cases.
 */
public class BaseControllerTest {
    /**
     * Test configuration.
     */
    public static final int REQUEST_TIMEOUT = 30;

    public static final double ASSERT_PRECISION = 0.01;
    
    /**
     * Global rules for tests.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);
    
    /**
     * Test fixtures,
     * Used to serve as HttpCallback and to capture request & response.
     */

    protected static HttpCallbackCatcher httpResponse;
    
    /**
     * Setup test.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        httpResponse = new HttpCallbackCatcher(); 
    }

    /**
     * Tear down test.
     */
    @AfterClass
    public static void tearDown() throws Exception {
        httpResponse = null;
    }

    /**
     * Create test configuration from Environment variables.
     */
    protected static ShellDataReportingAPIsClient createConfigurationFromEnvironment() {
        ShellDataReportingAPIsClient.Builder builder = new ShellDataReportingAPIsClient.Builder();

        final String environment = System.getenv("SHELL_DATA_REPORTING_AP_IS_LIB_ENVIRONMENT");
        final String timeout = System.getenv("SHELL_DATA_REPORTING_AP_IS_LIB_TIMEOUT");
        final String username = System.getenv("SHELL_DATA_REPORTING_AP_IS_LIB_USERNAME");
        final String password = System.getenv("SHELL_DATA_REPORTING_AP_IS_LIB_PASSWORD");
        final String oAuthClientId =
                System.getenv("SHELL_DATA_REPORTING_AP_IS_LIB_O_AUTH_CLIENT_ID");
        final String oAuthClientSecret =
                System.getenv("SHELL_DATA_REPORTING_AP_IS_LIB_O_AUTH_CLIENT_SECRET");

        if (username != null && password != null) {
            builder.basicAuthCredentials(new BasicAuthModel
                    .Builder(username, password)
                    .build());
        }
        if (oAuthClientId != null && oAuthClientSecret != null) {
            builder.bearerTokenCredentials(new BearerTokenModel
                    .Builder(oAuthClientId, oAuthClientSecret)
                    .build());
        }
        if (environment != null) {
            builder.environment(Environment.fromString(environment));
        }
        if (timeout != null) {
            builder.httpClientConfig(configBuilder -> configBuilder.timeout(
                    Long.parseLong(timeout)));
        }
        return builder.build();
    }

    
    /**
     * Create test configuration.
     */
    protected static ShellDataReportingAPIsClient createConfiguration() {
        // Set Configuration parameters for test execution
        ShellDataReportingAPIsClient config = createConfigurationFromEnvironment();
        config = config.newBuilder()
                .httpCallback(httpResponse)
                .build();

        return config;
    }
}
