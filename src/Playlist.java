import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Playlist {
    private String nome;
    private Map<String, List<Faixa>> musicas;

    public Playlist(String nome, Map<String, List<Faixa>> musicas) {
        this.nome = nome;
        this.musicas = new HashMap<>();
        for(Map.Entry<String, List<Faixa>> i : musicas.entrySet()){
            List<Faixa> fx = new ArrayList<>();
            for(Faixa j : i.getValue()){
                fx.add(j);
            }
            this.musicas.put(i.getKey(), fx);
        }
    }

    public List<Faixa> getFaixas (String autor) { //throws AutorInexistenteException
        return this.musicas.entrySet().stream().filter(l -> l.getKey().equals(autor)).
                flatMap(x-> x.getValue().stream()).collect(Collectors.toList());

    }

    public double tempoTotal (String autor){ //throws AutorInexistenteException
        return this.getFaixas(autor).stream().//map(x -> x.getNumeroDeVezesTocada() * x.getDuracao()).
                mapToDouble(x-> x.getNumeroDeVezesTocada() * x.getDuracao()).sum();
    }

    public List<Faixa> todasAsFaixas(){
        List<Faixa> paraRet = new ArrayList<>();
        this.musicas.entrySet().stream().forEach(x-> x.getValue().stream().forEach(y-> paraRet.add(y.clone())));
        return paraRet;
    }

    public Map<Integer, List<Faixa>> faixasPorClass(){
        return todasAsFaixas().stream()
               .collect(Collectors.groupingBy(Faixa::getClassificacao));
    }

}
