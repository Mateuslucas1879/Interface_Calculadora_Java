import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.print("Digite um numero: " );
        int num_one = numero.nextInt();

        System.out.print("Digite outro numero: " );
        int num_two = numero.nextInt();

        System.out.println("[1]SOMA\n[2]SUBTRAÇÃO\n[3]MULTIPLICAÇÃO\n[4]DIVISÃO");
        System.out.print("Qual operação deseja efetuar: ");
        int operacao = numero.nextInt();

        if(operacao == 1){
            int soma = num_one + num_two;
            System.out.println("O valor e: " + soma);

        }else if (operacao == 2) {
            int subtrai = num_one - num_two;
            System.out.println("O valor e: " + subtrai);
        } else if (operacao == 3) {
            int multiplica = num_one * num_two;
            System.out.println("O valor e: " + multiplica);
        } else{
            int divide = num_one / num_two;
            System.out.println("O valor e: " + divide);
        }
        numero.close();




        //System.out.println("Os numeros digitados foram: "+ num + num02);


    }
}
