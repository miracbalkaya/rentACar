package kodlama.io.rentACar.businnes.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllModelsResponse {

    private int id;
    private String name;
    private String brandName;
}
