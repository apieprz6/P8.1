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
        int val=root.getExprValue();
        return val;
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
        if(s.lastIndexOf("/")>operatorIndex){
            operatorIndex = s.lastIndexOf("/");
        }
        if(s.lastIndexOf("%")>operatorIndex){
            operatorIndex = s.lastIndexOf("%");
        }
        if(operatorIndex==-1){
            current = new ExpressionNode(s, null,null);
            return current;
        }
        return current = new ExpressionNode(""+s.charAt(operatorIndex),build(s.substring(0,operatorIndex)),build(s.substring(operatorIndex+1)));
    }

}
