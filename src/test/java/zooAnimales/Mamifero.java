package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal{
	
 private static ArrayList<Mamifero> listado;
 public static int caballos;
 public static int leones;
 private boolean pelaje;
 private int patas;
//--------------------------
 public Mamifero() {
	 super();
	 if(listado==null) {
		 listado=new ArrayList<Mamifero>();
		 Mamifero.listado.add(this);
	 }else {
		 Mamifero.listado.add(this);
	 }
 }
//--------------------------
 public Mamifero(String nom,int edad,
		 String hab,String gen,Zona zon,
		  boolean pelo,int pats) {
	 super(nom,edad,hab,gen,zon);
	 this.pelaje=pelo;
	 this.patas=pats;
	 if(listado==null) {
		 listado=new ArrayList<Mamifero>();
		 Mamifero.listado.add(this);
	 }else {
		 Mamifero.listado.add(this);
	 } 
 }
//--------------------------
 public Mamifero(String nom,int edad,
		 String hab,String gen,
		  boolean pelo,int pats) {
	 super(nom,edad,hab,gen);
	 this.pelaje=pelo;
	 this.patas=pats;
	 if(listado==null) {
		 listado=new ArrayList<Mamifero>();
		 Mamifero.listado.add(this);
	 }else {
		 Mamifero.listado.add(this);
	 } 
 }
//--------------------------
 public static Mamifero crearCaballo(String nom,int edad,String gen){
	 caballos++;
	 return new Mamifero(nom,edad,"pradera",gen,true,4); 
	 
 }
//--------------------------
public static Mamifero crearLeon(String nom,int edad,String gen){
	leones++;
	return new Mamifero(nom,edad,"selva",gen,true,4); 
}
//--------------------------
public static int cantidadMamiferos(){
	 return Mamifero.caballos+Mamifero.leones+Mamifero.listado.size();
}
//--------------------------
public boolean isPelaje() {
	return this.pelaje;
}
//--------------------------
public int getPatas() {
	return this.patas;
}
 
}
