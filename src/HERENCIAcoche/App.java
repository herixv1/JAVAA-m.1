package HERENCIAcoche;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        carro c = null;
        int op;

        do {
            System.out.println("\n1 crear carro");
            System.out.println("2 mostrar carros");
            System.out.println("3 acelerar");
            System.out.println("4 subir marcha");
            System.out.println("5 frenar a 0");
            System.out.println("6 salir");
            System.out.print("opcion: ");
            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1:
                    System.out.print("matricula: ");
                    String m = sc.nextLine();

                    System.out.print("automatico s/n: ");
                    String r = sc.nextLine();

                    if (r.equalsIgnoreCase("s")) {
                        c = new carroautomatico(m);
                    } else {
                        c = new carromanual(m);
                    }

                    System.out.println(c);
                    break;

                case 2:
                    if (c != null) System.out.println(c);
                    else System.out.println("no hay carro");
                    break;

                case 3:
                    if (c != null) {
                        System.out.print("cuanto acelerar: ");
                        double a = Double.parseDouble(sc.nextLine());
                        c.acelerar(a);
                        System.out.println(c);
                    } else {
                        System.out.println("no hay carro");
                    }
                    break;

                case 4:
                    if (c instanceof carromanual) {
                        carromanual cm = (carromanual) c;
                        int nueva = cm.getMarcha() + 1;
                        cm.cambiaMarcha(nueva);
                        System.out.println(c);
                    } else {
                        System.out.println("automatico cambia solo");
                    }
                    break;

                case 5:
                    if (c != null) {
                        c.frenar(c.getVelocidad());
                        System.out.println(c);
                    } else {
                        System.out.println("no hay carro");
                    }
                    break;

            }

        } while (op != 6);

        sc.close();
    }
}