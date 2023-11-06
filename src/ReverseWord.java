public class ReverseWord{
    public static void main(String[] arg) {

        String str = "Metoda", nstr="";
        char ch;

        System.out.println("Cuvantul inante de modificare " +str);
        // System.out.println();
        for(int i =0; i<str.length();i++){
            ch = str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("String-ul reversed este " +nstr);
    }
}