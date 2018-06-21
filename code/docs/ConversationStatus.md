
# ConversationStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationId** | **String** |  |  [optional]
**botId** | **String** |  |  [optional]
**botVersion** | **Integer** |  |  [optional]
**conversationState** | [**ConversationStateEnum**](#ConversationStateEnum) |  |  [optional]
**lastInteraction** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]


<a name="ConversationStateEnum"></a>
## Enum: ConversationStateEnum
Name | Value
---- | -----
READY | &quot;READY&quot;
IN_PROGRESS | &quot;IN_PROGRESS&quot;
ENDED | &quot;ENDED&quot;
EXECUTION_INTERRUPTED | &quot;EXECUTION_INTERRUPTED&quot;
ERROR | &quot;ERROR&quot;



