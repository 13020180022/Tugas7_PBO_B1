import java.io.*;
public class Mamalia {
void KelasMamalia () {
System.out.println(“Ciri umum mamalia adalah bernapas dengan paru-paru, ” +
“berkembang biak dengan cara beranak”);
}}class Paus extends Mamalia {
String x = “Ikan Paus”;
void TampilkanPaus () {
System.out.println(“dan Mamalia yang Anda pilih adalah “+ x );
System.out.println(“Mamalia ini berada di laut”);
System.out.println(“Paus termasuk jenis mamalia terbesar”);
}}class Cheetah extends Mamalia {
String x = “Cheetah”;
void TampilkanCheetah () {
System.out.println(“dan Mamalia yang Anda pilih adalah “+ x );
System.out.println(“Mamalia ini berada di darat”);
System.out.println(“Cheetah termasuk mamalia pelari tercepat di darat”);
}}class Sapi extends Mamalia {
String x = “Sapi”;
void TampilkanSapi () {
System.out.println(“dan Mamalia yang Anda pilih adalah “+ x );
System.out.println(“Mamalia ini berada di darat”);
System.out.println(“Sapi termasuk jenis mamalia pemamahbiak”);
}}class Turunan {
public static void main(String[] args) throws IOException{
String sInput = null ;
System.out.println(“____JENIS MAMALIA____”);
System.out.println(“[1]. IKAN PAUS”);
System.out.println(“[2]. CHEETAH”);
System.out.println(“[3]. SAPI”);
System.out.print(“Masukkan pilihan [1..3] :”);
Mamalia generalx = new Mamalia();
Paus turunan1 = new Paus();
Cheetah turunan2 = new Cheetah();
Sapi turunan3 = new Sapi ();
Sapi subxc = new Sapi();
InputStreamReader inputan = new InputStreamReader(System.in);
BufferedReader jm = new BufferedReader(inputan);
sInput = jm.readLine();
int i = Integer.parseInt(sInput);
switch (i) {
case 1 :
generalx.KelasMamalia ();
turunan1.TampilkanPaus ();break;
case 2 :
generalx.KelasMamalia ();
turunan2.TampilkanCheetah ();break;
case 3 :
generalx.KelasMamalia ();
turunan3.TampilkanSapi ();break;
default:
System.out.println(“Pilihan yang Anda masukkan salah!!”);break;
}
}
}
