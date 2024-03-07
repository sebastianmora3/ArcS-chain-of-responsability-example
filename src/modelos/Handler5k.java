package modelos;

public class Handler5k extends BaseHandler {

    @Override
    public void handler(int cantidad) {
        int billetes = cantidad / 5000;
        int resto = cantidad % 5000;
        if (resto != 0){
            System.out.println("Error, la cantidad no es multiplo de 5");


        }else { 
            System.out.println("Retirando "+ billetes +" billetes de $5.000");
        }
    }
}
