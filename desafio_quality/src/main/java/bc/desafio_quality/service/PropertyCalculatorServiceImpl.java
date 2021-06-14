package bc.desafio_quality.service;

import bc.desafio_quality.dto.PropertyTotalAreaRequestDTO;
import bc.desafio_quality.dto.PropertyTotalAreaResponseDTO;
import bc.desafio_quality.dto.RoomDTO;
import bc.desafio_quality.model.DistrictRepositoryImpl;

import java.util.HashMap;
import java.util.Map;

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
            response.setTotal( 
                response.getTotal() + (room.getRoom_lenght()*room.getRoom_width())
            );
        }
        response.setHouseName(property.getPropMame());
        
        return response;
    }

    @Override
    public PropertyPriceResponseDTO totalPrice(PropertyPriceRequestDTO property) {
        
        Double totalArea = 0D;
        for (RoomDTO room : property.getRooms()) {
            totalArea += room.getRoom_lenght()* room.getRoom_width();
        }
    
        Double totalPrice = totalArea * DistrictRepositoryImpl
                                            .getByName(property.getPropDistrict())
                                            .getSquareFootPrice();

                
        return new PropertyPriceResponseDTO(
                totalPrice, 
                property.getPropMame(), 
                property.getPropDistrict());
    }
    
    @Override
    public PropertyBiggestRoomResponseDTO biggestRoom(PropertyBiggestRoomRequestDTO property){
        PropertyBiggestRoomResponseDTO response = new PropertyBiggestRoomResponseDTO();
        response.setPropertyName(property.getPropMame());
        for (RoomDTO room : property.getRooms()) {
            Double roomArea = room.getRoom_lenght() * room.getRoom_width();
            if (response.getBiggestRoomArea() <= roomArea ){
                response.setBiggestRoom(room);
                response.setBiggestRoomArea(roomArea);
            }
        }
        return response;
    }

    @Override
    public PropertyGetAreaRoomsResponseDTO areaPerRoom(PropertyGetAreaRoomsRequestDTO property){
        Map<String, Double> areasList = new HashMap<>();
        for (RoomDTO room : property.getRooms()) {
            areasList.put(room.getRoom_name(), room.getRoom_lenght()*room.getRoom_width());
        }

        return new PropertyGetAreaRoomsResponseDTO(property.getPropMame(), areasList); 
    }
}
