//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class SecondConverter {
    public SecondConverter() {
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(999));
        System.out.println(getDurationString(-116, 89));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value for seconds";
        } else {
            int minutes = seconds / 60;
            return getDurationString(seconds / 60, seconds % 60);
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid value for minutes";
        } else if (seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remMinutes = minutes % 60;
            return "" + hours + "h " + remMinutes + "m " + seconds + "s";
        } else {
            return "Invalid value for seconds";
        }
    }
}
