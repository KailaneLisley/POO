//Exercício de Programação 01 | Programação Orientada a Objetos
//Aluna: Kailane Lisley de Araújo Silva | RA: 00000851345

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class Main {
//Código não otimizado nas questões de 1 a 4 e Otimzação do Código nas questões 5 a 7
    
    //Questão 5
    public static float calcularMedia(ArrayList<Float> notas) {
        if (notas.isEmpty()) return 0;
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
    
    
    // Questão 6
    public static String classificarAluno(float media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Final";
        } else {
            return "Reprovado";
        }
    }
    public static void main(String[] args) {
        //System.out.println("\nSejam todos bem vindos ao primeiro dia de aula!\n");
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        ArrayList<ArrayList<Float>> notasTurma = new ArrayList<>();
        /*
        System.out.printf("Vamos começar o processo de pre-matrecula\n");
        System.out.print("Nome do Aluno(a): ");
        String nome = ler.nextLine();
        int numeroAleatorio = random.nextInt(9000) + 1000; 
        System.out.printf("\nBem vindo(a) a escola %s!\n", nome);
        System.out.printf("Voce esta matriculado.\nSua matricula e %d\n", numeroAleatorio);
        
        System.out.printf("\nCAlCULANDO A MEDIA\n");
    
        float n1, n2, n3, media;
        System.out.printf("Nota 01: ");
        n1 = ler.nextFloat();
        System.out.printf("Nota 02: ");
        n2 = ler.nextFloat();
        System.out.printf("Nota 03: ");
        n3 = ler.nextFloat();
        media = (n1+n2+n3)/3;
        System.out.printf("Sua media e %.2f\n", media);

        //4º Questão - Otimização na 6º Questão
        if(media<7){
            System.out.printf("Aluno REPROVADO!\n");
        }
        else{
            System.out.printf("Aluno APROVADO!\n");
        }

        ler.close();
    }

    */
        System.out.println("\nBem-vindo ao Sistema de Registro de Notas!\n");
        while (true) {
            System.out.print("Nome do aluno ('sair' para finalizar): ");
            String nome = ler.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            int numeroAleatorio = random.nextInt(9000) + 1000;
            System.out.printf("\nBem-vindo(a) %s! Sua matrícula é: %d\n", nome, numeroAleatorio);

            ArrayList<Float> notas = new ArrayList<>();
            while (true) {
                System.out.print("Digite a nota (-1 para finalizar): ");
                float nota = ler.nextFloat();
                ler.nextLine(); 
                if (nota == -1) {
                    break;
                }
                notas.add(nota);
            }
            
            float media = calcularMedia(notas);
            String classificacao = classificarAluno(media);
            
            System.out.printf("Aluno: %s | Média: %.2f | Status: %s%n\n", nome, media, classificacao);
            notasTurma.add(notas);
        }
        
        float somaMedias = 0;
        for (ArrayList<Float> notasAluno : notasTurma) {
            somaMedias += calcularMedia(notasAluno);
        }
        if (!notasTurma.isEmpty()) {
            System.out.printf("\nMédia da turma: %.2f%n", somaMedias / notasTurma.size());
        } else {
            System.out.printf("\nNenhuma nota foi registrada.");
        }
        
        ler.close();
    }
}
