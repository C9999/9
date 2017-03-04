public class Compra {
	public static void main(String[] args) {
		int qtdItens = 0;
		int i = 0;
		
		CarrinhoRegras cr = new CarrinhoRegras();
		System.out.println("\n>> CARRINHO ABERTO! <<");
				
		qtdItens = cr.sorteioQuantidadeDeItens();//Sorteando a quantidade do item A que vai ser adionado ao Carrinho
		while(i < qtdItens){
			cr.addItem("A");
			i++;
		}
		
		qtdItens = i = 0;
		qtdItens = cr.sorteioQuantidadeDeItens();//Sorteando a quantidade do item B que vai ser adionado ao Carrinho
		while(i < qtdItens){
			cr.addItem("B");
			i++;
		}
		
		qtdItens = i = 0;
		qtdItens = cr.sorteioQuantidadeDeItens();//Sorteando a quantidade do item C que vai ser adionado ao Carrinho
		while(i < qtdItens){
			cr.addItem("C");
			i++;
		}
		
		qtdItens = i = 0;
		qtdItens = cr.sorteioQuantidadeDeItens();//Sorteando a quantidade do item D que vai ser adionado ao Carrinho
		while(i < qtdItens){
			cr.addItem("D");
			i++;
		}
					
//		cr.addItem("A"); // Cenário 2, a quantidade de itens adicionados ao Carrinho é fixa
//		cr.addItem("A");
//		cr.addItem("A");
//		
//		cr.addItem("B");
//		cr.addItem("B");
//		
//		cr.addItem("C");
//		cr.addItem("C");
//		
//		cr.addItem("D");
//		cr.addItem("D");
//		
		cr.fechaCarrinho();		
	}

}
