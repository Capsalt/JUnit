package junit;

public class StringChange {

    /*
  Verilen bir String'deki ilk iki harfinde A var ise bunları silen method creat ediniz.
  AACD->CD ABC->BC A->"" AA->"" B->B
   */
    public String ilkIkiASil(String str){
        if (str.length()<=2) {
            return str.replaceAll("A","");
        }
        String ilkIkiKarakter=str.substring(0,2);
        String ilkIkiKarakterSonrasi=str.substring(2);
        return ilkIkiKarakter.replaceAll("A","")+ilkIkiKarakterSonrasi;

    }
}
