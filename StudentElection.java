https://www.geeksforgeeks.org/goldman-sachs-interview-experience-for-1-5-years-experienced/


// Online Java Compiler
/*
A group of students are sitting in a circle. The teacher is electing a new class president. The teacher does this by singing a song while walking around the circle. After the song is finished the student at which the teacher stopped is removed from the circle.
Starting at the student next to the one that was just removed, the teacher resumes singing and walking around the circle.
After the teacher is done singing, the next student is removed. The teacher repeats this until only one student is left.

A song of length k will result in the teacher walking past k students on each round. 

The students are numbered 1 to n. The teacher starts at student 1.
For example, suppose the song length is two (k=2). And there are four students to start with (1,2,3,4). The first
student to go would be `2`, after that `4`, and after that `3`. Student `1` would be the next president in this example.
Function Description:
Implement a function that takes n = the number of students sitting in a circle. , k= the length (in students) of each song and returns the number of the student that is elected. (between 1 to n)

// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
    }
	
    public static int findPresident(int a[], int k){  //1, 2,3 ,4   k=2
	
		int n = a.length;     //4
		
		while(n>0)  
		elemination(a,k);
		n--;
		}
	   }
	
	
	
	}
	
	public int[] elemination(  int a[], int k, int n){
	int a1 [] = new int[a.length-1];
	int j=0;
	 for(int i=1;i<=a.length;i++){   1,2 ,3 ,4 
			if(i!=k){     2 %2 !=
			a1[j] =a[i];  //1,3,4
			j++;
			}
	   }
	  return a1;
	   }
}


chatGPT solution:
======================================================================================================================================
public class ClassPresidentElection {

    public static int findClassPresident(int n, int k) {
        if (n <= 0 || k <= 0) {
            throw new IllegalArgumentException("Invalid input. Number of students and song length must be positive integers.");
        }
        
        // Initializing an array to represent the students
        boolean[] students = new boolean[n];
        for (int i = 0; i < n; i++) {
            students[i] = true; // true indicates the student is still in the circle
        }

        int currentIndex = 0; // Starting index
        int remainingStudents = n; // Number of students remaining in the circle
        
        // Eliminate students until only one remains
        while (remainingStudents > 1) {
            int count = 0; // Counter for song length
            while (count < k) {
                currentIndex = (currentIndex + 1) % n; // Move to the next student in the circle
                if (students[currentIndex]) { // If the student is still in the circle
                    count++;
                }
            }
            students[currentIndex] = false; // Remove the student from the circle
            remainingStudents--; // Decrement the count of remaining students
        }

        // Finding the remaining student (the class president)
        for (int i = 0; i < n; i++) {
            if (students[i]) {
                return i + 1; // Return the student number (indices are 0-based)
            }
        }
        
        // This line should never be reached
        return -1;
    }

    public static void main(String[] args) {
        int n = 4; // Number of students
        int k = 2; // Song length
        int classPresident = findClassPresident(n, k);
        System.out.println("The class president is student " + classPresident);
    }
}
