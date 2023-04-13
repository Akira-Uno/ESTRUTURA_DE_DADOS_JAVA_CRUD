package CRUD;

public class CRUD {
	private Pessoa p[];
	private int tamanho;
	
	public CRUD() {
		p = new Pessoa[tamanho];
		tamanho = 0;
	}
	
	public void add(Pessoa p) {
		if(this.p.length == tamanho)
			aumentarTamanho();
			
		for(int i = 0; i < this.p.length;i++) {
			this.p[tamanho] = p;
			tamanho++;
			break;
		}
	}
	public void aumentarTamanho() {
		Pessoa novoArray[] = new Pessoa[tamanho + 1];
		for(int i =0;i < tamanho;i++) {
			novoArray[i] = p[i];
		}
		p = novoArray;
	
	}
	public void excluir(int indx) {
		for(int i = 0; i < tamanho;i++) {
			if(this.p != null) {
				this.p[indx] = null;
				break;
			}
		}
	}
	public void editar(int index, Pessoa p) {
		for(int i =0; i < tamanho;i++) {
			if(index == i) {
				this.p[index] = p;
				break;
			}
		}
	}
	public void exibir() {
		for(Pessoa p : this.p) {
			if(p != null) {
				System.out.println(p.getNome() + " " + p.getIdade() + " " + p.getDataNascimento());
			}
		}
	}

}
