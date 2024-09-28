package pe.edu.cibertec.evaluacion_daw_2.client.fakestore.model;

import lombok.Data;

@Data

public class Products {
    private Long id;
    private String title;
    private double price;
    private String description;

    private String image;

}
