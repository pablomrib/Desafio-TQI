import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		String nome, cpf, rg, ba, email, autEmail;
		double renda;
		int N, senha, autSenha;
		
		/*Cria��o do cadastro*/
		
		System.out.println("Ol�, para solicitar um empr�stimo, precisamos criar uma conta! ");
		
		/*Cria��o da conta*/
		
		System.out.print("Qual seu nome? ");
		nome = sc.nextLine();
		System.out.print("Qual seu CPF? ");
		cpf = sc.nextLine();
		System.out.print("Qual seu RG? ");
		rg = sc.nextLine();
		System.out.print("Qual seu endere�o? (Rua, n�mero, bairro, complemento, cidade, estado e CEP respectivamente)");
		ba = sc.nextLine();
		System.out.print("Qual sua renda mensal? ");
		renda = sc.nextDouble();
		sc.nextLine();
		
		/*Cria��o do usuario e senha*/
		
		System.out.print("Digite seu e-mail para acesso: ");
		email = sc.nextLine();
		System.out.print("Crie uma senha de 4 d�gitos: ");
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
			
		System.out.println("Senha inv�lida, tente novamente");
		System.out.print("Digite seu e-mail: ");
		autEmail = sc.nextLine();
		System.out.print("Digite sua senha: ");
		autSenha = sc.nextInt();
		sc.nextLine();
		
		}
		
		/*empr�stimo*/
		
		System.out.print("Quantos empr�stimos voc� pretende solicitar?");
		N = sc.nextInt();
		
		int [] dia = new int[N];
		int [] mes = new int[N];
		int [] ano = new int[N];
		double [] valEmp = new double[N];
		int [] parc = new int[N];
		String [] apelido = new String[N];
		String autApelido;
		
		for (int i = 0; i < N; i++) {
			System.out.println("Para realizar o " + (i+1) + "� empr�stimo, nos d� a data da primeira parcela (m�ximo de 3 m�ses contando a partir do proximo dia).");
			
			System.out.println("Nos fale o dia da data em n�meros: ");
			dia [i] = sc.nextInt();
			System.out.println("Nos fale o m�s da data em n�meros: ");
			mes [i] = sc.nextInt();
			System.out.println("Nos fale o ano da data em n�meros: ");
			ano [i] = sc.nextInt();
			
			System.out.println("Qual o valor que voc� quer solicitar? ");
			valEmp [i] = sc.nextDouble();
			System.out.println("Qual o n�mero de parcelas que voc� deseja? Lembrando que o m�ximo � 60. ");
			parc [i] = sc.nextInt();
			System.out.println("D� um apelido para seu empr�stimo: ");
			sc.nextLine();
			apelido [i] = sc.nextLine();
			
		}
		
		/*listagem de empr�stimos*/
		
		System.out.println("Aqui est� a listagem dos empr�stimos realizados: ");
		
		for (int i = 0; i < N; i++) {
			System.out.println("C�digo do empr�stimo: " + apelido [i] + " , Valor do empr�stimo: " + valEmp [i] + " , Quantidade de parcelas: " + parc [i]);
		}
		
		System.out.println("Digite o apelido do empr�stimo que voc� quer solicitar: ");
		autApelido = sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			if (apelido [i].equals(autApelido)) {
				System.out.println("C�digo do empr�stimo: " + apelido [i]);
				System.out.println("Valor do empr�stimo: " + valEmp [i]);
				System.out.println("N�mero de parcelas: " + parc [i]);
				System.out.println("Data da primeira parcela: " + dia [i] + "/" + mes [i] + "/" + ano [i]);
				System.out.println("E-mail: " + email);
				System.out.println("Renda: " + renda);
			}
		}
		
		
		sc.close();

	}

}
