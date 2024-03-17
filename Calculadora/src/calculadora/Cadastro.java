package calculadora;
import java.util.Scanner;
public class Cadastro implements IImpressao {
    private String nome;
    private String endereço;
    private int telefone;

    public Cadastro() {

        
    }
    public Cadastro(String nome, String endereço, int telefone) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
    public void Cadastrar(){
        Scanner entrada01 = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        this.nome = entrada01.nextLine();
        Scanner entrada02 = new Scanner(System.in);
        System.out.println("digite seu endereço: ");
        this.endereço = entrada01.nextLine();
        Scanner entrada03 = new Scanner(System.in);
        System.out.println("digite seu telefone: ");
        this.telefone = entrada01.nextInt();

        }
    @Override
    public void Imprimir(){
        System.out.println();
        System.out.println("seu nome é: "+this.nome);
        System.out.println("você reside no endereço: "+this.endereço);
        System.out.println("seu o número do seu telefone é: "+this.telefone);
        System.out.println();
        }
}



