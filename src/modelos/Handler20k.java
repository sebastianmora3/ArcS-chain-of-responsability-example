package modelos;

public class Handler20k extends BaseHandler {

    @Override
    public void handler(int cantidad) {
        int billetes = cantidad / 20000;
        int resto = cantidad % 20000;
        System.out.println("Retirando "+ billetes +" billetes de $20.000");
        goNext(resto);
    }

}
