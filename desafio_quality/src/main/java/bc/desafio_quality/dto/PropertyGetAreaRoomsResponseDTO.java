package bc.desafio_quality.dto;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class PropertyGetAreaRoomsResponseDTO {
    private String propName; 
    private Map<String, Double> rooms;
}
