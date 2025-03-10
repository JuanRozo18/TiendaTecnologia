import javax.lang.model.element.NestingKind;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean continuar = true;
        String nombre;
        String telefono;
        String fecha;
        int ram = 0;
        int discos = 0;
        int monitores = 0;
        int teclados = 0;
        int mauses = 0;
        int totalDiscos = 0;
        int totalRam = 0;
        int totalMonitor = 0;
        int totalTeclados = 0;
        int totalMauses = 0;
        int subtotal = 0;

        while(continuar){

            System.out.println("--Tienda Tecnologia--");
            System.out.println("Seleccione una opcion: ");
            System.out.println("1. Mouse");
            System.out.println("2. Teclados");
            System.out.println("3. Monitor");
            System.out.println("4. Discos Duros");
            System.out.println("5. RAM");
            System.out.println("6. Salir");

            int opcion = teclado.nextInt();


            switch (opcion) {
                case 1 -> {
                    System.out.println("Cuantos mause desea comprar? ");
                    System.out.println("Unidad a 80.000");
                    mauses = teclado.nextInt();
                }
                case 2 -> {
                    System.out.println("Cuantos teclados desea comprar? ");
                    System.out.println("Unidad a 320.000");
                    teclados = teclado.nextInt();
                }
                case 3 -> {
                    System.out.println("Cuantos monitores desea comprar?");
                    System.out.println("Unidad a 940.000");
                    monitores = teclado.nextInt();
                }
                case 4 -> {
                    System.out.println("Cuantos discos duros desea comprar? ");
                    System.out.println("Unidad a 230.000");
                    discos = teclado.nextInt();
                }
                case 5 -> {
                    System.out.println("Cuantas ram desea comprar? ");
                    System.out.println("Unidad a 180.000");
                    ram = teclado.nextInt();
                }
                case 6 -> {
                    System.out.println("Ingrese su nombre: ");
                    nombre = teclado.next();
                    System.out.println("Ingrese su numero telefonico: ");
                    telefono = teclado.next();
                    System.out.println("Ingrese fecha DD/MM/AA ");
                    fecha = teclado.next();

                    System.out.println("---Factura venta---");
                    System.out.println("-------------------------------------");
                    System.out.println("Nombre cliente: "+ nombre);
                    System.out.println("Telefono: " + telefono);
                    System.out.println("Fecha compra: " + fecha);
                    System.out.println("-------------------------------------");
                    if (mauses >= 0) {
                        System.out.println("Producto: Mause");
                        System.out.println("Cantidad: " + mauses);
                        System.out.println("Valor unidad: 80000");
                        totalMauses = mauses * 80000;
                        System.out.println("Valor total: " + totalMauses);
                    }if (teclados >= 0) {
                        System.out.println("Producto: Teclado");
                        System.out.println("Cantidad: " + teclados);
                        System.out.println("Valor unidad: 320000");
                        totalTeclados = teclados * 320000;
                        System.out.println("Valor total: " + totalTeclados);
                    }if (monitores >= 0) {
                        System.out.println("Producto: Monitor");
                        System.out.println("Cantidad: " + monitores);
                        System.out.println("Valor unidad: 940000");
                        totalMonitor = monitores + 940000;
                        System.out.println("Valor total: " + totalMonitor);
                    }if (discos >= 0) {
                        System.out.println("Producto: Disco Duro");
                        System.out.println("Cantidad: " + discos);
                        System.out.println("Valor unidad: 230000");
                        totalDiscos = discos * 230000;
                        System.out.println("Valor total: " + totalDiscos);
                    }if (ram >= 0) {
                        System.out.println("Producto: RAM");
                        System.out.println("Cantidad: " + ram);
                        System.out.println("Valor unidad: 180000");
                        totalRam = ram * 180000;
                        System.out.println("Valor total: " + totalRam);
                    }
                    System.out.println("__________________________________");
                    subtotal = totalMauses + totalTeclados + totalMonitor + totalDiscos + totalRam;
                    System.out.println("Subtotal: " + subtotal);
                    System.out.println("Iva 16%: " + subtotal * 0.16);
                    System.out.println("Total: " + subtotal * 0.16 + subtotal);



                    continuar = false;
                }
            }
        }



    }
}