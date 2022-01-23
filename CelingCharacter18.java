public class CelingCharacter18 {
    public static void main(String [] args) {
        char [] ch = {'c','f','j'};
        char target = 'i';
        System.out.println(search(ch,target));
    }

    public static char search(char[] ch, char target) {
        int start = 0;
        int end = ch.length-1;
        while(start<=end) {
            int mid = start + (end-start) / 2;
            if(ch[mid]>target) {
                end = mid-1;
            }
            else {
                start = mid + 1;
            }   
        }
        return ch[ start % ch.length] ;
        
    }
    
}
