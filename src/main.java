import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import  java.util.Scanner;

public class main {
    public static void main(String[] args) {
        List<String> listaM = new ArrayList<>();
        List<String> listaF = new ArrayList<>();

        String continuar = "S";
        while(continuar.equalsIgnoreCase("S")){
            Scanner s = new Scanner(System.in);
            System.out.println("Qual o seu nome?");
            String name = s.nextLine()  ;

            //String[] partes = name.split(" ");



                s = new Scanner(System.in);
                System.out.println("Qual seu sexo? M para Masculino e F para Feminino");
                String sexo = s.next();

                    if (sexo.equalsIgnoreCase("M")) {
                        listaM.add(name);
                    } else if (sexo.equalsIgnoreCase("F")) {
                        listaF.add(name);
                    }

                s = new Scanner(System.in);
                System.out.println("Continuar?  S/N");
                continuar = s.next();


            Collections.sort(listaM);
            Collections.sort(listaF);


           // System.out.println(name);
           // System.out.println(sexo);
                System.out.println("Masculino" + listaM);
           // else
                System.out.println("Feminino:" + listaF);
        }
    }
}

