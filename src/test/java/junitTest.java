import org.junit.Test;

public class junitTest {
    private miniService miniService = new miniService();

    @Test
    public void main(){
        int num = 100;
        testInTraditionalWay(num);
//        testInLessCosts(num);
        testInTraditionalWayStage2(num);
//        testInLessCostsStage2(num);

    }

    public void testInTraditionalWay(int num){
        try{
            long startTime = System.nanoTime();
            String[] pupils = miniService.pupilCountInTraditionalWay(num);
            long endTime = System.nanoTime();
            System.out.println("cost time(ns):"+(endTime-startTime));
            for(String tmp:pupils)
                System.out.println(tmp);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void testInLessCosts(int num){
        try{
            long startTime = System.nanoTime();
            String[] pupils = miniService.pupilCountInLessCosts(num);
            long endTime = System.nanoTime();
            System.out.println("cost time(ns):"+(endTime-startTime));
            for(String tmp:pupils)
                System.out.println(tmp);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void testInTraditionalWayStage2(int num){
        try{
            long startTime = System.nanoTime();
            String[] pupils = miniService.pupilCountInTraditionalWayStage2(num);
            long endTime = System.nanoTime();
            System.out.println("cost time(ns):"+(endTime-startTime));
            for(String tmp:pupils)
                System.out.println(tmp);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

//    public void testInLessCostsStage2(int num){
//        try{
//            long startTime = System.nanoTime();
//            String[] pupils = miniService.pupilCountInLessCostsStage2(num);
//            long endTime = System.nanoTime();
//            System.out.println("cost time(ns):"+(endTime-startTime));
////            for(String tmp:pupils)
////                System.out.println(tmp);
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//    }
}
