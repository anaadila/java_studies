package db;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import models.Cliente;

public class ClientesDB {

    private List<Cliente> clientesList = new ArrayList<>();

    public List<Cliente> getClientesList() {
        return clientesList;
    }

    public void addNovoCliente(Cliente cliente) {
        clientesList.add(cliente);
    }

    public Cliente getClientePorNome(String nome) {
        return clientesList.stream()
                .filter(cliente -> cliente.getNome().equals(nome))
                .findFirst()
                .get();
    }

    public Cliente getClienteMaxCompras() {
        return clientesList.stream()
                .max(Comparator.comparing(Cliente::getCompras)).get();
    }

    public Cliente getClienteMinCompras() {
        return clientesList.stream()
                .min(Comparator.comparing(Cliente::getCompras)).get();
    }

    public Double getClienteMediaCompras() {
        return clientesList.stream()
                .mapToDouble(Cliente::getCompras)
                .average().getAsDouble();
                
    }
}
