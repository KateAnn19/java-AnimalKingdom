package animalkingdom;

import java.util.*; //this just needs to be where main is

public class Main {

    public static List<AbstractAnimals> filteredList = new ArrayList<>(); // private field for main to work with of type
                                                                          // AbstractAnimals and it is called
                                                                          // filteredList

    private static void filterAnimals(List<AbstractAnimals> animals, Checker tester, boolean printit) {
        filteredList.clear();
        for (AbstractAnimals v : animals) {
            if (tester.test(v)) {
                if (printit) {
                    System.out.println(v.toString());
                }
                filteredList.add(v);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Animal Kingdom rooooooaaaaarrrr");

        Mammals Panda = new Mammals("Panda", 1869);
        Mammals Zebra = new Mammals("Zebra", 1778);
        Mammals Koala = new Mammals("Koala", 1816);
        Mammals Sloth = new Mammals("Sloth", 1804);
        Mammals Armadillo = new Mammals("Armadillo", 1758);
        Mammals Raccoon = new Mammals("Raccoon", 1758);
        Mammals Bigfoot = new Mammals("Bigfoot", 2021);

        Fish Salmon = new Fish("Salmon", 1758);
        Fish Catfish = new Fish("Catfish", 1817);
        Fish Perch = new Fish("Perch", 1758);

        Birds Pigeon = new Birds("Pigeon", 1837);
        Birds Peacock = new Birds("Peacock", 1821);
        Birds Toucan = new Birds("Toucan", 1758);
        Birds Parrot = new Birds("Parrot", 1824);
        Birds Swan = new Birds("Swan", 1758);

        List<AbstractAnimals> animalAllList = new ArrayList<>();

        animalAllList.add(Panda);
        animalAllList.add(Zebra);
        animalAllList.add(Koala);
        animalAllList.add(Sloth);
        animalAllList.add(Armadillo);
        animalAllList.add(Raccoon);
        animalAllList.add(Bigfoot);
        animalAllList.add(Salmon);
        animalAllList.add(Catfish);
        animalAllList.add(Perch);
        animalAllList.add(Pigeon);
        animalAllList.add(Peacock);
        animalAllList.add(Toucan);
        animalAllList.add(Parrot);
        animalAllList.add(Swan);

        System.out.println("\n*** List of All");
        System.out.println(animalAllList.toString());

        // * [ ] List all the animals in descending order by year named

        System.out.println("******************** Print Descending Year Order **************************");

        animalAllList.sort(Comparator.comparing(o -> (Integer) o.getYear(), Comparator.reverseOrder()));

        // System.out.println(animalAllList.toString());
        printList(animalAllList);

        System.out.println("******************** Print Alphabetically **************************");
        // * [ ] List all the animals alphabetically
        animalAllList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        printList(animalAllList);

        System.out.println("******************** Print By Movement **************************");
        // * [ ] List all the animals order by how they move
        animalAllList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
        printList(animalAllList);

        System.out
                .println("******************** Print Only Animals that Breathe with Lungs **************************");
        // * [ ] List only those animals the breath with lungs
        filterAnimals(animalAllList, v -> v.breathe() == "lungs", true);
        printList(filteredList);

        System.out.println(
                "******************** Print Only Animals that Breathe with Lungs and 1758 **************************");
        // * [ ] List only those animals that breath with lungs and were named in 1758
        filterAnimals(animalAllList, v -> v.breathe() == "lungs" && v.getYear() == 1758, true);

        System.out.println(
                "******************** Print Only Animals that Lay Eggs and Breathe With Lungs **************************");
        // * [ ] List only those animals that lay eggs and breath with lungs
        filterAnimals(animalAllList, v -> v.breathe() == "lungs" && v.reproduce() == "eggs", true);

        System.out.println(
                "******************** Print Alphabetically Only Animals that were named in 1758 **************************");
        // * [ ] List alphabetically only those animals that were named in 1758
        filterAnimals(animalAllList, v -> v.getYear() == 1758, false);

        sortAlphabetically(filteredList);
        System.out.println("******************** Print Alphabetically By Only Mammals **************************");
        // * Stretch Goal
        // * [ ] For the list of animals, list alphabetically those animals that are
        // mammals.
        filterAnimals(animalAllList, v -> v instanceof Mammals, false);
        sortAlphabetically(filteredList);

    }

    public static void printList(List<AbstractAnimals> x) {
        System.out.println(x.toString());
    }

    public static void sortAlphabetically(List<AbstractAnimals> y) {
        y.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
        printList(y);
    }

}

// compiling code:
// inside src
// javac folderNameUnderSrcFiles/*.java (compile)
// jar cvfe folderNameUnderSrcFiles.jar folderNameUnderSrcFiles.Main
// folderNameUnderSrcFiles/*.class (make an archive)
// java -jar foldernameUnderSrcFiles.jar (run it)