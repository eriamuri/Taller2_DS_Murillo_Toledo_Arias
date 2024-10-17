public interface Autentificacion { 
        public void log (User user);
}
/*//Principio de Sustitución de Liskov (LSP): Clase LogInAdmin: Extiende de LogIn, 
pero altera el comportamiento de la clase base al verificar si el usuario es administrador 
y bloquear el acceso si no lo es por lo que se creó una interfaz que tenga la funcion log para que cada clase que extienda de ella lo configure a su gusto.
 */