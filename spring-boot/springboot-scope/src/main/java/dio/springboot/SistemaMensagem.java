package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente techTeam;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas() {
        techTeam.setEmail("tech@dio.com.br");
        System.out.println(techTeam);
        System.out.println(noreply);
        System.out.println("Bem-vindo à Tech Elite!");
    }

    // SÓ PRECISAVA PRA TESTAR INSTANCIANDO OS OBJETOS DIRETAMENTE NO MAIN
    // public Remetente getNoreply() {
    //     return noreply;
    // }
    // public void setNoreply(Remetente noreply) {
    //     this.noreply = noreply;
    // }
    // public Remetente getTechTeam() {
    //     return techTeam;
    // }
    // public void setTechTeam(Remetente techTeam) {
    //     this.techTeam = techTeam;
    // }

}
