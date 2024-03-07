package modelos;

public class Handler100k extends BaseHandler {

    @Override
    public void handler(int cantidad) {
        int billetes = cantidad / 100000;
        int resto = cantidad % 100000;
        System.out.println("Retirando "+ billetes +" billetes de $100.000");
        goNext(resto);
    }

}
