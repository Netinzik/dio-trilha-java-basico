package Conta;

import java.util.Locale;
import java.util.Scanner;

/**Classe que representa uma conta bancária.
* @author Sebastião Neto
* @version 1.0
* @since Release 01 da aplicação
*/
public class ContaTerminal {
    private int number; // Número da conta
    private String agency; // Agência bancária
    private String name; // Nome do titular da conta
    private double balance; // Saldo da conta

    /**
     * Obtém o número da agência.
     * @return O número da agência.
     */
    public String getAgency() {
        return agency;
    }

    /**
     * Obtém o nome do titular da conta.
     * @return O nome do titular da conta.
     */
    public String getName() {
        return name;
    }

    /**
     * Obtém o número da conta.
     * @return O número da conta.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Obtém o saldo da conta.
     * @return O saldo da conta.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Define o número da agência.
     * @param agency O número da agência.
     */
    public void setAgency(String agency) {
        this.agency = agency;
    }

    /**
     * Define o nome do titular da conta.
     * @param name O nome do titular da conta.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Define o número da conta.
     * @param number O número da conta.
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Define o saldo da conta.
     * @param balance O saldo da conta.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Construtor padrão da classe.
     */
    public ContaTerminal() {
    }

    /**
     * Sobrescrita do método toString para retornar uma representação da conta.
     * @return Uma string representando a conta.
     */
    @Override
    public String toString(){
        return "Olá " + getName() +", obrigado por criar uma conta em nosso banco, sua agência é " + getAgency() + ", conta " + getNumber() + " e seu saldo " + getBalance() + " já está disponível para saque";
    }

    /**
     * Método principal para executar o programa.
     * @param args Argumentos da linha de comando (não são utilizados neste programa).
     * @throws Exception Se ocorrer um erro durante a execução.
     */
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in).useLocale(Locale.US);
        ContaTerminal conta = new ContaTerminal();
        System.out.println("Olá, insira seu nome!");
        conta.setName(read.nextLine());
        System.out.println("Por favor "+ conta.getName() + ", digite o número da Agência!");
        conta.setAgency(read.nextLine());
        System.out.println("Por favor "+ conta.getName() + ", digite o número da Conta!");
        conta.setNumber(read.nextInt());
        System.out.println("Por favor "+ conta.getName() + ", digite o saldo da Conta!");
        conta.setBalance(read.nextDouble());
        read.close();

        System.out.println(conta);
    }
}
