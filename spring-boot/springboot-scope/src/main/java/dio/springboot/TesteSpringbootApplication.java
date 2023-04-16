package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteSpringbootApplication.class, args);

		Remetente r = new Remetente();
		r.setEmail("teste@gmail.com");
		r.setNome("teste");
		System.out.println(r);

		SistemaMensagem s = new SistemaMensagem();
		s.setNoreply(r);
		s.setTechTeam(r);
		s.enviarConfirmacaoCadastro();
		s.enviarMensagemBoasVindas();
	}

}
