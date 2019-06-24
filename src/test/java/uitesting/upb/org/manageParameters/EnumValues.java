package uitesting.upb.org.manageParameters;

public enum EnumValues {
   
    CalzadoNemesis("CALZADO DE FÚTBOL NEMEZIZ 19.3 TERRENO FIRME");

    private String totalName;


    EnumValues(String totalName) {
        this.totalName = totalName;
    }

    public String getTotalName() {
        return totalName;
    }

    public static String getFullName(String calzado) {

        switch (calzado) {
            case "calzado 1":
                return CalzadoNemesis.getTotalName();

            default:
               return "";
        }

    }

}

