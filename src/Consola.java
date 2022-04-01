import java.util.ArrayList;
import java.util.Scanner;

public class Consola {
        
        private static int asientosLibres = 30;
        private static int asientosVendidos = 0;
        private static int totalRecaudado = 0;
    private static int opcionSeleccionada;
    
    public final static int OPCION_MENU_ENTRADAS_DISPONIBLES = 1;
    public final static int OPCION_MENU_COMPRAR_ENTRADAS = 2;
    public final static int OPCION_MENU_ENTRADAS_VENDIDAS = 3;
    public final static int OPCION_MENU_VENTA_RECAUDADA = 4;
    public final static int OPCION_MENU_SALIR = 5;
    

        public static void main(String[] args) {
                // TODO Auto-generated method stub
                 //CONSTANTES
                
        do {
                opcionSeleccionada = menu();
                        switch (opcionSeleccionada) {
                        case OPCION_MENU_ENTRADAS_DISPONIBLES:
                                entradasDisponibles();
                                break ;
                        case OPCION_MENU_COMPRAR_ENTRADAS :
                                compraEntrada();
                                break;         
                        case OPCION_MENU_ENTRADAS_VENDIDAS:
                                entradasVendidas();
                                break;         
                        case OPCION_MENU_VENTA_RECAUDADA:
                                verVentaRecaudada();
                                break;
                        
                        } 
                                                
                }while (opcionSeleccionada != OPCION_MENU_SALIR);
                
        }

        private static int menu() {
                
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nMENU TEATRO PUNTO TICKET \n****************************" );
        System.out.println("[1.] ENTRADAS DISPONIBLES ");
        System.out.println("[2.] COMPRAR ENTRADAS ");
        System.out.println("[3.] ENTRADAS VENDIDAS");
        System.out.println("[4.] VENTAS TOTALES RECAUDADAS");
        System.out.println("[5.] SALIR ");
        System.out.println("__________________________________________________________\n");
        System.out.println("[Seleccione su opción]");
        
        int opcionSeleccionada = scan.nextInt();
        
        return opcionSeleccionada;
        
        }

        public static void verVentaRecaudada() {
            System.out.println("Venta total entradas : " + totalRecaudado );
        }

        public static void entradasVendidas() {
                System.out.println("Se han vendido : " + asientosVendidos + " Asientos");
        }

        public static void entradasDisponibles() {
                System.out.println("Quedan : " + asientosLibres + " Asientos disponibles");
        }

        public static void compraEntrada() {
                
                Scanner scan = new Scanner(System.in);
                        int precio = 3000;
                        
                        if (asientosLibres == 0) {
                                System.out.println("NO HAY ASIENTOS LIBRES");
                        } else {
                                System.out.println("Indique cuantas entradas desea: ");
                                int cantidadEntradas = scan.nextInt();
                                if (cantidadEntradas > asientosLibres) {
                                        System.out.println("NO HAY ASIENTOS LIBRES");
                                } else {
                                                precio = (precio * cantidadEntradas);
                                                System.out.println("VENTA REALIZADA. PRECIO FINAL: " + precio);
                                        }
                                        asientosLibres = asientosLibres - cantidadEntradas;
                                        asientosVendidos = asientosVendidos + cantidadEntradas;
                                        totalRecaudado = 3000 * asientosVendidos;
                                        
                                        System.out.println("QUEDAN " + asientosLibres + " asientos.");
                                        
                                }
                
                        }
                        
                
        

}