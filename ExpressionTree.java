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

    }

    //-----------------------------------------------------------------
    // Helper method for the constructor.
    //-----------------------------------------------------------------
    private ExpressionNode build(String s)
    {
        ExpressionNode current;
        int operatorIndex =-1;
        if(s.lastIndexOf("-")>operatorIndex){
            operatorIndex = s.lastIndexof("-");
        }
        if(s.lastIndexOf("+")>operatorIndex){
            operatorIndex = s.lastIndexof("+");
        }
        if(operatorIndex<=0 && s.lastIndexOf("*")>operatorIndex){
            operatorIndex = s.lastIndexof("*");
        }
        else if(s.lastIndexOf("/")>operatorIndex){
            operatorIndex = s.lastIndexof("/");
        }
        else if(s.lastIndexOf("%")>operatorIndex){
            operatorIndex = s.lastIndexof("%");
        }
        if(operatorIndex==-1){
            return 
        }
        current
    }

}
