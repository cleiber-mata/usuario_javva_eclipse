package Usuario;

public class Gerente extends Empregado{
	private float comissao;

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	@Override
	public float getSalario() {
		return super.getSalario() + getComissao();
	}

}
