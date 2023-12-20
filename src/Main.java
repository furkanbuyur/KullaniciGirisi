import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password2, password;

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();
        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("hello") && (password.equals("world"))) {
            System.out.println("Giriş Yapıldı...");
        } else if (userName.equals("hello")) {
            System.out.println("Bilgileriniz Hatalı...Şifre Değişikliği İçin 1 'e Basın");
            int secim = inp.nextInt();


            if (secim == 1) {
                System.out.print("Yeni Şifre : ");
                password2 = inp.next();
                if (password2.equals("world")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                } else {
                    System.out.println("Şifre Oluşturuldu");
                }
            }
        } else {
                    System.out.println("Bilgileriniz Hatalı...");
        }
    }
}



