package Macsinos;

public class Pedido {
	String hamburguer, bebida;
	
	public Pedido(String hamburguer) {
		this.hamburguer = hamburguer;
	}

	public Pedido(String hamburguer, String bebida) {
		this.hamburguer = hamburguer;
		this.bebida = bebida;
	}


	
	public String getHamburguer() {
		return hamburguer;
	}

	public void setHamburguer(String hamburguer) {
		this.hamburguer = hamburguer;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	@Override
	public String toString() {
		if(getBebida() == null) {
			return "(" + hamburguer + ")";
		}else {
			return "(" + hamburguer + ", " + bebida + ")";
		}
	}
}
