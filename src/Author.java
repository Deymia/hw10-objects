public class Author {
    private String firsName;
    private String lastName;

    public Author(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }
}
