public class FindOutlier {
  static int find(int[] integers) {
    
    int residuo = 0;
    int contPar = 0, contImpar = 0, resultadoPar = 0, resultadoImpar = 0;

        for(int i=0 ; i<integers.length ; i++) {
            residuo = integers[i] % 2;
            if(residuo == 0) {
                contPar++;
                resultadoPar = i;
            }
            else{
                contImpar++;
                resultadoImpar = i;
            }
        }

        if(contPar > contImpar){
           return integers[resultadoImpar];
        }
        else{
            return integers[resultadoPar];
        }
  }
}