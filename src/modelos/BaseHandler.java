package modelos;

public abstract class BaseHandler implements Handler {
    private Handler next;

    public void selectNext(Handler next){
        this.next = next;
    }

    public void goNext(int cantidad){
        if (next !=  null ){
            next.handler(cantidad);
        }
    }
}
