import modelos.BaseHandler;
import modelos.Handler100k;
import modelos.Handler10k;
import modelos.Handler20k;
import modelos.Handler50k;
import modelos.Handler5k;

public class CajeroAutomatico {
    private BaseHandler handler;

    public CajeroAutomatico(){

        handler = new Handler100k();
        BaseHandler handler50k = new Handler50k();
        BaseHandler handler20k = new Handler20k();
        BaseHandler handler10k = new Handler10k();
        BaseHandler handler5k = new Handler5k();

        handler.selectNext(handler50k);
        handler50k.selectNext(handler20k);
        handler20k.selectNext(handler10k);
        handler10k.selectNext(handler5k);
    }
    
    public void dispensar(int cantidad){
        if (cantidad % 5000 != 0){
            System.out.println("Error: la cantidad no es multiplo de $5.000");
        } else {
            handler.handler(cantidad);
        }
    }
}
