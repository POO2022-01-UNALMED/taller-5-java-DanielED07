package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Anfibio extends Animal {
	 private static ArrayList<Anfibio> listado;
	 public static int ranas;
	 public static int salamandras;
	 private String colorPiel;
	 private boolean venenoso;
	//--------------------------
	 public Anfibio() {
		 super();
		 if(listado==null) {
			 listado=new ArrayList<Anfibio>();
			 Anfibio.listado.add(this);
		 }else {
			 Anfibio.listado.add(this);
		 }
	 }
	//--------------------------
	 public Anfibio(String nom,int edad,
			 String hab,String gen,Zona zon,
			  String colP,boolean ven) {
		 super(nom,edad,hab,gen,zon);
		 this.colorPiel=colP;
		 this.venenoso = ven;
		 if(listado==null) {
			 listado=new ArrayList<Anfibio>();
			 Anfibio.listado.add(this);
		 }else {
			 Anfibio.listado.add(this);
		 } 
	 }
	//--------------------------
	 public Anfibio(String nom,int edad,
			 String hab,String gen,
			  String colP,boolean ven) {
		 super(nom,edad,hab,gen);
		 this.colorPiel=colP;
		 this.venenoso = ven;
		 if(listado==null) {
			 listado=new ArrayList<Anfibio>();
			 Anfibio.listado.add(this);
		 }else {
			 Anfibio.listado.add(this);
		 } 
	 }
	//--------------------------
	 public String movimiento() {
			return "saltar";
		}
	//--------------------------
	 public static Anfibio crearRana(String nom,int edad,String gen){
		 ranas++;
		 return new Anfibio(nom,edad,"selva",gen,"rojo",true);
		 
	 }
	//--------------------------
	public static Anfibio crearSalamandra(String nom,int edad,String gen){
		salamandras++;
		return new Anfibio(nom,edad,"selva",gen,"negro y amarillo",false);
		 
	}
	//--------------------------
	public static int cantidadAnfibios(){
		 return Anfibio.ranas+Anfibio.salamandras+Anfibio.listado.size();
	}
	//--------------------------
	public String getColorPiel() {
		return this.colorPiel;
	}
	//--------------------------
		public boolean isVenenoso() {
			return this.venenoso;
		}
		
}
