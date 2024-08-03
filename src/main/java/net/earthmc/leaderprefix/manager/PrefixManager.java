package net.earthmc.leaderprefix.manager;

public class PrefixManager {

    public String getValidLeaderPrefixOrNull(String letter) {
        if (letter.equalsIgnoreCase("k") || letter.equals("Ⓚ")) return "§6👑";
        if (letter.equalsIgnoreCase("q") || letter.equals("Ⓠ")) return "§d👑";
        if (letter.equalsIgnoreCase("p") || letter.equals("Ⓟ")) return "§dⓅ";
        if (letter.equalsIgnoreCase("e") || letter.equals("Ⓔ")) return "§9👑";
        return null;
    }
}
