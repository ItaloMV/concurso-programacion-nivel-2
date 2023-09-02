public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    // Insert brilliant code here
    if (walk.length > 10 || walk.length < 10) {
        return false;
    }
    
        int sur = 0;
        int norte = 0;
        int este = 0;
        int oeste = 0;

        for(int i=0 ; i<walk.length ; i++){

            if(walk[i] == 's'){
                sur++;
            }else if(walk[i] == 'n'){
                norte++;
            }else if(walk[i] == 'e'){
                este++;
            }else{
                oeste++;
            }
        }

        if((sur == norte) && (este == oeste)){
            return true;
        }else{
          return false;
        }
    
  }
}