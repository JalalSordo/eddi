# BackupApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**exportBot1**](BackupApi.md#exportBot1) | **POST** /backup/export/{botId} | 
[**getBotZipArchive1**](BackupApi.md#getBotZipArchive1) | **GET** /backup/export/{botFilename} | 
[**importBot1**](BackupApi.md#importBot1) | **POST** /backup/import | 


<a name="exportBot1"></a>
# **exportBot1**
> exportBot1(botId, botVersion)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BackupApi;


BackupApi apiInstance = new BackupApi();
String botId = "botId_example"; // String | 
Integer botVersion = 1; // Integer | 
try {
    apiInstance.exportBot1(botId, botVersion);
} catch (ApiException e) {
    System.err.println("Exception when calling BackupApi#exportBot1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **botId** | **String**|  |
 **botVersion** | **Integer**|  | [default to 1]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBotZipArchive1"></a>
# **getBotZipArchive1**
> getBotZipArchive1(botFilename)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BackupApi;


BackupApi apiInstance = new BackupApi();
String botFilename = "botFilename_example"; // String | 
try {
    apiInstance.getBotZipArchive1(botFilename);
} catch (ApiException e) {
    System.err.println("Exception when calling BackupApi#getBotZipArchive1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **botFilename** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip

<a name="importBot1"></a>
# **importBot1**
> importBot1(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BackupApi;


BackupApi apiInstance = new BackupApi();
InputStream body = new InputStream(); // InputStream | 
try {
    apiInstance.importBot1(body);
} catch (ApiException e) {
    System.err.println("Exception when calling BackupApi#importBot1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InputStream**](InputStream.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/zip
 - **Accept**: Not defined

