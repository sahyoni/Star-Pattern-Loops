public class Main {

    public static void main(String[] args) {

        int rowOfStars = 7;
        int space = 20;

        for (int r = 1; r <= rowOfStars; r++) {
            for (int i = 1; i <= space; i++)
                System.out.print(" ");
            space--;
            for (int i = 1; i <= 2 * r - 1; i++)
                System.out.print("*");
            System.out.println();

        }

        //*************************************

        int rowOfStars2 = 3;
        int numberOfStars = 32;
        int spaceStep2 = 5;
        for (int numberOfLine = 0; numberOfLine <= rowOfStars2; numberOfLine++) {
            for (int sp = 1; sp <= spaceStep2; sp++)
                System.out.print(" ");
            for (int st = 1; st < numberOfStars; st++)
                System.out.print("*");
            System.out.println();
            spaceStep2++;
            numberOfStars -= 2;
        }

        //**************************************

        int rowsOfStars3 = 2;
        int numberOfStars3 = 26;
        int spaceStep3 = 7;

        for (int numberOfLine = 1; numberOfLine <= rowsOfStars3; numberOfLine++) {
            for (int sp = 1; sp <= spaceStep3; sp++)
                System.out.print(" ");
            spaceStep3--;
            for (int st = 0; st <= numberOfStars3; st++)
                System.out.print("*");
            System.out.println();
            numberOfStars3 += 2;

        }

        //***************************************

        int rowsOfStars4 = 4;
        int numberOfStars4 = 33;
        int spaceStep4 = 5;
        int bottomPart = 1;

        for (int numberOfLine = 1; numberOfLine <= rowsOfStars4; numberOfLine++) {
            for (int sp = 2; sp <= spaceStep4; sp++)
                System.out.print(" ");
            spaceStep4--;
            for (int st = 0; st < numberOfStars4 / 2; st++)
                System.out.print("*");
            for (int sp = 2; sp <= bottomPart; sp++)
                System.out.print(" ");
            bottomPart +=12;
            for (int st = 0; st < numberOfStars4 / 2; st++)
                System.out.print("*");
            numberOfStars4 -= 10;
            System.out.println();


        }


    }

}

