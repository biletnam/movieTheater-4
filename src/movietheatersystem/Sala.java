package movietheatersystem;

public class Sala {

    //Lista doblemente enlazada con las peliculas del cine.
    Sala next;
    int numSala;
    int capacidadSala;
    int boletossVendidos;
    int boletossCancelados;
    int tipoFormato;
    Pelicula pelicula;
    Ticket boletos;

    public Sala(int numSala) {
        this.next = null;
        this.numSala = numSala;
        this.boletossVendidos = 0;
        this.capacidadSala = 4;
        this.boletossCancelados = 0;
        this.tipoFormato = 0;
        this.pelicula = null;
        this.boletos = null;
    }
    public Sala(int numSala, int asientos) {
        this.next = null;
        this.numSala = numSala;
        this.boletossVendidos = 0;
        this.capacidadSala = asientos;
        this.boletossCancelados = 0;
        this.tipoFormato = 0;
        this.pelicula = null;
        this.boletos = null;
    }

    public Sala() {
        this.next = null;
        this.capacidadSala = 4;
        this.numSala = 0;
        this.boletossVendidos = 0;
        this.boletossCancelados = 0;
        this.tipoFormato = 0;
        this.pelicula = null;
        this.boletos = null;
    }

    public void setCapacidadSala(int capacidadSala) {
        this.capacidadSala = capacidadSala;
    }

    public void setTipoFormato(int tipoFormato) {
        this.tipoFormato = tipoFormato;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNext(Sala next) {
        this.next = next;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getNext() {
        return next;
    }

    public void labelFuncionesSala() {
        System.out.println();
        System.out.printf("|  %-20s  ", "NumSala");
        System.out.printf("|  %-20s  ", "Pelicula");
        System.out.printf("|  %-15s  ", "Formato");
        System.out.println();
    }

    public void mostrar() {
        System.out.printf("| %-21s  ", this.numSala);
        System.out.printf("| %-21s  ", this.pelicula.getNombre());
        System.out.printf("| %-16s  ", this.escribirFormato(this.tipoFormato));
        System.out.println();
    }

    public String escribirFormato(int formato) {
        if (formato == 1) {
            return "3D";
        } else {
            return "2D";
        }

    }

}
