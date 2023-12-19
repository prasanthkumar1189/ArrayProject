package arrays;
public class SecondLargestNumber {

	  public static void main(String[] args) {
	    int[] numbers = {5, 8, 2, 1, 10, 7};

	    int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;
	    
	    for (int number : numbers) {
	      if (number > largest) {
	        secondLargest = largest;
	        largest = number;
	      } else if (number > secondLargest && number != largest) {
	        secondLargest = number;
	      }
	    }
	    
	    if (secondLargest != Integer.MIN_VALUE) {
	      System.out.println("The second largest number is: " + secondLargest);
	    } else {
	      System.out.println("There is no second largest number.");
	    }
	  }
	}
