package one.digitalinnovation.desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class UniformesDeFinalDeAno {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String owner, color, size;
        String[] details;
        List<Tshirt> tshirts = new ArrayList<>();
        Tshirt tshirt;
        boolean firstCase = true;
        int N = Integer.parseInt(in.readLine());
        System.out.println("numero de alunos = "+ N);
        for (int i = 0; i < N; i++) {
            owner = in.readLine();
            StringTokenizer st = new StringTokenizer(in.readLine());
            color = st.nextToken();
            size = st.nextToken();
            tshirts.add(new Tshirt(size, color, owner));
        }
        System.out.println(tshirts);
//        tshirts.sort(());
    }
}

class Tshirt implements Comparable<Tshirt> {

    private final String size;
    private final String color;
    private final String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Tshirt{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    @Override
    public int compareTo(Tshirt o) {
        return -1;
    }
}

//public interface Comparator {
//    int compare(T o1, T o2);
//}

