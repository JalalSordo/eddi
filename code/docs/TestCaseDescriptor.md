
# TestCaseDescriptor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource** | **String** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastModifiedBy** | **String** |  |  [optional]
**lastModifiedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**deleted** | **Boolean** |  |  [optional]
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**testCaseState** | [**TestCaseStateEnum**](#TestCaseStateEnum) |  |  [optional]


<a name="TestCaseStateEnum"></a>
## Enum: TestCaseStateEnum
Name | Value
---- | -----
IN_PROGRESS | &quot;IN_PROGRESS&quot;
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
ERROR | &quot;ERROR&quot;



