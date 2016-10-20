package TDA;
import TDA.Nodo;

public class ListaT {
	private Nodo cab;
	private int tamaño;
	
	public ListaT(){
		cab = new Nodo();
		tamaño =0;
	}
	
	public int getTamaño(){
		return tamaño;
	}
	
	public boolean addDato(triangu dato){
		Nodo nodoUltimo = getUltimoNodo();
		if(dato != null && nodoUltimo != null){
			nodoUltimo.setNodo(new Nodo(dato));
			tamaño ++;
			return true;
		}else{
			return false;
		}
	}
	private Nodo getUltimoNodo(){
		Nodo nodoUltimo = null;
		if(cab != null){
			nodoUltimo = cab;
			while(nodoUltimo.getNodo() != null){
				nodoUltimo = nodoUltimo.getNodo();
			}
		}
		return nodoUltimo;
	}
	public triangu getDato(int pos){
		Nodo nodoUltimo = null;
		int contador = 0;
		triangu dato = null;
		if(cab != null){
			nodoUltimo = cab;
			do{
				nodoUltimo = nodoUltimo.getNodo();
				if(contador == pos){
					dato = nodoUltimo.getDato();
					break;
			    }else{
			    	contador++;
			    }
			}while(nodoUltimo.getNodo() != null);
		}
		return dato;
	}
}

