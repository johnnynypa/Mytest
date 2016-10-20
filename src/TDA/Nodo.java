package TDA;

public class Nodo{
	private triangu datos;
	private Nodo sgt;
	
	public Nodo(){
		datos = null;
		sgt = null;
	}
	
	public Nodo(triangu datos){
		this();
		this.datos = datos;  
	}
	
	public void setDato(triangu datos){
		this.datos = datos;
	}
	
	public triangu getDato(){
		return datos;
	}
	
	public void setNodo(Nodo sgt){
		this.sgt = sgt;
	}
	
	public Nodo getNodo(){
		return sgt;
	}
}
