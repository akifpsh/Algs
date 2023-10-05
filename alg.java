public class alg {
    public static void main(String[] args) {
        
        agac a1=new agac();
        
        a1.kok=a1.ekle(a1.kok, 10);
        a1.kok=a1.ekle(a1.kok,15);
        a1.kok=a1.ekle(a1.kok,8);
        a1.kok=a1.ekle(a1.kok,24);

        System.out.println(a1.kok.sayi);
        System.out.println(a1.kok.sag.sayi);
        System.out.println(a1.kok.sol.sayi);
    }
}
