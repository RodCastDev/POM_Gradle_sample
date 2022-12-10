package Models;

public class UsuarioSp {

    String Usuario;
    String Password;

    public UsuarioSp(String Usuario, String Password) {
        this.Usuario = Usuario;
        this.Password = Password;

    }

    public String getUsuario() {
        return Usuario;
    }

    public String getPassword() {
        return Password;
    }
}
