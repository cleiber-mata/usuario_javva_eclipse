package Usuario;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado joao = new Empregado();
		joao.setNome("João da Silva");
		joao.setSalario(9000);
		System.out.println("Salário do " + joao.getNome() + ": R$ " + joao.getSalario());
		
		
		Gerente cleiber = new Gerente();
		cleiber.setNome("Cleiber Mata");
		cleiber.setSalario(15000);
		cleiber.setComissao(3000);
		System.out.println("Salário do " + cleiber.getNome());
		System.out.println("Salário: R$ " + cleiber.getSalario());

	}

}
