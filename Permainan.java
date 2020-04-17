interface Permainan{ 
int panah = 4;
public void panahKiri(); 
public void panahKanan(); 
public void panahAtas(); 
public void panahBawah();
}

class Bola implements Permainan{ 
public void panahKiri(){ 
System.out.println("tendang ke kiri"); 
}
public void panahKanan(){ 
System.out.println("tendang ke kanan"); 
}
public void panahAtas(){ 
System.out.println("tendang ke depan");
}
public void panahBawah(){ 
System.out.println("balik belakang"); 
}
}
class Balapan implements Permainan{ 
public void panahKiri(){ 
System.out.println("belok kiri"); 
}
public void panahKanan(){ 
System.out.println("belok kanan"); 
}
public void panahAtas(){ 
System.out.println("injak gas"); 
}
public void panahBawah(){ 
System.out.println("injak rem"); 
}
}
