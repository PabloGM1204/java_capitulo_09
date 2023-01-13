public class PruebaFraccion{
    public static void main(String[] args) {
        
        Fraccion primera = new Fraccion(10,2);
        Fraccion segunda = new Fraccion(20,5);

        
        System.out.println("Dividir");
        primera.dividir(segunda);
    }
}