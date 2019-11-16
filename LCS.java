public class LCS{
  public static String getLCS(String x, String y, String prevString, int count){
    String lcs="";
    String buffer="";
    for(int i=0; i<count; i++){
      buffer+="  ";
    }
    //System.out.println(buffer+"prevString: "+prevString);
    //System.out.println(buffer+"x: "+x);
    //System.out.println(buffer+"y: "+y);

    if(x.length()==0 || y.length()==0){
      return prevString;
    }
    //case 1 if last elements are the same
    if(x.charAt(x.length()-1)==y.charAt(y.length()-1)){
      return getLCS(x.substring(0,x.length()-1),y.substring(0,y.length()-1),Character.toString(x.charAt(x.length()-1))+prevString,count+1);
    }
    //case 2 if last elements are different
    else{
      String xMinus = getLCS(x.substring(0,x.length()-1),y,prevString,count+1);
      String yMinus = getLCS(x,y.substring(0,y.length()-1),prevString,count+1);
      return (xMinus.length()>yMinus.length())?xMinus:yMinus;
    }
  }

  public static void main(String[] args){
    String x = "nematode_knowledge";
    String y = "empty_bottle";
    System.out.println(getLCS(x,y,"",0));
  }
}
