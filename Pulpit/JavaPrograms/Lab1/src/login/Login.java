package login;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Szymon
 */
public class Login {
    private String login;
    private String password;

    /**
     *
     * @param _login login jaki dana instancja klasy będiz eprzechowywać
     * @param _password hasło jakie dana instancja klasy będiz eprzechowywać
     */
    public Login(String _login, String _password){
        login = _login;
        password = _password;
    }

    /**
     *
     * @param _login login do porównania z przechowywanym wewnątrz obiektu
     * @param _password hasło do porównania z przechowywanym wewnatrz obiektu
     * @return prawda, gdy login i hasło zgadzaja sie, fałsz gdy albo login albo hasło nie pasuje do tych rpzechowywanych przez instancję kalsy
     */
    public boolean check(String _login, String _password){
        if(_login.equals(login) ){
           if (_password.equals(password)){
            System.out.println("OK!");
            return true;         }
            else{
               System.out.println("wrong password!");
               return false;

           }
        }
        else {
                System.out.println("Wrong login");
                return false;
        }
    }

}