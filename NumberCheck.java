import java.util.Random;

class FindPNO{
    int arr[];
    FindPNO(int ar[]){
        this.arr = ar;
    }
    synchronized void find(int i){
        if(arr[i]<0){
            System.out.println("The number "+arr[i]+" is negative number");
        }
        else if(arr[i]%2==0){
            System.out.println("The number "+arr[i]+" is positive and even number");
        }
        else{
            System.out.println("The number "+arr[i]+" is positive and odd number");
        }
    }

}

class FindWatItBelongsTo implements Runnable{

    FindPNO fp;
    int i;
    FindWatItBelongsTo(FindPNO f,int n){
        this.fp = f;
        this.i = n;
        new Thread(this).start();
    }
    @Override
    public void run() {
        fp.find(i);
    }
}

class NumberCheck {

    public static void main(String[] args){
        int arr[] = new int[20];
        Random r = new Random();
        for(int i = 0;i<20;i++){
            arr[i] = r.nextInt();
        }
        FindPNO ff = new FindPNO(arr);
        FindWatItBelongsTo f;
        for(int i = 0;i<20;i++){
            f = new FindWatItBelongsTo(ff,i);
        }
    }
}

