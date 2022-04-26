package zooAnimales;
import gestion.Zona;
//import gestion.Zoologico;
//import java.util.ArrayList;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona;
	//--------------------------
	public Animal() {
		super();
	}
	//--------------------------
	public Animal(String nom,int edad,String hab,String gen,Zona zon) {
		this.nombre = nom;
		this.edad = edad;
		this.habitat = hab;
		this.genero = gen;
		zona = new Zona[1];
		this.zona[0]=zon;
		totalAnimales++;
	}
	//--------------------------
	public Animal(String nom,int edad,String hab,String gen) {
		this.nombre = nom;
		this.edad = edad;
		this.habitat = hab;
		this.genero = gen;
		zona = new Zona[1];
		this.zona[0]=null;
		totalAnimales++;
	}
	//--------------------------
	public static String totalPorTipo() {
		return "Mamiferos: "+Mamifero.cantidadMamiferos()+
				"\nAves: "+Ave.cantidadAves()+
				"\nReptiles: "+Reptil.cantidadReptiles()+
				"\nPeces: "+Pez.cantidadPeces()+
				"\nAnfibios: "+Anfibio.cantidadAnfibios();
	}
	//--------------------------
	public String movimiento() {
		return "desplazarse";
	}
	//--------------------------
	public String toString() {
		return this.zona[0]!=null ? "Mi nombre es "+this.nombre+
				" , tengo una edad de "+this.edad+
				" , habito en "+this.habitat+
				" y mi genero es "+this.genero+
				",la zona en la que me ubico es "+this.zona[0].getNombre()+
				" en el "+this.zona[0].getZoo().getNombre() : "Mi nombre es "+this.nombre+
				", tengo una edad de "+this.edad+
				", habito en "+this.habitat+
				" y mi genero es "+this.genero;
	}
	//--------------------------
	public static int getTotalAnimales() {
		return Animal.totalAnimales;
	}
	//--------------------------
		public String getNombre() {
			return this.nombre;
		}
	//--------------------------
		public int getEdad() {
			return this.edad;
			}
	//--------------------------
		public String getHabitat() {
			return this.habitat;
			}
	//--------------------------
		public String getGenero() {
			return this.genero;
			}
}
