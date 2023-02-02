package charlie.algdswangzheng.backingTrace;

class Bag{
    private static int maxW = Integer.MIN_VALUE;

    //
    public static void f(int i, int cw, int[] items,int n,int w){
        if(cw == w || i==n){
            if(cw >maxW) maxW =cw;
            if(cw == w){
                System.out.println(cw);
            }

            return;
        }
        f(i+1,cw,items,n,w);

        if(cw+items[i] <= w){
            f(i+1, cw+ items[i], items, n,w);
        }
    }

    public static void test_bag(){
        int[] goods = {5,10,15,20,3,12};
        int n= 6;
        int w = 50 ; // 20,15,12

        f(0,0,goods, n,w);

    }
}
public class BackTrace {

    public static void main(String[] args) {
            Bag.test_bag();
    }


}
