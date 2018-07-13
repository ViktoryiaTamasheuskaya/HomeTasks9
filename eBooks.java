package Tasks;

public class eBooks extends paperBooks{
        public String eFormat;

        public eBooks(){

            super();
        }

    public eBooks(String Title, String Author, int Price, String eFormat) {
        super();
        this.eFormat = eFormat;
        this.Author=Author;
        this.Title=Title;
        this.Price=Price;

    }

    public void toConsole(String Title, String Author, double Price, String eFormat){
        System.out.println("Название электронного издания = "+Title+", Автор электронного издания = "+Author+ ", Цена = $"+Price+", Формат электронного издания = "+ eFormat);
    }
}

