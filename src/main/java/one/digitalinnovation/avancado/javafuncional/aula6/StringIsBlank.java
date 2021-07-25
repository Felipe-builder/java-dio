package one.digitalinnovation.avancado.javafuncional.aula6;

public class StringIsBlank {
    public static void main(String[] args) {
        String string = "                      ";
        System.out.println(isBlank(string));
        System.out.println(string.isBlank());
    }

    private static boolean isBlank(String string){
        return string == null || string.length() == 0 || string.chars().allMatch(c -> c == ' ');
    }
}
