
# TestCase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**botId** | **String** |  |  [optional]
**botVersion** | **Integer** |  |  [optional]
**testCaseState** | [**TestCaseStateEnum**](#TestCaseStateEnum) |  |  [optional]
**lastRun** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**expected** | [**ConversationMemorySnapshot**](ConversationMemorySnapshot.md) |  |  [optional]
**actual** | [**ConversationMemorySnapshot**](ConversationMemorySnapshot.md) |  |  [optional]


<a name="TestCaseStateEnum"></a>
## Enum: TestCaseStateEnum
Name | Value
---- | -----
IN_PROGRESS | &quot;IN_PROGRESS&quot;
SUCCESS | &quot;SUCCESS&quot;
FAILED | &quot;FAILED&quot;
ERROR | &quot;ERROR&quot;



