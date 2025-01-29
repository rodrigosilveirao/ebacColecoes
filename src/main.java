import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String name = s.next();

        s = new Scanner(System.in);
        System.out.println("Qual seu sexo?");
        String sexo = s.next();

        List<String> lista = new ArrayList<>();
        lista.add(name);
        lista.add(sexo);

        System.out.println(name);
        System.out.println(sexo);
        System.out.println(lista);
    }
}

