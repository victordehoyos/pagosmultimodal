package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Card;
import io.swagger.model.CreateCardResponse;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.business.facade.IRecaudoFacade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T04:38:26.623Z")

@Controller
public class RecaudoApiController implements RecaudoApi {

    private static final Logger log = LoggerFactory.getLogger(RecaudoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    private IRecaudoFacade rFacade;

    @org.springframework.beans.factory.annotation.Autowired
    public RecaudoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CreateCardResponse> createCard() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	CreateCardResponse response = new CreateCardResponse();
            	response.setCode(0);
            	response.setMessage("Servicio Ejecutado Correctamente");
            	response.setType("Confirmación");
            	Card card = rFacade.createCard();
            	response.setCard(card);
            	
                return new ResponseEntity<CreateCardResponse>(response, HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CreateCardResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CreateCardResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ModelApiResponse> customizeCard(@ApiParam(value = "Card Number",required=true) @PathVariable("cardNumber") String cardNumber,@ApiParam(value = "Customize Card Object" ,required=true )  @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	Card card = rFacade.getCardInfo(cardNumber);
            	
            	if (card != null) {
            		card.setOwner(body);
                	
                	card = rFacade.updateCard(card);
                	ModelApiResponse response = new ModelApiResponse();
                	
                	if (card != null) {
                    	response.setCode(0);
                    	response.setMessage("Tarjeta personalizada correctamente");
                    	response.setType("Confirmación");
                    	
                    	return new ResponseEntity<ModelApiResponse>(response, HttpStatus.OK);
                	} else {
                		response.setCode(-1);
                		response.setMessage("Error al personalizar la tarjeta");
                		response.setType("ERROR");
                		
                		return new ResponseEntity<ModelApiResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
                	}
            	}
            	
                return new ResponseEntity<ModelApiResponse>(objectMapper.readValue("{  \"code\" : 0,  \"type\" : \"type\",  \"message\" : \"message\"}", ModelApiResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    @CrossOrigin
    public ResponseEntity<Card> getCardInformation(@ApiParam(value = "Get Card Info by Card Number",required=true) @PathVariable("cardNumber") String cardNumber) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	Card card = rFacade.getCardInfo(cardNumber);
            		
                return new ResponseEntity<Card>(card, HttpStatus.OK);
            } catch (Exception e) {
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
            	Card card = rFacade.getCardInfo(cardNumber);
            	
            	if (card != null) {
            		card.setNumber(cardNumber);
                	card.setStatus(card.getStatus() == 0 ? 1 : 0);
                	
                	card = rFacade.updateCard(card);
                	ModelApiResponse response = new ModelApiResponse();
                	
                	if (card != null) {
                    	response.setCode(0);
                    	response.setMessage(card.getStatus() == 0 ? "Tarjeta bloqueada correctamente" : "Tarjeta desbloqueada correctamente");
                    	response.setType("Confirmación");
                    	
                    	return new ResponseEntity<ModelApiResponse>(response, HttpStatus.OK);
                	} else {
                		response.setCode(-1);
                		response.setMessage("Error al bloquear la tarjeta");
                		response.setType("ERROR");
                		
                		return new ResponseEntity<ModelApiResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
                	}
            	}
            	
            } catch (Exception e) {
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
                return new ResponseEntity<List<Card>>(objectMapper.readValue("[ {  \"owner\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"password\" : \"password\",    \"userStatus\" : 6,    \"phone\" : \"phone\",    \"email\" : \"email\"  },  \"number\" : \"7867564323565\",  \"balance\" : 20000.0,  \"status\" : \"0 = BLOQUEADO\"}, {  \"owner\" : {    \"firstName\" : \"firstName\",    \"lastName\" : \"lastName\",    \"password\" : \"password\",    \"userStatus\" : 6,    \"phone\" : \"phone\",    \"email\" : \"email\"  },  \"number\" : \"7867564323565\",  \"balance\" : 20000.0,  \"status\" : \"0 = BLOQUEADO\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
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
            	
            	Card card = rFacade.getCardInfo(cardNumber);
            	ModelApiResponse response = new ModelApiResponse();
            	
            	if (card != null) {
            		if (card.getStatus() == 0) {
            			response.setCode(-1);
            			response.setMessage("La tarjeta se encuentra bloqueada, no se puede recargar");
            			response.setType("Tarjeta Bloqueada");
            			return new ResponseEntity<ModelApiResponse>(response, HttpStatus.LOCKED);
            		} else {
            			card.setBalance((card.getBalance().add(amount)));
            			card = rFacade.updateCard(card);
            			
            			response.setCode(0);
            			response.setMessage("Saldo actualizado correctamente");
            			response.setType("Confirmación");
            			
            			return new ResponseEntity<ModelApiResponse>(response, HttpStatus.OK);
            		}
            	}
            	
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } catch (Exception e) {
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
            	Card card = rFacade.getCardInfo(cardNumber);
            	ModelApiResponse response = new ModelApiResponse();
            	
            	if (card != null) {
            		if (card.getStatus() == 0) {
            			response.setCode(-1);
            			response.setMessage("La tarjeta se encuentra bloqueada, no se puede realizar cobro");
            			response.setType("Tarjeta Bloqueada");
            			return new ResponseEntity<ModelApiResponse>(response, HttpStatus.LOCKED);
            		} else {
            			card.setBalance((card.getBalance().subtract(amount)));
            			card = rFacade.updateCard(card);
            			
            			response.setCode(0);
            			response.setMessage("Saldo actualizado correctamente");
            			response.setType("Confirmación");
            			
            			return new ResponseEntity<ModelApiResponse>(response, HttpStatus.OK);
            		}
            	}
            	
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ModelApiResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ModelApiResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
