public class Cuvinte {

    public static void main(String[] args) {

        String a = "university,test,java";
        String b = "car,university,planes";

        String[] aArray = a.split(",");
        String[] bArray = b.split(",");
        for (String aWord : aArray) {
            for (String bWord : bArray) {
                if (aWord.equals(bWord)) {
                    System.out.println("Element comun găsit: " + aWord);
                }
            }

        }
    }
}
