package tienda_botelloyurley;


import java.util.ArrayList;
import java.util.Scanner;

public class Tienda_BotelloYurley {
    int id;
    String nombre;
    double precio;
    int stock;
    public Tienda_BotelloYurley(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public void menuOpciones(){
        System.out.println("_______TIENDA_Y_______");
        System.out.println("1. Ver productos");
        System.out.println("2. Actualizar productos.");
        System.out.println("3. Eliminar producto.");
        System.out.println("4. Agregar producto.");
        System.out.println("5. Salir");
        System.out.println("_______________________");
    }
    public void verProductos(){
      System.out.println("Id: " + id + " | Nombre: " + nombre + " | Precio: $" + precio + 
      " | Cantidad_stock: " + stock);
    }
    public static void main(String[] args) {
        
        ArrayList<Tienda_BotelloYurley> productos = new ArrayList<>();
        productos.add(new Tienda_BotelloYurley(1, "Botella de agua", 1.50, 50));
        productos.add(new Tienda_BotelloYurley(2, "Cafe", 15.00, 30));
        productos.add(new Tienda_BotelloYurley(3, "Pollo", 35.00, 15));
        productos.add(new Tienda_BotelloYurley(4, "Arroz", 10.00, 25));
        productos.add(new Tienda_BotelloYurley(5, "Panela", 20.00, 20));
        productos.add(new Tienda_BotelloYurley(6, "Azucar", 10.00, 10));

       Tienda_BotelloYurley tienda = new Tienda_BotelloYurley(0, "", 0, 0);
       tienda.menuOpciones(); 
       
        Scanner scanner = new Scanner(System.in);
        boolean booleanito=true;
        while(booleanito){
            int opci;
            System.out.println("ingresa la opcion que deseas ");
            opci=scanner.nextInt();

            switch(opci){
                case 1 :
                    System.out.println("_____PRODUCTOS DISPONIBLES______");
                    System.out.println();
                    for (Tienda_BotelloYurley producto : productos) {
                        producto.verProductos();
                    }
                    break;
                case 2 : 
                    System.out.println("_____PRODUCTOS DISPONIBLES______");
                    System.out.println();
                    for (Tienda_BotelloYurley producto : productos) {
                        producto.verProductos();
                    }

                    scanner.nextLine();
                    System.out.println("Ingrese La id del producto a actualizar");
                    int id ;
                    id=scanner.nextInt();
                    Tienda_BotelloYurley productoActualizar = null;
                    for (Tienda_BotelloYurley producto : productos) {
                        if (producto.id == id) {
                            productoActualizar = producto;
                            break;
                        }
                    }

                    System.out.println("_____Actualizar______");
                    System.out.println("1. Nombre");
                    System.out.println("2. Precio");
                    System.out.println("3. Cantidad_stock");
                    System.out.println("4. Salir");
                    int opciactualizar;
                    opciactualizar=scanner.nextInt();
                    switch (opciactualizar) {
                        case 1:
                            scanner.nextLine(); // Consume the newline
                            System.out.println("Ingrese el nombre nuevo del producto:");
                            String newNombre = scanner.nextLine();
                            productoActualizar.nombre = newNombre;
                            System.out.println("Producto actualizado: ");
                            productoActualizar.verProductos();
                            break;

                        case 2:
                            System.out.println("Ingrese el precio nuevo del producto:");
                            double newPrecio = scanner.nextDouble();
                            productoActualizar.precio = newPrecio;
                            System.out.println("Producto actualizado: ");
                            productoActualizar.verProductos();
                            break;

                        case 3:
                            System.out.println("Ingrese la cantidad_stock nuevo del producto:");
                            int newStock = scanner.nextInt();
                            productoActualizar.stock = newStock;
                            System.out.println("Producto actualizado: ");
                            productoActualizar.verProductos();
                            break;

                        case 4:
                            System.out.println("Has abandonado el programa.");
                            break;

                    }
                case 3 : 
                    System.out.println("_____PRODUCTOS DISPONIBLES______");
                    System.out.println();
                    for (Tienda_BotelloYurley producto : productos) {
                        producto.verProductos();
                    }
                     System.out.println();
                    System.out.println("_____ ELIMINAR PRODUCTO______");
                    System.out.println("Ingrese la id del producto que desea eliminar:");
                    int idecita ;
                    idecita=scanner.nextInt();

                    for (Tienda_BotelloYurley producto : productos) {
                        if (producto.id == idecita) {
                            productos.remove(producto);
                            break;
                        }
                         producto.verProductos();
                    }

                case 4 : 
                    System.out.println("_____PRODUCTOS DISPONIBLES______");
                    System.out.println();
                    for (Tienda_BotelloYurley producto : productos) {
                        producto.verProductos();
                    }
                    System.out.println();
                    System.out.println("_____ AGREGAR PRODUCTOS______");
                    System.out.println();
                    int ide=0;
                    String name="";
                    double price =0.0;
                    int cantidad=0;
                    boolean idValida = false;
                    while (!idValida) {
                        System.out.println("Ingrese la id del nuevo producto:");
                        ide = scanner.nextInt();


                        boolean idExiste = false;
                        for (Tienda_BotelloYurley producto : productos) {
                            if (producto.id == ide) {
                                idExiste = true;
                                break;
                            }
                        }
                        if (idExiste) {
                            System.out.println("Esta id no es válida, ya existe.");
                        } else {
                            idValida = true; 
                        }
                    }
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del nuevo producto:");
                    name=scanner.nextLine();
                    System.out.println("Ingrese el precio del nuevo producto:");
                    price=scanner.nextDouble();
                    System.out.println("Ingrese el stock del nuevo producto:");
                    cantidad=scanner.nextInt();


                    productos.add(new Tienda_BotelloYurley(ide, name, price, cantidad));

                    for (Tienda_BotelloYurley producto : productos) {
                      producto.verProductos();
                    }
                    break;

                case 5 :

                    System.out.println("Vuelve pronto a la Tienda yu :)");
                    booleanito=false;
                    break;      
            }
        }
    }
}

