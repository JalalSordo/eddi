# SemanticParserApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**parse1**](SemanticParserApi.md#parse1) | **POST** /parser/{parserId} | returns an array of found solutions


<a name="parse1"></a>
# **parse1**
> parse1(parserId, version, body)

returns an array of found solutions



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SemanticParserApi;


SemanticParserApi apiInstance = new SemanticParserApi();
String parserId = "parserId_example"; // String | 
Integer version = 1; // Integer | 
String body = "body_example"; // String | 
try {
    apiInstance.parse1(parserId, version, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SemanticParserApi#parse1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parserId** | **String**|  |
 **version** | **Integer**|  |
 **body** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

