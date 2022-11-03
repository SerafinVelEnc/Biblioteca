public class Libros {

    /**
     * Atributos propiedades y variables estado
     */
    private Integer isnb;
    private String titulo;
    private String autor;
    private String genero;
    private String fechaDepublicacion;

    /**
     * Metodos, funciones y comportamiento
     */

    public Integer getIsnb(){

        return isnb;
    }
    public void setIsnb(Integer isnb){

        this.isnb = isnb;
    }
    public String getTitulo(){

        return titulo;
    }
    public void setTitulo (String titulo){

        this.titulo = titulo;
    }
    public String getAutor(){

        return autor;
    }
    public void setAutor(String autor){

        this.autor = autor;
    }
    public String getGenero(){
        return  genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getFechadePublicacion(){
        return fechaDepublicacion;
    }
    public void setFechadePublicacion(String fechaDepublicacion){
        this.fechaDepublicacion = fechaDepublicacion;
    }
}

