package Tasks;

public class newspaperArticles extends paperBooks {

        private String NewspaperName;


    public newspaperArticles() {
        super();}

    public newspaperArticles(String Title, String Author, int Year, String NewspaperName) {
        super();
        this.Title=Title;
        this.Author=Author;
        this.Year=Year;
        this.NewspaperName = NewspaperName;

    }

    public void toConsole(String Title, String Author, int Year, String NewspaperName){
        System.out.println("Название статьи = " +Title+", Автор статьи = "+Author+", Год публикации = " + Year+ ", Название журнала = "+NewspaperName);
    }
}
