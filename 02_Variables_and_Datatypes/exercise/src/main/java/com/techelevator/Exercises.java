package com.techelevator;

public class Exercises {

    /**
     * For the purposes of this exercise, the following naming rules are tested:
     * <p>
     * Variable names:
     * - must start with a lowercase character a-z.
     * - underscore ('_') characters are not allowed.
     * - dollar sign ('$') characters are not allowed.
     * - must be at least two characters in length.
     * - You are encouraged to create descriptive names and are required to camel case them as appropriate.
     * <p>
     * Constant names:
     * - must start with an uppercase character A-Z.
     * - dollar sign ('$') characters are not allowed.
     * - must be at least two characters in length.
     * - You are encouraged to create descriptive names and are required to upper case them as appropriate.
     * <p>
     * Due to practical limitations, camel case and pascal case are not tested other than checking the first
     * character of the name is lower case for variables and upper case for constants. Your instructor will
     * manually review your solution checking for the correct casing.
     */

    public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
        // ### EXAMPLE:
        int birdsOnABranch = 4;
        int birdsThatFlyAway = 1;
        int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
        // ### EXAMPLE:
        int numberOfBirds = 6;
        int numberOfNests = 3;
        int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
        int raccoonsInWoods = 3;
        int goHomeRaccoons = 2;
        int raccoonsLeftInWoods = raccoonsInWoods - goHomeRaccoons;

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
        int numberOfFlowers = 5;
        int numberOfBees = 3;
        int beesLessThenFlowers = numberOfFlowers - numberOfBees;

        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
        int initialPigeon = 1;
        int additionalPigeon = 1;
        int totalPigeonCount = initialPigeon + additionalPigeon;

        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
        int owlsOnFence = 3;
        int additionalOwls = 2;
        int totalOwlsCount = owlsOnFence + additionalOwls;

        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
        int beaversWorkingOnHome = 2;
        int goSwimBeaver = 1;
        int remainingBeaver = beaversWorkingOnHome - goSwimBeaver;

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
        int initialToucan = 2;
        int additionalToucan = 1;
        int totalToucans = initialToucan + additionalToucan;



        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
        int squirrelCount = 4;
        int nutCount = 2;
        int extraSquirrels = squirrelCount - nutCount;



        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
        int quaters = 1;
        int dime = 1;
        int nickels = 2;
        double totalMoneyFound = (quaters * 0.25) + (dime * 0.10) + (nickels * 0.05);

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
        int muffinsFromClassBrier = 18;
        int muffinsFromClassMacAdams = 20;
        int muffinsFromClassFlannery = 17;
        int totalMuffins = muffinsFromClassBrier + muffinsFromClassMacAdams + muffinsFromClassFlannery;


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        double yoyoPrice = 0.24;
        double whistlePrice = 0.14;
        double totalMoneyForToys = yoyoPrice + whistlePrice;

        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        int largeMarshmallows = 8;
        int miniMarshmallows = 10;
        int totalMarshmallows = largeMarshmallows + miniMarshmallows;

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int snowAtMrsHiltHouse = 29;
        int snowAtBrecknockElementary = 17;
        int moreSnowAtMrsHiltHouse = snowAtMrsHiltHouse - snowAtBrecknockElementary;


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2.50 on a pencil
        case. How much money does she have left?
        */
        double moneyMrsHiltHas = 10.0;
        double toyTruckCost = 3.0;
        double pencilCaseCost = 2.50;
        double moneyLeft = moneyMrsHiltHas - (toyTruckCost + pencilCaseCost);

        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int marblesInCollection = 16;
        int lostMarbles = 7;
        int marblesNow = marblesInCollection - lostMarbles;

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int seashellsMeganHas = 19;
        int seashellsNeeded = 25 - seashellsMeganHas;

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int totalBalloons = 17;
        int redBalloons = 8;
        int greenBalloons = totalBalloons - redBalloons;

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int booksOnShelf = 38;
        int booksAddedByMarta = 10;
        int totalBooksOnShelfNow = booksOnShelf + booksAddedByMarta;

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int legsPerBee = 6;
        int numOfBees = 8;
        int totalLegs = legsPerBee * numOfBees;

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        double costOfOneIceCream = 0.99;
        double costOfTwoIceCreams = 2 * costOfOneIceCream;

        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int rocksNeededForBorder = 125;
        int rocksMrsHiltHas = 64;
        int rocksNeededToCompleteBorder = rocksNeededForBorder - rocksMrsHiltHas;


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int marblesMrsHiltHad = 38;
        int marblesMrsHiltLost = 15;
        int marblesMrsHiltNowHas = marblesMrsHiltHad - marblesMrsHiltLost;

        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int totalMilesToConcert = 78;
        int milesDrivenBeforeGas = 32;
        int milesLeftToDrive = totalMilesToConcert - milesDrivenBeforeGas;

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
        int timeShovelingSaturdayMorning = 90;
        int timeShovelingSaturdayAfternoon = 45;
        int totalTimeShoveling = timeShovelingSaturdayMorning + timeShovelingSaturdayAfternoon;


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        int numberOfHotDogsBought = 6;
        double costPerHotDog = 0.50;
        double totalCostOfHotDogs = numberOfHotDogsBought * costPerHotDog;


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        double moneyMrsHiltHasForPencil = 0.50;
        double costOfOnePencil = 0.07;
        int totalPencilSheCanBuy = (int) (moneyMrsHiltHasForPencil / costOfOnePencil);

        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int totalButterfliesSeen = 33;
        int orangeButterfliesSeen = 20;
        int redButterfliesSeen = totalButterfliesSeen - orangeButterfliesSeen;


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        double amountKateGave = 1.00;
        double costOfCandy = 0.54;
        double changeKateShouldGet = amountKateGave - costOfCandy;

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int treesMarkHad = 13;
        int treesMarkPlanted = 12;
        int totalTreesMarkWillHave = treesMarkHad + treesMarkPlanted;

        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        int hoursUntilJoySeesGrandma = 2 * 24;


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int numberOfCousinsKimHas = 4;
        int piecesOfGumPerCousin = 5;
        int totalPiecesOfGumNeeded = numberOfCousinsKimHas * piecesOfGumPerCousin;


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        double moneyDanHas = 3.00;
        double costOfCandyBar = 1.00;
        double moneyLeftAfterCandyBar = moneyDanHas - costOfCandyBar;

        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int numberOfBoats = 5;
        int peoplePerBoat = 3;
        int totalPeopleOnBoats = numberOfBoats * peoplePerBoat;

        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int legosEllenHad = 380;
        int legosEllenLost = 57;
        int legosEllenNowHas = legosEllenHad - legosEllenLost;

        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int muffinsArthurBaked = 35;
        int muffinsArthurNeedsToBake = 83 - muffinsArthurBaked;

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int crayonsWillyHas = 1400;
        int crayonsLucyHas = 290;
        int moreCrayonsWillyHas = crayonsWillyHas - crayonsLucyHas;

        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int stickersPerPage = 10;
        int pagesOfStickers = 22;
        int totalStickers = stickersPerPage * pagesOfStickers;

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int cupcakesAvailable = 100;
        int childrenSharingCupcakes = 8;
        double cupcakesPerChild = (double) cupcakesAvailable / childrenSharingCupcakes;


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
        int gingerbreadCookiesMade = 47;
        int cookiesPerJar = 6;
        int cookiesNotPlacedInJar = gingerbreadCookiesMade % cookiesPerJar;

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
        int croissantsPrepared = 59;
        int neighborsSharingCroissants = 8;
        int croissantsLeftWithMarian = croissantsPrepared % neighborsSharingCroissants;

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int cookiesPerTray = 12;
        int oatmealCookiesToPrepare = 276;
        int traysNeeded = oatmealCookiesToPrepare / cookiesPerTray;

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int pretzelsMade = 480;
        int pretzelsPerServing = 12;
        int servingsPrepared = pretzelsMade / pretzelsPerServing;

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int lemonCupcakesBaked = 53;
        int cupcakesPerBox = 3;
        int boxesGivenAway = (lemonCupcakesBaked - 2) / cupcakesPerBox;

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int carrotSticksPrepared = 74;
        int peopleServed = 12;
        int carrotSticksLeft = carrotSticksPrepared % peopleServed;

        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int teddyBearsOwned = 98;
        int teddyBearsPerShelf = 7;
        int shelvesFilled = teddyBearsOwned / teddyBearsPerShelf;

        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int totalPictures = 480;
        int picturesPerAlbum = 20;
        int albumsNeeded = totalPictures / picturesPerAlbum;

        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int tradingCardsCollected = 94;
        int cardsPerBox = 8;
        int filledBoxes = tradingCardsCollected / cardsPerBox;
        int cardsInUnfilledBox = tradingCardsCollected % cardsPerBox;

        /* Exercise 49
        49. The Milky Way galaxy contains 300 billion stars. The Andromeda galaxy
        contains 1 trillion stars. How many stars do the two galaxies contain combined?
        */
        long starsInMilkyWay = 300_000_000_000L;
        long starsInAndromeda = 1_000_000_000_000L;
        long totalStars = starsInMilkyWay + starsInAndromeda;

        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        int croissantsBaked = 17;
        int guestsServed = 7;
        double croissantsPerGuest = (double) croissantsBaked / guestsServed;


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates, 
	    and then divide the total number of rooms to be painted by the combined rate.
	    */
        double billsRateToPaintARoom = 2.15;
        double jillsRateToPaintARoom = 1.90;
        double combinedRate = (1 / billsRateToPaintARoom) + (1 / jillsRateToPaintARoom);
        double timeForFiveRooms = 5 / combinedRate;


	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
        String firstName = "Grace";
        String lastName = "Hopper";
        String middleInitial = "B";
        String fullName = lastName + ", " + firstName + " " + middleInitial + ".";
        System.out.println(fullName);

	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
        int distanceNewYorkToChicago = 800;
        int milesAlreadyTravelled = 537;
        int percentageCompleted = (milesAlreadyTravelled * 100) / distanceNewYorkToChicago;

    }

}
