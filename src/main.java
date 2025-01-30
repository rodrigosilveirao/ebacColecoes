import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<String> listaM = new ArrayList<>();
        List<String> listaF = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String name = s.next();


        s = new Scanner(System.in);
        System.out.println("Qual seu sexo? M para Masculino e F para Feminino");
        String sexo = s.next();

        if (sexo.equalsIgnoreCase("M")) {
            listaM.add(name);
        } else if (sexo.equalsIgnoreCase("F")) {
            listaF.add(name);
        }

        System.out.println(name);
        System.out.println(sexo);
        System.out.println(listaM);
        System.out.println(listaF);

    }
}

