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
import io.swagger.client.model.PackageExtension;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PackageExtensionsApi
 */
@Ignore
public class PackageExtensionsApiTest {

    private final PackageExtensionsApi api = new PackageExtensionsApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBehaviorRuleExtensionsTest() throws ApiException {
        List<PackageExtension> response = api.getBehaviorRuleExtensions();

        // TODO: test validations
    }
    
}
