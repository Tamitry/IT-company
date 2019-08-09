package by.epam.javatraining.TarlikouskiDzmitri.task04.validation;

public final class Validation {

    private Validation() {

    }

    public static String validation(String str) {

        String[] sepStr = str.split(" ",5);

        if(sepStr[0].length()>16&&sepStr[0].length()<3) {
            return "";
        }

        if(sepStr[1].length()>16&&sepStr[1].length()<3) {
            return "";
        }

        if(Integer.parseInt(sepStr[2])<15&&Integer.parseInt(sepStr[2])>80) {
            return "";
        }

        if(Integer.parseInt(sepStr[2])<Integer.parseInt(sepStr[3])&&Integer.parseInt(sepStr[3])<0) {
            return "";
        }

        if(Integer.parseInt(sepStr[4])<0&&Integer.parseInt(sepStr[4])>10000000) {
            return "";
        }

        return str;
    }
}
