public class PruebaPiramideRectangulo{
    public static void main(String[] args) {
        Piramide p = new Piramide(4);
        Rectangualo r1 = new Rectangualo(3, 4);
        Rectangualo r2 = new Rectangualo(2, 6);
        System.out.println(p);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Pirámides creadas: " + Piramide.getPiramidesCreadas());
        System.out.println("Rectángulos creados: " + Rectangualo.getContadorRectangulo());
    }
}