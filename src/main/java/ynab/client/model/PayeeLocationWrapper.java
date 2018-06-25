/*
 * YNAB API Endpoints
 * Our API uses a REST based design, leverages the JSON data format, and relies upon HTTPS for transport. We respond with meaningful HTTP response codes and if an error occurs, we include error details in the response body.  API Documentation is at https://api.youneedabudget.com
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ynab.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import ynab.client.model.PayeeLocation;

/**
 * PayeeLocationWrapper
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-25T01:42:20.552-05:00")
public class PayeeLocationWrapper {
  @SerializedName("payee_location")
  private PayeeLocation payeeLocation = null;

  public PayeeLocationWrapper payeeLocation(PayeeLocation payeeLocation) {
    this.payeeLocation = payeeLocation;
    return this;
  }

   /**
   * Get payeeLocation
   * @return payeeLocation
  **/
  @ApiModelProperty(required = true, value = "")
  public PayeeLocation getPayeeLocation() {
    return payeeLocation;
  }

  public void setPayeeLocation(PayeeLocation payeeLocation) {
    this.payeeLocation = payeeLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayeeLocationWrapper payeeLocationWrapper = (PayeeLocationWrapper) o;
    return Objects.equals(this.payeeLocation, payeeLocationWrapper.payeeLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payeeLocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayeeLocationWrapper {\n");
    
    sb.append("    payeeLocation: ").append(toIndentedString(payeeLocation)).append("\n");
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
