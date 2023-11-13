public class AscendingSort10 {
    public static void main(String[] args) {
        String[][] atlet = {
                { "Abdillah", "Dimas", "Chiko", "Farhan", "Saka" },
                { "Innama", "Afifah", "Alif", "Lutfi", "Putra" },
                { "Vincent", "Taufik", "Nanda", "Ivan", "Farrel" },
                { "Cindy", "Vira", "Esa", "Mera", "Reika" },
        };
        String[] cabor = { "Badminton", "Tenis meja", "Basket", "Bola Voli" };

        for (int i = 0; i < atlet.length; i++) {
            for (int j = 0; j < atlet[i].length - 1; j++) {
                for (int k = 0; k < atlet[i].length - j - 1; k++) {
                    if (atlet[i][k].compareToIgnoreCase(atlet[i][k + 1]) > 0) {
                        String temp = atlet[i][k];
                        atlet[i][k] = atlet[i][k + 1];
                        atlet[i][k + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < atlet.length; i++) {
            System.out.println("Cabang Olahraga " + cabor[i]);
            for (int j = 0; j < atlet[i].length; j++) {
                System.out.println("Atlet ke-" + (j + 1) + " : " + atlet[i][j]);
            }
            System.out.println();
        }
    }
}