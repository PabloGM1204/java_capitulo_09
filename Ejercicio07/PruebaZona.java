import java.util.Scanner;
public class PruebaZona{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zona sala = new Zona(1000);
        Zona compra = new Zona(200);
        Zona vip = new Zona(25);
        int n = 0;
        int op = 0;
        do{
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                System.out.println("De la zona de sala principal quedan: "+sala.getEntradasPorVender());
                System.out.println("De la zona de compra-venta quedan: "+compra.getEntradasPorVender());
                System.out.println("De la zona de VIP quedan: "+vip.getEntradasPorVender());
                    break;
                case 2:
                    System.out.print("De que zona quiere comprar (1-Sala principal, 2-Compra-Venta, 3-VIP): ");
                    int opz = sc.nextInt();
                    switch (opz) {
                        case 1:
                            System.out.print("¿Cuantas quiere comprar? ");
                            n = sc.nextInt();
                            sala.vender(n);
                            break;
                        case 2:
                            System.out.print("¿Cuantas quiere comprar? ");
                            n = sc.nextInt();
                            compra.vender(n);
                            break;
                        case 3:
                            System.out.print("¿Cuantas quiere comprar? ");
                            n = sc.nextInt();
                            vip.vender(n);
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                System.out.println("Adios.");
                    break;
                default:
                    break;
            }
        }while(op != 3);
    }
}