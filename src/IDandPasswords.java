import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IDandPasswords(){

        loginInfo.put("mister_shawnb", "password");
        loginInfo.put("ewrose", "smitty");

    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
    
}
