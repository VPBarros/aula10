import java.util.Locale;
import java.util.Scanner;

public class App {
//logica de programação Vetor
	//programa para ler valor de N será a quantidade de nomes e depois imprimir a quantidade de nomes de N pessoas
	//enter mostrar numeros lidos.
    public static void main(String[] args) throws Exception {
        System.out.println("Digite numero de quantos nomes imprimir: ");
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[]nomes = new String[N];
	//(for (formula basica)	
		for (int i=0; i<N; i++) {
			nomes [i]= sc.next();
		}
	System.out.println("nomes lidos: ")	;
	 for (String s : nomes) {
		 System.out.println(s);
	}
    sc.close();

    }
}
