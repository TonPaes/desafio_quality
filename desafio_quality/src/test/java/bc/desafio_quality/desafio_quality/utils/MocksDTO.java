package bc.desafio_quality.desafio_quality.utils;

import java.util.ArrayList;
import java.util.List;

import bc.desafio_quality.dto.PropertyTotalAreaRequestDTO;
import bc.desafio_quality.dto.PropertyTotalAreaResponseDTO;
import bc.desafio_quality.dto.PropertyPriceResponseDTO;
import bc.desafio_quality.dto.PropertyPriceRequestDTO;
import bc.desafio_quality.dto.RoomDTO;

public class MocksDTO {
    static public RoomDTO getMockRoomDTO(){
        return new RoomDTO("sala",
                           10,
                           12
                        );
    }

    static public List<RoomDTO> getMockRoomListDTO(){
        List<RoomDTO> list = new ArrayList<RoomDTO>();
        
        list.add(new RoomDTO(
                "quarto",
                5.0,
                5.0 ));
        list.add(new RoomDTO(
            "cozinha",
            4.0,
            5.8 ));
        list.add(new RoomDTO(
            "sala",
            10,
            12
        ));

        return list;
        
    }

    static public PropertyTotalAreaRequestDTO  getPropertyTotalAreaRequest(){
        return new PropertyTotalAreaRequestDTO(
                "propety_name",
                "property_district",
                getMockRoomListDTO()
        );

    }

    static public PropertyTotalAreaResponseDTO getPropertyTotalAreaResponse(){
        return new PropertyTotalAreaResponseDTO(
                150.0,
                "propety_name"
        );
    }

    static public PropertyPriceRequestDTO getPropertyPriceRequest(){
        return new PropertyPriceRequestDTO(
            "property_name",
            "property_distric",
            getMockRoomListDTO()
        );
    }

    static public PropertyPriceResponseDTO getPropertyPriceResponseDTO(){
        return new PropertyPriceResponseDTO(150.00, "casa_do_ton", "bairro_do_ton");
    }
}
