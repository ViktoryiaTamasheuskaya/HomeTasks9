package Tasks;

public class paperBooks {

    public String Title;
    public int Year;
    public String Author;
    public double Price;

    public paperBooks(){

    }

    public paperBooks(String Title, int Year) {
        this.Title = Title;
        this.Year = Year;
        this.Author = Author;
        this.Price = Price;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void toConsole(String Title, String Author, int Year, double Price){
        System.out.println("Название книги = " +Title+", Год издания = " + Year+ ", Автор = "+Author+", цена = $"+Price );
    }



}
