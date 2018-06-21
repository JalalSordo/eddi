# BotEngineApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getConversationState**](BotEngineApi.md#getConversationState) | **GET** /bots/{environment}/conversationstatus/{conversationId} | 
[**isRedoAvailable**](BotEngineApi.md#isRedoAvailable) | **GET** /bots/{environment}/{botId}/redo/{conversationId} | 
[**isUndoAvailable**](BotEngineApi.md#isUndoAvailable) | **GET** /bots/{environment}/{botId}/undo/{conversationId} | 
[**readConversation**](BotEngineApi.md#readConversation) | **GET** /bots/{environment}/{botId}/{conversationId} | 
[**redo**](BotEngineApi.md#redo) | **POST** /bots/{environment}/{botId}/redo/{conversationId} | 
[**say**](BotEngineApi.md#say) | **POST** /bots/{environment}/{botId}/{conversationId} | 
[**startConversation**](BotEngineApi.md#startConversation) | **POST** /bots/{environment}/{botId} | 
[**undo**](BotEngineApi.md#undo) | **POST** /bots/{environment}/{botId}/undo/{conversationId} | 


<a name="getConversationState"></a>
# **getConversationState**
> String getConversationState(environment, conversationId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BotEngineApi;


BotEngineApi apiInstance = new BotEngineApi();
String environment = "environment_example"; // String | 
String conversationId = "conversationId_example"; // String | 
try {
    String result = apiInstance.getConversationState(environment, conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BotEngineApi#getConversationState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  | [enum: restricted, unrestricted, test]
 **conversationId** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="isRedoAvailable"></a>
# **isRedoAvailable**
> Boolean isRedoAvailable(environment, botId, conversationId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BotEngineApi;


BotEngineApi apiInstance = new BotEngineApi();
String environment = "environment_example"; // String | 
String botId = "botId_example"; // String | 
String conversationId = "conversationId_example"; // String | 
try {
    Boolean result = apiInstance.isRedoAvailable(environment, botId, conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BotEngineApi#isRedoAvailable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  | [enum: restricted, unrestricted, test]
 **botId** | **String**|  |
 **conversationId** | **String**|  |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="isUndoAvailable"></a>
# **isUndoAvailable**
> Boolean isUndoAvailable(environment, botId, conversationId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BotEngineApi;


BotEngineApi apiInstance = new BotEngineApi();
String environment = "environment_example"; // String | 
String botId = "botId_example"; // String | 
String conversationId = "conversationId_example"; // String | 
try {
    Boolean result = apiInstance.isUndoAvailable(environment, botId, conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BotEngineApi#isUndoAvailable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  | [enum: restricted, unrestricted, test]
 **botId** | **String**|  |
 **conversationId** | **String**|  |

### Return type

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="readConversation"></a>
# **readConversation**
> SimpleConversationMemorySnapshot readConversation(environment, botId, conversationId, returnDetailed)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BotEngineApi;


BotEngineApi apiInstance = new BotEngineApi();
String environment = "environment_example"; // String | 
String botId = "botId_example"; // String | 
String conversationId = "conversationId_example"; // String | 
Boolean returnDetailed = false; // Boolean | 
try {
    SimpleConversationMemorySnapshot result = apiInstance.readConversation(environment, botId, conversationId, returnDetailed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BotEngineApi#readConversation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  | [enum: restricted, unrestricted, test]
 **botId** | **String**|  |
 **conversationId** | **String**|  |
 **returnDetailed** | **Boolean**|  | [optional] [default to false]

### Return type

[**SimpleConversationMemorySnapshot**](SimpleConversationMemorySnapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="redo"></a>
# **redo**
> redo(environment, botId, conversationId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BotEngineApi;


BotEngineApi apiInstance = new BotEngineApi();
String environment = "environment_example"; // String | 
String botId = "botId_example"; // String | 
String conversationId = "conversationId_example"; // String | 
try {
    apiInstance.redo(environment, botId, conversationId);
} catch (ApiException e) {
    System.err.println("Exception when calling BotEngineApi#redo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  | [enum: restricted, unrestricted, test]
 **botId** | **String**|  |
 **conversationId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="say"></a>
# **say**
> say(environment, botId, conversationId, returnDetailed, returnCurrentStepOnly, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BotEngineApi;


BotEngineApi apiInstance = new BotEngineApi();
String environment = "environment_example"; // String | 
String botId = "botId_example"; // String | 
String conversationId = "conversationId_example"; // String | 
Boolean returnDetailed = false; // Boolean | 
Boolean returnCurrentStepOnly = true; // Boolean | 
String body = "body_example"; // String | 
try {
    apiInstance.say(environment, botId, conversationId, returnDetailed, returnCurrentStepOnly, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BotEngineApi#say");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  | [enum: restricted, unrestricted, test]
 **botId** | **String**|  |
 **conversationId** | **String**|  |
 **returnDetailed** | **Boolean**|  | [optional] [default to false]
 **returnCurrentStepOnly** | **Boolean**|  | [optional] [default to true]
 **body** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json

<a name="startConversation"></a>
# **startConversation**
> startConversation(environment, botId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BotEngineApi;


BotEngineApi apiInstance = new BotEngineApi();
String environment = "environment_example"; // String | 
String botId = "botId_example"; // String | 
try {
    apiInstance.startConversation(environment, botId);
} catch (ApiException e) {
    System.err.println("Exception when calling BotEngineApi#startConversation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  | [enum: restricted, unrestricted, test]
 **botId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="undo"></a>
# **undo**
> undo(environment, botId, conversationId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BotEngineApi;


BotEngineApi apiInstance = new BotEngineApi();
String environment = "environment_example"; // String | 
String botId = "botId_example"; // String | 
String conversationId = "conversationId_example"; // String | 
try {
    apiInstance.undo(environment, botId, conversationId);
} catch (ApiException e) {
    System.err.println("Exception when calling BotEngineApi#undo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environment** | **String**|  | [enum: restricted, unrestricted, test]
 **botId** | **String**|  |
 **conversationId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

