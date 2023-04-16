package dio.springboot;

public class SistemaMensagem {
    private Remetente noreply;
    private Remetente techTeam;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas() {
        techTeam.setEmail("tech@dio.com.br");
        System.out.println(techTeam);
        System.out.println("Bem-vindo à Tech Elite!");
    }

    public Remetente getNoreply() {
        return noreply;
    }

    public void setNoreply(Remetente noreply) {
        this.noreply = noreply;
    }

    public Remetente getTechTeam() {
        return techTeam;
    }

    public void setTechTeam(Remetente techTeam) {
        this.techTeam = techTeam;
    }

    
}
