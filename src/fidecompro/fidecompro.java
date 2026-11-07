package fidecompro;

public class fidecompro {

    public static GestorClientes gestorClientes = new GestorClientes();    
    public static Inventario inventario = new Inventario();

    public static void main(String[] args) {

        VentanaInicioSesion ventana = new VentanaInicioSesion();
        ventana.setVisible(true);
    }
}