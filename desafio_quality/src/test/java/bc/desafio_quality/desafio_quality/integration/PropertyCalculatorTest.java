package bc.desafio_quality.desafio_quality.integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class PropertyCalculatorTest {
    @Autowired
    private MockMvc mock;
    
    @Test
    void testGetTotalArea() throws Exception{
        String request = getHouseJson("Ton", "Mooca");
        System.out.println(request);
        this.mock.perform(
            post("/calculate/totalArea")
            .contentType(MediaType.APPLICATION_JSON)
            .content(request))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.total").value(168.2));
    }

    private String getHouseJson(String propName, String propDistric){
        return "{ \"prop_name\": \""+ propName +
               " House\", \"prop_district\": \""+ propDistric +
               "\", \"rooms\": "+
                    "[{ \"room_name\": \"Sala\", \"room_width\": 10, \"room_length\": 12 }," +
                    "{ \"room_name\": \"Cozinha\", \"room_width\": 4.0, \"room_length\": 5.8 }, "+ 
                    "{ \"room_name\": \"Quarto\", \"room_width\": 5.0, \"room_length\": 5.0 }]}";
    }

    @Test
    void testGetTotalPrice() throws Exception{
        String request = getHouseJson("Ton", "Mooca");
        System.out.println(request);
        this.mock.perform(
            post("/calculate/price")
            .contentType(MediaType.APPLICATION_JSON)
            .content(request))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.price").value(1682D));
    }

    @Test
    void testGetBiggestRoom() throws Exception{
        String request = getHouseJson("Ton", "Mooca");
        System.out.println(request);
        this.mock.perform(
            post("/calculate/biggest_room")
            .contentType(MediaType.APPLICATION_JSON)
            .content(request))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.biggest_room_area").value(120D));
    }

    @Test
    void testGetRoomsArea() throws Exception{
        String request = getHouseJson("Ton", "Mooca");
        System.out.println(request);
        this.mock.perform(
            post("/calculate/rooms_area")
            .contentType(MediaType.APPLICATION_JSON)
            .content(request))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.rooms.Cozinha").value(23.2D));
    }

}
