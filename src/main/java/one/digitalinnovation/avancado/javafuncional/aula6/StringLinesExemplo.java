package one.digitalinnovation.avancado.javafuncional.aula6;

import java.util.stream.Collectors;

public class StringLinesExemplo {
    public static void main(String[] args) {
        String html = "<html>\n <head>\n </head>\n  <body>\n\t<h1>olá mundo</h1>\noi\n </body>\n</html>";
        System.out.println(html);
        System.out.println(html.lines().filter(string -> string.contains("head")).collect(Collectors.joining()));
        System.out.println(html.lines().filter(string -> string.contains("<"))
                .map(string -> "[TAG] = "+ string).collect(Collectors.toList()));
    }
}
