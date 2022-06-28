package jenkins;

public class Remove_Ekstra_Spaces {

    public static void main(String[] args) {

        String input = "Replace    ekstra    spaces    with   contains...";
        String inputNew = input;

        while (inputNew.contains("  ")) {
            inputNew = inputNew.replace("  ", " ");
        };

        System.out.println(input);
        System.out.println(inputNew);

    }
}
