package pe.edu.cibertec.evaluacion_daw_2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.iproductservice.CustomersClient;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.model.Customers;
import pe.edu.cibertec.evaluacion_daw_2.client.fakestore.model.Products;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomersService {
    private final CustomersClient customersClient;

    public List<Customers> listAllCustomers(){
        return customersClient.listAll();
    }

}
