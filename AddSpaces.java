
public class Solution {

    public static String addSpaces(String words[]) {
        
        
        if(words==null){
            return null;
        }
       else if(words.length==0){
            return "";
        }
        else{
            StringBuilder sb = new StringBuilder(words[0]);
            for(int i=1;i<words.length;i++){
                sb.append(" ");
                sb.append(words[i]);
            }
            return sb.toString();
        //    sb.append(" ");
        //    sb.append(words[1]);
        //    return sb.toString();
        }
        
    }
