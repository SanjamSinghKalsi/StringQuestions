static boolean potluckSupper(String name, String dish) {
        if(name.charAt(0)==dish.charAt(0)&& name.charAt(name.length()-1) == dish.charAt(dish.length()-1)){
            return true;
        }
        else{
            return false;
        }
    }
