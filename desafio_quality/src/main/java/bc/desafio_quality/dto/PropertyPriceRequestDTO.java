package bc.desafio_quality.dto;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@Validated
@Getter @Setter
public class PropertyPriceRequestDTO extends PropertyDTO {
    public PropertyPriceRequestDTO(String name, String district, List<RoomDTO> rooms){
        super(name, district , rooms);
    }
}
