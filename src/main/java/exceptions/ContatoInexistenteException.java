package exceptions;

public class ContatoInexistenteException extends Exception{
    public ContatoInexistenteException(String msg){
        super(msg);
    }
    public ContatoInexistenteException(){
        this("Contato Inexistente!");
    }
}
