public class Main {

    public static void main(String[] args) {
        //While template
        int count = 1;
        while (count != 6){
            System.out.println("Count value is " + count);
            count ++;
        }

        count = 1;

        // while loop with if logic conditional
        while (true){
            if(count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count ++;
        }
        //for loop translation

//        for(int i=1;i<7;i++){
//            System.out.println("count value is " + i);
//        }

        //do while format (promises to always excecute code block at least 1x)

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while(count != 6);

        System.out.println(isEvenNumber(4));

        int number = 4;
        int ecount = 0;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {

                //continue statement bypasses sout code to continue with next lop, ending with the step of finished number
                continue;

            }
            if (ecount == 5){
                break;
            }
            ecount++;

            // 4 is not included as an even number as the first itteration is impacted by ++, making it 5
            //if 4 needs to be included, one would need to set number = 3 instead
            //it appears this could simplify alternatives, by eliminating else / elif statements
            System.out.println("Even Number " + number);
        }
        System.out.println("We have found " + ecount + " even numbers!");

    }
    //Challenge
    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }


}
