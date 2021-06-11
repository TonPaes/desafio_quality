package bc.desafio_quality.dto;

import java.util.List;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Validated
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class PropertyPriceRequestDTO {
    private String prop_name;
    private String prop_distric;
    private List<RoomDTO> rooms;
}
