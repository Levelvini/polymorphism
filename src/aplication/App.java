package aplication;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();
        System.out.println("entre com o numero de pessoas: ");
        int x = sc.nextInt();
        for (int i = 1;i<= x; i++){
            System.out.println("entre com os dados da pessoa numero "+i+ ":");
            System.out.println("é uma pessoa fisica ou juridica? (f/j)");
            char y = sc.next().charAt(0);
            System.out.println("entre com o nome: ");
            String name = sc.next();
            System.out.println("entre com a renda anual: ");
            double rendaAnual = sc.nextDouble();
            if (y == 'f'){
                System.out.println("entre com os gastos com saude: ");
                double gastosComSaude = sc.nextDouble();
                list.add(new PessoaFisica(name,rendaAnual,gastosComSaude));
            } else if (y == 'j') {
                System.out.println("entre com o numero de funcionarios: ");
                int numeroDeFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(name,rendaAnual,numeroDeFuncionarios));
            }
            for (Pessoa pessoa : list){
                System.out.println(pessoa.getName() + " $ - " + pessoa.rendaFinal(rendaAnual));
            }
        }
    }
}
