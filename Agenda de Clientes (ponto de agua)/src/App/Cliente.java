package App;

public class Cliente {
	private int Id;
	private String nome;
	private String endere�o;
	
	public Cliente(int id){
		this.Id = id;
	}
	public Cliente(String nome, String endere�o){
		this.nome = nome;
		this.endere�o = endere�o;
	}
	public Cliente(){
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}	
}
