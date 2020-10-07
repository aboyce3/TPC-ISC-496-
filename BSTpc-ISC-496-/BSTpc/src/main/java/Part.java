public class Part {
    private String partName;
    private String partURL;
    private String img_URL;
    private String price;

    public Part(String partName, String partURL, String img_URL, String price){
        this.partName = partName;
        this.partURL = partURL;
        this.img_URL = img_URL;
        this.price = price;
    }

    String getPartName(){return partName;}
    String getPartURL(){return partURL;}
    String getIMG_URL(){return img_URL;}
    String getPrice(){return price;}

    void setPartName(String partName){this.partName = partName;}
    void setPartURL(String partURL) {this.partURL = partURL;}
    void setIMG_URL(String img_URL) {this.img_URL = img_URL;}
    void setPrice(String price) {this.price = price;}
}