package bc.desafio_quality.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Validated
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class PropertyBiggestRoomResponseDTO {
    @JsonProperty("property_name")
    private String propertyName;

    @JsonProperty("biggest_room")
    private RoomDTO biggestRoom;

    @JsonProperty("biggest_room_area")
    private Double biggestRoomArea = 0D;
}
