package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args); //diz que eu estou trabalhando com o spring boot

		// Calculadora calculadora = new Calculadora();
		// System.out.println("O resultado é " + calculadora.somar(2, 7));
		// dá certo, mas não está utilizando o spring boot
		//no spring boot não usamos o new para componentes
	}

}
