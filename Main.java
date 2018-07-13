package Tasks;

public class Main {
    public static void main (String [] args){
        paperBooks paperBook1=new paperBooks();
        paperBook1.toConsole("To Kill a Mockingbird", "Harper Lee", 1960, 251.2);
        newspaperArticles newspaper1=new newspaperArticles();
        newspaper1.toConsole("It Came From a Black Hole, and Landed in Antarctica", "Dennis Overbye", 2018, "The New York Times");
        eBooks eBook1= new eBooks();
        eBook1.toConsole("Java Tutorial", "Mike Doe", 123, "Tutorial");


    }
}
