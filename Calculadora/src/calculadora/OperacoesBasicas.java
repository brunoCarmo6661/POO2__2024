package calculadora;

import java.util.Scanner;

public class OperacoesBasicas implements IImpressao{
    private int num01;
    private int num02;
    private int resultado;

    
    public OperacoesBasicas() {
    }


    public OperacoesBasicas(int num01, int num02) {
        this.num01 = num01;
        this.num02 = num02;
    }


    public int getNum01() {
        return num01;
    }


    public void setNum01(int num01) {
        this.num01 = num01;
    }


    public int getResultado() {
        return resultado;
    }
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }


    public int getNum02() {
        return num02;
    }

    public void setNum02(int num02) {
        this.num02 = num02;
    }

    public void Somar (){
    System.out.println("SOMA DOIS NUMEROS");
        Scanner entrada01 = new Scanner(System.in);
        System.out.println("digite um numero");
        int n1 = entrada01.nextInt();
        Scanner entrada02 = new Scanner(System.in);
        System.out.println("digite outro numero:");
        int n2 = entrada02.nextInt();
        int r = n1+n2;
        this.num01 = n1;
        this.num02 = n2;
        this.resultado = r;
    }

    public void Multiplicar(){
        System.out.println("MULTIPLICADOR DE DOIS NUMEROS");
        Scanner entrada01 = new Scanner(System.in);
        System.out.println("digite um numero");
        int n1 = entrada01.nextInt();
        Scanner entrada02 = new Scanner(System.in);
        System.out.println("digite outro numero:");
        int n2 = entrada02.nextInt();
        int r = n1*n2;
        this.num01 = n1;
        this.num02 = n2;
        this.resultado = r;
    }

    public void AntecessorSucessor(){
        System.out.println();
        System.out.println("ANTECESSOR E SUCESSOR DE UM NUEMRO");
        Scanner entrada01 = new Scanner(System.in);
        System.out.println("digite um numero");
        int n1 = entrada01.nextInt();
        this.num01 = n1;
        int ant = num01-1;
        int suc = num01+1;
        System.out.println();
        System.out.println("O numero digitado foi "+this.num01+" seu antecessor é "+ant+" e seu sucessor é "+suc);
        System.out.println();

    }

    @Override
    public void Imprimir(){
        System.out.println();
        System.out.println("*************************");
        System.out.println(" O resultado é igual a: "+this.resultado);
        System.out.println("*************************");
        System.out.println();
    }
    

}
