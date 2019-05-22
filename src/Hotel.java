import java.util.Objects;

public class Hotel {
    private String codigo;
    private String nome;
    private String localidade;
    private double precoBaseQuarto;
    private int numeroQuartos;
    private int estrelas;

    public Hotel(){
        this.codigo = "";
        this.nome = "";
        this.localidade = "";
        this.precoBaseQuarto = 0;
        this.numeroQuartos = 0;
        this.estrelas = 0;
    }

    public Hotel(String codigo, String nome, String localidade, double precoBaseQuarto, int numeroQuartos, int estrelas) {
        this.codigo = codigo;
        this.nome = nome;
        this.localidade = localidade;
        this.precoBaseQuarto = precoBaseQuarto;
        this.numeroQuartos = numeroQuartos;
        this.estrelas = estrelas;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalidade() {
        return this.localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public double getPrecoBaseQuarto() {
        return this.precoBaseQuarto;
    }

    public void setPrecoBaseQuarto(double precoBaseQuarto) {
        this.precoBaseQuarto = precoBaseQuarto;
    }

    public int getNumeroQuartos() {
        return this.numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public int getEstrelas() {
        return this.estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return  hotel.precoBaseQuarto == this.precoBaseQuarto &&
                this.numeroQuartos == hotel.numeroQuartos &&
                this.estrelas == hotel.estrelas &&
                this.codigo.equals(hotel.codigo) &&
                this.nome.equals(hotel.nome) &&
                this.localidade.equals(hotel.localidade);
    }




}
