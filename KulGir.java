import java.util.Scanner;

public class KulGir {

    public static void main(String[] args) {

        String userName, passWord,sifirlendirme, newPassword ;
        Scanner input= new Scanner(System.in);
        System.out.print(" Kullanci Adinizi yaziniz  ");
        userName=input.nextLine( );
        System.out.print(" Sifrenizi yaziniz  ");
        passWord=input.nextLine();

        if (userName.equals("patika") && passWord.equals("dev") ){
            System.out.println(" ---  Giris yaptiniz --- ");

        }
        else{
            System.out.println("  Hatali sifre girdiniz yeni sifre belirtmek isterseniz \"evet\"  istemezseniz \" hayır\"  secin  ");
            sifirlendirme=input.nextLine();

            if( sifirlendirme.equals("hayır")){
                System.out.println(" Giris sonlandirildi ");}

            else if (sifirlendirme.equals("evet")) {
                System.out.println(" yeni sifrenizi yazin ");
                newPassword=input.nextLine();

                if( newPassword.equals("dev")|| newPassword.equals(passWord)){
                    System.out.println(" Hatali giris tekrar dene ");
                }
                else{
                    System.out.println(" sifrenizi basariyla yenilendi ");

                }

            }
            else{
                System.out.println(" hatali secim sectiniz ");

            }

        }
    }

}