package javatutorials.method;

public class ReturnDemo4 {

    public static String[] getMembers() {
        String[] members = { "최진혁", "최유빈", "한이람" };
        return members;
    }

    public static void main(String[] args) {
        String[] members = getMembers();
    }

}