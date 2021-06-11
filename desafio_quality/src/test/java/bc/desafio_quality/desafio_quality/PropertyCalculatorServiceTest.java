package bc.desafio_quality.desafio_quality;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import bc.desafio_quality.desafio_quality.utils.MocksDTO;
import bc.desafio_quality.dto.PropertyPriceRequestDTO;
import bc.desafio_quality.dto.PropertyPriceResponseDTO;
import bc.desafio_quality.dto.PropertyTotalAreaRequestDTO;
import bc.desafio_quality.dto.PropertyTotalAreaResponseDTO;
import bc.desafio_quality.service.PropertyCalculatorService;
import bc.desafio_quality.service.PropertyCalculatorServiceImpl;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class PropertyCalculatorServiceTest {
    private PropertyCalculatorService service = new PropertyCalculatorServiceImpl(); 


    static PropertyTotalAreaRequestDTO mockTotalAreaRequest = MocksDTO.getPropertyTotalAreaRequest();
    static PropertyTotalAreaResponseDTO mockTotalAreaResponse = MocksDTO.getPropertyTotalAreaResponse();
    static PropertyPriceRequestDTO mockPriceRequest = MocksDTO.getPropertyPriceRequest();

    @Test
    public void testGetTotalArea(){
        PropertyTotalAreaResponseDTO response = service.totalArea(mockTotalAreaRequest);
        //TODO: total area from house
    }

    public void testGetTotalPrice(){
        PropertyPriceResponseDTO response = service.totalPrice(mockPriceRequest);
        //TODO: total price from property
    }

    public void testGetBiggestRoom(){
        //TODO: biggestRoom of the property
    }
    public void testGetAreaOfRooms(){
        //TODO:
    }
}
