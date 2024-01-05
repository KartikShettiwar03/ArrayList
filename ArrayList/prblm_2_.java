import java.util.ArrayList;
public class prblm_2_{
    public static boolean pairSum(ArrayList<Integer>arr,int key){
        int lo = 0;
        int hi = arr.size()-1;
        while(lo != hi){
            if(arr.get(lo)+arr.get(hi)<key){
                lo++;
            }
            else if(arr.get(lo)+arr.get(hi)==key){
                return true;
            }
            else{
                hi--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(9);
        System.out.println(pairSum(arr,));
    }
}