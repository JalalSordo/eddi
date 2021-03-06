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
import io.swagger.client.model.Group;
import io.swagger.client.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserManagementApi
 */
@Ignore
public class UserManagementApiTest {

    private final UserManagementApi api = new UserManagementApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changePasswordTest() throws ApiException {
        String userId = null;
        String newPassword = null;
        api.changePassword(userId, newPassword);

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
    public void createGroupTest() throws ApiException {
        Group body = null;
        api.createGroup(body);

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
    public void createUserTest() throws ApiException {
        User body = null;
        api.createUser(body);

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
    public void deleteGroupTest() throws ApiException {
        String groupId = null;
        api.deleteGroup(groupId);

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
    public void deleteUserTest() throws ApiException {
        String userId = null;
        api.deleteUser(userId);

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
    public void readGroupTest() throws ApiException {
        String groupId = null;
        Group response = api.readGroup(groupId);

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
    public void readUserTest() throws ApiException {
        String userId = null;
        User response = api.readUser(userId);

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
    public void searchUserTest() throws ApiException {
        String username = null;
        String response = api.searchUser(username);

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
    public void updateGroupTest() throws ApiException {
        String groupId = null;
        Group body = null;
        api.updateGroup(groupId, body);

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
    public void updateUserTest() throws ApiException {
        String userId = null;
        User body = null;
        api.updateUser(userId, body);

        // TODO: test validations
    }
    
}
