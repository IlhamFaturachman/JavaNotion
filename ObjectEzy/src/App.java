class barang{
    String nama;
    int hargaSatuan;
    int jumlah;
    int total;
    int diskon;
    int hargaBayar;

int hitungHargaTotal(int jumlah, int hargaSatuan){
    total = hargaSatuan * jumlah;
    System.out.println("Total Harga : " + total);
    return total;
    }

int hitungHargaDiskon(){
    if (total > 100000){
        diskon = total * 10/100;
        System.out.println("Diskon : " + diskon);
    }
    if (total >= 50000 && total <= 100000){
        diskon = total * 5/100;
        System.out.println("Diskon : " + diskon);
    }
    if (total <= 50000){
        System.out.println("No Ingfo Diskon");
    }
    return diskon;
    }

int hitungHargaBayar(){
    hargaBayar = total - diskon;
    System.out.println("Harga yang harus dibayar : " + hargaBayar);
    return hargaBayar;
 }
}

public class App {
    public static void main(String[] args) {
        barang barang1 = new barang();
        barang1.nama = "Makaroni";
        barang1.jumlah = 10;
        barang1.hargaSatuan = 12000;
        System.out.println("Nama Barang : " + barang1.nama);
        barang1.hitungHargaTotal(barang1.jumlah, barang1.hargaSatuan);
        barang1.hitungHargaDiskon();
        barang1.hitungHargaBayar();

        System.out.println("<------------------------>");

        barang barang2 = new barang();
        barang2.nama = "Kripca";
        barang2.jumlah = 10;
        barang2.hargaSatuan = 6500;
        System.out.println("Nama Barang : " + barang2.nama);
        barang2.hitungHargaTotal(barang2.jumlah, barang2.hargaSatuan);
        barang2.hitungHargaDiskon();
        barang2.hitungHargaBayar();


        System.out.println("<------------------------>");

        barang barang3 = new barang();
        barang3.nama = "Kripca";
        barang3.jumlah = 7;
        barang3.hargaSatuan = 5000;
        System.out.println("Nama Barang : " + barang3.nama);
        barang3.hitungHargaTotal(barang3.jumlah, barang3.hargaSatuan);
        barang3.hitungHargaDiskon();
        barang3.hitungHargaBayar();

    }
}
