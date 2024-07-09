package Base;

public class Parse {
    public static void main(String[] args) {
        ///Parse Method
        //el método parse() recibe una cadena como entrada, 
        //"extrae" la información necesaria y la convierte en un objeto de la clase que llama.

        //parseInt(String s, int radix) -> se utiliza para obtener el tipo de datos primitivo de una cadena.
            //s -> cadena que representa un valor decimal con signo
            //radix -> la base de un sistema numérico. Ej: 2 (binario). No se pueden con flotantes. 
             int x = Integer.parseInt("10101001010101001010010",2);
             double c = Double.parseDouble("12");
             float d = Float.parseFloat("10");
             
             System.out.println(x);
             System.out.println(c);


             
            }
}
