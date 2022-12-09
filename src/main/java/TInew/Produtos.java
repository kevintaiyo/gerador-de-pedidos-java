package TInew;

public class Produtos {

	//ATRIBUTOS DE PRODUTOS DO TIPO PRIVATE E DOUBLE//
	
	private double SucoDeUva600ml = 5.00;
	private double SucoDeLaranja600ml = 6.00;
	private double SucoDeGoiaba600ml = 4.00 ;
	private double SucoDeLimao600ml = 4.00 ;
	
	private int QuantidadeSucoDeUva;
	private	int QuantidadeSucoDeLaranja;
	private int QuantidadeSucoDeGoiaba;
	private int QuantidadeSucoDeLimao;
	
	
	
	//GERAR GET E SET PARA SABER AS QUANTIDADES DE SUCO//
	
	public int getQuantidadeSucoDeUva() {
		return QuantidadeSucoDeUva;
	}
	public void setQuantidadeSucoDeUva(int quantidadeSucoDeUva) {
		QuantidadeSucoDeUva = quantidadeSucoDeUva;
	}
	public int getQuantidadeSucoDeLaranja() {
		return QuantidadeSucoDeLaranja;
	}
	public void setQuantidadeSucoDeLaranja(int quantidadeSucoDeLaranja) {
		QuantidadeSucoDeLaranja = quantidadeSucoDeLaranja;
	}
	public int getQuantidadeSucoDeGoiaba() {
		return QuantidadeSucoDeGoiaba;
	}
	public void setQuantidadeSucoDeGoiaba(int quantidadeSucoDeGoiaba) {
		QuantidadeSucoDeGoiaba = quantidadeSucoDeGoiaba;
	}
	public int getQuantidadeSucoDeLimao() {
		return QuantidadeSucoDeLimao;
	}
	public void setQuantidadeSucoDeLimao(int quantidadeSucoDeLimao) {
		QuantidadeSucoDeLimao = quantidadeSucoDeLimao;
	}
	
	//GERAR GET E SET PARA PREÇOS DOS SUCOS//
	
	public double getSucoDeUva600ml() {
		return SucoDeUva600ml;
	}
	public void setSucoDeUva600ml(double sucoDeUva600ml) {
		SucoDeUva600ml = sucoDeUva600ml;
	}
	public double getSucoDeLaranja600ml() {
		return SucoDeLaranja600ml;
	}
	public void setSucoDeLaranja600ml(double sucoDeLaranja600ml) {
		SucoDeLaranja600ml = sucoDeLaranja600ml;
	}
	public double getSucoDeGoiaba600ml() {
		return SucoDeGoiaba600ml;
	}
	public void setSucoDeGoiaba600ml(double sucoDeGoiaba600ml) {
		SucoDeGoiaba600ml = sucoDeGoiaba600ml;
	}
	public double getSucoDeLimão600ml() {
		return SucoDeLimao600ml;
	}
	public void setSucoDeLimão600ml(double sucoDeLimão600ml) {
		SucoDeLimao600ml = sucoDeLimão600ml;
	}

}
