package App;

public class Cliente {
	private int Id;
	private String nome;
	private int nPedidos;
	private String enderešo;
	private String telefone1;
	private String telefone2;	
	
	public Cliente(int id){
		this.Id = id;
	}
	public Cliente(String nome, String nPedidos, String enderešo,String telefone1,String telefone2){
		this.nome = nome;
		
		try{
			this.setnPedidos(Integer.parseInt(nPedidos));
		}catch(NumberFormatException e){
			this.nPedidos = 0;
		}
		
		
		this.enderešo = enderešo;
		this.setTelefone1(telefone1);
		this.setTelefone2(telefone2);
	}
	public Cliente(){
		this.nome = "<Novo>";		
	}
	@Override
	public String toString() {
		return this.nome;
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
	public int getnPedidos() {
		return nPedidos;
	}
	public void setnPedidos(int nPedidos) {
		this.nPedidos = nPedidos;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}	
}
