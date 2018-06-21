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
import io.swagger.client.model.ConversationStepData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * SimpleConversationStep
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T23:55:01.697Z")
public class SimpleConversationStep {
  @SerializedName("conversationStep")
  private List<ConversationStepData> conversationStep = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  public SimpleConversationStep conversationStep(List<ConversationStepData> conversationStep) {
    this.conversationStep = conversationStep;
    return this;
  }

  public SimpleConversationStep addConversationStepItem(ConversationStepData conversationStepItem) {
    if (this.conversationStep == null) {
      this.conversationStep = new ArrayList<ConversationStepData>();
    }
    this.conversationStep.add(conversationStepItem);
    return this;
  }

   /**
   * Get conversationStep
   * @return conversationStep
  **/
  @ApiModelProperty(value = "")
  public List<ConversationStepData> getConversationStep() {
    return conversationStep;
  }

  public void setConversationStep(List<ConversationStepData> conversationStep) {
    this.conversationStep = conversationStep;
  }

  public SimpleConversationStep timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleConversationStep simpleConversationStep = (SimpleConversationStep) o;
    return Objects.equals(this.conversationStep, simpleConversationStep.conversationStep) &&
        Objects.equals(this.timestamp, simpleConversationStep.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationStep, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleConversationStep {\n");
    
    sb.append("    conversationStep: ").append(toIndentedString(conversationStep)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
