package bc.desafio_quality.desafio_quality.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import bc.desafio_quality.dto.PropertyTotalAreaRequestDTO;
import bc.desafio_quality.dto.PropertyTotalAreaResponseDTO;
import bc.desafio_quality.dto.PropertyPriceResponseDTO;
import bc.desafio_quality.dto.DistrictDTO;
import bc.desafio_quality.dto.PropertyBiggestRoomRequestDTO;
import bc.desafio_quality.dto.PropertyBiggestRoomResponseDTO;
import bc.desafio_quality.dto.PropertyGetAreaRoomsRequestDTO;
import bc.desafio_quality.dto.PropertyGetAreaRoomsResponseDTO;
import bc.desafio_quality.dto.PropertyPriceRequestDTO;
import bc.desafio_quality.dto.RoomDTO;

public class MocksDTO {
    static public RoomDTO getMockRoomDTO(){
        return new RoomDTO("sala", 10, 12);
    }

    static public List<RoomDTO> getMockRoomListDTO(){
        List<RoomDTO> list = new ArrayList<RoomDTO>();
        
        list.add(new RoomDTO("quarto", 5D, 5D)); //25
        list.add(new RoomDTO("cozinha", 4D, 5.8D )); //23 ,2
        list.add(new RoomDTO("sala", 10D, 12D )); // 120

        return list;
    }

    static public PropertyTotalAreaRequestDTO  getPropertyTotalAreaRequest(){
        return new PropertyTotalAreaRequestDTO( "propety_name", "Mooca", getMockRoomListDTO());
    }

    static public PropertyTotalAreaResponseDTO getPropertyTotalAreaResponse(){
        return new PropertyTotalAreaResponseDTO(168.2, "propety_name");
    }

    static public PropertyPriceRequestDTO getPropertyPriceRequest(){
        return new PropertyPriceRequestDTO("property_name", "Mooca", getMockRoomListDTO());
    }

    static public PropertyPriceResponseDTO getPropertyPriceResponseDTO(){
        return new PropertyPriceResponseDTO(150D, "casa_do_ton", "Mooca");
    }

    static public PropertyBiggestRoomRequestDTO getPropertyBiggestRoomRequestDTO(){
        return new PropertyBiggestRoomRequestDTO("property_name", "Mooca", getMockRoomListDTO());
    }

    static public  PropertyBiggestRoomResponseDTO getPropertyBiggestRoomResponse() {
        return new PropertyBiggestRoomResponseDTO("property_name", new RoomDTO("sala", 10, 12), 120D);
    }
    static public DistrictDTO getDistrict(){
        return new DistrictDTO("Mooca", 10D);
    }

    public static PropertyGetAreaRoomsRequestDTO getPropertyRoomsAreaRequest() {
        return new PropertyGetAreaRoomsRequestDTO("property_name", "Mooca", getMockRoomListDTO());
    }

    public static PropertyGetAreaRoomsResponseDTO getPropertyRoomsAreaResponse() {
        return new PropertyGetAreaRoomsResponseDTO("casa_do_ton", getMapRoomAreas());
    }

    private static Map<String, Double> getMapRoomAreas(){
        Map<String,Double> rooms = Map.of(
                "quarto", 25D,
                "cozinha", 23.2D,
                "sala", 120D        
        );
        return rooms;
    }

}
