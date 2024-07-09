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

### Conversión de datos

No se puede almacenar una variable de un tipo de dato menor al de una suma de tipos de datos mayores.
byte myByte =  myInt1 +  myInt2;

## Parse()
Recibe una cadena como entrada, "extrae" la información necesaria y la convierte en un objeto de la clase que llama

`Parse[tipo de dato](String s, int radix)` -> se utiliza para obtener el tipo de datos primitivo de una cadena.
 - `s` -> cadena que representa un valor decimal con signo
 - `radix` -> la base de un sistema numérico. Ej: 2 (binario). *No se pueden con flotantes.*