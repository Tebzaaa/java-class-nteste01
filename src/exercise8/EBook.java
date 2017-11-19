package exercise8;

/**
 * Class EBook
 * MediaLIbrary code 4
 * @author Teboho Samuel Nteso
 */
public class EBook extends Book {
  private final String format;
  
  public EBook(String format, String author, int publishingYear, long id, String title, int quantity){
      super(author,publishingYear,id,title,quantity);
      this.format = format;
  }
  
  /**
   * Get the book format
   * @return the value of format
   */
  public String getFormat() {
    return format;
  }
  @Override
  public void checkin(){
  }
  @Override
  public void checkout(){
  }
  public String getInfo(){
      return (author+'('+publishingYear+')'+title+"is available for"+format);
  }
}
  
