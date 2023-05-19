package Exercise1Heritage;

public class Multimedia {
    protected String titulo;
    protected String autor;
    protected Formato formato;
    protected double duracion;


    public Multimedia(String titulo,String autor,Formato formato,double duracion){
        this.titulo=titulo;
        this.autor=autor;
        this.formato=formato;
        this.duracion=duracion;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return   autor;

    }
    public Formato getFormato(){
        return formato;
    }
    public double getDuracion(){
        return duracion;
    }

    @Override
    public boolean equals(Object obj) {
            if (obj instanceof Multimedia ){
                Multimedia multimedia=(Multimedia) obj;
                return multimedia.titulo.compareToIgnoreCase(titulo)==0 &&multimedia.autor==autor;
            }
            return false;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato=" + formato +
                ", duracion=" + duracion ;
    }
}

