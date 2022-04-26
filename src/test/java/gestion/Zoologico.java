package gestion;
import java.util.ArrayList;

//import zooAnimales.Mamifero;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	
	public Zoologico() {
		super();
	}
	//--------------------------
	public Zoologico(String nom, String ubi) {
		this.nombre = nom;
		this.ubicacion = ubi;
	}
	//--------------------------
	public int cantidadTotalAnimales() {
		int k=0;
		for(Zona i :zonas) {
			if(i instanceof Zona) {
				k=k+i.cantidadAnimales();
			}
		}
		return k;
	}
	//--------------------------
	public void agregarZonas(Zona z) {
		if(zonas==null) {
			 zonas=new ArrayList<Zona>();
			 this.zonas.add(z);
		 }else {
			 this.zonas.add(z);
		 } 
	}
	//--------------------------
	public String getNombre() {
		return this.nombre;
	}
	//--------------------------
		public ArrayList<Zona> getZona() {
			return this.zonas;
		}
}
