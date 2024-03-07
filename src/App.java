import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leer = new Scanner(System.in);
        CajeroAutomatico cajero = new CajeroAutomatico();

        System.out.println("Ingrese la cantidad a retirar: ");
        int cantidad = leer.nextInt();
        cajero.dispensar(cantidad);

        leer.close();
    }
}
