package bc.desafio_quality.dto;


import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Validated
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class RoomDTO {
    private String room_name;
    private double room_width;
    private double room_lenght;
}
