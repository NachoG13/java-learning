# Hola

Aquí se irán subiendo los avances y cositas sobre Java que voy teniendo

## Enlaces a los cursos utilizados
- `Mouredev` : https://www.youtube.com/watch?v=W86KTBSiX2o&ab_channel=MoureDevbyBraisMoure
- `Javatpoint`: https://www.javatpoint.com/java-data-types

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
    
## Operators
https://www.javatpoint.com/java-data-types
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
Tipo de dato de java que almacena pares clave-valor

## Implementaciones Comunes:

- HashMap: Es la implementación más común de Map. Permite la búsqueda rápida de claves y es no sincronizada (no es segura para su uso con múltiples hilos simultáneos).
- TreeMap: Mantiene las claves ordenadas según su orden natural o un comparador personalizado.
- LinkedHashMap: Mantiene el orden de inserción de las claves.
- Hashtable: Es similar a HashMap pero es sincronizada, lo que la hace segura para su uso en entornos con múltiples hilos.
## Métodos Principales:

- `put(K clave, V valor)`: Añade una pareja clave-valor al Map. Si la clave ya existe, sobrescribe el valor.
- `get(Object clave)`: Devuelve el valor asociado a la clave, o null si no existe.
- `remove(Object clave)`: Elimina la pareja clave-valor.
- `containsKey(Object clave)`: Devuelve true si el Map contiene la clave especificada.
- `keySet()`: Devuelve un conjunto de todas las claves del Map.
- `values()`: Devuelve una colección con todos los valores del Map.

# Palabras Reservadas o Java Keywords
https://www.javatpoint.com/java-keywords
## final
- En la declaración de una variable: la variable se convierte en una *constante*.
- En un método: no puede ser sobrescrito por una subclase.
- En una clase: no puede ser subclasificada (no puedes heredar de esa clase).

## static
Define miembros que pertenecen a la clase en lugar de a instancias.
## abstract
Define métodos y clases abstractos que deben ser implementados por subclases.
## synchronized
Asegura la exclusividad en el acceso a código crítico.
## transient
Evita que un campo sea serializado.
## volatile
Asegura la visibilidad de los cambios en variables en un entorno multihilo.
## this 
Referencia al objeto actual.
## super
Accede a los miembros de la clase padre.