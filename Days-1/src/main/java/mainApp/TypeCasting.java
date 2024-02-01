package mainApp;

public class TypeCasting {
    public static void main(String[] args){

        // tür dönüşümleri
        // string türünün diğer türleri dönüşümü
        String stBoy = "172";
        String stKilo = "68";

        double boy = Double.parseDouble(stBoy);
        double kilo =Double.parseDouble(stKilo);
        double end = boy / kilo;

        // diğer türlerin string türüne dönüşümü
        String stEnd = String.valueOf(end);
        stEnd = stEnd.substring(0,5);
        System.out.println("boy / kilo: " + stEnd);

        // Diğer türlerin kendi arasında tür dönüşümü
        int intEnd = (int) end;
        System.out.println("intEnd: " + intEnd);

        // char to int
        char c1 = '9';
        String stC1 = String.valueOf(c1);
        int cInt = Integer.parseInt(stC1);
        System.out.println("cInt: " + cInt);


    }
}
