# BotAdministrationApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deployBot**](BotAdministrationApi.md#deployBot) | **POST** /administration/{environment}/deploy/{botId} | 
[**getDeploymentStatus**](BotAdministrationApi.md#getDeploymentStatus) | **GET** /administration/{environment}/deploymentstatus/{botId} | 
[**readDeploymentInfos**](BotAdministrationApi.md#readDeploymentInfos) | **GET** /deploymentstore/deployments | 
[**undeployBot**](BotAdministrationApi.md#undeployBot) | **POST** /administration/{environment}/undeploy/{botId} | 


<a name="deployBot"></a>
# **deployBot**
> deployBot(environment, botId, version, autoDeploy)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BotAdministrationApi;


BotAdministrationApi apiInstance = new BotAdministrationApi();
String environment = "environment_example"; // String | 
String botId = "botId_example"; // String | 
Integer version = 1; // Integer | 
Boolean autoDeploy = true; // Boolean | 
try {
    apiInstance.deployBot(environment, botId, version, autoDeploy);
} catch (ApiException e) {
    System.err.println("Exception when calling BotAdministrationApi#deployBot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  | [enum: restricted, unrestricted, test]
 **botId** | **String**|  |
 **version** | **Integer**|  |
 **autoDeploy** | **Boolean**|  | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getDeploymentStatus"></a>
# **getDeploymentStatus**
> String getDeploymentStatus(environment, botId, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BotAdministrationApi;


BotAdministrationApi apiInstance = new BotAdministrationApi();
String environment = "environment_example"; // String | 
String botId = "botId_example"; // String | 
Integer version = 1; // Integer | 
try {
    String result = apiInstance.getDeploymentStatus(environment, botId, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BotAdministrationApi#getDeploymentStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  | [enum: restricted, unrestricted, test]
 **botId** | **String**|  |
 **version** | **Integer**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="readDeploymentInfos"></a>
# **readDeploymentInfos**
> List&lt;DeploymentInfo&gt; readDeploymentInfos()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BotAdministrationApi;


BotAdministrationApi apiInstance = new BotAdministrationApi();
try {
    List<DeploymentInfo> result = apiInstance.readDeploymentInfos();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BotAdministrationApi#readDeploymentInfos");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;DeploymentInfo&gt;**](DeploymentInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="undeployBot"></a>
# **undeployBot**
> undeployBot(environment, botId, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BotAdministrationApi;


BotAdministrationApi apiInstance = new BotAdministrationApi();
String environment = "environment_example"; // String | 
String botId = "botId_example"; // String | 
Integer version = 1; // Integer | 
try {
    apiInstance.undeployBot(environment, botId, version);
} catch (ApiException e) {
    System.err.println("Exception when calling BotAdministrationApi#undeployBot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  | [enum: restricted, unrestricted, test]
 **botId** | **String**|  |
 **version** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

