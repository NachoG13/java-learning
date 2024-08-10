# Hola

Aquí se irán subiendo los avances y cositas sobre Java que voy teniendo

## Enlaces a los cursos utilizados
- `Mouredev` : https://www.youtube.com/watch?v=W86KTBSiX2o&ab_channel=MoureDevbyBraisMoure

# Cosas aprendidas

## Vocabulario aprendido
- parsear -> analizar una cadena de texto para analizar su estructura y sintáctica y extraer información sobre ella. 
- InputStream -> 

### Ingreso variable por consola
Para ingresar datos por consola se necesita la clase Scanner -> Scanner entrada = new Scanner(System.in);
- `Scanner` -> proporciona métodos convenientes para leer y parsear diferentes tipos de datos de un flujo de entrada.
- `entrada` -> variable tipo Scanner
- `System.in` -> Flujo de entrada estándar (generalmente el teclado)
    - `System.out`: Flujo de salida estándar (generalmente la consola).
    - `System.err`: Flujo de salida de error estándar (generalmente la consola, pero separado de System.out).

## Conversión de tipo de datos

### Conversión Implícita (Widening Conversion)
    Java realiza automáticamente esta conversión cuando se pasa de un tipo de datos más pequeño a uno más grande.
### Conversión Explícita (Narrowing Conversion) 
    El programador debe especificar esta conversión cuando:
    - Se pasa de un tipo de datos más grande a uno más pequeño 
    - Cuando se convierten tipos no compatibles.
#### Conversión con datos primitivos
 No se puede almacenar una variable de un tipo de dato menor al de una suma de tipos de datos mayores sin castearlo.
*Necesito colocarle el (tipo)*
 - <int numeroInt = (int) numeroDouble;> -> Conversión explícita de double a int
 - <byte myByte =  (myByte + myByte;> - > Conversión implícita de int a Byte

///Truco, puedo setear el valor decimal a un flotante casteandoló sin signo y volviendo a colocarlo en un flotante:
myDouble = (int) myDouble;
#### Conversión con datos de Referencia
 - <Animal miAnimal = new Perro();> -> Conversión implícita de Perro a Animal. Cuando se crea el objeto
 - <Perro miPerro = (Perro) miAnimal;> -> Conversión explícita de Animal a Perro. Cuando se declara
    

## Parse()
Recibe una cadena como entrada, "extrae" la información necesaria y la convierte en un objeto de la clase que llama

<Parse[tipo de dato](String s, int radix)`> -> se utiliza para obtener el tipo de datos primitivo de una cadena.
 - `s` -> cadena que representa un valor decimal con signo
 - `radix` -> la base de un sistema numérico. Ej: 2 (binario). *No se pueden con flotantes.*

 # Listas
 ## Implementaciones de la interfaz List:
- `ArrayList`, eficiente para iterar. 
    - List<String> myList = new ArrayList<>();
    - Necesario importar java.util.ArrayLista
- `LinkedList`, nodos conectados uno tras otro, no es eficiente para iterar, acceso secuencial
    - List<Boolean> myLinkedList = new LinkedList<>();
    - Necesario importar java.util.LinkedList
- `Vector`, como Arraylist pero usado para acceso concurrente
    - List<Integer> myVector = new Vector<>();
    - Necesario importar java.util.Vector
   

## Operaciones Comunes en Listas
    Agregar Elemento: add(elemento) - Añade un elemento al final de la lista.
    Obtener Elemento: get(índice) - Obtiene el elemento en la posición especificada.
    Eliminar Elemento: remove(índice) o remove(elemento) - Elimina el elemento en la posición especificada o el primer elemento que coincide con el objeto especificado.
    Tamaño de la Lista: size() - Devuelve el número de elementos en la lista.
    Recorrer la Lista: Se puede usar un bucle for tradicional o un for-each
# Map
Tipo de dato de java que almacena datos clave-valor
