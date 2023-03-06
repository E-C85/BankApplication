import java.util.Scanner;

public class main1 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {


       Customer customer=new Customer("karl","374758585","746655656566","karl@hotmail",4000
       ,"bende123");
       //kullaniciya hesap numarasi ve sifre sorularak kontrol saglanir, dogruysa isleme girilir,
        // yanlis ise tekrar soru sorulur musteri dogru bilgi girene kadar.
         while (true){
             yildizlar("Banka Uygulamamiza Hosgeldiniz");
             System.out.println("hesap numaranizi giriniz");String hesapinput=sc.next();


             if (hesapinput.equals(customer.accountnumber)){
                 System.out.println("sifrenizi giriniz"); String sifre=sc.next();
                 if (sifre.equals(customer.password)){
                     System.out.println("sayin "+customer.name.toUpperCase()+"  HOSGELDINIZ");
                     break;

                 }else {
                     System.out.println("sifre yanlistir,lutfen yeniden giriniz");

                 }

             }else {
                 System.out.println("hesap numaraniz yanlis,yeniden deneyin");
             }

         }
        int devam=1;

         while(devam==1){
             anamenu();
             int islem=sc.nextInt();
             switch (islem){
                 case 1:
                     bakiyeyazdir(customer);
                     devam=devammi();
                     break;
                 case 2:
                     parayatir(customer);
                     devam=devammi();

                     break;
                 case 3:
                     paracek(customer);
                     devam=devammi();
                     break;

                 case 4:
                     customer.passwordchange();
                     devam=devammi();
                     break;
                 case 5:
                     yildizlar("yine bekleriz");
                     break;
                 default:
                     System.out.println("lutfen dogru cod giriniz");


             }

         }

      //Kullnici giris yaptiktan sonra ana menude secenekler ile karsilasir

        //ana menuyu yazdir
        //kullnicidan islem girdisi al
        //kullnicinin girdisine gore metod cagir

        //bakiye yazdir
        //para ekle para yatir
        //para cek
        //bilgileri degistir
        //her islem sonunda kullniciya baska islem isteyip istemedigi sorulur,evet der ise menu tekrardan yazdirilarak ana menuye gidilece
       // hayir denir ise sistemden cikis yailir
    }

    private static void paracek(Customer customer) {
        System.out.println("kac para cekmek istersin");double paracek=sc.nextDouble();
        customer.withdrawmoney(paracek);
    }

    private static void parayatir(Customer customer) {
        System.out.println("ne kadar para yatiricaksin");
        double parayatirma=sc.nextDouble();
        if (pozitifmi(parayatirma)){
            customer.addbalance(parayatirma);

        }else {
            System.out.println("lutfen pozitif bir sayi giriniz");
            parayatir(customer);
        }
    }

    private static  boolean pozitifmi(double i) {
        if (i>0){
            return true;
        }

        return false;
    }

    private static void bakiyeyazdir(Customer customer) {
        customer.balancecheck();
    }
    public static int devammi(){
        System.out.println("islem yapmak isterseniz devam mi,evet icin 1 ,hayir icin 0 tikla");int cevap=sc.nextInt();
        return cevap;
    }

    public static void yildizlar (String text){
        System.out.println("********************************\n\n");
        System.out.println(text);
        System.out.println("\n*******************************");
    }
    public static void anamenu(){
        yildizlar("Lutfen yapacaginiz ilsemi seciniz\n\n_____________"+
                "1-bakiye yazdir\n"+
                "2-para yatir\n"+
                "3-para cek\n"+
                "5-cikis yap____________");
    }
}
