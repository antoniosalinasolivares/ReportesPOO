import java.io.*;
import java.util.Date;

class SerializeDate{
  SerializeDate(){
    Date d = new Date();
    System.out.println(d);
    try{
      FileOutputStream f = new FileOutputStream("date.ser");
      ObjectOutputStream s = new ObjectOutputStream(f);
      s.writeObject(d);
      s.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}

class DeSerializeDate{
  DeSerializeDate(){
    Date d = null;
    try{
      FileInputStream f = new FileInputStream("date.ser");
      ObjectInputStream s = new ObjectInputStream(f);
      d = (Date) s.readObject();
      s.close();
    }catch(Exception e){
      e.printStackTrace();
    }
    
    System.out.println("Deserialized Date object from date.ser:");
    System.out.println(d);
  }
}

public class Serializer{
  public static void main(String [] args){
    new SerializeDate();

    new DeSerializeDate();

  }
  
}
