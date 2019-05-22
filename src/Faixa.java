import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Faixa implements Comparable<Faixa>{
    private String nome;
    private String autor;
    private double duracao;
    private int classificacao;
    private ArrayList<String> letra;
    private int numeroDeVezesTocada;
    private LocalDateTime ultimaVez;

    public Faixa(){
        this.nome = "";
        this.autor = "";
        this.duracao = 0;
        this.classificacao = 0;
        this.letra = new ArrayList<>();
        this.numeroDeVezesTocada = 0;
        this.ultimaVez = LocalDateTime.MIN;
    }
    public Faixa(Faixa f){
        this.nome = f.getNome();
        this.autor = f.getAutor();
        this.duracao = f.getDuracao();
        this.classificacao = f.getClassificacao();
        this.letra = f.getLetra();
        this.numeroDeVezesTocada = f.getNumeroDeVezesTocada();
        this.ultimaVez = f.getUltimaVez();
    }

    public String getNome() {
        return this.nome;
    }

    public String getAutor() {
        return this.autor;
    }

    public double getDuracao() {
        return this.duracao;
    }

    public int getClassificacao() {
        return this.classificacao;
    }

    public ArrayList<String> getLetra() {
        return new ArrayList<>(this.letra);
    }

    public int getNumeroDeVezesTocada() {
        return this.numeroDeVezesTocada;
    }

    public LocalDateTime getUltimaVez() {
        return this.ultimaVez;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Faixa faixa = (Faixa) o;
        return this.nome.equals(faixa.getNome()) &&
                this.autor.equals(faixa.getAutor()) &&
                this.duracao == faixa.getDuracao() &&
                this.classificacao == faixa.getClassificacao() &&
                this.letra.equals(faixa.letra) &&
                this.numeroDeVezesTocada == faixa.getNumeroDeVezesTocada() &&
                this.ultimaVez.equals(faixa.getUltimaVez());
    }

    public int compareTo(Faixa f1){
        if (this.getNumeroDeVezesTocada() == f1.getNumeroDeVezesTocada())
            return 0;
        if (this.getNumeroDeVezesTocada() < f1.getNumeroDeVezesTocada())
            return -1;
        else return 1;
    }

    public Faixa clone(){
        return new Faixa(this);
    }

}
