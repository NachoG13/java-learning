

public class Perro extends Animal{
    Integer patas;
    public Perro(String name, Integer patas){
        super(name);
        this.patas = patas;
    }
    @Override
    public void doSound() {
        System.out.println("Hola soy " + super.name + " el perro" );
    }

    public void cantidadPatas(){
        System.out.println("Tengo " + patas +" patas");
    }
}
