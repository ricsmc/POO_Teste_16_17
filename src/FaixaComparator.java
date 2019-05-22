import java.util.Comparator;

public class FaixaComparator implements Comparator<Faixa> {
    public int compare(Faixa f1, Faixa f2){
        if (f1.getUltimaVez().isBefore(f2.getUltimaVez())) return -1;
        else return 1;
    }
}
