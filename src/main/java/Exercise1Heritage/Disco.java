package Exercise1Heritage;

public class Disco extends Multimedia {
    private Genero genero;


    public Disco(String titulo,String autor, Formato formato, double duracion, Genero genero){
        super(titulo, autor, formato, duracion);
        this.genero=genero;
    }
        public Genero getGenero(){
        return genero;
        }
    public enum Genero{
        rock,
        Pop,
        Opera,
        jazz,
        reggaeton,
        flamenco;
    }
    public String toString(){
     return    "Multimedia{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", formato=" + formato +
                ", duracion=" + duracion + "Genero" +genero +"}";
    }

}
