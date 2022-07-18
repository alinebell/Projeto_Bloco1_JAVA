package Projeto_I;

public class teste {
	
	public static void main(String[] args) {
		
		
		Desconto descontoEspecial = new Desconto_especial(0);
		Desconto aplicarDesconto = new Aplicar_desconto(0);
		Desconto desconto = null;
		
		int tipoDesconto=0;
		
		System.out.println("\nDigite 1 para receber 5% de desconto, 2 para 10% de desconto ou 3 para 15%: ");
		switch(tipoDesconto) {
		case 1:desconto = aplicarDesconto;break;
		case 2:desconto = descontoEspecial;break;
		
		default: System.out.println("\nDigite uma opção válida...");}

		}
}
