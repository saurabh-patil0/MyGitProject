package Exercise;

import java.util.ArrayList;
import java.util.List;

class header
{
   String title;
   
  header(String title)
  {
  this.title = title;
  }
  
  public String getTitle() 
  {
	 return title;
  }
}

class body
{
   String message;
   
  body(String message)
  {
  this.message = message;
  }
  
  public String getMessage() 
  {
	 return message;
  }
}

class attachment
{
   String filename;
   
   attachment(String filename)
  {
  this.filename = filename;
  }
   
   public String getFilename() 
   {
 	 return filename;
   }
}

public class mailMessage 
{
	
		header hd;
		body bd;
		attachment atc;
	
	   mailMessage(header hd, body bd, attachment atc)
       {
			this.hd=hd;
			this.bd=bd;
			this.atc=atc;
	   }
	   
	   public String toString()
	   {
		return hd.getTitle()+bd.getMessage()+atc.getFilename();
	   }
	   
	   public static void main(String[] args) 
	   {
		   header h = new header("header of mail, ");
		   body b = new body("body of mail, ");
		   attachment a = new attachment("attachment of mail ");
		   mailMessage m = new mailMessage(h, b, a);
		   List<mailMessage> mailmsg = new ArrayList<mailMessage>();
		   mailmsg.add(m);
		   
		   for(mailMessage mlms : mailmsg ) 
		   {
			   System.out.println(mlms.toString());
		   }
	   }
}
	
		


