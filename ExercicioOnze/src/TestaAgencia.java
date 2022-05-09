
public class TestaAgencia {
	public static void main(String[] args) {
		Agencia a1 = new Agencia ();
		a1.numero = "64";
		
		Conta c1 = new Conta();
		c1.numero = "54042";
		c1.saldo = 1000;
		c1.limite = 3000;
		c1.agencia = a1;
		
		System.out.println("numero da agencia: " + a1.numero);
		System.out.println("numero da conta: " + c1.numero );
		System.out.println("saldo da conta: " + c1.saldo);
		System.out.println("limite: " + c1.limite);
		System.out.println("agencia: " + a1);
	}

}
	