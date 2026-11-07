package fidecompro;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProducto(String codigo)
            throws ProductoNoEncontradoException {

        for (Producto producto : productos) {
            if (producto.getCodigo().equalsIgnoreCase(codigo)) {
                return producto;
            }
        }

        throw new ProductoNoEncontradoException(
                "No se encontró un producto con el código: " + codigo);
    }

    public void actualizarExistencia(String codigo, int cantidad)
            throws ProductoNoEncontradoException {

        Producto producto = buscarProducto(codigo);
        producto.actualizarExistencia(cantidad);
    }

    public ArrayList<Producto> obtenerProductos() {
        return productos;
    }
}
