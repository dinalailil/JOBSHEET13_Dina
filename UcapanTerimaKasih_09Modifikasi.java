import java.util.Scanner;
public class UcapanTerimaKasih_09Modifikasi {

    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you"+nama+"For being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like i cloud ask you anything.");
    }
    public static String UcapanTambahan(String tambahan){
        return tambahan;
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}