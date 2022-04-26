package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico[] zoo;
	private ArrayList<Animal> animales;
	
	public Zona() {
		super();
	}
	//--------------------------
	public Zona(String nom, Zoologico z) {
		
		this.nombre = nom;
		zoo = new Zoologico[1];
		this.zoo[0]=z;
	}
	//--------------------------
	public void agregarAnimales(Animal anim) {
		if(animales==null) {
			animales=new ArrayList<Animal>();
			this.animales.add(anim);
		 }else {
			 this.animales.add(anim);
		 }	
	}
	//--------------------------
	public int cantidadAnimales() {
		return this.animales.size();
		}
	//--------------------------
	public ArrayList<Animal> getAnimales() {
		return this.animales;
	}
//--------------------------
	
	public String getNombre() {
			return this.nombre;
		}
	//--------------------------
	public Zoologico getZoo() {
		return this.zoo[0];
	}
}
