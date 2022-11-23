import java.util.Scanner;
public class login {
    public static void main(String[] args) {
    String id,password,select,newpassword;
    Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adınız:");
        id = inp.nextLine();
        System.out.print("Şifreniz:");
        password = inp.nextLine();

        if (password.equals("sarıköse")&&id.equals("batuhansrks")){
            System.out.println("Giriş Başarılı");}
        else System.out.println("Kullanıcı adı veya Şifre yanlış!\nŞifrenizi yenilemek ister misiniz?(Evet/Hayır)");
        select = inp.nextLine();
        if (select.equals("Evet")){
            System.out.print("Yeni şifrenizi girin:");}
            newpassword=inp.nextLine();
        if (newpassword.equals("sarıköse")){
            System.out.println("Yeni şifreniz eskisiyle aynı olamaz!");}
        else System.out.println("Şifreniz yenilendi tekrar giriş yapınız");



        }

    }

