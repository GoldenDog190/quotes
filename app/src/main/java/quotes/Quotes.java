package quotes;

public class Quotes {
    String author;
    String quotes;

    public Quotes(String author, String quotes) {
        this.author = author;
        this.quotes = quotes;
    }

    public String toString(){
        return String.format("Author: %s, Quote: %s",
                author,
                quotes);
    }
}
