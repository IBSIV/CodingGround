public class  Node{
    
    public Node nextNode;
    public String value;
    
    
    public Node(String word){
        nextNode = new Node(null);
        value = word;
        
    }
    public void setPoint(Node nodeToSet){
       nextNode = nodeToSet;
    }
    
    public Node getPoint(){
        return nextNode;
    }
    
    public String getString(){
        return value;
    }
    
    public void deleteNode(){
        
        //Node is only node in list
        if(nextNode == null){
            value = null;
        return;
            
        }
 
        else{
            value = nextNode.value;
            nextNode = nextNode.nextNode;
            
            
        }
        
        
    }
    
    
    
    
}