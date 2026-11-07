package fidecompro;

public class ProductoLimpieza extends Producto {

    private String presentacion;

    public ProductoLimpieza(String codigo, String nombre, String descripcion,
                            double precio, int cantidadDisponible,
                            String presentacion) {
        super(codigo, nombre, descripcion, precio, cantidadDisponible);
        this.presentacion = presentacion;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    @Override
    public String obtenerTipo() {
        return "Limpieza";
    }
}
