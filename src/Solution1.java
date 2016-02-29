
/********* String Chain*********/
/* image 3*/


public class Solution1 {

    public static void main(String[] args) {
        String[] q = {"bdcaa", "6","","","ba","bca","bda","bdca","bababa","bacd", "acd", "ac"};
        int a = longest_chain(q);
        System.out.println(a);
    }
    static int longest_chain(String[] w) {
        Integer max = new Integer(0);
        for(int i = w.length-1; i>=0; i--){
            String s = w[i];

            Integer maxValue = new Integer(0);
            System.out.println("--------\n"+ s + "\n------------");
            Integer returnVal = recursive(s,w,maxValue) + 1;
            System.out.println("Return Value " + returnVal);
            if(returnVal > max){
                max = returnVal;
            }
        }
        return max;
    }

    static Integer recursive(String s, String[] w, Integer maxValue)
    {
        if (s.length() <= 0) {
            return 0;
        }

        boolean stringPresent = false;
        for(String f1:w) {
            if (f1.equals(s)) {
                stringPresent = true;
            }
        }

        if (stringPresent == false) {
            return 0;
        }

        int max = 0;
        for(int j = 0; j < s.length(); j++){
            String newString = s.substring(0,j) + s.substring(j+1,s.length());

            for(String f:w){
                if(f.equals(newString)){

                    maxValue = maxValue + 1;

                    int tempmax = 1 + recursive(newString,w,maxValue);
                    if (tempmax > max)
                        max = tempmax;

                    //System.out.println("newString : " + newString +  " max " + max + " tempmax " + tempmax);

                }
            }
        }
        return max;//s.length() + 1;

    }

}