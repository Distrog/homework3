public class Main {
    public static void main(String[] args) {
        //Задача1
        int int1 = 3334;
        System.out.println("Значение переменной int1 с типом int равно "+int1);
        byte byte1 = 122;
        System.out.println("Значение переменной byte1 с типом byte равно "+byte1);
        short short1 = 3044;
        System.out.println("Значение переменной short1 с типом short равно "+short1);
        long long1 = 12000000000L;
        System.out.println("Значение переменной long1 с типом long равно "+long1);
        float float1 = 1.333f;
        System.out.println("Значение переменной float1 с типом float равно "+float1);
        double double1 = 4.44545644d;
        System.out.println("Значение переменной double1 с типом double равно "+double1);

        //Задача2
        float num1 = 27.12f;
        long num2 = 987678965549L;
        float num3 = 2.786f;
        short num4 = 569;
        short num5 = -159;
        short num6 = 27897;
        byte num7 = 67;

        //Задача3
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short sheets = 480;
        int sheetsPerStudent = sheets/(studentsLP+studentsAS+studentsEA);
        System.out.println("Каждому ученику досталось "+ sheetsPerStudent+" листов");

        //Задача4
        byte bottles = 16;
        byte time = 2;
        int bottlesPerMinute = bottles/time;
        int bottlesIn20minutes = bottlesPerMinute*20;
        System.out.println("За 20 минут машина произвела "+bottlesIn20minutes+" штук бутылок");
        int bottlesPerday = bottlesPerMinute*60*24;
        System.out.println("За сутки машина произвела "+bottlesPerday+" штук бутылок");
        int bottlesIn3days = bottlesPerday*3;
        System.out.println("За три дня машина произвела "+bottlesIn3days+" штук бутылок");
        int bottlesPerMonth = bottlesPerday*30;
        System.out.println("За месяц машина произвела "+bottlesPerMonth+" штук бутылок");

        //Задача5
        short cans = 120;
        byte cansWhitePaintPerClass = 2;
        byte cansBrownPaintPerClass = 4;
        int classes = cans/(cansWhitePaintPerClass+cansBrownPaintPerClass);
        int cansWhitePaint = classes*cansWhitePaintPerClass;
        int cansBrownPaint = cans - cansWhitePaint;
        System.out.println("В школе, где "+classes+" классов, нужно "+cansWhitePaint+" банок белой краски и "
                +cansBrownPaint+" банок коричневой краски");

        //Задача6
        byte bananaWeight = 80;
        byte numberBananas = 5;
        short milkVolume = 200;
        short weight100Ml = 105;
        short numberIceCream = 2;
        short iceCreamWeight = 100;
        short numberEgg = 4;
        short weightEgg = 70;
        int weightG = bananaWeight*numberBananas+milkVolume/100*weight100Ml+numberIceCream*iceCreamWeight+
                numberEgg*weightEgg;
        float weightKg = (float)weightG/1000;
        System.out.println("Вес спортзавтрака: "+weightKg+" кг");

        //Задача7
        byte differenceWeightG = 7;
        int differenceWeightKg = 7*1000;
        short gramPerDay250G = 250;
        short gramPerDay500G= 500;
        int days250 = differenceWeightKg/gramPerDay250G;
        int days500 = differenceWeightKg/gramPerDay500G;
        float average = (float)(days250+days500)/2;
        System.out.println("При потере по 250г похудеет за "+ days250+" дней. При потере по 500г похудеет за "
                + days500+" дней. В среднем похудеет за "+average+" дней");

        //Задача8
        int MashaOldSalaryPerMonth = 67760;
        float MashaNewSalaryPerMonth = (float)MashaOldSalaryPerMonth+ (float)MashaOldSalaryPerMonth*0.1f;
        float MashaDifferencePerYear = (MashaNewSalaryPerMonth-(float)MashaOldSalaryPerMonth)*12.0f;
        System.out.println("Маша теперь получает "+MashaNewSalaryPerMonth+" рублей. Годовой доход вырос на "
                +MashaDifferencePerYear+" рублей");

        int DenisOldSalaryPerMonth = 83690;
        float DenisNewSalaryPerMonth = (float)DenisOldSalaryPerMonth+ (float)DenisOldSalaryPerMonth*0.1f;
        float DenisDifferencePerYear = (DenisNewSalaryPerMonth-(float)DenisOldSalaryPerMonth)*12.0f;
        System.out.println("Денис теперь получает "+DenisNewSalaryPerMonth+" рублей. Годовой доход вырос на "
                +DenisDifferencePerYear+" рублей");

        int KristinaOldSalaryPerMonth = 76230;
        float KristinaNewSalaryPerMonth = (float)KristinaOldSalaryPerMonth+ (float)KristinaOldSalaryPerMonth*0.1f;
        float KristinaDifferencePerYear = (KristinaNewSalaryPerMonth-(float)KristinaOldSalaryPerMonth)*12.0f;
        System.out.println("Кристина теперь получает "+KristinaNewSalaryPerMonth+" рублей. Годовой доход вырос на "
                +KristinaDifferencePerYear+" рублей");
    }
}