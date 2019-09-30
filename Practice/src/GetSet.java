
public class GetSet {

	public static void main(String[] args) {

		Logger log= new Logger();
		log.setFormat("banner");
		System.out.println("Value BANNER has been set");
		System.out.println("Getting value as: "+log.getFormat());

	}
}

class Logger 
{
   private String format;
   public String getFormat() {
      return this.format;
   }

   public void setFormat(String format) {
      this.format = format;
   }
}
