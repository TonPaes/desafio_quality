package bc.desafio_quality.desafio_quality;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import bc.desafio_quality.controller.PropertyCalculatorController;
import bc.desafio_quality.desafio_quality.utils.MocksDTO;
import bc.desafio_quality.dto.PropertyTotalAreaRequestDTO;
import bc.desafio_quality.dto.PropertyTotalAreaResponseDTO;
import bc.desafio_quality.dto.PropertyPriceRequestDTO;
import bc.desafio_quality.dto.PropertyPriceResponseDTO;
import bc.desafio_quality.service.PropertyCalculatorServiceImpl;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class PropertyCalculatorControllerTest{

	@Mock
	static PropertyCalculatorServiceImpl service;

	@InjectMocks
	private PropertyCalculatorController controller;

	private static PropertyTotalAreaRequestDTO totalAreaRequest = MocksDTO.getPropertyTotalAreaRequest();
	private static PropertyPriceResponseDTO totalPriceResponse = MocksDTO.getPropertyPriceResponseDTO();
	private static PropertyTotalAreaResponseDTO totalAreaResponse = MocksDTO.getPropertyTotalAreaResponse();
	private static PropertyPriceRequestDTO totalPriceRequest = MocksDTO.getPropertyPriceRequest();

	@BeforeEach
	public void init(){
	}

	@Test
	void contextLoads() throws Exception {
	}

	@Test
	public void testGetTotalSquareMeters(){
		when(service.totalArea( totalAreaRequest )).thenReturn(totalAreaResponse);

		ResponseEntity<PropertyTotalAreaResponseDTO> response = controller.totalArea(totalAreaRequest);
		assertEquals(totalAreaResponse, response.getBody());
	}

	@Test
	public void testGetTotalPrice(){
		when(service.totalPrice(totalPriceRequest)).thenReturn(totalPriceResponse);

		ResponseEntity<PropertyPriceResponseDTO> response = controller.totalPrice(totalPriceRequest);
		assertEquals(totalPriceResponse, response.getBody());
	}
}
 