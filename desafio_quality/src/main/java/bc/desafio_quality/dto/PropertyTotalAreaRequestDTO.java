package bc.desafio_quality.dto;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@Validated
@Getter @Setter
public class PropertyTotalAreaRequestDTO extends PropertyDTO {
    public PropertyTotalAreaRequestDTO(String propMame, String propDistrict, List<RoomDTO>rooms){
        super(propMame, propDistrict, rooms);
    }
}
