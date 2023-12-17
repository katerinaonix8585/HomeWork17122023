import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
          CustomStringList customStringList = new CustomStringList(new String[]{"гном","лес","гриб"});
          System.out.println(customStringList.check("гном"));
          System.out.println(customStringList.check("полено"));
          System.out.println(customStringList.check(new String[]{"гном","лес","гриб"}));
          System.out.println(customStringList.check(new String[]{"гном","арбуз","гриб", "апельсин"}));
          System.out.println(customStringList.check(new String[]{"билет","заяц","береза"}));
          System.out.println(customStringList.toString());
          customStringList.add("потолок");
          System.out.println(customStringList.toString());
          customStringList.addIfNotExists("билет");
          System.out.println(customStringList.toString());
          customStringList.addIfNotExists("билет");
          System.out.println(customStringList.toString());

    }
}