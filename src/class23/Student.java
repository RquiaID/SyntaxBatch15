package class23;

public class Student {

        public void study(){
            System.out.println("studying.... ");
        }
        void doHomeWork(){
            System.out.println("Solving homeworks");
        }
        void practice(){
            System.out.println("practicing the skills");
        }
    }

    class SyntaxStudent extends Student{

        @Override
        public void study() {
            System.out.println("Syntax Student must study Programming");
        }

        @Override
        void doHomeWork() {
            System.out.println("Syntax Students must solve the homeworks before next class");
        }

        @Override
        void practice() {
            System.out.println("Syntax Student must practice Repls");
        }
    }

    class  CollegeStudent extends Student{
        @Override
        void practice() {
            System.out.println("College students must practice to get good grades");
        }
    }

    class SchoolStudent extends Student{

    }


