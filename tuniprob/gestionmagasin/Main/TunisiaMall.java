import tn.tuniprob.gestionmagasin.GestMall.Mall;

public class TunisiaMall {
    public static void useMallPropertiesAndMethods() {
        // Creating an instance of the Mall class
        Mall mall = new Mall("Example Mall", 1, "Example City", 5);

        // Access and use the properties and methods of the Mall class
        System.out.println(mall.getM_sMall());
        System.out.println(mall.getM_id());
        System.out.println(mall.getM_sVille());
        System.out.println(mall.getM_inbEtages());
    }
}
