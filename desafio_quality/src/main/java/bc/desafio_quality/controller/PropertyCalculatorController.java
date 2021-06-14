package bc.desafio_quality.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bc.desafio_quality.dto.PropertyTotalAreaRequestDTO;
import bc.desafio_quality.dto.PropertyTotalAreaResponseDTO;
import bc.desafio_quality.dto.PropertyBiggestRoomRequestDTO;
import bc.desafio_quality.dto.PropertyBiggestRoomResponseDTO;
import bc.desafio_quality.dto.PropertyGetAreaRoomsRequestDTO;
import bc.desafio_quality.dto.PropertyGetAreaRoomsResponseDTO;
import bc.desafio_quality.dto.PropertyPriceRequestDTO;
import bc.desafio_quality.dto.PropertyPriceResponseDTO;
import bc.desafio_quality.service.PropertyCalculatorService;
import bc.desafio_quality.service.PropertyCalculatorServiceImpl;

@RestController
@RequestMapping("/calculate")
public class PropertyCalculatorController {
    private  PropertyCalculatorService propertyCalculatorservice = new PropertyCalculatorServiceImpl();

    @PostMapping("/totalArea")
    public ResponseEntity<PropertyTotalAreaResponseDTO> totalArea(
            @Valid 
            @RequestBody 
            PropertyTotalAreaRequestDTO request){
       
        return ResponseEntity.status(HttpStatus.OK).body(propertyCalculatorservice.totalArea(request));
    }
    @PostMapping("/price")
    public ResponseEntity<PropertyPriceResponseDTO> totalPrice(
            @Valid 
            @RequestBody 
            PropertyPriceRequestDTO property){
        
        return ResponseEntity.status(HttpStatus.OK)
                             .body(propertyCalculatorservice.totalPrice(property));
    }
    @PostMapping("/biggest_room")
    public ResponseEntity<PropertyBiggestRoomResponseDTO> biggestRoom(
            @Valid 
            @RequestBody 
            PropertyBiggestRoomRequestDTO property){

        return ResponseEntity.status(HttpStatus.OK).body(propertyCalculatorservice.biggestRoom(property));
    }
    @PostMapping("/rooms_area")
    public ResponseEntity<PropertyGetAreaRoomsResponseDTO> areaPerRoom(
            @Valid 
            @RequestBody 
            PropertyGetAreaRoomsRequestDTO property){
        
        return ResponseEntity.status(HttpStatus.OK).body(propertyCalculatorservice.areaPerRoom(property));
    }
}