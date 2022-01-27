public class driver {


    public static void main(String[] args) {

// List of 100 names for sorting
        String[] listOfNames = {"Walt", "Lawrence", "Ken", "Jennifer", "David", "Walter", "Phil", "Scotty", "Todd", "Leonard",
                "Kara", "Michelle", "Jill", "Steven", "Wynn", "Lloyd", "Brandon", "Gary", "Jim", "Hal", "Dale",
                "Joyce", "Don", "Tom", "Christine", "Rachel", "Jeff", "Fred", "Raymond", "Kelli", "Charles", "Kevin",
                "Brant", "Joseph", "Michael", "Kelly", "Fred", "Jessie", "Suzie", "Sally", "Shafira","Abel","Sara",
                "Hamish","Bertha", "Kimberly", "Hilel", "Brady", "Hayes", "Nolan", "Wade", "Zena", "Lars", "Faith",
                "Brittany", "Salvador", "Erasmus", "Channing", "Sonya", "Ayanna", "Fitzgerald", "Melodie", "Xyla",
                "Dieter", "Fletcher", "Duncan" , "Jelani" , "Lysandra" , "Liberty","Cassidy","Nigel","Andrew","Dale",
                "Amena","Mariam","Mechelle","Sydnee","Xander","Macaulay", "Ronan","Alexander","Vance","Wanda","Isaiah",
                "Gavin","Cailin","Larissa","Lewis","Holly","Quail","Nicholas"};




        sortAlgo sorty = new sortAlgo();

        System.out.println("Unsorted Array");
        sorty.printArray(listOfNames);
       sorty.bubbleSort(listOfNames);
       // sorty.merge(listOfNames);


       System.out.println("-----------------------------------------------");
       System.out.println("Sorted Array");


        sorty.printArray(listOfNames);

      // System.out.println("Compares is " + sorty.getCompares()+" swaps is "+ Math.abs(sorty.getMergesortCounter()));
       //System.out.println("Compares is " + sorty.getCompares()+" swaps is "+ Math.abs(sorty.getSwaps()));

    }

}
