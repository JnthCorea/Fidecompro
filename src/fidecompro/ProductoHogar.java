package fidecompro;

public class ProductoHogar extends Producto {

    private String material;

    public ProductoHogar(String codigo, String nombre, String descripcion,
                         double precio, int cantidadDisponible,
                         String material) {
        super(codigo, nombre, descripcion, precio, cantidadDisponible);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String obtenerTipo() {
        return "Hogar";
    }
}
