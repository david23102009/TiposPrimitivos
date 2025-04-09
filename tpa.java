/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
public class tpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaração de variáveis primitivas
byte idade = 15; // Armazena números pequenos (-128 a 127)
short ano = 2025; // Armazena valores um pouco maiores 4 a 5 casas decimais(-32.760 a 32.767) 
int populacaoCidade = 50000; // Tipo mais comum para números (inteiros)
long populacaoMundial = 8000000000L; // Necessário 'L' para valores longos

float altura = 1.80f; // Necessário 'f' no final para indicar float
double peso = 64.5; // Mais preciso que float

char inicial = 'M'; // Armazena um único caractere, sempre entre aspas exemplo 'E'
boolean ativo =true; // Armazena verdadeiro(true) ou falso(false)

// Exibição dos valores
System.out.println("Idade: " + idade);
System.out.println("Ano: " + ano);
System.out.println("Poupulação da cidade: " + populacaoCidade);
System.out.println("População mundial: " + populacaoMundial);
System.out.println("Altura: " + altura + "m");
System.out.println("Peso: " + peso + "kg");
System.out.println("Inicial de nome: " + inicial);
System.out.println("Está ativo? " + ativo);
  }

    }
