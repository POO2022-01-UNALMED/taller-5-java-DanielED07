package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Pez extends Animal{
	 private static ArrayList<Pez> listado;
	 public static int salmones;
	 public static int bacalaos;
	 private String colorEscamas;
	 private int cantidadAletas;
	//--------------------------
	 public Pez() {
		 super();
		 if(listado==null) {
			 listado=new ArrayList<Pez>();
			 Pez.listado.add(this);
		 }else {
			 Pez.listado.add(this);
		 } 
	 }
	//--------------------------
	 public Pez(String nom,int edad,
			 String hab,String gen,Zona zon,
			 String colE,int CantA) {
		 super(nom,edad,hab,gen,zon);
		 this.colorEscamas=colE;
		 this.cantidadAletas = CantA;
		 if(listado==null) {
			 listado=new ArrayList<Pez>();
			 Pez.listado.add(this);
		 }else {
			 Pez.listado.add(this);
		 } 
		 
	 }
	//--------------------------
	 public Pez(String nom,int edad,
			 String hab,String gen,
			 String colE,int CantA) {
		 super(nom,edad,hab,gen);
		 this.colorEscamas=colE;
		 this.cantidadAletas = CantA;
		 if(listado==null) {
			 listado=new ArrayList<Pez>();
			 Pez.listado.add(this);
		 }else {
			 Pez.listado.add(this);
		 } 
		 
	 }
	//--------------------------
	 public String movimiento() {
			return "nadar";
		}
	//--------------------------
	 public static Pez crearSalmon(String nom,int edad,String gen){
		 salmones++;
		 return new Pez(nom,edad,"oceano",gen,"rojo",6);
		 
	 }
	//--------------------------
	public static Pez crearBacalao(String nom,int edad,String gen){
		bacalaos++;
		return new Pez(nom,edad,"oceano",gen,"gris",6);
		 
	}
	//--------------------------
	public static int cantidadPeces(){
		 return Pez.salmones+Pez.bacalaos+Pez.listado.size();
	}
	//--------------------------
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	//--------------------------
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
}
