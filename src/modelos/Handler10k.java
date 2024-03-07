package modelos;

public class Handler10k extends BaseHandler {

    @Override
    public void handler(int cantidad) {
        int billetes = cantidad / 10000;
        int resto = cantidad % 10000;
        System.out.println("Retirando "+ billetes +" billetes de $10.000");
        goNext(resto);
    }

}
