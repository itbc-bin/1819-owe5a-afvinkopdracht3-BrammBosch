public class DemoObjecten {

        public static void main(String[] args) {

                int studnr1 = Integer.parseInt(args[1]);
                int studnr2 = Integer.parseInt(args[3]);
                int studnr3 = Integer.parseInt(args[5]);
                int studnr4 = Integer.parseInt(args[7]);


                Student stud1 = new Student(args[0], studnr1); //initialisatie - creatie van een object van het type student
                Student stud2 = new Student(args[2], studnr2);
                Student stud3 = new Student(args[4], studnr3);
                Student stud4 = new Student(args[6], studnr4);


                stud1.info();
                stud2.info();
                stud3.info();
                stud4.info();

        }
}
