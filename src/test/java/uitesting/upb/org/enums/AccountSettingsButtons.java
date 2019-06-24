package uitesting.upb.org.enums;

public enum AccountSettingsButtons {
    CHANGENAME ("changeNameButton"),
    DELETE ("deleteAccountButton");

    private String id;
    AccountSettingsButtons(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
