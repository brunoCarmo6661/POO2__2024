package calculadora;

import java.util.Scanner;

public class OperacoesAvacandas implements IImpressao{
    private Double num01Double;
    private Double num02Double;
    private Double num03Double;
    private Double resultado;
    public OperacoesAvacandas() {

        
    }
    public OperacoesAvacandas(Double num01Double, Double num02Double, Double num03Double, Double resultado) {
        this.num01Double = num01Double;
        this.num02Double = num02Double;
        this.num03Double = num03Double;
        this.resultado = resultado;
    }
    public Double getNum01Double() {
        return num01Double;
    }
    public void setNum01Double(Double num01Double) {
        this.num01Double = num01Double;
    }
    public Double getNum02Double() {
        return num02Double;
    }
    public void setNum02Double(Double num02Double) {
        this.num02Double = num02Double;
    }
    public Double getNum03Double() {
        return num03Double;
    }
    public void setNum03Double(Double num03Double) {
        this.num03Double = num03Double;
    }
    public Double getResultado() {
        return resultado;
    }
    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public void CalculoMedia(){
        System.out.println();
        System.out.println("CALCULO MEDIA");
        Scanner entrada01 = new Scanner(System.in);
        System.out.println("digite um numero");
        Double n1 = entrada01.nextDouble();
        Scanner entrada02 = new Scanner(System.in);
        System.out.println("digite outro numero:");
        Double n2 = entrada02.nextDouble();
        Scanner entrada03 = new Scanner(System.in);
        System.out.println("digite mais um numero:");
        Double n3 = entrada03.nextDouble();

        Double r = ((n1+n2+n3)/3);
        this.num01Double = n1;
        this.num02Double = n2;
        this.num03Double = n3;
        this.resultado = r;
    }

    public void CalcuReajustePoupanca(){
        Scanner entrada01 = new Scanner(System.in);
        System.out.println();
        System.out.println("CALCULADORA RENDIMENTO POUPANÇA");
        System.out.println("digite o saldo da sua conta poupança");
        this.num01Double = entrada01.nextDouble();
        this.resultado = num01Double+(0.02*num01Double);
        System.out.println("Seu saldo com o rendimento será igual a >>");

    }

    public void CalcRetangulo(){
        
        Scanner entrada01 = new Scanner(System.in);
        System.out.println();
        System.out.println("CALCULO AREA E PERIMETRO");
        System.out.println("digite o valor em centimetros, da altura do retangulo: ");
        this.num01Double = entrada01.nextDouble();
        Scanner entrada02 = new Scanner(System.in);
        System.out.println("digite o valor em centimetros, da base do retangulo: ");
        this.num02Double = entrada02.nextDouble();
        Double perimetro = this.num01Double+this.num02Double;
        Double area = this.num01Double*this.num02Double;
        System.out.println();
        System.out.println("O perimetro total do retangulo é de "+perimetro+" centimetros");
        System.out.println("O area total do retangulo é de "+area+" centimetros");
        System.out.println();
    }

    public void CalcReajusteSalario(){
        System.out.println("CALCULO REAJUSTE SALARIAL");
        Scanner entrada01 = new Scanner(System.in);
        System.out.println("digite o valor, em reais, do seu sálario: ");
        this.num01Double = entrada01.nextDouble();
        Scanner entrada02 = new Scanner(System.in);
        System.out.println("digite o percentual de reajuste do sálario (%): ");
        this.num02Double = entrada02.nextDouble();
        Double reajuste = this.num01Double+((this.num02Double/100)*this.num01Double);
        System.out.println();
        System.out.println("O valor do seu sálario com o reajuste é de R$ "+reajuste);
        System.out.println();
    }

    public void ConversorTemperatura(){
        System.out.println("CONVERSOR DE TEMPERATURA");
        System.out.println("digite o valor, em °C: ");
        Scanner entrada01 = new Scanner(System.in);
        this.num01Double = entrada01.nextDouble();
        this.resultado = ((9*this.num01Double)+160)/5;
        System.out.println(this.num01Double+" graus Celsius é igual a "+this.resultado+" graus Fahrenheit");
    }

    public void CalcConsumo(){
        System.out.println();
        System.out.println("CALCULO DE CONSUMO");
        Scanner entrada01 = new Scanner(System.in);
        System.out.print("Informe o tempo de viagem (horas): ");
        this.num01Double = entrada01.nextDouble();
        Scanner entrada02 = new Scanner(System.in);
        System.out.print("Informe a velocidade média (km/h): ");
        this.num02Double = entrada02.nextDouble();

        double distancia = this.num01Double * this.num02Double;
        double consumo = distancia / 12.0;
        System.out.println();
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Consumo de combustível: " + consumo + " litros");
        System.out.println();

    }

    @Override
    public void Imprimir(){

        System.out.println();
        System.out.println("*************************");
        System.out.println(" VALOR =  "+this.resultado);
        System.out.println("*************************");
        System.out.println();
    }
}
