package collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class Contato {
    private String nome;
    private Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", numero=" + numero + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        return true;
    }
    
}

class ComparatorNumeroTelefone implements Comparator<Map.Entry<Integer,Contato>> {
    @Override
    public int compare(Entry<Integer, Contato> c1, Entry<Integer, Contato> c2) {
        return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
    }
}

class ComparatorNomeContato implements Comparator<Map.Entry<Integer,Contato>> {
    @Override
    public int compare(Entry<Integer, Contato> c1, Entry<Integer, Contato> c2) {
        return c1.getValue().getNome().compareToIgnoreCase(c2.getValue().getNome());
    }
}