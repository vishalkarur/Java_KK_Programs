class OccurenceOfSpecificDigits5 {
    public static void main(String[] args) {
        int target = 2;
        int n = 45563255;
        int count = 0;
        while (n>0){
            int rem = n % 10;
            if(rem==target) count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}