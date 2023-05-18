package validadores;

import java.util.ArrayList;
import java.util.List;

public abstract class Validador {

    private final List<String> errors = new ArrayList<>();

    public abstract Boolean ehValido();

    public List<String> getErros() {
        return errors;
    }

    public void addError(String erro) {
        this.errors.add(erro);
    }
    
}
