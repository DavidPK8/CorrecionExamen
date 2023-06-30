public class Girasol extends Rosa{
    double tamanio;

    public Girasol(){
        super();
    }

    public Girasol(String nombre, String nombre_cientifico, int edad, String color, double tamanio) {
        super(nombre, nombre_cientifico, edad, color);
        this.tamanio = tamanio;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
}
