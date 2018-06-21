# ConfigurationsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBehaviorRuleSet**](ConfigurationsApi.md#createBehaviorRuleSet) | **POST** /behaviorstore/behaviorsets | 
[**createBot**](ConfigurationsApi.md#createBot) | **POST** /botstore/bots | 
[**createHttpCalls**](ConfigurationsApi.md#createHttpCalls) | **POST** /httpcallsstore/httpcalls | 
[**createOutputSet**](ConfigurationsApi.md#createOutputSet) | **POST** /outputstore/outputsets | 
[**createPackage**](ConfigurationsApi.md#createPackage) | **POST** /packagestore/packages | 
[**createParser**](ConfigurationsApi.md#createParser) | **POST** /parserstore/parsers | 
[**createRegularDictionary**](ConfigurationsApi.md#createRegularDictionary) | **POST** /regulardictionarystore/regulardictionaries | 
[**deleteBehaviorRuleSet**](ConfigurationsApi.md#deleteBehaviorRuleSet) | **DELETE** /behaviorstore/behaviorsets/{id} | 
[**deleteBot**](ConfigurationsApi.md#deleteBot) | **DELETE** /botstore/bots/{id} | 
[**deleteConversationLog**](ConfigurationsApi.md#deleteConversationLog) | **DELETE** /conversationstore/conversations/{conversationId} | 
[**deleteHttpCalls**](ConfigurationsApi.md#deleteHttpCalls) | **DELETE** /httpcallsstore/httpcalls/{id} | 
[**deleteOutputSet**](ConfigurationsApi.md#deleteOutputSet) | **DELETE** /outputstore/outputsets/{id} | 
[**deletePackage**](ConfigurationsApi.md#deletePackage) | **DELETE** /packagestore/packages/{id} | 
[**deleteParser**](ConfigurationsApi.md#deleteParser) | **DELETE** /parserstore/parsers/{id} | 
[**deleteRegularDictionary**](ConfigurationsApi.md#deleteRegularDictionary) | **DELETE** /regulardictionarystore/regulardictionaries/{id} | 
[**endActiveConversations**](ConfigurationsApi.md#endActiveConversations) | **POST** /conversationstore/conversations/end | 
[**getActiveConversations**](ConfigurationsApi.md#getActiveConversations) | **GET** /conversationstore/conversations/active/{botId} | 
[**getCurrentVersion**](ConfigurationsApi.md#getCurrentVersion) | **GET** /botstore/bots/{id}/currentversion | 
[**getCurrentVersion1**](ConfigurationsApi.md#getCurrentVersion1) | **GET** /httpcallsstore/httpcalls/{id}/currentversion | 
[**getCurrentVersion2**](ConfigurationsApi.md#getCurrentVersion2) | **GET** /outputstore/outputsets/{id}/currentversion | 
[**getCurrentVersion3**](ConfigurationsApi.md#getCurrentVersion3) | **GET** /packagestore/packages/{id}/currentversion | 
[**getCurrentVersion4**](ConfigurationsApi.md#getCurrentVersion4) | **GET** /parserstore/parsers/{id}/currentversion | 
[**getCurrentVersion5**](ConfigurationsApi.md#getCurrentVersion5) | **GET** /regulardictionarystore/regulardictionaries/{id}/currentversion | 
[**getCurrentVersion7**](ConfigurationsApi.md#getCurrentVersion7) | **GET** /behaviorstore/behaviorsets/{id}/currentversion | 
[**patchDescriptor**](ConfigurationsApi.md#patchDescriptor) | **PATCH** /descriptorstore/descriptors/{id} | 
[**patchOutputSet**](ConfigurationsApi.md#patchOutputSet) | **PATCH** /outputstore/outputsets/{id} | 
[**patchRegularDictionary**](ConfigurationsApi.md#patchRegularDictionary) | **PATCH** /regulardictionarystore/regulardictionaries/{id} | 
[**readBehaviorDescriptors**](ConfigurationsApi.md#readBehaviorDescriptors) | **GET** /behaviorstore/behaviorsets/descriptors | 
[**readBehaviorRuleSet**](ConfigurationsApi.md#readBehaviorRuleSet) | **GET** /behaviorstore/behaviorsets/{id} | 
[**readBot**](ConfigurationsApi.md#readBot) | **GET** /botstore/bots/{id} | 
[**readBotDescriptors**](ConfigurationsApi.md#readBotDescriptors) | **GET** /botstore/bots/descriptors | 
[**readBotDescriptors_0**](ConfigurationsApi.md#readBotDescriptors_0) | **POST** /botstore/bots/descriptors | 
[**readConversationDescriptors**](ConfigurationsApi.md#readConversationDescriptors) | **GET** /conversationstore/conversations | 
[**readConversationLog**](ConfigurationsApi.md#readConversationLog) | **GET** /conversationstore/conversations/{conversationId} | 
[**readDescriptor**](ConfigurationsApi.md#readDescriptor) | **GET** /descriptorstore/descriptors/{id} | 
[**readDescriptors**](ConfigurationsApi.md#readDescriptors) | **GET** /descriptorstore/descriptors | 
[**readExpressions**](ConfigurationsApi.md#readExpressions) | **GET** /regulardictionarystore/regulardictionaries/{id}/expressions | 
[**readExtensionDescriptors**](ConfigurationsApi.md#readExtensionDescriptors) | **GET** /extensionstore/extensions | 
[**readHttpCalls**](ConfigurationsApi.md#readHttpCalls) | **GET** /httpcallsstore/httpcalls/{id} | 
[**readHttpCallsDescriptors**](ConfigurationsApi.md#readHttpCallsDescriptors) | **GET** /httpcallsstore/httpcalls/descriptors | 
[**readOutputDescriptors**](ConfigurationsApi.md#readOutputDescriptors) | **GET** /outputstore/outputsets/descriptors | 
[**readOutputKeys**](ConfigurationsApi.md#readOutputKeys) | **GET** /outputstore/outputsets/{id}/outputKeys | 
[**readOutputSet**](ConfigurationsApi.md#readOutputSet) | **GET** /outputstore/outputsets/{id} | 
[**readPackage**](ConfigurationsApi.md#readPackage) | **GET** /packagestore/packages/{id} | 
[**readPackageDescriptors**](ConfigurationsApi.md#readPackageDescriptors) | **GET** /packagestore/packages/descriptors | 
[**readPackageDescriptors_0**](ConfigurationsApi.md#readPackageDescriptors_0) | **POST** /packagestore/packages/descriptors | 
[**readParser**](ConfigurationsApi.md#readParser) | **GET** /parserstore/parsers/{id} | 
[**readParserDescriptors**](ConfigurationsApi.md#readParserDescriptors) | **GET** /parserstore/parsers/descriptors | 
[**readPermissions**](ConfigurationsApi.md#readPermissions) | **GET** /permissionstore/permissions/{resourceId} | 
[**readRegularDictionary**](ConfigurationsApi.md#readRegularDictionary) | **GET** /regulardictionarystore/regulardictionaries/{id} | 
[**readRegularDictionaryDescriptors**](ConfigurationsApi.md#readRegularDictionaryDescriptors) | **GET** /regulardictionarystore/regulardictionaries/descriptors | 
[**readSimpleDescriptor**](ConfigurationsApi.md#readSimpleDescriptor) | **GET** /descriptorstore/descriptors/{id}/simple | 
[**redirectToLatestVersion**](ConfigurationsApi.md#redirectToLatestVersion) | **POST** /botstore/bots/{id}/currentversion | 
[**redirectToLatestVersion1**](ConfigurationsApi.md#redirectToLatestVersion1) | **POST** /httpcallsstore/httpcalls/{id}/currentversion | 
[**redirectToLatestVersion2**](ConfigurationsApi.md#redirectToLatestVersion2) | **POST** /outputstore/outputsets/{id}/currentversion | 
[**redirectToLatestVersion3**](ConfigurationsApi.md#redirectToLatestVersion3) | **POST** /packagestore/packages/{id}/currentversion | 
[**redirectToLatestVersion4**](ConfigurationsApi.md#redirectToLatestVersion4) | **POST** /parserstore/parsers/{id}/currentversion | 
[**redirectToLatestVersion5**](ConfigurationsApi.md#redirectToLatestVersion5) | **POST** /regulardictionarystore/regulardictionaries/{id}/currentversion | 
[**redirectToLatestVersion7**](ConfigurationsApi.md#redirectToLatestVersion7) | **POST** /behaviorstore/behaviorsets/{id}/currentversion | 
[**updateBehaviorRuleSet**](ConfigurationsApi.md#updateBehaviorRuleSet) | **PUT** /behaviorstore/behaviorsets/{id} | 
[**updateBot**](ConfigurationsApi.md#updateBot) | **PUT** /botstore/bots/{id} | 
[**updateHttpCalls**](ConfigurationsApi.md#updateHttpCalls) | **PUT** /httpcallsstore/httpcalls/{id} | 
[**updateOutputSet**](ConfigurationsApi.md#updateOutputSet) | **PUT** /outputstore/outputsets/{id} | 
[**updatePackage**](ConfigurationsApi.md#updatePackage) | **PUT** /packagestore/packages/{id} | 
[**updateParser**](ConfigurationsApi.md#updateParser) | **PUT** /parserstore/parsers/{id} | 
[**updatePermissions**](ConfigurationsApi.md#updatePermissions) | **PUT** /permissionstore/permissions/{resourceId} | 
[**updateRegularDictionary**](ConfigurationsApi.md#updateRegularDictionary) | **PUT** /regulardictionarystore/regulardictionaries/{id} | 
[**updateResourceInBot**](ConfigurationsApi.md#updateResourceInBot) | **PUT** /botstore/bots/{id}/updateResourceUri | 
[**updateResourceInPackage**](ConfigurationsApi.md#updateResourceInPackage) | **PUT** /packagestore/packages/{id}/updateResourceUri | 


<a name="createBehaviorRuleSet"></a>
# **createBehaviorRuleSet**
> createBehaviorRuleSet(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
BehaviorConfiguration body = new BehaviorConfiguration(); // BehaviorConfiguration | 
try {
    apiInstance.createBehaviorRuleSet(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#createBehaviorRuleSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BehaviorConfiguration**](BehaviorConfiguration.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createBot"></a>
# **createBot**
> createBot(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
BotConfiguration body = new BotConfiguration(); // BotConfiguration | 
try {
    apiInstance.createBot(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#createBot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BotConfiguration**](BotConfiguration.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createHttpCalls"></a>
# **createHttpCalls**
> createHttpCalls(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
HttpCallsConfiguration body = new HttpCallsConfiguration(); // HttpCallsConfiguration | 
try {
    apiInstance.createHttpCalls(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#createHttpCalls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**HttpCallsConfiguration**](HttpCallsConfiguration.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createOutputSet"></a>
# **createOutputSet**
> createOutputSet(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
OutputConfigurationSet body = new OutputConfigurationSet(); // OutputConfigurationSet | 
try {
    apiInstance.createOutputSet(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#createOutputSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OutputConfigurationSet**](OutputConfigurationSet.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createPackage"></a>
# **createPackage**
> createPackage(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
PackageConfiguration body = new PackageConfiguration(); // PackageConfiguration | 
try {
    apiInstance.createPackage(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#createPackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PackageConfiguration**](PackageConfiguration.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createParser"></a>
# **createParser**
> createParser(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
ParserConfiguration body = new ParserConfiguration(); // ParserConfiguration | 
try {
    apiInstance.createParser(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#createParser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParserConfiguration**](ParserConfiguration.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRegularDictionary"></a>
# **createRegularDictionary**
> createRegularDictionary(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
RegularDictionaryConfiguration body = new RegularDictionaryConfiguration(); // RegularDictionaryConfiguration | 
try {
    apiInstance.createRegularDictionary(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#createRegularDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RegularDictionaryConfiguration**](RegularDictionaryConfiguration.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteBehaviorRuleSet"></a>
# **deleteBehaviorRuleSet**
> deleteBehaviorRuleSet(id, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
try {
    apiInstance.deleteBehaviorRuleSet(id, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#deleteBehaviorRuleSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteBot"></a>
# **deleteBot**
> deleteBot(id, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
try {
    apiInstance.deleteBot(id, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#deleteBot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteConversationLog"></a>
# **deleteConversationLog**
> deleteConversationLog(conversationId, deletePermanently)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String conversationId = "conversationId_example"; // String | 
Boolean deletePermanently = false; // Boolean | 
try {
    apiInstance.deleteConversationLog(conversationId, deletePermanently);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#deleteConversationLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**|  |
 **deletePermanently** | **Boolean**|  | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteHttpCalls"></a>
# **deleteHttpCalls**
> deleteHttpCalls(id, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
try {
    apiInstance.deleteHttpCalls(id, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#deleteHttpCalls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteOutputSet"></a>
# **deleteOutputSet**
> deleteOutputSet(id, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
try {
    apiInstance.deleteOutputSet(id, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#deleteOutputSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deletePackage"></a>
# **deletePackage**
> deletePackage(id, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
try {
    apiInstance.deletePackage(id, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#deletePackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteParser"></a>
# **deleteParser**
> deleteParser(id, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
try {
    apiInstance.deleteParser(id, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#deleteParser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteRegularDictionary"></a>
# **deleteRegularDictionary**
> deleteRegularDictionary(id, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
try {
    apiInstance.deleteRegularDictionary(id, version);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#deleteRegularDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="endActiveConversations"></a>
# **endActiveConversations**
> endActiveConversations(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
List<ConversationStatus> body = Arrays.asList(new ConversationStatus()); // List<ConversationStatus> | 
try {
    apiInstance.endActiveConversations(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#endActiveConversations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;ConversationStatus&gt;**](ConversationStatus.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getActiveConversations"></a>
# **getActiveConversations**
> List&lt;ConversationStatus&gt; getActiveConversations(botId, botVersion, index, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String botId = "botId_example"; // String | 
Integer botVersion = 1; // Integer | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
try {
    List<ConversationStatus> result = apiInstance.getActiveConversations(botId, botVersion, index, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#getActiveConversations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **botId** | **String**|  |
 **botVersion** | **Integer**|  |
 **index** | **Integer**|  | [default to 0]
 **limit** | **Integer**|  | [default to 20]

### Return type

[**List&lt;ConversationStatus&gt;**](ConversationStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrentVersion"></a>
# **getCurrentVersion**
> Integer getCurrentVersion(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
try {
    Integer result = apiInstance.getCurrentVersion(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#getCurrentVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getCurrentVersion1"></a>
# **getCurrentVersion1**
> Integer getCurrentVersion1(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
try {
    Integer result = apiInstance.getCurrentVersion1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#getCurrentVersion1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getCurrentVersion2"></a>
# **getCurrentVersion2**
> Integer getCurrentVersion2(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
try {
    Integer result = apiInstance.getCurrentVersion2(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#getCurrentVersion2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getCurrentVersion3"></a>
# **getCurrentVersion3**
> Integer getCurrentVersion3(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
try {
    Integer result = apiInstance.getCurrentVersion3(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#getCurrentVersion3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getCurrentVersion4"></a>
# **getCurrentVersion4**
> Integer getCurrentVersion4(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
try {
    Integer result = apiInstance.getCurrentVersion4(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#getCurrentVersion4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getCurrentVersion5"></a>
# **getCurrentVersion5**
> Integer getCurrentVersion5(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
try {
    Integer result = apiInstance.getCurrentVersion5(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#getCurrentVersion5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getCurrentVersion7"></a>
# **getCurrentVersion7**
> Integer getCurrentVersion7(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
try {
    Integer result = apiInstance.getCurrentVersion7(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#getCurrentVersion7");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**Integer**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="patchDescriptor"></a>
# **patchDescriptor**
> patchDescriptor(id, version, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
PatchInstructionDocumentDescriptor body = new PatchInstructionDocumentDescriptor(); // PatchInstructionDocumentDescriptor | 
try {
    apiInstance.patchDescriptor(id, version, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#patchDescriptor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **body** | [**PatchInstructionDocumentDescriptor**](PatchInstructionDocumentDescriptor.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="patchOutputSet"></a>
# **patchOutputSet**
> patchOutputSet(id, version, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
List<PatchInstructionOutputConfigurationSet> body = Arrays.asList(new PatchInstructionOutputConfigurationSet()); // List<PatchInstructionOutputConfigurationSet> | 
try {
    apiInstance.patchOutputSet(id, version, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#patchOutputSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **body** | [**List&lt;PatchInstructionOutputConfigurationSet&gt;**](PatchInstructionOutputConfigurationSet.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="patchRegularDictionary"></a>
# **patchRegularDictionary**
> patchRegularDictionary(id, version, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
List<PatchInstructionRegularDictionaryConfiguration> body = Arrays.asList(new PatchInstructionRegularDictionaryConfiguration()); // List<PatchInstructionRegularDictionaryConfiguration> | 
try {
    apiInstance.patchRegularDictionary(id, version, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#patchRegularDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **body** | [**List&lt;PatchInstructionRegularDictionaryConfiguration&gt;**](PatchInstructionRegularDictionaryConfiguration.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="readBehaviorDescriptors"></a>
# **readBehaviorDescriptors**
> List&lt;DocumentDescriptor&gt; readBehaviorDescriptors(filter, index, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String filter = "filter_example"; // String | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
try {
    List<DocumentDescriptor> result = apiInstance.readBehaviorDescriptors(filter, index, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readBehaviorDescriptors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

[**List&lt;DocumentDescriptor&gt;**](DocumentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readBehaviorRuleSet"></a>
# **readBehaviorRuleSet**
> BehaviorConfiguration readBehaviorRuleSet(id, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
try {
    BehaviorConfiguration result = apiInstance.readBehaviorRuleSet(id, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readBehaviorRuleSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |

### Return type

[**BehaviorConfiguration**](BehaviorConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readBot"></a>
# **readBot**
> BotConfiguration readBot(id, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
try {
    BotConfiguration result = apiInstance.readBot(id, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readBot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |

### Return type

[**BotConfiguration**](BotConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readBotDescriptors"></a>
# **readBotDescriptors**
> List&lt;DocumentDescriptor&gt; readBotDescriptors(filter, index, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String filter = "filter_example"; // String | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
try {
    List<DocumentDescriptor> result = apiInstance.readBotDescriptors(filter, index, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readBotDescriptors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

[**List&lt;DocumentDescriptor&gt;**](DocumentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readBotDescriptors_0"></a>
# **readBotDescriptors_0**
> List&lt;DocumentDescriptor&gt; readBotDescriptors_0(filter, index, limit, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String filter = "filter_example"; // String | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
String body = "body_example"; // String | eddi://ai.labs.package/packagestore/packages/ID?version=VERSION
try {
    List<DocumentDescriptor> result = apiInstance.readBotDescriptors_0(filter, index, limit, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readBotDescriptors_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]
 **body** | **String**| eddi://ai.labs.package/packagestore/packages/ID?version&#x3D;VERSION | [optional]

### Return type

[**List&lt;DocumentDescriptor&gt;**](DocumentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json

<a name="readConversationDescriptors"></a>
# **readConversationDescriptors**
> List&lt;ConversationDescriptor&gt; readConversationDescriptors(index, limit, botId, botVersion, conversationState, viewState)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
String botId = "botId_example"; // String | 
Integer botVersion = 56; // Integer | 
String conversationState = "conversationState_example"; // String | 
String viewState = "viewState_example"; // String | 
try {
    List<ConversationDescriptor> result = apiInstance.readConversationDescriptors(index, limit, botId, botVersion, conversationState, viewState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readConversationDescriptors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]
 **botId** | **String**|  | [optional]
 **botVersion** | **Integer**|  | [optional]
 **conversationState** | **String**|  | [optional] [enum: READY, IN_PROGRESS, ENDED, EXECUTION_INTERRUPTED, ERROR]
 **viewState** | **String**|  | [optional] [enum: UNSEEN, SEEN]

### Return type

[**List&lt;ConversationDescriptor&gt;**](ConversationDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readConversationLog"></a>
# **readConversationLog**
> ConversationMemorySnapshot readConversationLog(conversationId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String conversationId = "conversationId_example"; // String | 
try {
    ConversationMemorySnapshot result = apiInstance.readConversationLog(conversationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readConversationLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationId** | **String**|  |

### Return type

[**ConversationMemorySnapshot**](ConversationMemorySnapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readDescriptor"></a>
# **readDescriptor**
> DocumentDescriptor readDescriptor(id, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
try {
    DocumentDescriptor result = apiInstance.readDescriptor(id, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readDescriptor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |

### Return type

[**DocumentDescriptor**](DocumentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readDescriptors"></a>
# **readDescriptors**
> List&lt;DocumentDescriptor&gt; readDescriptors(type, filter, index, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String type = "type_example"; // String | 
String filter = "filter_example"; // String | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
try {
    List<DocumentDescriptor> result = apiInstance.readDescriptors(type, filter, index, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readDescriptors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**|  | [optional]
 **filter** | **String**|  | [optional]
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

[**List&lt;DocumentDescriptor&gt;**](DocumentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readExpressions"></a>
# **readExpressions**
> List&lt;String&gt; readExpressions(id, version, filter, order, index, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
String filter = "filter_example"; // String | 
String order = "order_example"; // String | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
try {
    List<String> result = apiInstance.readExpressions(id, version, filter, order, index, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readExpressions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **filter** | **String**|  | [optional]
 **order** | **String**|  | [optional]
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readExtensionDescriptors"></a>
# **readExtensionDescriptors**
> List&lt;ExtensionDescriptor&gt; readExtensionDescriptors(filter)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String filter = "filter_example"; // String | 
try {
    List<ExtensionDescriptor> result = apiInstance.readExtensionDescriptors(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readExtensionDescriptors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]

### Return type

[**List&lt;ExtensionDescriptor&gt;**](ExtensionDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readHttpCalls"></a>
# **readHttpCalls**
> HttpCallsConfiguration readHttpCalls(id, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
try {
    HttpCallsConfiguration result = apiInstance.readHttpCalls(id, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readHttpCalls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |

### Return type

[**HttpCallsConfiguration**](HttpCallsConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readHttpCallsDescriptors"></a>
# **readHttpCallsDescriptors**
> List&lt;DocumentDescriptor&gt; readHttpCallsDescriptors(filter, index, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String filter = "filter_example"; // String | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
try {
    List<DocumentDescriptor> result = apiInstance.readHttpCallsDescriptors(filter, index, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readHttpCallsDescriptors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

[**List&lt;DocumentDescriptor&gt;**](DocumentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readOutputDescriptors"></a>
# **readOutputDescriptors**
> List&lt;DocumentDescriptor&gt; readOutputDescriptors(filter, index, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String filter = "filter_example"; // String | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
try {
    List<DocumentDescriptor> result = apiInstance.readOutputDescriptors(filter, index, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readOutputDescriptors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

[**List&lt;DocumentDescriptor&gt;**](DocumentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readOutputKeys"></a>
# **readOutputKeys**
> List&lt;String&gt; readOutputKeys(id, version, filter, order, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
String filter = "filter_example"; // String | 
String order = "order_example"; // String | 
Integer limit = 20; // Integer | 
try {
    List<String> result = apiInstance.readOutputKeys(id, version, filter, order, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readOutputKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **filter** | **String**|  | [optional]
 **order** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readOutputSet"></a>
# **readOutputSet**
> OutputConfigurationSet readOutputSet(id, version, filter, order, index, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
String filter = "filter_example"; // String | 
String order = "order_example"; // String | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
try {
    OutputConfigurationSet result = apiInstance.readOutputSet(id, version, filter, order, index, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readOutputSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **filter** | **String**|  | [optional]
 **order** | **String**|  | [optional]
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

[**OutputConfigurationSet**](OutputConfigurationSet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readPackage"></a>
# **readPackage**
> PackageConfiguration readPackage(id, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
try {
    PackageConfiguration result = apiInstance.readPackage(id, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readPackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |

### Return type

[**PackageConfiguration**](PackageConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readPackageDescriptors"></a>
# **readPackageDescriptors**
> List&lt;DocumentDescriptor&gt; readPackageDescriptors(filter, index, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String filter = "filter_example"; // String | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
try {
    List<DocumentDescriptor> result = apiInstance.readPackageDescriptors(filter, index, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readPackageDescriptors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

[**List&lt;DocumentDescriptor&gt;**](DocumentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readPackageDescriptors_0"></a>
# **readPackageDescriptors_0**
> List&lt;DocumentDescriptor&gt; readPackageDescriptors_0(filter, index, limit, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String filter = "filter_example"; // String | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
String body = "body_example"; // String | eddi://ai.labs.TYPE/PATH/ID?version=VERSION
try {
    List<DocumentDescriptor> result = apiInstance.readPackageDescriptors_0(filter, index, limit, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readPackageDescriptors_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]
 **body** | **String**| eddi://ai.labs.TYPE/PATH/ID?version&#x3D;VERSION | [optional]

### Return type

[**List&lt;DocumentDescriptor&gt;**](DocumentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: application/json

<a name="readParser"></a>
# **readParser**
> ParserConfiguration readParser(id, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
try {
    ParserConfiguration result = apiInstance.readParser(id, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readParser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |

### Return type

[**ParserConfiguration**](ParserConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readParserDescriptors"></a>
# **readParserDescriptors**
> List&lt;DocumentDescriptor&gt; readParserDescriptors(filter, index, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String filter = "filter_example"; // String | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
try {
    List<DocumentDescriptor> result = apiInstance.readParserDescriptors(filter, index, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readParserDescriptors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

[**List&lt;DocumentDescriptor&gt;**](DocumentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readPermissions"></a>
# **readPermissions**
> Permissions readPermissions(resourceId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String resourceId = "resourceId_example"; // String | 
try {
    Permissions result = apiInstance.readPermissions(resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **String**|  |

### Return type

[**Permissions**](Permissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readRegularDictionary"></a>
# **readRegularDictionary**
> RegularDictionaryConfiguration readRegularDictionary(id, version, filter, order, index, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
String filter = "filter_example"; // String | 
String order = "order_example"; // String | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
try {
    RegularDictionaryConfiguration result = apiInstance.readRegularDictionary(id, version, filter, order, index, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readRegularDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **filter** | **String**|  | [optional]
 **order** | **String**|  | [optional]
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

[**RegularDictionaryConfiguration**](RegularDictionaryConfiguration.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readRegularDictionaryDescriptors"></a>
# **readRegularDictionaryDescriptors**
> List&lt;DocumentDescriptor&gt; readRegularDictionaryDescriptors(filter, index, limit)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String filter = "filter_example"; // String | 
Integer index = 0; // Integer | 
Integer limit = 20; // Integer | 
try {
    List<DocumentDescriptor> result = apiInstance.readRegularDictionaryDescriptors(filter, index, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readRegularDictionaryDescriptors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]
 **index** | **Integer**|  | [optional] [default to 0]
 **limit** | **Integer**|  | [optional] [default to 20]

### Return type

[**List&lt;DocumentDescriptor&gt;**](DocumentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="readSimpleDescriptor"></a>
# **readSimpleDescriptor**
> SimpleDocumentDescriptor readSimpleDescriptor(id, version)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
try {
    SimpleDocumentDescriptor result = apiInstance.readSimpleDescriptor(id, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#readSimpleDescriptor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |

### Return type

[**SimpleDocumentDescriptor**](SimpleDocumentDescriptor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="redirectToLatestVersion"></a>
# **redirectToLatestVersion**
> redirectToLatestVersion(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
try {
    apiInstance.redirectToLatestVersion(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#redirectToLatestVersion");
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

<a name="redirectToLatestVersion1"></a>
# **redirectToLatestVersion1**
> redirectToLatestVersion1(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
try {
    apiInstance.redirectToLatestVersion1(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#redirectToLatestVersion1");
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

<a name="redirectToLatestVersion2"></a>
# **redirectToLatestVersion2**
> redirectToLatestVersion2(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
try {
    apiInstance.redirectToLatestVersion2(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#redirectToLatestVersion2");
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

<a name="redirectToLatestVersion3"></a>
# **redirectToLatestVersion3**
> redirectToLatestVersion3(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
try {
    apiInstance.redirectToLatestVersion3(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#redirectToLatestVersion3");
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

<a name="redirectToLatestVersion4"></a>
# **redirectToLatestVersion4**
> redirectToLatestVersion4(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
try {
    apiInstance.redirectToLatestVersion4(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#redirectToLatestVersion4");
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

<a name="redirectToLatestVersion5"></a>
# **redirectToLatestVersion5**
> redirectToLatestVersion5(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
try {
    apiInstance.redirectToLatestVersion5(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#redirectToLatestVersion5");
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

<a name="redirectToLatestVersion7"></a>
# **redirectToLatestVersion7**
> redirectToLatestVersion7(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
try {
    apiInstance.redirectToLatestVersion7(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#redirectToLatestVersion7");
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

<a name="updateBehaviorRuleSet"></a>
# **updateBehaviorRuleSet**
> updateBehaviorRuleSet(id, version, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
BehaviorConfiguration body = new BehaviorConfiguration(); // BehaviorConfiguration | 
try {
    apiInstance.updateBehaviorRuleSet(id, version, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#updateBehaviorRuleSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **body** | [**BehaviorConfiguration**](BehaviorConfiguration.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateBot"></a>
# **updateBot**
> updateBot(id, version, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
BotConfiguration body = new BotConfiguration(); // BotConfiguration | 
try {
    apiInstance.updateBot(id, version, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#updateBot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **body** | [**BotConfiguration**](BotConfiguration.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateHttpCalls"></a>
# **updateHttpCalls**
> updateHttpCalls(id, version, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
HttpCallsConfiguration body = new HttpCallsConfiguration(); // HttpCallsConfiguration | 
try {
    apiInstance.updateHttpCalls(id, version, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#updateHttpCalls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **body** | [**HttpCallsConfiguration**](HttpCallsConfiguration.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateOutputSet"></a>
# **updateOutputSet**
> updateOutputSet(id, version, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
OutputConfigurationSet body = new OutputConfigurationSet(); // OutputConfigurationSet | 
try {
    apiInstance.updateOutputSet(id, version, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#updateOutputSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **body** | [**OutputConfigurationSet**](OutputConfigurationSet.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updatePackage"></a>
# **updatePackage**
> updatePackage(id, version, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
PackageConfiguration body = new PackageConfiguration(); // PackageConfiguration | 
try {
    apiInstance.updatePackage(id, version, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#updatePackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **body** | [**PackageConfiguration**](PackageConfiguration.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateParser"></a>
# **updateParser**
> updateParser(id, version, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
ParserConfiguration body = new ParserConfiguration(); // ParserConfiguration | 
try {
    apiInstance.updateParser(id, version, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#updateParser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **body** | [**ParserConfiguration**](ParserConfiguration.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updatePermissions"></a>
# **updatePermissions**
> updatePermissions(resourceId, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String resourceId = "resourceId_example"; // String | 
Permissions body = new Permissions(); // Permissions | 
try {
    apiInstance.updatePermissions(resourceId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#updatePermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **String**|  |
 **body** | [**Permissions**](Permissions.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateRegularDictionary"></a>
# **updateRegularDictionary**
> updateRegularDictionary(id, version, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
RegularDictionaryConfiguration body = new RegularDictionaryConfiguration(); // RegularDictionaryConfiguration | 
try {
    apiInstance.updateRegularDictionary(id, version, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#updateRegularDictionary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **body** | [**RegularDictionaryConfiguration**](RegularDictionaryConfiguration.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateResourceInBot"></a>
# **updateResourceInBot**
> updateResourceInBot(id, version, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
String body = "body_example"; // String | 
try {
    apiInstance.updateResourceInBot(id, version, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#updateResourceInBot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **body** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: Not defined

<a name="updateResourceInPackage"></a>
# **updateResourceInPackage**
> updateResourceInPackage(id, version, body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ConfigurationsApi;


ConfigurationsApi apiInstance = new ConfigurationsApi();
String id = "id_example"; // String | 
Integer version = 1; // Integer | 
String body = "body_example"; // String | 
try {
    apiInstance.updateResourceInPackage(id, version, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationsApi#updateResourceInPackage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **version** | **Integer**|  |
 **body** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: Not defined

