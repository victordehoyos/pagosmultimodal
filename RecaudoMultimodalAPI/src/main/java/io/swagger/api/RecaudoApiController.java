package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Card;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-27T15:51:48.963Z")

@Controller
public class RecaudoApiController implements RecaudoApi {

    private static final Logger log = LoggerFactory.getLogger(RecaudoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RecaudoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ModelApiResponse> createCard(@ApiParam(value = "Created Card Object" ,required=true )  @Valid @RequestBody Card body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{  \"code\" : 0,  \"type\" : \"type\",  \"message\" : \"message\"}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> customizeCard(@ApiParam(value = "Card Number",required=true) @PathVariable("cardNumber") String cardNumber,@ApiParam(value = "Customize Card Object" ,required=true )  @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{  \"code\" : 0,  \"type\" : \"type\",  \"message\" : \"message\"}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Card> getCardInformation(@ApiParam(value = "Get Card Info by Card Number",required=true) @PathVariable("cardNumber") String cardNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Card>(objectMapper.readValue("{  \"owner\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"password\" : \"password\",    \"userStatus\" : 0,    \"phone\" : \"phone\",    \"email\" : \"email\"  },  \"number\" : \"7867564323565\",  \"balance\" : 20000.0,  \"status\" : \"0 = BLOQUEADO\"}", Card.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Card>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Card>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> lockCard(@ApiParam(value = "Card Number",required=true) @PathVariable("cardNumber") String cardNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{  \"code\" : 0,  \"type\" : \"type\",  \"message\" : \"message\"}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Card>> loginApp(@NotNull @ApiParam(value = "user email", required = true) @Valid @RequestParam(value = "email", required = true) String email,@NotNull @ApiParam(value = "user password", required = true) @Valid @RequestParam(value = "password", required = true) String password) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Card>>(objectMapper.readValue("[ {  \"owner\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"password\" : \"password\",    \"userStatus\" : 0,    \"phone\" : \"phone\",    \"email\" : \"email\"  },  \"number\" : \"7867564323565\",  \"balance\" : 20000.0,  \"status\" : \"0 = BLOQUEADO\"}, {  \"owner\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"password\" : \"password\",    \"userStatus\" : 0,    \"phone\" : \"phone\",    \"email\" : \"email\"  },  \"number\" : \"7867564323565\",  \"balance\" : 20000.0,  \"status\" : \"0 = BLOQUEADO\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Card>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Card>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> rechargeBalance(@ApiParam(value = "Card Number",required=true) @PathVariable("cardNumber") String cardNumber,@ApiParam(value = "",required=true) @PathVariable("amount") BigDecimal amount) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{  \"code\" : 0,  \"type\" : \"type\",  \"message\" : \"message\"}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> reduceBalance(@ApiParam(value = "Card Number",required=true) @PathVariable("cardNumber") String cardNumber,@ApiParam(value = "",required=true) @PathVariable("amount") BigDecimal amount) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{  \"code\" : 0,  \"type\" : \"type\",  \"message\" : \"message\"}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
