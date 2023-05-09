package kodlama.io.rentACar.businnes.abstractss;

import kodlama.io.rentACar.businnes.requests.CreateBrandRequest;
import kodlama.io.rentACar.businnes.requests.CreateModelRequest;
import kodlama.io.rentACar.businnes.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {

    List<GetAllModelsResponse> getAll();
    void add(CreateModelRequest createModelRequest);
}
