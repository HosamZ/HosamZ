package week3JAVA.ex2;

import week3JAVA.ex1.Customer;

public class TemplateChooser {

    public String chooseTemplate(Customer customer) {

        String name = customer.getName().trim();
        if (name.contains("Hokopoko")) {
            return "privileged";
        }
        if (name.startsWith("Mr.")) {
            return "Man";
        }
        if (name.startsWith("Ms.") || name.startsWith("Mrs.")) {
            return "Woman";
        }
        return "default";

    }
}
