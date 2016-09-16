package orderedlist;
/**
 * Date 2015
 * @author rdw77236
 */
public class Node<T>
{
    private T data;
    private Node<T> link;
    
    public Node(T d, Node<T> i){data = d; link = i;}
    public Node(){data = null; link = null;}
    
    public void setData(T data) {this.data = data;}
    public void setLink(Node link) {this.link = link;}
    
    public T getData(){return data;}
    public Node<T> getLink(){return link;}
}
