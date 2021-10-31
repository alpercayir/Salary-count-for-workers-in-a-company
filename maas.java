import java.util.Objects;
import java.util.Arrays;
import java.util.Scanner;


public class maas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("saat basi ucret 20 tl olarak verilmistir. isci sayisini giriniz:");
        Scanner sc = new Scanner(System.in);
        int kisisayisi = sc.nextInt();
        int[] dizi1 = new int[kisisayisi];
        for (int j=0 ; j<dizi1.length; j++) {
        	dizi1[j]= j+1;
        	
        }
        int[] dizi2 = new int[kisisayisi];
        int[] dizi3 = new int[kisisayisi];
        while(1==1) {
        System.out.print("isciye saat eklemek icin 1, bir iscinin toplam saat ve ucret bilgisini ogrenmek icin 2 ye\r\n"
        		+ "basiniz, tum iscilerin saat ve ucret bilgisini icin 3 e basiniz: ");
        int secenek = sc.nextInt();
        if(secenek ==1) {
        	
        	System.out.print("Isci no:");
        	int iscino = sc.nextInt();
        	while(iscino>kisisayisi) {
        		System.out.print("Isci no:");
        		int iscino2 = sc.nextInt();
        		iscino = iscino2;
        	}
        	System.out.print("Su ana kadar " + iscino + " nolu isci " + dizi2[iscino-1] + " saat calismistir. Eklenecek calisma saati:" );
        	int calismasaati = sc.nextInt();
        	if((calismasaati>0) && (calismasaati<=40) ) {
        		dizi2[iscino-1] = calismasaati;
            	dizi3[iscino-1] = dizi2[iscino-1]*20;	
        		
        	}                  
        	else {
        		System.out.println("Girmis oldugunuz saat iscinin 40 saatlik calisma suresini asmaktadır.Yeniden secim yapiniz");
        	}
        	
        }
        else if(secenek ==2) {
        	System.out.print("Isci no:");
        	int iscino = sc.nextInt();
        	while(iscino>kisisayisi) {
        		System.out.print("Isci no:");
        		int iscino2 = sc.nextInt();
        		iscino = iscino2;
        	}
        	System.out.println("Isci no saat maas");
        	System.out.print(dizi1[iscino-1]);
    		System.out.print("      ");
    		System.out.print(dizi2[iscino-1]);
    		System.out.print("      ");
    		System.out.println(dizi3[iscino-1]);
        	        	
        }
        else if(secenek ==3) {
        	System.out.println("Isci no saat maas");
        	for (int i=0; i<dizi2.length;i++) {
        		System.out.print(dizi1[i]);
        		System.out.print("      ");
        		System.out.print(dizi2[i]);
        		System.out.print("      ");
        		System.out.println(dizi3[i]);
        	}
        	
	
        }
        else {
        	if((secenek !=1) || (secenek !=2) || (secenek !=3) ) {
        		System.out.println("1,2 veya 3 numarali secenklerden birini secmelisiniz.");
        		
        	}
        
        	
        }
		
		
		
		
        }
	}

}

