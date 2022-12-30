package Lab6;

public class Main {
    public static void main(String[] args) {
        Helmet h = new Helmet(10, 120, "Железо");
        Armor a = new Armor(30, 200, "Сталь");
        Shield s = new Shield(7, 100, "Дерево");
        Amunitions[] amunitions = { h, a, s };

        System.out.println("Общая стоимость амуниции рыцаря: "
                + Amunitions.cost(amunitions));
        Amunitions.sortedByWeight(amunitions);
        System.out.println("Отсортированная по весу аммуниция рыцаря:");
        for (int i = 0; i < amunitions.length; i++) {
            System.out.print(amunitions[i].getWeight() + " ");
        }
        System.out.println();
        Amunitions d[];
        d = Amunitions.priceRange(amunitions, 50, 200);
        System.out.println("Аммуниция из данного диапозона цен:");
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i].getPrice() + " ");
        }
    }
}

