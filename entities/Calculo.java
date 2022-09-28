package entities;

import java.util.Scanner;

public class Calculo {
    
    private int v1;
    private int v2;

    // CONSTRUTORES
    public Calculo (){
    }

    public Calculo(int valor1, int valor2) {
        this.v1 = valor1;
        this.v2 = valor2;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public int getV1() {
        return v1;
    }
    public void setV1(int v1) {
        this.v1 = v1;
    }
    public int getV2() {
        return v2;
    }
    public  void setV2(int v2, int i) {
        this.v2 = v2;
    }
    // ENCAPSULAMENTO

    // METODOS
    /**
     * @return
     */
    public  int operacao() {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------------------");
        System.out.println("-----------------calculadora do datior----------------");
        System.out.println("------------------------------------------------------");
        System.out.print("\nPrimeiro numero: ");
        setV1(sc.nextInt());
        System.out.print("\nSegundo numero: ");
        setV2(sc.nextInt(), v2);
        System.out.println("***** Selecione uma operação que deseja realizar *****");    
        System.out.println("\n|   Opção 1 - Somar         | "+
        "\n|   Opção 2 - Subtrair      |" +
        "\n|   Opção 3 - Multiplicar   |" +
        "\n|   Opção 4 - Dividir       |" +
        "\n|   Opção 5 - Elevação      |" +
        "\n|   Opção 6 - Raiz quadrada |" +
        "\n|   Opção 7 - Sair          |");
        int selecao = sc.nextInt();

        switch(selecao) {
            case 1:
                int soma = getV1() + getV2();
                System.out.printf("A soma entre %d + %d =", getV1(), getV2(), soma);
                return soma;
                break;
            case 2:


        }


        return 1;
    }
    

   
}
