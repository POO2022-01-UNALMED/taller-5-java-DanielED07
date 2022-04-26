package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal{
	
	private static ArrayList<Ave> listado;
	 public static int halcones;
	 public static int aguilas;
	 private String colorPlumas;
	//--------------------------
	 public Ave() {
		 super();
		 if(listado==null) {
			 listado=new ArrayList<Ave>();
			 Ave.listado.add(this);
		 }else {
			 Ave.listado.add(this);
		 }
	 }
	//--------------------------
	 public Ave(String nom,int edad,
			 String hab,String gen,Zona zon,
			 String colP) {
		 super(nom,edad,hab,gen,zon);
		 this.colorPlumas=colP;
		 if(listado==null) {
			 listado=new ArrayList<Ave>();
			 Ave.listado.add(this);
		 }else {
			 Ave.listado.add(this);
		 } 
		 
	 }
	//--------------------------
	 public Ave(String nom,int edad,
			 String hab,String gen,
			 String colP) {
		 super(nom,edad,hab,gen);
		 this.colorPlumas=colP;
		 if(listado==null) {
			 listado=new ArrayList<Ave>();
			 Ave.listado.add(this);
		 }else {
			 Ave.listado.add(this);
		 } 
		 
	 }
	//--------------------------
	 public String movimiento() {
			return "volar";
		}
	//--------------------------
	 public static Ave crearHalcon(String nom,int edad,String gen){
		 halcones++;
		 return new Ave(nom,edad,"montanas",gen,"cafe glorioso");
	 }
	//--------------------------
	public static Ave crearAguila(String nom,int edad,String gen){
		aguilas++;
		return new Ave(nom,edad,"montanas",gen,"blanco y amarillo");	 
	}
	//--------------------------
	public static int cantidadAves(){
		 return Ave.halcones+Ave.aguilas+Ave.listado.size();
	}
	//--------------------------
	public String getColorPlumas() {
		return this.colorPlumas;
	}
}
