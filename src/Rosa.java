public class Rosa extends Arbol{
    String color;

    public Rosa(){
        super();
    }

    public Rosa(String nombre, String nombre_cientifico, int edad, String color) {
        super(nombre, nombre_cientifico, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
