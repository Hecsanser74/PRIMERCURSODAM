package BasesDatos.Aplicacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Base de Datos Factura");

        boolean acabar = false;


        while (!acabar){
            System.out.println("Introduce que quieres hacer (1-9) \n" +
                    "1. Mostrar Clientes \n" +
                    "2. Mostrar Facturas con Líneas \n" +
                    "3. Mostrar Articulos y Categorias \n" +
                    "4. Añadir Clientes \n" +
                    "5. Añadir Artículo \n" +
                    "6. Eliminar Articulo \n" +
                    "7. Modificar precio articulo \n" +
                    "8. Añadir Poblacion \n" +
                    "9. Salir");
            System.out.print("La opción seleccionada es: ");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    Client.listarClientes();
                    break;

                case 2:
                    LiniaFactura.listarLiniafactura();
                    break;

                case 3:
                    System.out.println("Articulos");
                    System.out.println("----------------- \n");
                    Article.listarArticle();
                    System.out.println();
                    System.out.println("Categoria");
                    System.out.println("-------------- \n");
                    Categoria.listarCategorias();
                    break;

                case 4:
                    System.out.println("Agregador de Clientes");
                    System.out.println("-----------------------");
                    System.out.print("Codigo: ");
                    int cod_cliente2 = scanner.nextInt();
                    System.out.println();
                    System.out.print("Nombre: ");
                    String nombre2 = scanner.nextLine();
                    System.out.println();
                    System.out.print("Direccion: ");
                    String Adreca2 = scanner.nextLine();
                    System.out.println();
                    System.out.print("Cp: ");
                    int cp2 = scanner.nextInt();
                    System.out.println();
                    System.out.print("Cod_pob: ");
                    int cod_pob2 = scanner.nextInt();

                    Client.agregarCliente(cod_cliente2,nombre2,Adreca2,cp2,cod_pob2);
                    break;

                case 5:
                    System.out.println("Agregador de Articulos");
                    System.out.println("------------------------");
                    System.out.print("Cod_a: ");
                    int cod_a2 = scanner.nextInt();
                    System.out.println();
                    System.out.print("Descripcion: ");
                    String descrip2 = scanner.nextLine();
                    System.out.println();
                    System.out.print("Precio: ");
                    double preu2 = scanner.nextDouble();
                    System.out.println();
                    System.out.print("Stock: ");
                    int stock2 = scanner.nextInt();
                    System.out.println();
                    System.out.print("Stock_min: ");
                    int stock_min2 = scanner.nextInt();

                    Article.agregarArticulo(cod_a2,descrip2,preu2,stock2,stock_min2);
                    break;

                case 6:
                    System.out.println("Borrador de articulos");
                    System.out.println("-------------------------");
                    System.out.print("Codigo del cliente que desea eliminar: ");
                    int cod_EliminarArt = scanner.nextInt();
                    Article.eliminarArticle(cod_EliminarArt);
                    break;

                case 7:
                    System.out.println("Modificar el articulo");
                    System.out.println("----------------------");
                    System.out.print("Introduce el porcentage (5% = 1.05 para sumar un 5%: ");
                    double preuModificat = scanner.nextDouble();
                    Article.modificarArticle(preuModificat);
                    break;

                case 8:
                    System.out.println("Agregar una Poblacion");
                    System.out.println("--------------------");
                    System.out.print("Cod_pob: ");
                    int cod_poblacio3 = scanner.nextInt();
                    System.out.println();
                    System.out.print("Nombre: ");
                    String nomP = scanner.nextLine();
                    System.out.println();
                    System.out.print("Adreca: ");
                    String cod_pro3 = scanner.nextLine();
                    System.out.println();

                    Poble.agregarPoble(cod_poblacio3,nomP,cod_pro3);
                    break;

                case 9:
                    acabar = true;
                    break;
            }
        }


    }
}
