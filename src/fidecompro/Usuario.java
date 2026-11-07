package fidecompro;

public class Usuario {

    private int idUsuario;
    private String nombre;
    private String nombreUsuario;
    private String contrasena;
    private String rol;

    public Usuario(int idUsuario, String nombre, String nombreUsuario,
                   String contrasena, String rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean validarCredenciales(String usuario, String contrasena) {
        return nombreUsuario.equals(usuario)
                && this.contrasena.equals(contrasena);
    }
}
