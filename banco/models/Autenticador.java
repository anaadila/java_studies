package models;

@FunctionalInterface
public interface Autenticador {
    
    
    public abstract Boolean autentica(String senha);
}
