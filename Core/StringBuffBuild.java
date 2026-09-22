public class StringBuffBuild{



 public static void main(String[] args)
 {  
    StringBuffer buff = new StringBuffer("Hello");
    System.out.println(buff.capacity());
    System.out.println(buff.length());
    buff.append(" World");
    System.out.println(buff);
    buff.insert(5, " ");
    System.out.println(buff);
    buff.deleteCharAt(2);
    System.out.println(buff);
    buff.reverse();
    System.out.println(buff);
    buff.setLength(5);
    System.out.println(buff);
    buff.setLength(10);
    System.out.println(buff);


    StringBuilder sb = new StringBuilder("Hello");
    System.out.println(sb.capacity());
    System.out.println(sb.length());
    sb.append(" World");
    System.out.println(sb);
    sb.insert(5, " ");
    System.out.println(sb);
    sb.deleteCharAt(2);
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
    sb.setLength(5);
    System.out.println(sb);
    sb.setLength(10);
    System.out.println(sb);




    
    
    
    

    
    
 }   
}