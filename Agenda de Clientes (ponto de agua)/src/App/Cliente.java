package App;

public class Cliente {
	private int Id;
	private String nome;
	private int nPedidos;
	private String enderešo;
	private String ultimoPedido;
	
	public Cliente(int id){
		this.Id = id;
	}
	public Cliente(String nome, String nPedidos, String enderešo,String ultimoPedido){
		this.nome = nome;
		this.nPedidos = Integer.parseInt(nPedidos);
		this.enderešo = enderešo;
		this.ultimoPedido = ultimoPedido;
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
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}	
}
