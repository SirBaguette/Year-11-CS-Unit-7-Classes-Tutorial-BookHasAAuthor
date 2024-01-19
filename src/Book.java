public class Book {
    private String Bookname;
    private Author author;
    private double price;
    private int qty;

    public Book(String bn, Author a, double p, int q) {
        Bookname = bn;
        author = a;
        price = p;
        qty = q;
    }
    public void setPrice(double i) {
        price = i;
    }
    public void setQty(int a) {
        qty = a;
    }
    public Author getAuthor(){
        return author;
    }
    public String getName(){
        return Bookname;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    @Override
    public String toString(){
        return ("'"+Bookname + "' by " + author.toString());
    }
}
