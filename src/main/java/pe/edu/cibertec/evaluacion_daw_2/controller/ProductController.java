package pe.edu.cibertec.evaluacion_daw_2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.model.Products;
import pe.edu.cibertec.evaluacion_daw_2.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("product/{id}")
    public Products listProductByid(@PathVariable("id") Long id){
        return productService.listProducByID(id);
    }

    @GetMapping("product")
    public List<Products> listAllProducts(){
        return productService.listAllProducts();
    }

}
