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
import java.io.IOException;

/**
 * PhraseConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T23:55:01.697Z")
public class PhraseConfiguration {
  @SerializedName("phrase")
  private String phrase = null;

  @SerializedName("exp")
  private String exp = null;

  public PhraseConfiguration phrase(String phrase) {
    this.phrase = phrase;
    return this;
  }

   /**
   * Get phrase
   * @return phrase
  **/
  @ApiModelProperty(value = "")
  public String getPhrase() {
    return phrase;
  }

  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }

  public PhraseConfiguration exp(String exp) {
    this.exp = exp;
    return this;
  }

   /**
   * Get exp
   * @return exp
  **/
  @ApiModelProperty(value = "")
  public String getExp() {
    return exp;
  }

  public void setExp(String exp) {
    this.exp = exp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhraseConfiguration phraseConfiguration = (PhraseConfiguration) o;
    return Objects.equals(this.phrase, phraseConfiguration.phrase) &&
        Objects.equals(this.exp, phraseConfiguration.exp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phrase, exp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhraseConfiguration {\n");
    
    sb.append("    phrase: ").append(toIndentedString(phrase)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
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

