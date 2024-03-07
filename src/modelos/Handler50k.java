package modelos;

public class Handler50k extends BaseHandler{

    @Override
    public void handler(int cantidad) {
        int billetes = cantidad / 50000;
        int resto = cantidad % 50000;
        System.out.println("Retirando "+ billetes +" billetes de $50.000");
        goNext(resto);
    }

}
