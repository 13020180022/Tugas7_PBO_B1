abstract public class Mobil implements PropertiInM{ 
abstract public void injakPedalGas(); 
public void injakRem(){  
	System.out.println("Mobil berhenti!");  
	} 
} 
class Kijang extends Mobil{ 
public void injakPedalGas(){ 
	System.out.println("Mobil Melaju dengan kecepatan 100 Km/jam...");  
} 

@Override 
public int berukuran(int ukuran) {  
	// TODO Auto-generated method stub return ukuran;  
} 
 
@Override 
public int berkekuatan(int kekuatan) {  
	// TODO Auto-generated method stub return kekuatan;  
	
}
}
class BMW extends Mobil {  
	public void injakPedalGas(){ 
		System.out.println("Mobil Melaju dengan kecepatan 100 Km/jam...");  
} 

 
@Override  
public int berukuran(int ukuran) {  
	// TODO Auto-generated method stub return ukuran;  
} 

 
@Override 
public int berkekuatan(int kekuatan) {  
	// TODO Auto-generated method stub return kekuatan;  
	} 

 class TestMobil {  
	public static void main(String[] args){ 
		Mobil mobil = new Mobil(){ 
			public void injakPedalGas(){  
				System.out.println("Mobil berjalan..."); 
				} 
 
@Override 
public int berukuran(int ukuran) {  
	// TODO Auto-generated method stub return ukuran*10;  
} 
 
@Override 
public int berkekuatan(int kekuatan) {  
	// TODO Auto-generated method stub return kekuatan*10;  
	}
};
 
Kijang kijang = new Kijang(); 
 
BMW bmw = new BMW(); 
	mobil.injakPedalGas();  
		System.out.println("Kekuatan BMW: "+ mobil.berkekuatan(100)+"\nBerukuran : "+ mobil.berukuran(100)); 
 
	mobil = kijang; 
	mobil.injakPedalGas(); 
	System.out.println("Kekuatan Kijang: "+ 
mobil.berkekuatan(150)+"\nBerukuran : "+ mobil.berukuran(100)); 
 
	mobil = bmw; 
	mobil.injakPedalGas(); 
 
System.out.println("Kekuatan BMW: "+ mobil.berkekuatan(150)+"\nBerukuran : "+ mobil.berukuran(100)); 
 }


