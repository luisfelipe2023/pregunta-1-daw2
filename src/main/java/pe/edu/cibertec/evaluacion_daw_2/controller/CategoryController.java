package pe.edu.cibertec.evaluacion_daw_2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.model.Category;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.model.Customers;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.model.Products;
import pe.edu.cibertec.evaluacion_daw_2.service.CategoryService;
import pe.edu.cibertec.evaluacion_daw_2.service.CustomersService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("category")
    public List<Category> listAllCategory(){
        return categoryService.listAllCustomers();
    }


}
