package UAS;
import java.util.Scanner;

//class
public class MieGacoanBeraksi {
    public static void main(String[] args) {
        //Error Handling
        try{   
            //IO Sederhana
            Scanner scanner = new Scanner(System.in);

            //Array
            PesananMieGacoan[] MieGacoan = new PesananMieGacoan[2];

            //Perulangan
            for(int i=0; i<MieGacoan.length; i++){
                System.out.print("Masukkan Menu "+(i+1)+" : ");
                String menu = scanner.nextLine();
                System.out.print("Masukkan Nama Costumer "+(i+1)+" : ");
                String costumer = scanner.nextLine();
                System.out.print("Masukkan Kode "+(i+1)+" : ");
                String kode = scanner.nextLine();
                System.out.println("");


             //Object
            MieGacoan[i] = new PesananMieGacoan(menu, costumer, kode);
            }

            //Perulangan
            for(PesananMieGacoan  data: MieGacoan){
                System.out.println("===================");
                System.out.println("pesanan:         ");
                System.out.println(data.displayInfo());
            }
        } catch (NumberFormatException e){
            System.out.println("Kesalahan Format nomor: "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format kode: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Kesalahan Umum: "+e.getMessage());
        }
    }
    
}
