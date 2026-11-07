package fidecompro;

import java.util.ArrayList;

public class GestorClientes {

    private ArrayList<Cliente> clientes;

    public GestorClientes() {
        clientes = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarCliente(String identificacion) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equalsIgnoreCase(identificacion)) {
                return cliente;
            }
        }

        return null;
    }

    public boolean actualizarCliente(String identificacion, String nombre,
                                     String telefono, String correo) {

        Cliente cliente = buscarCliente(identificacion);

        if (cliente != null) {
            cliente.setNombre(nombre);
            cliente.setTelefono(telefono);
            cliente.setCorreo(correo);
            return true;
        }

        return false;
    }

    public ArrayList<Cliente> obtenerClientes() {
        return clientes;
    }
}
