public class agac {
    
    dugum kok;

    public agac(){
        kok=null;
    }

    dugum yenidugum(int sayi){
        kok=new dugum(sayi);
        return kok;
    }

    dugum ekle(dugum kok,int sayi){
        if(kok!=null){  
            if(sayi<kok.sayi){
                kok.sol=ekle(kok.sol,sayi);
            }
            else{
                kok.sag=ekle(kok.sag,sayi);
            }
            System.out.println("sayi eklendi :"+sayi);
        }
        else{
            kok=yenidugum(sayi);
        }
        return kok;
    }


}
