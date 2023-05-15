package db;

import java.util.HashSet;
import java.util.Set;

import models.Presenca;


public class PresencasDB {
    private Set<Presenca> presencasList = new HashSet<>();

    public Set<Presenca> getPresencasList() {
        return presencasList;
    }

    public void addNovaPresenca(Presenca presenca) {
        presencasList.add(presenca);
    }
}
