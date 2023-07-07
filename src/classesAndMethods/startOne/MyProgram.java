package classesAndMethods.startOne;

// !        NOT                !pirmas        false, nes true keičiame priešingu
// ==       Equal to           pirmas==antras false, nes pirmas nėra lygus antram
// !=       Not equal to       pirmas!=antras true, nes pirmas nėra lygus antram
// && ir &  Conditional - AND  pirmas$$antras false, nes abu nėra true
// || ir |  Conditional - OR   pirmas||antras true, nes bent vienas iš abiejų yra true
// ^        Exclusive OR       pirmas^antras  true, jei vienas ir TIK vienas iš dviejų yra true

public class MyProgram {
    public static void main(String[] args) {
        int mom = 62;
        int me = 18;
        int papa = 35;
        int bublik = 1;

        // I'm NOT (!) older than mom ( me > mom)
        if (!(me > mom)) {
            System.out.println("I'm younger");
        } else {
            System.out.println("I'm older than my mom");
        }

        if (bublik == me) {
            System.out.println("I'm like bublik");
        } else {
            System.out.println("I'm not like bublik");
        }

        if (1 == bublik) {
            System.out.println("Bublik is 1 year old");
        } else {
            System.out.println("Bublik is not 1 year old");
        }

        if (bublik != me) {
            System.out.println("I'm not like bublik");
        } else {
            System.out.println("I'm like bublik");
        }

        if(me > bublik && papa > bublik) {
            System.out.println("This is true, I'm > bublik AND papa > bublik");
        }

        System.out.println("Am I > bublik AND i > mom");
        if(me > bublik && me > mom) {
            System.out.println("This is true, I'm > bublik AND i'm > mom");
        } else {
            System.out.println("This is false");
        }

        if(mom > mom || mom > me || bublik > papa) {
            System.out.println("Bublik will give a cake");
        }
    }
}