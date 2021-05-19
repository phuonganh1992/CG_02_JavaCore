import java.util.Stack;

public class Braket {
    public static void main(String[] args) {
        Stack<String> bracketStack=new Stack<>();
        String operation="s * (s – a) * (s – b( * s – c)))    ";
        String operationWithoutSpace=operation.replaceAll(" ","");
        String [] operationArray=operationWithoutSpace.split("");

        boolean isWell=true;
        for (String sym:operationArray) {
            if(sym.equals("(")) bracketStack.push(sym);
            if(sym.equals(")")) {
                if(bracketStack.isEmpty()) {
                    isWell=false;
                    break;
                } else bracketStack.pop();
            }
        }
        if(!bracketStack.isEmpty()) isWell=false;
        if(isWell) System.out.println("Use bracket well!");
        else System.out.println("Use bracket badly");
    }
}
