package Lab6;

import java.util.Arrays;
import java.util.Comparator;

public class Amunitions {
    private int weight;
    private int price;
    private String material;

    public int getWeight() {
        return weight;
    }

   void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterial() {
        return new String(material);
    }

    public void setMaterial(String material) {
        this.material = new String(material);
    }

    public Amunitions(int w, int p, String m) {
        setWeight(w);
        setPrice(p);
        setMaterial(m);
    }

    public Amunitions(Amunitions obj) {
        setWeight(obj.getWeight());
        setPrice(obj.getPrice());
        setMaterial(obj.getMaterial());
    }

    public static int cost(Amunitions[] m) {
        int price = 0;
        for (int i = 0; i < m.length; i++) {
            price = price + m[i].getPrice();
        }
        return price;
    }

    public static void sortedByWeight(Amunitions[] m) {
        Arrays.sort(m, new Comparator<Amunitions>() {
            public int compare(Amunitions m1, Amunitions m2) {
                return m1.getWeight() - m2.getWeight();
            }
        });
    }

    public static Amunitions[] priceRange(Amunitions[] m, int a, int b) {
        int length = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i].getPrice() >= a && m[i].getPrice() <= b) {
                length++;
            }
        }
        Amunitions[] m1 = new Amunitions[length];
        for (int i = 0; i < m.length; i++) {
            if (m[i].getPrice() >= a && m[i].getPrice() <= b) {
                m1[i] = m[i];
            }
        }
        if (length == 0) {
            return null;
        } else {
            return m1;
        }
    }
}


