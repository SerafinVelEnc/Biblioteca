public class Usuarios {

    /**
     * Atributos propiedades y variables estado
     */
    private Integer dni;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String poblacion;

    /**
     * Metodos, funciones y comportamiento
     */

    public Integer getDni(){
        return dni;
    }
    public void setDni(Integer dni){
        this.dni = dni;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidos(){
        return apellidos;
    }public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getPoblacion(){
        return poblacion;
    }
    public void setPoblacion(String poblacion){
        this.poblacion = poblacion;
    }
}
