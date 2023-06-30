public class Plantas {
    String nombre;
    String nombre_cientifico;

    public Plantas(){

    }

    public Plantas(String nombre, String nombre_cientifico) {
        this.nombre = nombre;
        this.nombre_cientifico = nombre_cientifico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }
}
