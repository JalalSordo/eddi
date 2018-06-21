
# SimpleConversationMemorySnapshot

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**botId** | **String** |  |  [optional]
**botVersion** | **Integer** |  |  [optional]
**environment** | [**EnvironmentEnum**](#EnvironmentEnum) |  |  [optional]
**conversationState** | [**ConversationStateEnum**](#ConversationStateEnum) |  |  [optional]
**redoCacheSize** | **Integer** |  |  [optional]
**conversationSteps** | [**List&lt;SimpleConversationStep&gt;**](SimpleConversationStep.md) |  |  [optional]


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



