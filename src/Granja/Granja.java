import javax.swing.JOptionPane;

public class Granja {
    public static void main(String[] args) {
        System.out.println("Te presento al perro de Nacho");
        String name = nameDog();
        Integer patas = legDog();
        
        
        Perro   perro = new Perro(name, patas);
        
        
        perro.doSound();
        perro.cantidadPatas();
       
    }
    public static Integer  legDog(){
        String  patas = JOptionPane.showInputDialog(null, "Cuántas patas quiere que tenga el perro?");
        try {
            return Integer.parseInt(patas);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error de variable" );
            return null;
        }
    }
    public static String nameDog(){
        String name = JOptionPane.showInputDialog(null, "Coloque el nombre del perro");
        return name;
    }
}