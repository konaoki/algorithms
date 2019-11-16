public class SCS{
  public static int getSCS(String x, String y){
    if(x.length()==0 || y.length()==0){
      return (x.length()>y.length())?x.length():y.length();
    }
    else{
      //case 1 if last elements are the same
      if(x.charAt(x.length()-1)==y.charAt(y.length()-1)){
        return 1+getSCS(x.substring(0,x.length()-1),y.substring(0,y.length()-1));

      }
      //case 2 if first elements are the same
      else{
        int xMinus = getSCS(x.substring(0,x.length()-1),y);
        int yMinus = getSCS(x,y.substring(0,y.length()-1));
        int min = (xMinus<yMinus)?xMinus:yMinus;
        return min+1;
      }
    }
  }
  public static void main(String[] args){
    String x = "nematode_knowledge";
    String y = "empty_bottle";
    System.out.println(getSCS(x,y));
  }
}
