package pe.edu.cibertec.evaluacion_daw_2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.iproductservice.ProductClient;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.model.Products;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductClient productClient;
    public Products listProducByID(Long id){
        return productClient.listProductsByID(id);
    }

    public List<Products> listAllProducts(){
        return productClient.listAll();
    }





}
