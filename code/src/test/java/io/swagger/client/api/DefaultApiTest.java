/*
 * EDDI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void webHook1Test() throws ApiException {
        String botId = null;
        Integer version = null;
        String body = null;
        String xHubSignature = null;
        api.webHook1(botId, version, body, xHubSignature);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void webHookSetup1Test() throws ApiException {
        String botId = null;
        Integer version = null;
        String hubMode = null;
        String hubVerifyToken = null;
        String hubChallenge = null;
        api.webHookSetup1(botId, version, hubMode, hubVerifyToken, hubChallenge);

        // TODO: test validations
    }
    
}
