public interface Database { // Interface for Database (DIP)

    void insert(String statement);
    void select(String statement);
    void delete(String statement);
    void update(String statement);
    // More Methods

}
