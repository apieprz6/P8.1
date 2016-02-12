//import java.io.*;
/**
 * The class creates a binary tree that represents an arithmetic expression
 * of ints with operators +,-,*,/ and %.
 */
public class ExpressionTree
{
    private ExpressionNode root;
    public ExpressionTree(String s)
    {
        root=build(s);
    }

    //-----------------------------------------------------------------
    // Returns an int representing the value of the expression 
    // stored in this tree.
    //-----------------------------------------------------------------
    public int EvaluateTree()
    {
        int x=0;
        return x;
    }

    //-----------------------------------------------------------------
    // Helper method for the constructor.
    //-----------------------------------------------------------------
    private ExpressionNode build(String s)
    {
        ExpressionNode current;
        int operatorIndex =-1;
        if(s.lastIndexOf("-")>operatorIndex){
            operatorIndex = s.lastIndexOf("-");
        }
        if(s.lastIndexOf("+")>operatorIndex){
            operatorIndex = s.lastIndexOf("+");
        }
        if(operatorIndex<=0 && s.lastIndexOf("*")>operatorIndex){
            operatorIndex = s.lastIndexOf("*");
        }
        else if(s.lastIndexOf("/")>operatorIndex){
            operatorIndex = s.lastIndexOf("/");
        }
        else if(s.lastIndexOf("%")>operatorIndex){
            operatorIndex = s.lastIndexOf("%");
        }
        if(operatorIndex==-1){
            current = new ExpressionNode(s, null,null);
            return current;
        }
        return current = new ExpressionNode(s.substring(operatorIndex),build(s.substring(0,s.lastIndexOf(operatorIndex))),build(s.substring(s.lastIndexOf(operatorIndex),s.charAt(s.length( ) - 1))));
    }

}
