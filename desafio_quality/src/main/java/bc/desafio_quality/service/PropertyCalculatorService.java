package bc.desafio_quality.service;

import bc.desafio_quality.dto.PropertyTotalAreaRequestDTO;
import bc.desafio_quality.dto.PropertyTotalAreaResponseDTO;
import bc.desafio_quality.dto.PropertyPriceRequestDTO;
import bc.desafio_quality.dto.PropertyPriceResponseDTO;

public interface PropertyCalculatorService {
    public PropertyTotalAreaResponseDTO totalArea(PropertyTotalAreaRequestDTO property);
    public PropertyPriceResponseDTO totalPrice(PropertyPriceRequestDTO property);
}
