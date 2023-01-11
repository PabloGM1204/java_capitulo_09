public class Prueba{
    public static void main(String[] args) {
        
        Caballo r = new Caballo("Rocinante", "Blanco", 12);
        Caballo v = new Caballo("Vicente", "Gris", 17);

        System.out.println("Este caballo se llama "+r.getNombre());
        r.relinchar();
        r.cabalgar();
        r.rumiar();

        System.out.println("\nEste caballo se llama "+v.getNombre());
        v.relinchar();
        v.cabalgar();
        r.rumiar();
    }
}