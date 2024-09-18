import java.util.Scanner;

import java.util.InputMismatchException;


class StudentDatabaseSystem {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

		SIN();

        
    }

    

    public static void SIN(){

        String generalIns = "Select appropriate option:\n\t1. Registration\n\t2. Login\n\t3. Help\n\t4. Exit";

        while(true){

            int user = getRightOption(1,4,generalIns);

            if(user == 4){

                break;

            }

        }

    }

    

    public static int getRightOption(int min, int max, String ins){

        Scanner sc = new Scanner(System.in);

        int user;

        System.out.print(ins+"\nEnter your option: ");

        while(true){

            try{
                user = sc.nextInt();

            } catch (InputMismatchException e){

                System.out.print("Something went wrong!\nTry again: ");

                sc.next();
                continue;

            }

            if (user > max || user < min){

                System.out.print("Please enter right option: ");

                continue;

            }
            

        }
    }
}
class Student {
    String user, pass, info;
    // constructor
    public Student(String user, String pass, String info){
        this.user = user;
        this.pass = pass;
        this.info = info;
    }
}


