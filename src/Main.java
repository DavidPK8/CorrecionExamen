import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nombre, nombre_cientifico, color;
        int menu, edad;
        double tamanio;
        Scanner sc = new Scanner(System.in);
        Plantas[] plantas = new Plantas[5];
        Arbol arbol[] = new Arbol[5];
        Rosa rosa[] = new Rosa[5];
        Girasol[] girasol = new Girasol[5];

        try{
        do{
            System.out.println("\n*** MENU ***");
            System.out.println("\n1. Arbol");
            System.out.println("2. Rosa");
            System.out.println("3. Girasol");
            System.out.println("4. Salir");
            System.out.print("\nIngrese una opcion del menu: ");
            menu = sc.nextInt();

            switch(menu){
                case 1:{
                    System.out.println("\n*** ARBOL ***");
                    for(int i = 0; i < arbol.length; i++){
                        arbol[i] = new Arbol();
                        System.out.println("\nArbol " + (i+1));
                        System.out.print("Ingrese el nombre: ");
                        nombre = sc.next();
                        System.out.print("Ingrese el nombre cientifico: ");
                        nombre_cientifico = sc.next();
                        System.out.print("Ingrese la edad: ");
                        edad = sc.nextInt();
                        arbol[i].setNombre(nombre);
                        arbol[i].setNombre_cientifico(nombre_cientifico);
                        arbol[i].setEdad(edad);
                    }
                    for(int i = 0; i < arbol.length; i++){
                        System.out.println("\nArbol " + (i+1));
                        System.out.println("Nombre: " + arbol[i].getNombre());
                        System.out.println("Nombre Cientifico: " + arbol[i].getNombre_cientifico());
                        System.out.println("Edad: " + arbol[i].getEdad());
                    }
                    break;
                }
                case 2:{
                    System.out.println("\n*** ROSA ***");
                        for(int i = 0; i < rosa.length; i++){
                            rosa[i] = new Rosa();
                            System.out.println("\nRosa " + (i+1));
                            System.out.print("Ingrese el nombre: ");
                            nombre = sc.next();
                            System.out.print("Ingrese el nombre cientifico: ");
                            nombre_cientifico = sc.next();
                            System.out.print("Ingrese la edad: ");
                            edad = sc.nextInt();
                            System.out.print("Ingrese el color: ");
                            color = sc.next();
                            rosa[i].setNombre(nombre);
                            rosa[i].setNombre_cientifico(nombre_cientifico);
                            rosa[i].setEdad(edad);
                            rosa[i].setColor(color);
                        }
                        for(int i = 0; i < rosa.length; i++){
                            System.out.println("\nRosa " + (i+1));
                            System.out.println("Nombre: " + rosa[i].getNombre());
                            System.out.println("Nombre Cientifico: " + rosa[i].getNombre_cientifico());
                            System.out.println("Edad: " + rosa[i].getEdad());
                            System.out.println("Color: " + rosa[i].getColor());
                        }
                    break;
                }
                case 3:{
                    System.out.println("\n*** GIRASOL ***");
                    for(int i = 0; i < girasol.length; i++){
                        girasol[i] = new Girasol();
                        System.out.println("\nGirasol " + (i+1));
                        System.out.print("Ingrese el nombre: ");
                        nombre = sc.next();
                        System.out.print("Ingrese el nombre cientifico: ");
                        nombre_cientifico = sc.next();
                        System.out.print("Ingrese la edad: ");
                        edad = sc.nextInt();
                        System.out.print("Ingrese el color: ");
                        color = sc.next();
                        System.out.print("Ingrese el tamanio: ");
                        tamanio = sc.nextDouble();
                        girasol[i].setNombre(nombre);
                        girasol[i].setNombre_cientifico(nombre_cientifico);
                        girasol[i].setEdad(edad);
                        girasol[i].setColor(color);
                        girasol[i].setTamanio(tamanio);
                    }
                    for(int i = 0; i < girasol.length; i++){
                        System.out.println("\nGirasol " + (i+1));
                        System.out.println("Nombre: " + girasol[i].getNombre());
                        System.out.println("Nombre Cientifico: " + girasol[i].getNombre_cientifico());
                        System.out.println("Edad: " + girasol[i].getEdad());
                        System.out.println("Tamanio: " + girasol[i].getTamanio());
                    }
                    break;
                }
                case 4:{
                    System.out.println("\nGracias, vuelva pronto!");
                    break;
                }
                default:{
                    System.out.println("\nOpcion no disponible del menu!");
                }
            }
        }while(menu != 4);
        }catch (Exception ex) {
            System.out.println("Exepccion " + ex.getMessage());
        }
    }
}