import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        String resultado = "";

        if (a.equals("vertebrado")) {

            if (b.equals("ave")) {
                if (c.equals("carnivoro")) {
                    resultado = "aguia";
                } else if (c.equals("onivoro")) {
                    resultado = "pomba";
                }

            } else if (b.equals("mamifero")) {
                if (c.equals("onivoro")) {
                    resultado = "homem";
                } else if (c.equals("herbivoro")) {
                    resultado = "vaca";
                }
            }

        } else if (a.equals("invertebrado")) {

            if (b.equals("inseto")) {
                if (c.equals("hematofago")) {
                    resultado = "pulga";
                } else if (c.equals("herbivoro")) {
                    resultado = "lagarta";
                }

            } else if (b.equals("anelideo")) {
                if (c.equals("hematofago")) {
                    resultado = "sanguessuga";
                } else if (c.equals("onivoro")) {
                    resultado = "minhoca";
                }
            }
        }

        System.out.println(resultado);

        sc.close();
    }
}
