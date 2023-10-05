public class kuyruk {
    int dizi[];
    int boyut;
    int bas;
    int son;

    public kuyruk(int boyut){
        this.boyut=boyut;

        dizi=new int[boyut];    //kuyruk yapisi

        bas=0;
        son=-1;
    }

    void ekle(int sayi){
        son++;    
        dizi[son]=sayi;


    }
    
    void cikar(){
        
    }

}
