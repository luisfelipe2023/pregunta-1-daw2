package pe.edu.cibertec.evaluacion_daw_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EvaluacionDaw2Application {

	public static void main(String[] args) {
		SpringApplication.run(EvaluacionDaw2Application.class, args);
	}

}
