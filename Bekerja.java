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