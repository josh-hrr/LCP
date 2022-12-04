class Main {
  public static void main(String[] args) {
    System.out.println("**Longest Common Prefix**"); 
    String[] strs = {"flower","flow","flight"}; 
    System.out.println(longestCommonPrefix(strs)); 
  }

  public static String longestCommonPrefix(String[] strs) { 

    String result = "";
    
    for(int i = 0; i<strs.length; i++){   
      if((i + 1) < strs.length){
        for(int k = 0; k<strs[i].length(); k++){    
          for(int g = 0; g<strs[i + 1].length(); g++){    
            if(strs[i].charAt(k) == strs[i + 1].charAt(g)){
              System.out.println(strs[i].charAt(k)); 
              if(i == strs.length){
                result = result + strs[i].charAt(k); 
              } 
            }
          }  
        } 
      }else{
        break;
      } 
    }
      System.out.println("test result" + result);
      return " testing ";
    }  
}
