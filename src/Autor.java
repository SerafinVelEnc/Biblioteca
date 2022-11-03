public class Autor {

    /**
     * Atributos propiedades y variables estado
     */
    private Integer codAutor;
    private String nombre;
    private String apellidos;
    private String fechaDenacimiento;

    /**
     * Metodos, funciones y comportamiento
     */

    public Integer getCodAutor(){
        return codAutor;
    }
    public void setCodAutor(Integer codAutor){
        this.codAutor = codAutor;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public String getFechadeNacimiento(){
        return fechaDenacimiento;
    }
    public void setFechaDenacimiento(String fechaDenacimiento){
        this.fechaDenacimiento = fechaDenacimiento;
    }
}
