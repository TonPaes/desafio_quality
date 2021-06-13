package bc.desafio_quality.service;

import bc.desafio_quality.dto.PropertyTotalAreaRequestDTO;
import bc.desafio_quality.dto.PropertyTotalAreaResponseDTO;
import bc.desafio_quality.exception.DistrictDoestNotExistsException;
import bc.desafio_quality.dto.PropertyBiggestRoomRequestDTO;
import bc.desafio_quality.dto.PropertyBiggestRoomResponseDTO;
import bc.desafio_quality.dto.PropertyGetAreaRoomsRequestDTO;
import bc.desafio_quality.dto.PropertyGetAreaRoomsResponseDTO;
import bc.desafio_quality.dto.PropertyPriceRequestDTO;
import bc.desafio_quality.dto.PropertyPriceResponseDTO;

public interface PropertyCalculatorService {
    public PropertyTotalAreaResponseDTO totalArea(PropertyTotalAreaRequestDTO property);
    public PropertyPriceResponseDTO totalPrice(PropertyPriceRequestDTO property) throws DistrictDoestNotExistsException;
    public PropertyBiggestRoomResponseDTO biggestRoom(PropertyBiggestRoomRequestDTO property);
    public PropertyGetAreaRoomsResponseDTO areaPerRoom(PropertyGetAreaRoomsRequestDTO property);
}
