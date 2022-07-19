import java.util.*;
class OperationInStack{

    Stack<Integer> stack;

    OperationInStack(Stack<Integer> s){
        this.stack = s;
    }

    void displayStack(){
        System.out.println("Content of Stack is"+ stack);
    }
    synchronized void pushToStack(int n){
        System.out.println("Push operation took place");
        stack.push(n);
        displayStack();
    }
    synchronized void popFromStack(){
        if(!stack.isEmpty()) {
            System.out.println("Pop operation took place and the remove element is" + stack.pop());
            displayStack();
        }
        else{
            System.out.println("Stack pop can't happen the stack is empty");
        }
    }
}

class PushOperation implements Runnable{
    OperationInStack push;

    int number;

    PushOperation(OperationInStack p,int n){
        this.push = p;
        this.number = n;
        new Thread(this).start();
    }

    @Override
    public void run() {
        push.pushToStack(number);
    }
}

class PopOperation implements Runnable{
    OperationInStack pop;

    PopOperation(OperationInStack p){
        this.pop = p;
        new Thread(this).start();
    }
    @Override
    public void run() {
        pop.popFromStack();
    }
}


class StackOperations {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        OperationInStack ops = new OperationInStack(s);
        PushOperation push;
        PopOperation pop;
        push = new PushOperation(ops,21);
        push = new PushOperation(ops,22);
        push = new PushOperation(ops,23);
        push = new PushOperation(ops,24);
        pop = new PopOperation(ops);
        pop = new PopOperation(ops);

    }
}

