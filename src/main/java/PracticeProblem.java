/*
File Name: If Statements
Author: Jim Li
Date Created: Mar. 23, 2026
Date Last Modified: Mar. 23, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String evenOrOdd(int num){
	String evenOrOdd = "placeholder";
	if (num % 2 == 0){
	evenOrOdd = "Even";
	} else {
	evenOrOdd = "Odd";
	}
	return evenOrOdd;
	}

	public static String teacherOrStudent(String name){
	String teacherOrStudent = "placeholder";
	if(name.equals("Kalisz")){
		teacherOrStudent = "Teacher";
	} else {
		teacherOrStudent = "Student";
	}
	return teacherOrStudent;
	}

	public static int fartherFromZero(int num){
	if (num < 0){
		num -= 5;
	}
	if (num > 0){
		num += 5;
	}
	return num;
	}
}
