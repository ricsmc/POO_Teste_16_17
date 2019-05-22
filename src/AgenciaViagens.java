import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgenciaViagens {
    private Map<Hotel, List<String>> lista;

    public String toString() {
        return "AgenciaViagens{" +
                "lista=" + lista +
                '}';
    }

    public void guardaEstado(String nomeFicheiro, String tipo) throws FileNotFoundException, IOException {
        Map<Hotel, List<String>> n = new HashMap<>();
        for(Hotel i : this.lista.keySet()){
            if(tipo.equals("Premium") && i isinstanceof Premium){
                n.put(i, this.lista.values());
            }
        }
        FileOutputStream fos = new FileOutputStream(nomeFicheiro);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject();
        oos.flush();
        oos.close();
    }


}
