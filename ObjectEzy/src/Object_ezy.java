class barang{
    String nama;
    int hargaSatuan;
    int jumlah;
    int total;
    int diskon;
    int hargaBayar;

    barang(String nama, int hargaSatuan, int jumlah){
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
        System.out.println("Nama Barang : " + this.nama);
        System.out.println("Satuan Barang : " + this.hargaSatuan);
        System.out.println("Jumlah Barang : " + this.jumlah);
    }

int hitungHargaTotal(){
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

public class Object_ezy {
    public static void main(String[] args) {
        barang barang1 = new barang("Makaroni", 10, 12000);
        barang1.hitungHargaTotal();
        barang1.hitungHargaDiskon();
        barang1.hitungHargaBayar();

        System.out.println("<------------------------>");

        barang barang2 = new barang("Kripca", 10, 6500);
        barang2.hitungHargaTotal();
        barang2.hitungHargaDiskon();
        barang2.hitungHargaBayar();


        System.out.println("<------------------------>");

        barang barang3 = new barang("Mie Gelas", 10, 4500);
        barang3.hitungHargaTotal();
        barang3.hitungHargaDiskon();
        barang3.hitungHargaBayar();

    }
}
