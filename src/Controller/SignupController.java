package Controller;

public class SignupController {
    protected String email;
    protected String password;

    public SignupController(String email, String password){
        //skal modtage input (email & password) fra SignupDisplay
        Model.Bruger bruger = new Model.Bruger(email, password);
    }
}
