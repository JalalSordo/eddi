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
import io.swagger.client.model.PackageExtension;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PackageConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-13T23:55:01.697Z")
public class PackageConfiguration {
  @SerializedName("packageExtensions")
  private List<PackageExtension> packageExtensions = null;

  public PackageConfiguration packageExtensions(List<PackageExtension> packageExtensions) {
    this.packageExtensions = packageExtensions;
    return this;
  }

  public PackageConfiguration addPackageExtensionsItem(PackageExtension packageExtensionsItem) {
    if (this.packageExtensions == null) {
      this.packageExtensions = new ArrayList<PackageExtension>();
    }
    this.packageExtensions.add(packageExtensionsItem);
    return this;
  }

   /**
   * Get packageExtensions
   * @return packageExtensions
  **/
  @ApiModelProperty(value = "")
  public List<PackageExtension> getPackageExtensions() {
    return packageExtensions;
  }

  public void setPackageExtensions(List<PackageExtension> packageExtensions) {
    this.packageExtensions = packageExtensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageConfiguration packageConfiguration = (PackageConfiguration) o;
    return Objects.equals(this.packageExtensions, packageConfiguration.packageExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageExtensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageConfiguration {\n");
    
    sb.append("    packageExtensions: ").append(toIndentedString(packageExtensions)).append("\n");
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

