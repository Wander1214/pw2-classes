
public class TestaCliente {
	public static void main(String[] args) {
		Cliente c1= new Cliente();
		c1.nome = "horacio";
		c1.statuscliente = StatusCliente.ATIVO;
		
		Cartao ct1 = new Cartao();
		ct1.tipo = TipoCartao.CREDITO;
		ct1.numero = 3288;
		ct1.datavale = "20/8/2029";
		ct1.titular = c1;
		
		System.out.println("nome: "+c1.nome );
		System.out.println("status do cliente: " + c1.statuscliente);
		System.out.println("tipo do cartao: " + ct1.tipo );
		System.out.println("numero do cartao: " + ct1.numero);
		System.out.println("data de validade do cartao: " + ct1.datavale);
		System.out.println("titular: " +ct1.titular );
	}

}