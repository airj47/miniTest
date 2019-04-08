import java.util.*;

public class miniService {

    private ArrayList<String> pupils=new ArrayList<String>();

    /**
     * test by liuzhe 20190325
     * Try to poll and check all the number, and return the pupils Array
     * @param number
     * @return String[]
     */
    public String[] pupilCountInTraditionalWay(int number){
        if(number>0){
            String[] pupils=new String[number];

            for(int i=1;i<=number;i++){
                if(i%3==0&&i%5==0)
                    pupils[i-1]="FizzBuzz";
                else if(i%3!=0&&i%5==0)
                    pupils[i-1]="Buzz";
                else if(i%3==0&&i%5!=0)
                    pupils[i-1]="Fizz";
                else
                    pupils[i-1]=String.valueOf(i);
            }

            return pupils;
        }

        return null;
    }

    /**
     * test by liuzhe 20190325
     * Try to poll only the related number and minimize the costs, and return the pupils Array
     * @param number
     * @return String[]
     */
    public String[] pupilCountInLessCosts(int number){
        if(number>0){
            String[] pupils=new String[number];
            for(int i=1;i<=number;i++)
                pupils[i-1]=String.valueOf(i);

            int fizzNum=number/3;
            for(int i=1;i<=fizzNum;i++)
                pupils[3*i-1]="Fizz";

            int buzzNum=number/5;
            for(int i=1;i<=buzzNum;i++)
                pupils[5*i-1]="Buzz";

            int fizzBuzzNum=number/(3*5);
            for(int i=1;i<=fizzBuzzNum;i++)
                pupils[3*5*i-1]="FizzBuzz";

            return pupils;
        }

        return null;
    }

    /**
     * test by liuzhe 20190325
     * Try to poll and check all the number in stage 2, and return the pupils Array
     * @param number
     * @return String[]
     */
    public String[] pupilCountInTraditionalWayStage2(int number){
        if(number>0){
            String[] pupils=new String[number];

            for(int i=1;i<=number;i++){
                if(check3(i)&&check5(i))
                    pupils[i-1]="FizzBuzz";
                else if(!check3(i)&&check5(i))
                    pupils[i-1]="Buzz";
                else if(check3(i)&&!check5(i))
                    pupils[i-1]="Fizz";
                else
                    pupils[i-1]=String.valueOf(i);
            }

            return pupils;
        }

        return null;
    }

    /*
    test by liuzhe 20190325
     */
    public boolean check3(int inputNum) {
        int di=0;
        while(inputNum>0){
            if(inputNum%3==0)
                return true;
            else{
                if(inputNum%10==3)
                    return true;
                else {
                    inputNum=inputNum/10;
                    continue;
                }
            }
        }
        return false;
    }

    /*
    test by liuzhe 20190325
     */
    public boolean check5(int inputNum) {
        int di=0;
        while(inputNum>0){
            if(inputNum%5==0)
                return true;
            else{
                if(inputNum%10==5)
                    return true;
                else {
                    inputNum=inputNum/10;
                    continue;
                }
            }
        }
        return false;
    }


//    public String[] pupilCountInLessCostsStage2(int number){
//    }








}
