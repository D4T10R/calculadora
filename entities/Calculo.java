package entities;

import java.util.Scanner;

public class Calculo {
    
    private static Integer v1;
    private static Integer v2;

    // CONSTRUTORES
    public Calculo (){
    }

    public Calculo(Integer valor1, Integer valor2) {
        this.v1 = valor1;
        this.v2 = valor2;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public Integer getV1() {
        return v1;
    }
    public void setV1(Integer v1) {
        this.v1 = v1;
    }
    public Integer getV2() {
        return v2;
    }
    public void setV2(Integer v2) {
        this.v2 = v2;
    }
    // ENCAPSULAMENTO

    // METODOS


    /**
     * 
     */
    public static void operacao() {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("-----------------calculadora do datior----------------");
        System.out.println("------------------------------------------------------");
        System.out.print("\nPrimeiro numero: ");
        v1 = sc.nextInt();
        System.out.print("\nSegundo numero: ");
        v2 = sc.nextInt();
        System.out.println("\n------------------------------------------------------");
        System.out.println("***** Selecione uma operação que deseja realizar *****");
        System.out.println("------------------------------------------------------");
        System.out.println("|   Opção 1 - Somar         |");
        System.out.println("|   Opção 2 - Subtrair      |");
        System.out.println("|   Opção 3 - Multiplicar   |");
        System.out.println("|   Opção 4 - Dividir       |");
        System.out.println("|   Opção 5 - Elevação      |");
        System.out.println("|   Opção 6 - Raiz quadrada |");
        System.out.println("|   Opção 7 - Sair          |");
        int escolha = sc.nextInt();

        switch (escolha){

            case 1:
                somar();
                break;
            case 2:
                subtrair();
                break;
            case 3:
                multiplicar();
                break;
            case 4:
                dividir();
                break;
            case 5:
                elevacao();
                break;
            case 6:
                raiz_quadrada();
                break;
            case 7: 
                System.out.println("Finalizando o programa...");
                System.exit(0);
            default:
                System.out.println("Escolha inválida!");
                operacao();
                break;
        }
        
        
        
    }
    

    public static Integer somar(Integer valor1, Integer valor2) {
        return valor1 + valor2;
    }

}
