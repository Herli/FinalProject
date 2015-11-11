package proyecto;
public class Tree {
    private Node[] treeArray;
    private int maxSize;
    private int currentSize;
    private int i = 0;		 // i es el índice del arreglo en todos los métodos
    public Tree(int maxSize)
    {
        this.maxSize = maxSize;
        currentSize = 0;
        treeArray = new Node[maxSize];
    }
    public Node find(int key)
    {  
        Node ROOT=treeArray[0];
        if(ROOT==null)
        {
            System.out.println("El �rbol est� vacio");
            return null;
        }     

        while(treeArray[i]!=null)
        {
            if(key==treeArray[i].getKey())
            {
                //currentSize=i;
                return treeArray[i];
            }
            else
            {
                if(key<=treeArray[i].getKey())
                {
                    currentSize=i;
                    i=2*(currentSize)+1;
                }
                else
                {
                    currentSize=i;
                    i=2*(currentSize)+2;
                }
            }
        }
        return null;
    }
    public void insert(int key, double dData)
    {
       // implementación aquí

    }
    public Node minimum()
    {
      // implementación aquí  
          return null;		// para que no de errores antes de implementar
    }
    public Node maximum()
    {
      // implementación aquí  
          return null;		// para que no de errores antes de implementar
    } 
    public boolean delete(int key)
    {
     // implementación aquí
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

