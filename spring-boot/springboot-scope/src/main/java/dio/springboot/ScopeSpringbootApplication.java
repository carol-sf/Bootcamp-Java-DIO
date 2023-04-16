package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ScopeSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScopeSpringbootApplication.class, args);

		// Remetente r = new Remetente();
		// r.setEmail("teste@gmail.com");
		// r.setNome("teste");
		// System.out.println(r);

		// SistemaMensagem s = new SistemaMensagem();
		// s.setNoreply(r);
		// s.setTechTeam(r);
		// s.enviarConfirmacaoCadastro();
		// s.enviarMensagemBoasVindas();
	}

	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) {
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
			sistema.enviarConfirmacaoCadastro();
		};
	}

}
