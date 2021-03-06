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
import io.swagger.client.model.BehaviorRuleConfiguration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BehaviorGroupConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T23:55:01.697Z")
public class BehaviorGroupConfiguration {
  @SerializedName("name")
  private String name = null;

  @SerializedName("behaviorRules")
  private List<BehaviorRuleConfiguration> behaviorRules = null;

  public BehaviorGroupConfiguration name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BehaviorGroupConfiguration behaviorRules(List<BehaviorRuleConfiguration> behaviorRules) {
    this.behaviorRules = behaviorRules;
    return this;
  }

  public BehaviorGroupConfiguration addBehaviorRulesItem(BehaviorRuleConfiguration behaviorRulesItem) {
    if (this.behaviorRules == null) {
      this.behaviorRules = new ArrayList<BehaviorRuleConfiguration>();
    }
    this.behaviorRules.add(behaviorRulesItem);
    return this;
  }

   /**
   * Get behaviorRules
   * @return behaviorRules
  **/
  @ApiModelProperty(value = "")
  public List<BehaviorRuleConfiguration> getBehaviorRules() {
    return behaviorRules;
  }

  public void setBehaviorRules(List<BehaviorRuleConfiguration> behaviorRules) {
    this.behaviorRules = behaviorRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BehaviorGroupConfiguration behaviorGroupConfiguration = (BehaviorGroupConfiguration) o;
    return Objects.equals(this.name, behaviorGroupConfiguration.name) &&
        Objects.equals(this.behaviorRules, behaviorGroupConfiguration.behaviorRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, behaviorRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BehaviorGroupConfiguration {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    behaviorRules: ").append(toIndentedString(behaviorRules)).append("\n");
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

