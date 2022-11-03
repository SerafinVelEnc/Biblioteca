public class Prestamos {

    /**
     * Atributos propiedades y variables estado
     */

    private String usuario;
    private String libroPrestado;
    private String fechaDeprestamo;
    private String fechaDedevolucion;

    /**
     * Metodos, funciones y comportamiento
     */

    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getLibroprestado(){
        return libroPrestado;
    }
    public void setLibroprestado(String libroPrestado){
        this.libroPrestado = libroPrestado;
    }
    public String getFechadePrestamo(){
        return fechaDeprestamo;
    }
    public void setFechadePrestamo(String fechaDeprestamo){
        this.fechaDeprestamo = fechaDeprestamo;
    }
    public String getFechadeDevolucion(){
        return fechaDedevolucion;
    }
    public void setFechadeDevolucion(String fechaDedevolucion){
        this.fechaDedevolucion = fechaDedevolucion;
    }
}
