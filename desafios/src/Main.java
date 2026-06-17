class Main{

    public static void main(String[] args) {

        int[] numbers = {5,15,35,20};
        int target = 50;
        int indiceI = 0;
        int indiceJ = 0;

        for (int i = 0; i < numbers.length; i++){
           for (int j = 0; j < numbers.length; j++){
               if(numbers[i] + numbers[j] == target){
                   indiceI = i;
                   indiceJ = j;
               }
           }
        }

        System.out.println("Indice I: " + indiceI);
        System.out.println("Indice J: " + indiceJ);

    }
}