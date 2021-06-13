package bc.desafio_quality.dto;

import java.util.List;

public class PropertyGetAreaRoomsRequestDTO extends PropertyDTO{
    public PropertyGetAreaRoomsRequestDTO(String propName, String propDistrict, List<RoomDTO> rooms){
        super(propName, propDistrict, rooms);
    }
}
