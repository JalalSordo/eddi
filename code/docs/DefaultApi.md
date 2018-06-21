# DefaultApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webHook1**](DefaultApi.md#webHook1) | **POST** /channels/facebook/{botId} | 
[**webHookSetup1**](DefaultApi.md#webHookSetup1) | **GET** /channels/facebook/{botId} | 


<a name="webHook1"></a>
# **webHook1**
> webHook1(botId, version, body, xHubSignature)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String botId = "botId_example"; // String | 
Integer version = -1; // Integer | 
String body = "body_example"; // String | 
String xHubSignature = "xHubSignature_example"; // String | 
try {
    apiInstance.webHook1(botId, version, body, xHubSignature);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#webHook1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **botId** | **String**|  |
 **version** | **Integer**|  | [optional] [default to -1]
 **body** | **String**|  | [optional]
 **xHubSignature** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="webHookSetup1"></a>
# **webHookSetup1**
> webHookSetup1(botId, version, hubMode, hubVerifyToken, hubChallenge)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String botId = "botId_example"; // String | 
Integer version = -1; // Integer | 
String hubMode = "hubMode_example"; // String | 
String hubVerifyToken = "hubVerifyToken_example"; // String | 
String hubChallenge = "hubChallenge_example"; // String | 
try {
    apiInstance.webHookSetup1(botId, version, hubMode, hubVerifyToken, hubChallenge);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#webHookSetup1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **botId** | **String**|  |
 **version** | **Integer**|  | [optional] [default to -1]
 **hubMode** | **String**|  | [optional]
 **hubVerifyToken** | **String**|  | [optional]
 **hubChallenge** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

