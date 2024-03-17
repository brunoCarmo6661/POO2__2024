
import calculadora.Cadastro;
import calculadora.OperacoesAvacandas;
import calculadora.OperacoesBasicas;

public class App {

    public static void main(String[] args) throws Exception {
    
        /*EX01*/
        OperacoesBasicas s = new OperacoesBasicas();
        s.Somar();
        s.Imprimir();
    

        /*EX02*/
        OperacoesBasicas m = new OperacoesBasicas();
        m.Multiplicar();
        m.Imprimir();

        /*EX 03*/
        OperacoesAvacandas md = new OperacoesAvacandas();
        md.CalculoMedia();
        md.Imprimir();

        /*EX 04*/
        OperacoesBasicas a = new OperacoesBasicas();
        a.AntecessorSucessor();

        /*EX 05*/
        Cadastro c = new Cadastro();
        c.Cadastrar();
        c.Imprimir();

        /*EX 06*/
        OperacoesAvacandas cp = new OperacoesAvacandas();
        cp.CalcuReajustePoupanca();
        cp.Imprimir();

        /*EX 07*/
        OperacoesAvacandas ar = new OperacoesAvacandas();
        ar.CalcRetangulo();

        /*EX 08*/
        OperacoesAvacandas cs = new OperacoesAvacandas();
        cs.CalcReajusteSalario();

        /*EX 09*/
        OperacoesAvacandas ct = new OperacoesAvacandas();
        ct.ConversorTemperatura();

        /*EX 10*/
        OperacoesAvacandas cc = new OperacoesAvacandas();
        cc.CalcConsumo();

        
    }

}