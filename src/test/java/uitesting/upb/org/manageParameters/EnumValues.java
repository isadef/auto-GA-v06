package uitesting.upb.org.manageParameters;

public enum EnumValues {
   
    CALZADODEFUTBOLNEMEZIZ193TERRENOFIRME("Cantidad: 1");

    private String quantity;


    EnumValues(String quantity) {
        this.quantity = quantity;

    }

    public String getQuantity() {
        return quantity;
    }
}

