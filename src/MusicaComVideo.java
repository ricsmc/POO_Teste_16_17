import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MusicaComVideo extends Faixa implements Playable {
    private List<Character> caracteres;

    public MusicaComVideo(List<Character> caracteres,String nome, String autor, double duracao, int classificacao, ArrayList<String> letra, int numeroDeVezesTocada, LocalDateTime ultimaVez) {
        super(nome,autor,duracao,classificacao,letra,numeroDeVezesTocada,ultimaVez);
        this.caracteres = new ArrayList<>(caracteres);
    }

    public void play(){
        super.play();
        System.out.println(this.caracteres );
    }
}
