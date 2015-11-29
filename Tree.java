package proyecto;
public class Tree 
{
    private Node[] treeArray;
    private int maxSize;
    private int currentSize;
    private int i = 0;
    public Tree(int maxSize)
    {
        this.maxSize = maxSize;
        //currentSize = 0;
        treeArray = new Node[maxSize];
    }

    public Node find(int key)
    {
        Node ROOT=treeArray[0];
        if(ROOT==null)
        {
            System.out.println("El árbol está vacio");
            return null;
        }     

        while(treeArray[i]!=null)
        {
            if(key==treeArray[i].getKey())
            {
                return treeArray[i];
            }
            else
            {
                if(key<treeArray[i].getKey())
                {
                    //Left
                    i=2*(i)+1;
                }
                else
                {
                    //Right
                    i=2*(i)+2;
                }
            }
        }
        return null;
    }

    public void insert(int key, double dData)
    {
        Node newNode = new Node(key,dData);
        Node ROOT=treeArray[0];
        Node current;
        if(ROOT==null)
        {
            ROOT= newNode;
        }
        else
        {
            current=treeArray[i];
            
            while(true)
            {
                if(key<current.getKey())
                {
                    //Left
                    i=2*(i)+1;
                    current=treeArray[i];
                    
                    if(treeArray[i]==null)
                    {
                        current=newNode;
                        return;
                    }
                }
                else
                {
                    //Right
                    i=2*(i)+2;
                    current=treeArray[i];
                    
                    if(treeArray[i]==null)
                    {
                        current=newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node minimum()
    {
        Node ROOT=treeArray[0];
        Node current=ROOT;
        if(ROOT==null)
        {
            return null;
        }
        else
        {
            while(current!=null)
            {
                //Left
                i=2*(i)+1;
                current=treeArray[i];
            }
            return current;
        }
    }

    public Node maximum()
    {
        Node ROOT=treeArray[0];
        Node current=ROOT;
        if(ROOT==null)
        {
            return null;
        }
        else
        {
            while(current!=null)
            {
                //Right
                i=2*(i)+2;
                current=treeArray[i];
            }
            return current;
        }
    }

    public boolean delete(int key)
    {
     // implementaciÃ³n aquÃ­
          return false;		// para que no de errores antes de implementargit
    }

    public void displayTree()
    {
        System.out.print("treeArray: ");
        for(int j = 0; j < maxSize; j++)
        {
            if(treeArray[j] != null)
            {
                System.out.print(treeArray[j].getKey() + " ");
            }
            else
            {
                System.out.print(" - ");
            }
        }
        System.out.println();
    }
}