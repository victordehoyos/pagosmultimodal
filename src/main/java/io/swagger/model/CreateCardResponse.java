package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Card;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CreateCardResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T04:38:26.623Z")

public class CreateCardResponse   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("card")
  private Card card = null;

  public CreateCardResponse code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")


  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public CreateCardResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CreateCardResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CreateCardResponse card(Card card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCardResponse createCardResponse = (CreateCardResponse) o;
    return Objects.equals(this.code, createCardResponse.code) &&
        Objects.equals(this.type, createCardResponse.type) &&
        Objects.equals(this.message, createCardResponse.message) &&
        Objects.equals(this.card, createCardResponse.card);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, type, message, card);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCardResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
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

