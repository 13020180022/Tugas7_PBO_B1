abstract class Mencuci{ 
boolean sabun; 
int banyakAir;

abstract void cuci();
void menyiram(){ 
System.out.println("menyiram air"); 
}
}

class CuciBaju extends Mencuci{ 
void cuci(){ 
System.out.println("masukan ke mesin cuci"); 
System.out.println("tambah sabun"); 
System.out.println("nyalakan mesin");   
 }
void menyiram(){ 
System.out.println("membuang air cucian");
}
}

class CuciTangan extends Mencuci{
void cuci(){ 
System.out.println("buka kran air"); 
System.out.println("bilas tangan"); 
}
}

class Bekerja{ 
public static void main(String args[]){ 
Mencuci bersih; 
CuciBaju kaos = new CuciBaju(); 
CuciTangan makan = new CuciTangan();
bersih = kaos; 
bersih.cuci(); 
bersih.menyiram();

bersih = makan; 
bersih.cuci(); 
bersih.menyiram();    
}
}
