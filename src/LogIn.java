public class LogIn {
    private boolean userIsAdmin
    public void log (User user) {
        System.out.println("Has access to the website");
        insertUserInDatabase(user);
        // Logic
    }
    public void insertUserInDatabase(User user){
        this.userIsAdmin = verifyIfTheUserIsAdmin(user);
        if(!userIsAdmin){
            return;
        }        // Insert user in database
    }

    private boolean verifyIfTheUserIsAdmin(User user){
        // Do something
        return true;
    }
}

