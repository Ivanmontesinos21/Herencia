package Exercise1Heritage;

public class Main {
    public static void main(String[] args) {
       Multimedia multimedia=new Multimedia("Tu no vive asi","Bad Bunny",Formato.MP3,3.23);
        System.out.println(multimedia);
        Disco disco=new Disco("DON DON","Don Omar",Formato.MP3,4.25, Disco.Genero.reggaeton);
        System.out.println(disco);

    }
}