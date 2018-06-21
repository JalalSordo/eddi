# UserManagementApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePassword**](UserManagementApi.md#changePassword) | **POST** /userstore/users/changepassword | 
[**createGroup**](UserManagementApi.md#createGroup) | **POST** /groupstore/groups | 
[**createUser**](UserManagementApi.md#createUser) | **POST** /userstore/users | 
[**deleteGroup**](UserManagementApi.md#deleteGroup) | **DELETE** /groupstore/groups/{groupId} | 
[**deleteUser**](UserManagementApi.md#deleteUser) | **DELETE** /userstore/users/{userId} | 
[**readGroup**](UserManagementApi.md#readGroup) | **GET** /groupstore/groups/{groupId} | 
[**readUser**](UserManagementApi.md#readUser) | **GET** /userstore/users/{userId} | 
[**searchUser**](UserManagementApi.md#searchUser) | **GET** /userstore/users | 
[**updateGroup**](UserManagementApi.md#updateGroup) | **PUT** /groupstore/groups/{groupId} | 
[**updateUser**](UserManagementApi.md#updateUser) | **PUT** /userstore/users/{userId} | 


<a name="changePassword"></a>
# **changePassword**
> changePassword(userId, newPassword)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserManagementApi;


UserManagementApi apiInstance = new UserManagementApi();
String userId = "userId_example"; // String | 
String newPassword = "newPassword_example"; // String | 
try {
    apiInstance.changePassword(userId, newPassword);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  | [optional]
 **newPassword** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createGroup"></a>
# **createGroup**
> createGroup(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserManagementApi;


UserManagementApi apiInstance = new UserManagementApi();
Group body = new Group(); // Group | 
try {
    apiInstance.createGroup(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementApi#createGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Group**](Group.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createUser"></a>
# **createUser**
> createUser(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserManagementApi;


UserManagementApi apiInstance = new UserManagementApi();
User body = new User(); // User | 
try {
    apiInstance.createUser(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteGroup"></a>
# **deleteGroup**
> deleteGroup(groupId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserManagementApi;


UserManagementApi apiInstance = new UserManagementApi();
String groupId = "groupId_example"; // String | 
try {
    apiInstance.deleteGroup(groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementApi#deleteGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(userId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserManagementApi;


UserManagementApi apiInstance = new UserManagementApi();
String userId = "userId_example"; // String | 
try {
    apiInstance.deleteUser(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="readGroup"></a>
# **readGroup**
> Group readGroup(groupId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserManagementApi;


UserManagementApi apiInstance = new UserManagementApi();
String groupId = "groupId_example"; // String | 
try {
    Group result = apiInstance.readGroup(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementApi#readGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readUser"></a>
# **readUser**
> User readUser(userId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserManagementApi;


UserManagementApi apiInstance = new UserManagementApi();
String userId = "userId_example"; // String | 
try {
    User result = apiInstance.readUser(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementApi#readUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchUser"></a>
# **searchUser**
> String searchUser(username)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserManagementApi;


UserManagementApi apiInstance = new UserManagementApi();
String username = "username_example"; // String | 
try {
    String result = apiInstance.searchUser(username);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementApi#searchUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateGroup"></a>
# **updateGroup**
> updateGroup(groupId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserManagementApi;


UserManagementApi apiInstance = new UserManagementApi();
String groupId = "groupId_example"; // String | 
Group body = new Group(); // Group | 
try {
    apiInstance.updateGroup(groupId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementApi#updateGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **String**|  |
 **body** | [**Group**](Group.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateUser"></a>
# **updateUser**
> updateUser(userId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UserManagementApi;


UserManagementApi apiInstance = new UserManagementApi();
String userId = "userId_example"; // String | 
User body = new User(); // User | 
try {
    apiInstance.updateUser(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserManagementApi#updateUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**|  |
 **body** | [**User**](User.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

