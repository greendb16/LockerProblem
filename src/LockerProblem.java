public class LockerProblem {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[101];

        //Set all lockers to open
        for (int i = 1; i < lockers.length; i++) {
            lockers[i] = true;
        }

        //Start at second locker.  Changing every nth locker.

//        for (int i = 2; i <= 100; i++) {
//            for (int j = 1; i * j <= 100; j++) {
//                lockers[i * j] = (lockers[i * j] == true) ? false : true;
//            }
//        }
        for (int n = 2; n < lockers.length; n++) {
            for (int i = n; i < lockers.length; i+=n) {
                lockers[i] = !lockers[i];
            }

//                int p = 0;
//                while (p < n) {
//                    p++;
//                    i++;
//                }


        //print locker status
        for (int i = 1; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.println("Locker Number " + (i) + " is Open");
            } else {
                System.out.println("Locker Number " + (i) + " is closed");
            }
        }
    }
}}
