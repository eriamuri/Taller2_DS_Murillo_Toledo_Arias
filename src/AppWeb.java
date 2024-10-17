public class AppWeb {
    //LogIn logIn;
    //LogInAdmin logInAdmin;
    Database baseDatos;
    Autentificacion autentificacion;
    
    
    public AppWeb(Database baseDatos, Autentificacion autentificacion) {
        this.baseDatos = baseDatos;
        this.autentificacion = autentificacion;
    }
    public void login(User user) {
        autentificacion.log(user);
    }
    /*
        public AppWeb (LogIn logIn, MySQL mySQL) {
        // Logic
    }
        public AppWeb (LogInAdmin logInAdmin, MySQL mySQL) {
        // Logic
    }*/
    public void connectToDatabase (Database baseDatos) {
        // Logic
    }
    /*Clase AppWeb: La clase depende directamente de implementaciones concretas 
    (LogIn, LogInAdmin, y MySQL), en lugar de depender de abstracciones (interfaces). */
}

