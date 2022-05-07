package FilaEstatica;


public class FilaEstatica <T>{
	
	
	private T[] elementos;             //METODO DE ATRIBUIÇAO AO ELEMENTO
	private int inicio, fim, tamanho; //INDICADORES DE INICIO, FIM, TAMANHO
	
	
	public FilaEstatica(int tamanho){ //DECLARANDO O TAMANHO
		this.elementos = (T[]) new Object[tamanho]; //INSTACIANDO O ELEMENTO
		this.inicio = this.fim = 0; // INFORMANDO QUE O FIM SERÁ 0
		this.tamanho = tamanho; // DEFININDO O TAMANHO DA FILA
	}
		public boolean isVazia(){  // VERIFICANDO SE A LISTA ESTÁ VAZIA
			return this.inicio == this.fim; 
			} 

		public boolean isCheia(){ //VERIFICANDO SE A LISTA ESTÁ CHEIA
			return ((this.fim + 1) % this.tamanho) == this.inicio;
		}
			
		
		public int getQuantidade() { //METODO QUANTIDADE
				int aux = this.inicio, qtde = 0; 
				while (aux != this.fim){ //AUX É DIFERENTE DO FIM
				++qtde; // DEFININDO A QUANTIDADE
				this.fim = (++this.fim) % this.tamanho; } //
				return qtde; } 


      public void inserir(T elem) { 
   if (this.isCheia()); this.elementos[this.fim] = elem; 
   this.fim = (++this.fim) % this.tamanho; 
} 

}
	

