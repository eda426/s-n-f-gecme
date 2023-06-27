import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double avarage;
        Scanner gir = new Scanner(System.in);

        System.out.println("Not Ortalaması Hesaplama.");

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = gir.nextInt();
if(mat<0 || mat>100 )
{System.out.println("geçersiz not girdiniz ortalamaya katılmaz");
mat=0;}
        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = gir.nextInt();
        if(fizik<0 || fizik>100 )
        {System.out.println("geçersiz not girdiniz ortalamaya katılmaz");
        fizik=0;}

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = gir.nextInt();
        if(turkce<0 || turkce>100 )
        {System.out.println("geçersiz not girdiniz ortalamaya katılmaz");
        turkce=0;}

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = gir.nextInt();
        if(kimya<0 || kimya>100 )
        {System.out.println("geçersiz not girdiniz ortalamaya katılmaz");
        kimya=0;}
        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = gir.nextInt();
        if(muzik<0 || muzik>100 )
        {System.out.println("geçersiz not girdiniz ortalamaya katılmaz");
        muzik=0;}
        avarage=(mat+fizik+turkce+kimya+muzik)/5;

        if(avarage<55)
        {
            System.out.println("Sınıfta kaldınız:");
        }
        else {
            System.out.println("tebrikler geçtiniz");
        }
        System.out.println("ortalamanız:"+avarage);
        }
    }
