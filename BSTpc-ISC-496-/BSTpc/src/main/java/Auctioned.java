import java.util.ArrayList;

public class Auctioned {
    private String userName;
    private ArrayList<Part> parts;

    public Auctioned(String userName){
        this.userName = userName;
        parts = new ArrayList<>();
    }

    String getUserName(){return userName;}
    ArrayList<Part> getParts(){return parts;}

    void setUserName(String userName){this.userName = userName;}
    void setPartsList(ArrayList<Part> parts){this.parts = parts;}

    void add(Part part){parts.add(part);}
}