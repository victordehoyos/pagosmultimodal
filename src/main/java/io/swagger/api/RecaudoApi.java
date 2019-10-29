/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.9).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Card;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-27T15:51:48.963Z")

@Api(value = "recaudo", description = "the recaudo API")
public interface RecaudoApi {

    @ApiOperation(value = "Create Card", nickname = "createCard", notes = "Create Card", response = ModelApiResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "recaudo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = ModelApiResponse.class),
        @ApiResponse(code = 400, message = "Invalid Request"),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid") })
    @RequestMapping(value = "/recaudo/createCard",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> createCard(@ApiParam(value = "Created Card Object" ,required=true )  @Valid @RequestBody Card body);


    @ApiOperation(value = "Customize Card", nickname = "customizeCard", notes = "Customize Card", response = ModelApiResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "recaudo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = ModelApiResponse.class),
        @ApiResponse(code = 400, message = "Invalid Request"),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid") })
    @RequestMapping(value = "/recaudo/{cardNumber}/customizeCard",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<ModelApiResponse> customizeCard(@ApiParam(value = "Card Number",required=true) @PathVariable("cardNumber") String cardNumber,@ApiParam(value = "Customize Card Object" ,required=true )  @Valid @RequestBody User body);


    @ApiOperation(value = "Get Card Information", nickname = "getCardInformation", notes = "Get Card Information", response = Card.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "recaudo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = Card.class),
        @ApiResponse(code = 400, message = "Invalid Request"),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid"),
        @ApiResponse(code = 404, message = "The server could not find the requested card") })
    @RequestMapping(value = "/recaudo/card/{cardNumber}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Card> getCardInformation(@ApiParam(value = "Get Card Info by Card Number",required=true) @PathVariable("cardNumber") String cardNumber);


    @ApiOperation(value = "Lock Card", nickname = "lockCard", notes = "Lock Card", response = ModelApiResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "recaudo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = ModelApiResponse.class),
        @ApiResponse(code = 400, message = "Invalid Request"),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid"),
        @ApiResponse(code = 404, message = "The server could not find the requested card") })
    @RequestMapping(value = "/recaudo/card/{cardNumber}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<ModelApiResponse> lockCard(@ApiParam(value = "Card Number",required=true) @PathVariable("cardNumber") String cardNumber);


    @ApiOperation(value = "Login App", nickname = "loginApp", notes = "Login App", response = Card.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "recaudo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = Card.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid Request"),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid"),
        @ApiResponse(code = 404, message = "The server could not find the requested card") })
    @RequestMapping(value = "/recaudo/user/login",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Card>> loginApp(@NotNull @ApiParam(value = "user email", required = true) @Valid @RequestParam(value = "email", required = true) String email,@NotNull @ApiParam(value = "user password", required = true) @Valid @RequestParam(value = "password", required = true) String password);


    @ApiOperation(value = "Recharge Balance", nickname = "rechargeBalance", notes = "Recharge Balance", response = ModelApiResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "recaudo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = ModelApiResponse.class),
        @ApiResponse(code = 400, message = "Invalid Request"),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid"),
        @ApiResponse(code = 404, message = "The server could not find the requested card") })
    @RequestMapping(value = "/recaudo/card/{cardNumber}/{amount}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<ModelApiResponse> rechargeBalance(@ApiParam(value = "Card Number",required=true) @PathVariable("cardNumber") String cardNumber,@ApiParam(value = "",required=true) @PathVariable("amount") BigDecimal amount);


    @ApiOperation(value = "Reduce Balance", nickname = "reduceBalance", notes = "Reduce Balance", response = ModelApiResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "recaudo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Operation", response = ModelApiResponse.class),
        @ApiResponse(code = 400, message = "Invalid Request"),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid"),
        @ApiResponse(code = 404, message = "The server could not find the requested card") })
    @RequestMapping(value = "/recaudo/card/{cardNumber}/{amount}",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> reduceBalance(@ApiParam(value = "Card Number",required=true) @PathVariable("cardNumber") String cardNumber,@ApiParam(value = "",required=true) @PathVariable("amount") BigDecimal amount);

}
