# TestcasesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTestCase**](TestcasesApi.md#createTestCase) | **POST** /testcasestore/testcases | 
[**deleteTestCase**](TestcasesApi.md#deleteTestCase) | **DELETE** /testcasestore/testcases/{id} | 
[**getTestCaseState**](TestcasesApi.md#getTestCaseState) | **GET** /testcases/run/{id} | 
[**patchDescriptor**](TestcasesApi.md#patchDescriptor) | **PATCH** /testcasestore/testcases/{id} | 
[**readTestCase**](TestcasesApi.md#readTestCase) | **GET** /testcasestore/testcases/{id} | 
[**readTestCaseDescriptors**](TestcasesApi.md#readTestCaseDescriptors) | **GET** /testcasestore/testcases | 
[**runTestCase**](TestcasesApi.md#runTestCase) | **POST** /testcases/run/{id} | 
[**updateTestCase**](TestcasesApi.md#updateTestCase) | **PUT** /testcasestore/testcases/{id} | 


<a name="createTestCase"></a>
# **createTestCase**
> createTestCase(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestcasesApi;


TestcasesApi apiInstance = new TestcasesApi();
String body = "body_example"; // String | 
try {
    apiInstance.createTestCase(body);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcasesApi#createTestCase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteTestCase"></a>
# **deleteTestCase**
> deleteTestCase(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestcasesApi;


TestcasesApi apiInstance = new TestcasesApi();
String id = "id_example"; // String | 
try {
    apiInstance.deleteTestCase(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcasesApi#deleteTestCase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getTestCaseState"></a>
# **getTestCaseState**
> String getTestCaseState(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestcasesApi;


TestcasesApi apiInstance = new TestcasesApi();
String id = "id_example"; // String | 
try {
    String result = apiInstance.getTestCaseState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcasesApi#getTestCaseState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="patchDescriptor"></a>
# **patchDescriptor**
> patchDescriptor(id, version, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestcasesApi;


TestcasesApi apiInstance = new TestcasesApi();
String id = "id_example"; // String | 
Integer version = 56; // Integer | 
PatchInstructionSimpleTestCaseDescriptor body = new PatchInstructionSimpleTestCaseDescriptor(); // PatchInstructionSimpleTestCaseDescriptor | 
try {
    apiInstance.patchDescriptor(id, version, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcasesApi#patchDescriptor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  | [optional]
 **body** | [**PatchInstructionSimpleTestCaseDescriptor**](PatchInstructionSimpleTestCaseDescriptor.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="readTestCase"></a>
# **readTestCase**
> TestCase readTestCase(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestcasesApi;


TestcasesApi apiInstance = new TestcasesApi();
String id = "id_example"; // String | 
try {
    TestCase result = apiInstance.readTestCase(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcasesApi#readTestCase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**TestCase**](TestCase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readTestCaseDescriptors"></a>
# **readTestCaseDescriptors**
> List&lt;TestCaseDescriptor&gt; readTestCaseDescriptors(botId, botVersion, index, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestcasesApi;


TestcasesApi apiInstance = new TestcasesApi();
String botId = "botId_example"; // String | 
Integer botVersion = 56; // Integer | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
try {
    List<TestCaseDescriptor> result = apiInstance.readTestCaseDescriptors(botId, botVersion, index, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcasesApi#readTestCaseDescriptors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **botId** | **String**|  | [optional]
 **botVersion** | **Integer**|  | [optional]
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

[**List&lt;TestCaseDescriptor&gt;**](TestCaseDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="runTestCase"></a>
# **runTestCase**
> runTestCase(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestcasesApi;


TestcasesApi apiInstance = new TestcasesApi();
String id = "id_example"; // String | 
try {
    apiInstance.runTestCase(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcasesApi#runTestCase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateTestCase"></a>
# **updateTestCase**
> String updateTestCase(id, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TestcasesApi;


TestcasesApi apiInstance = new TestcasesApi();
String id = "id_example"; // String | 
TestCase body = new TestCase(); // TestCase | 
try {
    String result = apiInstance.updateTestCase(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TestcasesApi#updateTestCase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**TestCase**](TestCase.md)|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

