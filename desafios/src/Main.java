class Main{

    public static void main(String[] args) {

        int number = 101;

        String numberText = String.valueOf(number);
        //System.out.println(numberText);
        String numberTextReverse = new StringBuilder(numberText).reverse().toString();
        //System.out.println(numberTextReverse);

        if(numberText.equals(numberTextReverse)){
            System.out.println("É igual");
        }

    }
}