package sit707_week6;

public class Loop {
	public int SumoftheNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
	
	public int sumOfEvenAndOddNumbers(int n) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i; 
            } else {
                sumOdd += i; 
            }
        }

        return sumEven + sumOdd; 
    }
	

}
