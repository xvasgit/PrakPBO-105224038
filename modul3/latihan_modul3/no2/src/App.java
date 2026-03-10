import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        String PINBenar = "123456";
        boolean dapat = false;
        for(int i=1;i<=3;i++){
            System.out.print("Masukkan PIN 6 digit (percobaan " + i + ") : ");
            String PIN = input.nextLine();
            if(PIN.equals(PINBenar)){
                System.out.println("PIN Benar");
                dapat = true;
                break;
            }
        }
        if(!dapat) System.out.println("Akun diblokir");
        input.close();
    }
}
