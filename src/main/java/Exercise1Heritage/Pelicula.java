package Exercise1Heritage;

public class Pelicula extends Multimedia{
    public String actorprincipal;
    public String actrizprincipal;

    public Pelicula(String titulo,String autor,Formato formato, double duracion,String actorprincipal,String actrizprincipal){
        super(titulo,autor,formato,duracion);
        this.actorprincipal=actorprincipal;
        this.actrizprincipal=actrizprincipal;
    }

    public String getActorprincipal() {
        return actorprincipal;
    }
    public String getActrizprincipal(){
        return actrizprincipal;
    }
    public void setActorprincipal(String actorprincipal){
        this.actrizprincipal=actorprincipal;

    }
    public void setActrizprincipal(String actrizprincipal){
        this.actrizprincipal=actrizprincipal;
    }

    @Override
    public String toString() {
        return "Pelicula [actorPrincipal=" + actorprincipal
                + ", actrizPrincipal=" + actrizprincipal + ", toString()="
                + super.toString() + "]";
    }
}
