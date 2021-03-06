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
import io.swagger.client.model.OutputConfiguration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OutputConfigurationSet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T23:55:01.697Z")
public class OutputConfigurationSet {
  @SerializedName("outputSet")
  private List<OutputConfiguration> outputSet = null;

  public OutputConfigurationSet outputSet(List<OutputConfiguration> outputSet) {
    this.outputSet = outputSet;
    return this;
  }

  public OutputConfigurationSet addOutputSetItem(OutputConfiguration outputSetItem) {
    if (this.outputSet == null) {
      this.outputSet = new ArrayList<OutputConfiguration>();
    }
    this.outputSet.add(outputSetItem);
    return this;
  }

   /**
   * Get outputSet
   * @return outputSet
  **/
  @ApiModelProperty(value = "")
  public List<OutputConfiguration> getOutputSet() {
    return outputSet;
  }

  public void setOutputSet(List<OutputConfiguration> outputSet) {
    this.outputSet = outputSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputConfigurationSet outputConfigurationSet = (OutputConfigurationSet) o;
    return Objects.equals(this.outputSet, outputConfigurationSet.outputSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputConfigurationSet {\n");
    
    sb.append("    outputSet: ").append(toIndentedString(outputSet)).append("\n");
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

