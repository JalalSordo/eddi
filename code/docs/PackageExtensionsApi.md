# PackageExtensionsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBehaviorRuleExtensions**](PackageExtensionsApi.md#getBehaviorRuleExtensions) | **GET** /packagestore/extensions | 


<a name="getBehaviorRuleExtensions"></a>
# **getBehaviorRuleExtensions**
> List&lt;PackageExtension&gt; getBehaviorRuleExtensions()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PackageExtensionsApi;


PackageExtensionsApi apiInstance = new PackageExtensionsApi();
try {
    List<PackageExtension> result = apiInstance.getBehaviorRuleExtensions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PackageExtensionsApi#getBehaviorRuleExtensions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PackageExtension&gt;**](PackageExtension.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

