import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        int pilihan, saldoAwal = 500000;
        do{
            System.out.println("Menu: 1. Cek Saldo |2. Setor Tunai |3. Tarik Tunai |4. Keluar");
            System.out.print("Masukkan pilihan : ");
            pilihan = input.nextInt();
            switch(pilihan){
                case 1 :
                    System.out.println("Banyak saldo = Rp" + saldoAwal);
                    break;
                case 2 :
                    System.out.print("Masukkan banyak yang ingin disetor : ");
                    int setor = input.nextInt();
                    saldoAwal = saldoAwal + setor;
                    System.out.println("Saldo berhasil disetor");
                    break;
                case 3 :
                    if(saldoAwal < 50000){
                        System.out.println("Saldo tidak memenuhi batas minimal (Rp50.000)");
                        break;
                    }
                    System.out.print("Masukkan banyak yang ingin ditarik tunai : ");
                    int tarik = input.nextInt();
                    if(saldoAwal < tarik){
                        System.out.println("Saldo tidak mencukupi");
                        break;
                    }else{
                        saldoAwal = saldoAwal - tarik;
                        System.out.println("Saldo berhasil ditarik");
                    }
                    break;
                case 4 :
                    break;
            }

        }while(pilihan != 4);
        input.close();
    }
}
