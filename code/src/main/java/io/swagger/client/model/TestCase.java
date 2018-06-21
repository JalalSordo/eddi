/*
 * EDDI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ConversationMemorySnapshot;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * TestCase
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T23:55:01.697Z")
public class TestCase {
  @SerializedName("botId")
  private String botId = null;

  @SerializedName("botVersion")
  private Integer botVersion = null;

  /**
   * Gets or Sets testCaseState
   */
  @JsonAdapter(TestCaseStateEnum.Adapter.class)
  public enum TestCaseStateEnum {
    IN_PROGRESS("IN_PROGRESS"),
    
    SUCCESS("SUCCESS"),
    
    FAILED("FAILED"),
    
    ERROR("ERROR");

    private String value;

    TestCaseStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TestCaseStateEnum fromValue(String text) {
      for (TestCaseStateEnum b : TestCaseStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TestCaseStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TestCaseStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TestCaseStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TestCaseStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("testCaseState")
  private TestCaseStateEnum testCaseState = null;

  @SerializedName("lastRun")
  private OffsetDateTime lastRun = null;

  @SerializedName("expected")
  private ConversationMemorySnapshot expected = null;

  @SerializedName("actual")
  private ConversationMemorySnapshot actual = null;

  public TestCase botId(String botId) {
    this.botId = botId;
    return this;
  }

   /**
   * Get botId
   * @return botId
  **/
  @ApiModelProperty(value = "")
  public String getBotId() {
    return botId;
  }

  public void setBotId(String botId) {
    this.botId = botId;
  }

  public TestCase botVersion(Integer botVersion) {
    this.botVersion = botVersion;
    return this;
  }

   /**
   * Get botVersion
   * @return botVersion
  **/
  @ApiModelProperty(value = "")
  public Integer getBotVersion() {
    return botVersion;
  }

  public void setBotVersion(Integer botVersion) {
    this.botVersion = botVersion;
  }

  public TestCase testCaseState(TestCaseStateEnum testCaseState) {
    this.testCaseState = testCaseState;
    return this;
  }

   /**
   * Get testCaseState
   * @return testCaseState
  **/
  @ApiModelProperty(value = "")
  public TestCaseStateEnum getTestCaseState() {
    return testCaseState;
  }

  public void setTestCaseState(TestCaseStateEnum testCaseState) {
    this.testCaseState = testCaseState;
  }

  public TestCase lastRun(OffsetDateTime lastRun) {
    this.lastRun = lastRun;
    return this;
  }

   /**
   * Get lastRun
   * @return lastRun
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastRun() {
    return lastRun;
  }

  public void setLastRun(OffsetDateTime lastRun) {
    this.lastRun = lastRun;
  }

  public TestCase expected(ConversationMemorySnapshot expected) {
    this.expected = expected;
    return this;
  }

   /**
   * Get expected
   * @return expected
  **/
  @ApiModelProperty(value = "")
  public ConversationMemorySnapshot getExpected() {
    return expected;
  }

  public void setExpected(ConversationMemorySnapshot expected) {
    this.expected = expected;
  }

  public TestCase actual(ConversationMemorySnapshot actual) {
    this.actual = actual;
    return this;
  }

   /**
   * Get actual
   * @return actual
  **/
  @ApiModelProperty(value = "")
  public ConversationMemorySnapshot getActual() {
    return actual;
  }

  public void setActual(ConversationMemorySnapshot actual) {
    this.actual = actual;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCase testCase = (TestCase) o;
    return Objects.equals(this.botId, testCase.botId) &&
        Objects.equals(this.botVersion, testCase.botVersion) &&
        Objects.equals(this.testCaseState, testCase.testCaseState) &&
        Objects.equals(this.lastRun, testCase.lastRun) &&
        Objects.equals(this.expected, testCase.expected) &&
        Objects.equals(this.actual, testCase.actual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botId, botVersion, testCaseState, lastRun, expected, actual);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCase {\n");
    
    sb.append("    botId: ").append(toIndentedString(botId)).append("\n");
    sb.append("    botVersion: ").append(toIndentedString(botVersion)).append("\n");
    sb.append("    testCaseState: ").append(toIndentedString(testCaseState)).append("\n");
    sb.append("    lastRun: ").append(toIndentedString(lastRun)).append("\n");
    sb.append("    expected: ").append(toIndentedString(expected)).append("\n");
    sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

