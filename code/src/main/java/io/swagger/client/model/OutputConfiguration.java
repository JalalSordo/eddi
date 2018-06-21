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
import io.swagger.client.model.OutputType;
import io.swagger.client.model.QuickReply;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OutputConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T23:55:01.697Z")
public class OutputConfiguration {
  @SerializedName("action")
  private String action = null;

  @SerializedName("timesOccurred")
  private Integer timesOccurred = null;

  @SerializedName("outputs")
  private List<OutputType> outputs = null;

  @SerializedName("quickReplies")
  private List<QuickReply> quickReplies = null;

  public OutputConfiguration action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public OutputConfiguration timesOccurred(Integer timesOccurred) {
    this.timesOccurred = timesOccurred;
    return this;
  }

   /**
   * Get timesOccurred
   * @return timesOccurred
  **/
  @ApiModelProperty(value = "")
  public Integer getTimesOccurred() {
    return timesOccurred;
  }

  public void setTimesOccurred(Integer timesOccurred) {
    this.timesOccurred = timesOccurred;
  }

  public OutputConfiguration outputs(List<OutputType> outputs) {
    this.outputs = outputs;
    return this;
  }

  public OutputConfiguration addOutputsItem(OutputType outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<OutputType>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * Get outputs
   * @return outputs
  **/
  @ApiModelProperty(value = "")
  public List<OutputType> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<OutputType> outputs) {
    this.outputs = outputs;
  }

  public OutputConfiguration quickReplies(List<QuickReply> quickReplies) {
    this.quickReplies = quickReplies;
    return this;
  }

  public OutputConfiguration addQuickRepliesItem(QuickReply quickRepliesItem) {
    if (this.quickReplies == null) {
      this.quickReplies = new ArrayList<QuickReply>();
    }
    this.quickReplies.add(quickRepliesItem);
    return this;
  }

   /**
   * Get quickReplies
   * @return quickReplies
  **/
  @ApiModelProperty(value = "")
  public List<QuickReply> getQuickReplies() {
    return quickReplies;
  }

  public void setQuickReplies(List<QuickReply> quickReplies) {
    this.quickReplies = quickReplies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputConfiguration outputConfiguration = (OutputConfiguration) o;
    return Objects.equals(this.action, outputConfiguration.action) &&
        Objects.equals(this.timesOccurred, outputConfiguration.timesOccurred) &&
        Objects.equals(this.outputs, outputConfiguration.outputs) &&
        Objects.equals(this.quickReplies, outputConfiguration.quickReplies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, timesOccurred, outputs, quickReplies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputConfiguration {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    timesOccurred: ").append(toIndentedString(timesOccurred)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    quickReplies: ").append(toIndentedString(quickReplies)).append("\n");
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

