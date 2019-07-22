import java.util.Scanner;
public class Circula {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String dia = "", holograma, ultimo, hoy;

        System.out.println("Buenas, �sta aplicaci�n tiene el prop�sito de evitar sanciones debido a que no circula tu coche");
        System.out.println("Indica el holograma de tu coche");
        holograma = lector.nextLine();

        switch (holograma) {
            case "00":

                System.out.println("No te preocupes, c�rculas hoy y todos los d�as, buen viaje.");
                break;

            case "0":

                System.out.println("No te preocupes, c�rculas hoy y todos los d�as, buen viaje.");
                break;

            case "1":
                System.out.println("Proporciona el �ltimo d�gito de tu placa");
                ultimo = lector.nextLine();

                System.out.println("�Qu� d�a es hoy?");
                dia = lector.nextLine();

                if (dia.equals("sabado")) {
                    System.out.printf("Hoy sabado %s", sabadaba1(ultimo));
                } else {
                    hoy = holo(ultimo);
                    if (hoy.equals(dia)) {
                        System.out.printf("Hoy %s no circulas", dia);
                    } else {
                        System.out.printf("Hoy %s si circulas", dia);
                    }
                }
                break;

            case "2":
                System.out.println("Proporciona el �ltimo d�gito de tu placa");
                ultimo = lector.nextLine();

                System.out.println("�Qu� d�a es hoy?");
                dia = lector.nextLine();

                if (dia.equals("sabado")) {
                    System.out.printf("Por ser holograma 2, ningun sabado circulas :( ");
                } else {

                    hoy = holo(ultimo);
                    if (hoy.equals(dia)) {
                        System.out.printf("Hoy %s no circulas", dia);
                    } else {
                        System.out.printf("Hoy %s si circulas", dia);
                    }
                }
                break;


            case "foraneo":
                System.out.println("Proporciona el �ltimo d�gito de tu placa");
                ultimo = lector.nextLine();

                System.out.println("�Qu� d�a es hoy?");
                dia = lector.nextLine();
                if (dia.equals("sabado")) {
                    System.out.printf("Por tener placas foraneas, ningun sabado circulas :( ");
                } else {

                    hoy = holo(ultimo);
                    if (hoy.equals(dia)) {
                        System.out.printf("Hoy %s no circulas", dia);
                    } else {
                        System.out.printf("Hoy %s si circulas", dia);
                    }
                }
                break;
        }
    }

    public static String holo(String u) {
        String nocircula = "";

        if (u.equals("1") || u.equals("2")) {
            nocircula = "jueves";
        } else if (u.equals("3") || u.equals("4")) {
            nocircula = "miercoles";
        } else if (u.equals("5") || u.equals("6")) {
            nocircula = "lunes";
        } else if (u.equals("7") || u.equals("8")) {
            nocircula = "martes";
        } else if (u.equals("9") || u.equals("0")) {
            nocircula = "viernes";
        } else {
            System.out.println("Porfavor ingresa un numero v�lido");
        }
        return nocircula;

    }
    public static String sabadaba1(String u) {
        int n, nsab;
        String respuesta = "";
        Scanner lector = new Scanner(System.in);
        n = Integer.valueOf(u);
        System.out.println("Indica el n�mero de s�bado del mes");
        nsab = lector.nextInt();

        if (n % 2 == 0) {
            if (nsab == 1 || nsab == 3) {
                respuesta = "no circulas";
            } else {
                respuesta = "si circulas";
            }
        } else {
            if (nsab == 2 || nsab == 4) {
                respuesta = "no circulas";
            } else {
                respuesta = "si circulas";
            }
        }
        return respuesta;
    }
}