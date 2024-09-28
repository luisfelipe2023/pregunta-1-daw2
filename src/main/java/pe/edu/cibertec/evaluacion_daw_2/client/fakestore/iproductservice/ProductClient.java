package pe.edu.cibertec.evaluacion_daw_2.client.fakestore.iproductservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.model.Products;

import java.util.List;

@FeignClient(name = "productClient" ,url = "https://fakestoreapi.com")
public interface ProductClient {

    @GetMapping("/products")
    List<Products> listAll();
    @GetMapping("/products/{id}")
    Products listProductsByID(@PathVariable ("id")Long id);

}
