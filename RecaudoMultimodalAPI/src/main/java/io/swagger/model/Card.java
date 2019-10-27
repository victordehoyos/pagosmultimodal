package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.User;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Card
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-27T15:51:48.963Z")

public class Card   {
  @JsonProperty("number")
  private String number = null;

  @JsonProperty("balance")
  private BigDecimal balance = null;

  @JsonProperty("owner")
  private User owner = null;

  @JsonProperty("status")
  private Integer status = null;

  public Card number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Nro de la tarjeta
   * @return number
  **/
  @ApiModelProperty(example = "7867564323565", required = true, value = "Nro de la tarjeta")
  @NotNull


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Card balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Saldo de la tarjeta
   * @return balance
  **/
  @ApiModelProperty(example = "20000.0", value = "Saldo de la tarjeta")

  @Valid

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public Card owner(User owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")

  @Valid

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }

  public Card status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Estado actual de la tarjeta
   * @return status
  **/
  @ApiModelProperty(example = "0 = BLOQUEADO", required = true, value = "Estado actual de la tarjeta")
  @NotNull


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.number, card.number) &&
        Objects.equals(this.balance, card.balance) &&
        Objects.equals(this.owner, card.owner) &&
        Objects.equals(this.status, card.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, balance, owner, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

