
# ConversationDescriptor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resource** | **String** |  |  [optional]
**createdBy** | **String** |  |  [optional]
**createdOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**lastModifiedBy** | **String** |  |  [optional]
**lastModifiedOn** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**deleted** | **Boolean** |  |  [optional]
**botName** | **String** |  |  [optional]
**viewState** | [**ViewStateEnum**](#ViewStateEnum) |  |  [optional]
**conversationStepSize** | **Integer** |  |  [optional]
**createdByUserName** | **String** |  |  [optional]
**environment** | [**EnvironmentEnum**](#EnvironmentEnum) |  |  [optional]
**conversationState** | [**ConversationStateEnum**](#ConversationStateEnum) |  |  [optional]


<a name="ViewStateEnum"></a>
## Enum: ViewStateEnum
Name | Value
---- | -----
UNSEEN | &quot;UNSEEN&quot;
SEEN | &quot;SEEN&quot;


<a name="EnvironmentEnum"></a>
## Enum: EnvironmentEnum
Name | Value
---- | -----
RESTRICTED | &quot;restricted&quot;
UNRESTRICTED | &quot;unrestricted&quot;
TEST | &quot;test&quot;


<a name="ConversationStateEnum"></a>
## Enum: ConversationStateEnum
Name | Value
---- | -----
READY | &quot;READY&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
ENDED | &quot;ENDED&quot;
EXECUTION_INTERRUPTED | &quot;EXECUTION_INTERRUPTED&quot;
ERROR | &quot;ERROR&quot;



