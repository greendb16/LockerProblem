public class LockerProblem {
    public static void main(String[]args){
        boolean [] lockers = new boolean[100];

        for (int i = 0; i < lockers.length; i++) {
            lockers[i] =true;
        }
        for(int n=1; n<lockers.length; n++){
        for (int i =n; i<lockers.length; i++){
            if(lockers[i] = true){
                lockers[i] = false;
            }
            else{lockers[i] = true;}

            int p=0;
            while(p<n){
                p++;
                i++;
        }}}
    for(int i=0; i<lockers.length; i++){
            if(lockers[i] = true){
                System.out.println("Locker Number "+ (i +1) + " is Open");
            }
            else{
                System.out.println("Locker Number "+ (i+1) + " is closed");
    }
    }}}
