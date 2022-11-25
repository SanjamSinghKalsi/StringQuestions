
    static String hidePhoneNumber(String s) {
        StringBuffer text = new StringBuffer(s.length());
        
       
        int star = s.length() -3;
        for(int i = 0;i<star;i++){
          text.append("*");
        }
        for(int i = star;i<s.length();i++){
          text.append(s.charAt(i));
        }
         //int star = s.length() -3;
//text.replace( 0 , star,"*");

      // System.out.println(text);
        return text.toString();
    }
