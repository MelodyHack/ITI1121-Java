
public interface Queue
{
  // TODO Fill in interface
  public abstract boolean isEmpty();
  public abstract void enqueue(Job o);
  public abstract Job dequeue();
  public abstract void clear();
  
}