public class Workfile{
    
    public static void main(String []args){
    
    Node x = new Node("hello");
    Node y = new Node("fellow");
    
    
    x.setPoint(y);
    
    Node h = x.getPoint();
    System.out.println(h.getString());

        
        
        
        
    }
    
    
    
    
}