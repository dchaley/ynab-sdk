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
import java.math.BigDecimal;
import java.util.List;

/**
 * SubTransaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-25T01:42:20.552-05:00")
public class SubTransaction {
  @SerializedName("id")
  private String id = null;

  @SerializedName("transaction_id")
  private String transactionId = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  public SubTransaction id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SubTransaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public SubTransaction amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The subtransaction amount in milliunits format
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The subtransaction amount in milliunits format")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public SubTransaction deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Whether or not the subtransaction has been deleted.  Deleted subtransactions will only be included in delta requests.
   * @return deleted
  **/
  @ApiModelProperty(required = true, value = "Whether or not the subtransaction has been deleted.  Deleted subtransactions will only be included in delta requests.")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubTransaction subTransaction = (SubTransaction) o;
    return Objects.equals(this.id, subTransaction.id) &&
        Objects.equals(this.transactionId, subTransaction.transactionId) &&
        Objects.equals(this.amount, subTransaction.amount) &&
        Objects.equals(this.deleted, subTransaction.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionId, amount, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubTransaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

