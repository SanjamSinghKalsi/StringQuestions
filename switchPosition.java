
    static String switcheroo(String s) {
        
   StringBuilder answer = new StringBuilder(s);

        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)=='a'){
               
                 answer.setCharAt(i, 'b');
            }
            else if (s.charAt(i)=='b'){
       
                 answer.setCharAt(i, 'a');
            }
        }
        
        return answer.toString();
    }
