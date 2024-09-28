package pe.edu.cibertec.evaluacion_daw_2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.iproductservice.CategoryClient;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.model.Category;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.model.Customers;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.model.Products;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryClient categoryClient;
    public List<Category> listAllCustomers(){
        return categoryClient.listAllCategory();
    }


}
