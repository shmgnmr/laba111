import Books.BookFactory;
import Users.People;

import java.util.ArrayList;
import Users.Users;

public class Archive {
    private Users users;
    private BookFactory library;
    private ArrayList<People> libraryUsers;

    public ArrayList<People> getLibraryUsers() {
        return libraryUsers;
    }

    public Archive() {
        users = new Users();
        library = new BookFactory();
        libraryUsers = users.getlibraryUsers();
        for (People user : libraryUsers) {
            users.distributeUsersBooks(user, library);
        }
    }
}