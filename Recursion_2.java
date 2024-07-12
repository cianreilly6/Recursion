public class Recursion_2 {
    public static void main(String [] args)
    {
        String attendance = "APLLPPP";
        int Absent = 0;
        int Late = 0;
        boolean test= checkAttendance(attendance, 0, 0);
        if(test){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }

    public static boolean checkAttendance(String attendance, int Absent, int Late){
        if(Absent>1 || Late>2){
            return false;// base case to see if the person have failed
        }
        else if(attendance.length()==0)
        {
            return true;//base case: if by the end of attendance no failing criteria its a pass
        }
        else if(attendance.charAt(0)=='L'){
            return checkAttendance(attendance.substring(1), Absent, Late+1);//Increments Late if it equals L
        }
        else if(attendance.charAt(0)=='A'){
            return checkAttendance(attendance.substring(1), Absent+1, 0);//Increments Absent if it equals A
        }
        return checkAttendance(attendance.substring(1), Absent, 0);

    }

}


