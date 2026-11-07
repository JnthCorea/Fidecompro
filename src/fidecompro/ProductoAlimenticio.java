package fidecompro;

public class ProductoAlimenticio extends Producto {

    private String fechaVencimiento;

    public ProductoAlimenticio(String codigo, String nombre, String descripcion,
                               double precio, int cantidadDisponible,
                               String fechaVencimiento) {
        super(codigo, nombre, descripcion, precio, cantidadDisponible);
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String obtenerTipo() {
        return "Alimenticio";
    }
}
