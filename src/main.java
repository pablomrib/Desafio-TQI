import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		String nome, cpf, rg, ba, email, autEmail;
		double renda;
		int N, senha, autSenha;
		
		/*Criação do cadastro*/
		
		System.out.println("Olá, para solicitar um empréstimo, precisamos criar uma conta! ");
		
		/*Criação da conta*/
		
		System.out.print("Qual seu nome? ");
		nome = sc.nextLine();
		System.out.print("Qual seu CPF? ");
		cpf = sc.nextLine();
		System.out.print("Qual seu RG? ");
		rg = sc.nextLine();
		System.out.print("Qual seu endereço? (Rua, número, bairro, complemento, cidade, estado e CEP respectivamente)");
		ba = sc.nextLine();
		System.out.print("Qual sua renda mensal? ");
		renda = sc.nextDouble();
		sc.nextLine();
		
		/*Criação do usuario e senha*/
		
		System.out.print("Digite seu e-mail para acesso: ");
		email = sc.nextLine();
		System.out.print("Crie uma senha de 4 dígitos: ");
		senha = sc.nextInt();
		sc.nextLine();
		
		/*Login*/
		
		System.out.println("Agora vamos fazer o login!");
		System.out.print("Digite seu e-mail: ");
		autEmail = sc.nextLine();
		System.out.print("Digite sua senha: ");
		autSenha = sc.nextInt();
		sc.nextLine();
		
		while (senha != autSenha || !email.equals(autEmail)) {
			
		System.out.println("Senha inválida, tente novamente");
		System.out.print("Digite seu e-mail: ");
		autEmail = sc.nextLine();
		System.out.print("Digite sua senha: ");
		autSenha = sc.nextInt();
		sc.nextLine();
		
		}
		
		/*empréstimo*/
		
		System.out.print("Quantos empréstimos você pretende solicitar?");
		N = sc.nextInt();
		
		int [] dia = new int[N];
		int [] mes = new int[N];
		int [] ano = new int[N];
		double [] valEmp = new double[N];
		int [] parc = new int[N];
		String [] apelido = new String[N];
		String autApelido;
		
		for (int i = 0; i < N; i++) {
			System.out.println("Para realizar o " + (i+1) + "º empréstimo, nos dê a data da primeira parcela (máximo de 3 mêses contando a partir do proximo dia).");
			
			System.out.println("Nos fale o dia da data em números: ");
			dia [i] = sc.nextInt();
			System.out.println("Nos fale o mês da data em números: ");
			mes [i] = sc.nextInt();
			System.out.println("Nos fale o ano da data em números: ");
			ano [i] = sc.nextInt();
			
			System.out.println("Qual o valor que você quer solicitar? ");
			valEmp [i] = sc.nextDouble();
			System.out.println("Qual o número de parcelas que você deseja? Lembrando que o máximo é 60. ");
			parc [i] = sc.nextInt();
			System.out.println("Dê um apelido para seu empréstimo: ");
			sc.nextLine();
			apelido [i] = sc.nextLine();
			
		}
		
		/*listagem de empréstimos*/
		
		System.out.println("Aqui está a listagem dos empréstimos realizados: ");
		
		for (int i = 0; i < N; i++) {
			System.out.println("Código do empréstimo: " + apelido [i] + " , Valor do empréstimo: " + valEmp [i] + " , Quantidade de parcelas: " + parc [i]);
		}
		
		System.out.println("Digite o apelido do empréstimo que você quer solicitar: ");
		autApelido = sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			if (apelido [i].equals(autApelido)) {
				System.out.println("Código do empréstimo: " + apelido [i]);
				System.out.println("Valor do empréstimo: " + valEmp [i]);
				System.out.println("Número de parcelas: " + parc [i]);
				System.out.println("Data da primeira parcela: " + dia [i] + "/" + mes [i] + "/" + ano [i]);
				System.out.println("E-mail: " + email);
				System.out.println("Renda: " + renda);
			}
		}
		
		
		sc.close();

	}

}
