package uitesting.upb.org.manageParameters;

public enum EnumValues {
   
    CalzadoNemesis("calzado Prueba 1");

    private String totalName;


    EnumValues(String totalName) {
        this.totalName = totalName;
    }

    public String getQuantity() {
        return totalName;
    }

    public static String testMyEnum(String calzado) {

        switch (calzado) {
            case "calzado 1":
                return CalzadoNemesis.getQuantity();

            default:
               return "";
        }

    }

}

