package collections.set;

public class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private double tempoEpisodio;

    public Serie(String nome, String genero, double tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getTempoEpisodio() {
        return tempoEpisodio;
    }
    public void setTempoEpisodio(double tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    // @Override
    // public String toString() {
    //     return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
    // }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Double.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if(tempoEpisodio != 0) return tempoEpisodio;
        
        return this.getGenero().compareToIgnoreCase(serie.getGenero());
    }
}
