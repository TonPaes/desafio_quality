package bc.desafio_quality.service;

import bc.desafio_quality.dto.PropertyTotalAreaRequestDTO;
import bc.desafio_quality.dto.PropertyTotalAreaResponseDTO;
import bc.desafio_quality.dto.RoomDTO;
import bc.desafio_quality.dto.PropertyBiggestRoomRequestDTO;
import bc.desafio_quality.dto.PropertyBiggestRoomResponseDTO;
import bc.desafio_quality.dto.PropertyGetAreaRoomsRequestDTO;
import bc.desafio_quality.dto.PropertyGetAreaRoomsResponseDTO;
import bc.desafio_quality.dto.PropertyPriceRequestDTO;
import bc.desafio_quality.dto.PropertyPriceResponseDTO;

public class PropertyCalculatorServiceImpl  implements PropertyCalculatorService{

    @Override
    public PropertyTotalAreaResponseDTO totalArea(PropertyTotalAreaRequestDTO property) {
        PropertyTotalAreaResponseDTO response =  new PropertyTotalAreaResponseDTO();
        for (RoomDTO room : property.getRooms()) {
            response.setTotal( response.getTotal() + (room.getRoom_lenght()*room.getRoom_width()));
        }
        
        response.setHouseName(property.getPropMame());
        
        return response;
    }

    @Override
    public PropertyPriceResponseDTO totalPrice(PropertyPriceRequestDTO property) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public PropertyBiggestRoomResponseDTO biggestRoom(PropertyBiggestRoomRequestDTO property){
        return null;
    }

    @Override
    public PropertyGetAreaRoomsResponseDTO areaPerRoom(PropertyGetAreaRoomsRequestDTO property){
        return null;
    }
}
