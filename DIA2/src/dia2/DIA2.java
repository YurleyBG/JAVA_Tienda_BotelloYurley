
package dia2;

import java.util.ArrayList;

/**
 *
 * @author Uniminuto Tibu
 */
public class DIA2 {
    // p o o
    // es un paradigma de programacion que parte del
    // concepto de "objectos" como base , contenido
    // informacion en forma de campos y codigo en forma de metodos
    public static void main(String[] args) {
       cars carrito1=new cars();
       cars carrito2=new cars("audi", "A4",2010);
       cars carrito3 = new cars("Toyota","Tundra",2025,"Diesel",1000,2800,"Negro petroleo", 5);
        System.out.println(carrito1);
        System.out.println(carrito2);
        System.out.println(carrito3);
        // asignar valores a u  objecto
        carrito1.Modelo="Twingo";
        carrito1.marca="Renault";
        System.out.println(carrito1);
        System.out.println(carrito1.Modelo);
        
        ArrayList<cars>listaCarro=new ArrayList<>();
        System.out.println(listaCarro);
        listaCarro.add(carrito1);
        listaCarro.add(carrito2);
        listaCarro.add(carrito3);
        System.out.println(listaCarro);
        System.out.println(listaCarro.get(2));
        cars carrotemporal=new cars();
        carrotemporal=listaCarro.get(2);
        System.out.println(carrotemporal.marca);
        
        for (int i = 0; i < listaCarro.size(); i++) {
            System.out.println(listaCarro);
            
        }
    }
    
}
