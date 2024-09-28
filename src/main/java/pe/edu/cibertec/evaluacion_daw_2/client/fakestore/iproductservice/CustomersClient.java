package pe.edu.cibertec.evaluacion_daw_2.client.fakestore.iproductservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.model.Customers;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.model.Products;

import java.util.List;

@FeignClient(name = "customersClient" ,url = "http://localhost:9090")
public interface CustomersClient {
    @GetMapping("/customers")
    List<Customers> listAll();


}
