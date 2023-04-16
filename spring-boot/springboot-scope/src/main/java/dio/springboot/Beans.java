package dio.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

    @Bean
    @Scope("prototype") // se n tivesse seria "singleton", aí se eu mexesse em um remetente lá no sistemaMensagem ia mexer nos dois
    public Remetente remetente() {
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setNome("Digital Innovation One");
        remetente.setEmail("noreply@dio.com.br");
        return remetente;
    }

}
