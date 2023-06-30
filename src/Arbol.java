public class Arbol extends Plantas{
    int edad;

    public Arbol(){
        super();
    }

    public Arbol(String nombre, String nombre_cientifico, int edad) {
        super(nombre, nombre_cientifico);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
