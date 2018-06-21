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
import io.swagger.client.model.SimpleConversationStep;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SimpleConversationMemorySnapshot
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T23:55:01.697Z")
public class SimpleConversationMemorySnapshot {
  @SerializedName("botId")
  private String botId = null;

  @SerializedName("botVersion")
  private Integer botVersion = null;

  /**
   * Gets or Sets environment
   */
  @JsonAdapter(EnvironmentEnum.Adapter.class)
  public enum EnvironmentEnum {
    RESTRICTED("restricted"),
    
    UNRESTRICTED("unrestricted"),
    
    TEST("test");

    private String value;

    EnvironmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnvironmentEnum fromValue(String text) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EnvironmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnvironmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnvironmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EnvironmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("environment")
  private EnvironmentEnum environment = null;

  /**
   * Gets or Sets conversationState
   */
  @JsonAdapter(ConversationStateEnum.Adapter.class)
  public enum ConversationStateEnum {
    READY("READY"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    ENDED("ENDED"),
    
    EXECUTION_INTERRUPTED("EXECUTION_INTERRUPTED"),
    
    ERROR("ERROR");

    private String value;

    ConversationStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConversationStateEnum fromValue(String text) {
      for (ConversationStateEnum b : ConversationStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConversationStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConversationStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConversationStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConversationStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("conversationState")
  private ConversationStateEnum conversationState = null;

  @SerializedName("redoCacheSize")
  private Integer redoCacheSize = null;

  @SerializedName("conversationSteps")
  private List<SimpleConversationStep> conversationSteps = null;

  public SimpleConversationMemorySnapshot botId(String botId) {
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

  public SimpleConversationMemorySnapshot botVersion(Integer botVersion) {
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

  public SimpleConversationMemorySnapshot environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(value = "")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public SimpleConversationMemorySnapshot conversationState(ConversationStateEnum conversationState) {
    this.conversationState = conversationState;
    return this;
  }

   /**
   * Get conversationState
   * @return conversationState
  **/
  @ApiModelProperty(value = "")
  public ConversationStateEnum getConversationState() {
    return conversationState;
  }

  public void setConversationState(ConversationStateEnum conversationState) {
    this.conversationState = conversationState;
  }

  public SimpleConversationMemorySnapshot redoCacheSize(Integer redoCacheSize) {
    this.redoCacheSize = redoCacheSize;
    return this;
  }

   /**
   * Get redoCacheSize
   * @return redoCacheSize
  **/
  @ApiModelProperty(value = "")
  public Integer getRedoCacheSize() {
    return redoCacheSize;
  }

  public void setRedoCacheSize(Integer redoCacheSize) {
    this.redoCacheSize = redoCacheSize;
  }

  public SimpleConversationMemorySnapshot conversationSteps(List<SimpleConversationStep> conversationSteps) {
    this.conversationSteps = conversationSteps;
    return this;
  }

  public SimpleConversationMemorySnapshot addConversationStepsItem(SimpleConversationStep conversationStepsItem) {
    if (this.conversationSteps == null) {
      this.conversationSteps = new ArrayList<SimpleConversationStep>();
    }
    this.conversationSteps.add(conversationStepsItem);
    return this;
  }

   /**
   * Get conversationSteps
   * @return conversationSteps
  **/
  @ApiModelProperty(value = "")
  public List<SimpleConversationStep> getConversationSteps() {
    return conversationSteps;
  }

  public void setConversationSteps(List<SimpleConversationStep> conversationSteps) {
    this.conversationSteps = conversationSteps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleConversationMemorySnapshot simpleConversationMemorySnapshot = (SimpleConversationMemorySnapshot) o;
    return Objects.equals(this.botId, simpleConversationMemorySnapshot.botId) &&
        Objects.equals(this.botVersion, simpleConversationMemorySnapshot.botVersion) &&
        Objects.equals(this.environment, simpleConversationMemorySnapshot.environment) &&
        Objects.equals(this.conversationState, simpleConversationMemorySnapshot.conversationState) &&
        Objects.equals(this.redoCacheSize, simpleConversationMemorySnapshot.redoCacheSize) &&
        Objects.equals(this.conversationSteps, simpleConversationMemorySnapshot.conversationSteps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(botId, botVersion, environment, conversationState, redoCacheSize, conversationSteps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleConversationMemorySnapshot {\n");
    
    sb.append("    botId: ").append(toIndentedString(botId)).append("\n");
    sb.append("    botVersion: ").append(toIndentedString(botVersion)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    conversationState: ").append(toIndentedString(conversationState)).append("\n");
    sb.append("    redoCacheSize: ").append(toIndentedString(redoCacheSize)).append("\n");
    sb.append("    conversationSteps: ").append(toIndentedString(conversationSteps)).append("\n");
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
