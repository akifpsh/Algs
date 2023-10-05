
public class liste {
    
    dugum bas=null;
    dugum kuyruk=null;

    void sonaekle(int sayi){

        dugum temp=new dugum();

        temp.sayi=sayi;
        temp.next=null;

        if(bas==null){
            bas=temp;
            kuyruk=temp;
        }
        else{
            kuyruk.next=temp;
            kuyruk=temp;
            System.out.println("sona eklenen sayi :"+temp.sayi);
        }
    }

    void basaekle(int sayi){
        dugum temp=new dugum();

        temp.sayi=sayi;
        temp.next=null;

        if(bas==null){
            bas=temp;
            kuyruk=temp;
        }
        else{
            temp.next=bas;
            bas=temp;
            System.out.println("basa eklenen sayi"+temp.sayi);
        }

    }

    void yaz(){
        if(bas==null){
            System.out.println("kuyruk bos");
        }
        else{
            dugum temp=bas;
            while(temp!=null){
                System.out.println(temp.sayi);
                temp=temp.next;
                
            }
        }
    }
}
