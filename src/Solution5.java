/**
 * Created by linetdsouza on 3/9/16.
 * 2 Sigma program
 * delete the tree that is stored in an array
 */

class Node
{
    double value;
    int parent;

    Node(double val, int par)
    {
        value = val;
        parent = par;
    }

    public String toString()
    {
        return (value + " " + parent);
    }
}

public class Solution5 {
    static Node[] tree = new Node[11];
    public static void main(String[] args)
    {
        Node n1 = new Node(100, -1);
        Node n2 = new Node(100, 0);
        Node n3 = new Node(100, 0);
        Node n4 = new Node(100, 1);
        Node n5 = new Node(100, 1);
        Node n6 = new Node(100, 3);
        Node n7 = new Node(100, 2);
        Node n8 = new Node(100, 2);
        Node n9 = new Node(100, 4);
        Node n10 = new Node(100, 5);
        Node n11 = new Node(100, 6);

        tree[0] =  n1;
        tree[1] =  n2;
        tree[2] =  n3;
        tree[3] =  n4;
        tree[4] =  n5;
        tree[5] =  n6;
        tree[6] =  n7;
        tree[7] =  n8;
        tree[8] =  n9;
        tree[9] =  n10;
        tree[10] =  n11;

        for(int i = 0 ; i < tree.length ; i++)
        {
            System.out.println(tree[i]);
        }
        removeIndex(3);
        System.out.println("--------------------");
        for(int i = 0 ; i < tree.length ; i++)
        {
            System.out.println(tree[i]);
        }

    }

    static void removeIndex (int index)
    {
        tree[index].parent = -2;
        for(int i = 0; i<tree.length; i++)
        {
            if(tree[i].parent == -2)
            {
                continue;
            }
            if (tree[i].parent == index)
            {
                removeIndex(i);
            }
        }
    }
}
