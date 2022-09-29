package entities;

import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

import java.lang.Math;

public class Calculo {
    
    private double v1;
    private double v2;

    // CONSTRUTORES
    public Calculo (){
    }

    public Calculo(Double valor1, Double valor2) {
        this.v1 = valor1;
        this.v2 = valor2;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public double getV1() {
        return v1;
    }
    public void setV1(Double v1) {
        this.v1 = v1;
    }
    public double getV2() {
        return v2;
    }
    public  void setV2(Double v2) {
        this.v2 = v2;
    }
    // ENCAPSULAMENTO

    // METODOS
    /**
     * @return
     */
    public  int operacao() {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\n------------------------------------------------------");
        System.out.println("-----------------calculadora do datior----------------");
        System.out.println("------------------------------------------------------");
        System.out.print("\nPrimeiro numero: ");
        setV1(sc.nextDouble());
        System.out.print("\nSegundo numero: ");
        setV2(sc.nextDouble());
        System.out.println("\n------------------------------------------------------");
        System.out.println("***** Selecione uma operação que deseja realizar *****");
        System.out.println("------------------------------------------------------");    
        System.out.println("\n|   Opção 1 - Somar         | "+
        "\n|   Opção 2 - Subtrair      |" +
        "\n|   Opção 3 - Multiplicar   |" +
        "\n|   Opção 4 - Dividir       |" +
        "\n|   Opção 5 - Elevação      |" +
        "\n|   Opção 6 - Raiz quadrada |" +
        "\n|   Opção 7 - Sair          |");
        System.out.print("Qual sua opção? ");
        int selecao = sc.nextInt();

        switch(selecao) {
            case 1:
                Double resultado = somaNum(getV1(), getV2());
                System.out.printf("\nA soma entre %.2f + %.2f = %.2f\n", getV1(), getV2(), resultado);
                return operacao();
               
            case 2:
                resultado = subNum(getV1(), getV2());
                System.out.printf("A subtração entre %.2f - %.2f = %.2f", getV1(), getV2(), resultado);
                return operacao();
               
            case 3: 
                resultado = multNum(getV1(), getV2());
                System.out.printf("A multiplicação entre %.2f x %.2f = %.2f", getV1(), getV2(), resultado);
                return operacao();
               
            case 4: 
                resultado = divNum(getV1(), getV2());
                System.out.printf("A divisao entre %.2f / %.2f = %.2f", getV1(), getV2(), resultado);
                return operacao();
                
            case 5: 
                resultado = elevNum(getV1(), getV2());
                System.out.printf("A elevação de %.2f ^ %.2f = %.2f", getV1(), getV2(), resultado);
                return operacao();
                
            default: 
                System.out.println("Erro");
                break;
        }


        return 1;
    }

    public Double somaNum(Double v1, Double v2) {
        return v1 + v2;
    }
    
    public Double subNum(Double v1, Double v2) {
        return v1 - v2;
    }

    public Double multNum(Double v1, Double v2) {
        return v1 * v2;
    }
    
    public double divNum(Double v1, Double v2) {
        return v1 / v2;
    }

    public Double elevNum(Double v1, Double v2) {
        return Math.pow(v1, v2);
    }

}
