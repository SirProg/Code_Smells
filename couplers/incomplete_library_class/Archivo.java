package incomplete_library_class;
import java.io.File;
public class Archivo {        
    public static void main(String[] args) {
    File origen = new File("documento.txt");
    File destino = new File("copia.txt");
    //File no posee un método copy() para realizar un origen.copy(destino)
    //Esto muestra un ejemplo del mal olor Incomplete library Class
    }
}
