import java.util.*;

public class LIS{
  public static int getLIS(int[] X, HashMap<Integer, Integer> map){
    if(X.length==1){
      return 2;
    }
    for(int i=1; i<X.length; i++){
      if(X[i]>X[0]){
        //if(i>1 && X[i]<X[i-1] && X[i]>X[0]
        if(map.get(X[i])==null){
          int lis = getLIS(Arrays.copyOfRange(X,i,X.length),map)+1;
          map.put(X[i],lis);
          return lis;
        }
        else{
          return map.get(X[i]);
        }
      }
    }
    return 1;
  }
  public static void main(String[] args){
    int[] X = new int[]{0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    System.out.println(getLIS(X,hm));
    System.out.println(hm);
  }
}
