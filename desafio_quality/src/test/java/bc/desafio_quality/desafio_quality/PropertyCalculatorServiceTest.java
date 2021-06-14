package bc.desafio_quality.desafio_quality;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import bc.desafio_quality.desafio_quality.utils.MocksDTO;
import bc.desafio_quality.dto.DistrictDTO;
import bc.desafio_quality.dto.PropertyBiggestRoomRequestDTO;
import bc.desafio_quality.dto.PropertyBiggestRoomResponseDTO;
import bc.desafio_quality.dto.PropertyGetAreaRoomsRequestDTO;
import bc.desafio_quality.dto.PropertyGetAreaRoomsResponseDTO;
import bc.desafio_quality.dto.PropertyPriceRequestDTO;
import bc.desafio_quality.dto.PropertyPriceResponseDTO;
import bc.desafio_quality.dto.PropertyTotalAreaRequestDTO;
import bc.desafio_quality.dto.PropertyTotalAreaResponseDTO;
import bc.desafio_quality.model.DistrictRepository;
import bc.desafio_quality.service.PropertyCalculatorServiceImpl;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class PropertyCalculatorServiceTest {
    @Mock
    static DistrictRepository districtRepository;

    @InjectMocks
    private PropertyCalculatorServiceImpl service;

    static PropertyTotalAreaRequestDTO mockedTotalAreaRequest = MocksDTO.getPropertyTotalAreaRequest();
    static PropertyTotalAreaResponseDTO mockedTotalAreaResponse = MocksDTO.getPropertyTotalAreaResponse();
    static PropertyPriceRequestDTO mockedPriceRequest = MocksDTO.getPropertyPriceRequest();
    static PropertyPriceResponseDTO mockedPriceResponse = MocksDTO.getPropertyPriceResponseDTO();
    static PropertyBiggestRoomResponseDTO mockedRoomResponse = MocksDTO.getPropertyBiggestRoomResponse();
    static PropertyBiggestRoomRequestDTO mockedRoomResquest = MocksDTO.getPropertyBiggestRoomRequestDTO();
    static DistrictDTO mockedDistrictDTO = MocksDTO.getDistrict();
    static PropertyGetAreaRoomsRequestDTO mockedRoomsAreaRequest = MocksDTO.getPropertyRoomsAreaRequest();
    static PropertyGetAreaRoomsResponseDTO mockedRoomsAreaResponse = MocksDTO.getPropertyRoomsAreaResponse();
    
    @Test
    public void testGetTotalArea(){
        PropertyTotalAreaResponseDTO response = service.totalArea(mockedTotalAreaRequest);
        assertEquals(mockedTotalAreaResponse.getTotal(), response.getTotal());
    }
        
    @Test
    public void testGetTotalPrice(){
        PropertyPriceResponseDTO response = service.totalPrice(mockedPriceRequest);
        assertEquals(mockedPriceResponse.getPrice(), response.getPrice());
    }

    @Test
    public void testGetBiggestRoom(){
        PropertyBiggestRoomResponseDTO response = service.biggestRoom(mockedRoomResquest);
        assertEquals(mockedRoomResponse.getBiggestRoom().getRoom_name(), response.getBiggestRoom().getRoom_name());
    }

    @Test
    public void testGetAreaOfRooms(){
        PropertyGetAreaRoomsResponseDTO response = service.areaPerRoom(mockedRoomsAreaRequest);
        assertEquals(mockedRoomsAreaResponse.getRooms().get("cozinha"), response.getRooms().get("cozinha"));
    }
}
