

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> myList = new ArrayList();
        
        myList.add("holaaaa");
        System.out.println(myList.size()); 
        System.out.println(myList);
        /*
    Implementaciones de la interfaz List:
        ArrayList, eficiente para iterar
        LinkedList, nodos conectados uno tras otro, no es eficiente para iterar
        Vector, como Arraylist pero usado para acceso concurrente

    Operaciones Comunes en Listas
        Agregar Elemento: add(elemento) - Añade un elemento al final de la lista.
        Obtener Elemento: get(índice) - Obtiene el elemento en la posición especificada.
        Eliminar Elemento: remove(índice) o remove(elemento) - Elimina el elemento en la posición especificada o el primer elemento que coincide con el objeto especificado.
        Tamaño de la Lista: size() - Devuelve el número de elementos en la lista.
        Recorrer la Lista: Se puede usar un bucle for tradicional o un for-each
         */
    }
}
