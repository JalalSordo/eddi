# ExpressionsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**readExpressions**](ExpressionsApi.md#readExpressions) | **GET** /expressions | 


<a name="readExpressions"></a>
# **readExpressions**
> List&lt;String&gt; readExpressions(packageId, packageVersion, filter, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ExpressionsApi;


ExpressionsApi apiInstance = new ExpressionsApi();
String packageId = "packageId_example"; // String | 
Integer packageVersion = 56; // Integer | 
String filter = "filter_example"; // String | 
Integer limit = 20; // Integer | 
try {
    List<String> result = apiInstance.readExpressions(packageId, packageVersion, filter, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExpressionsApi#readExpressions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **packageId** | **String**|  | [optional]
 **packageVersion** | **Integer**|  | [optional]
 **filter** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

