package uitesting.upb.org.manageParameters;

import java.util.HashMap;
import java.util.Map;

public class MapQuantity {
    static Map<String, String> CalzadoQuantityValue = new HashMap<>();
    public MapQuantity() {
        CalzadoQuantityValue.put("CALZADO DE FÚTBOL NEMEZIZ 19.3 TERRENO FIRME","Cantidad: 1" );
    }

    public static String getQuantity(String calzado){


        return CalzadoQuantityValue.get(calzado);
    }
}
