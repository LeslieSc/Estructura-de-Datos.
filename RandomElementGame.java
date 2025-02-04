public class RandomElementGame {
    public void GetRandomElement() {
        String[] GameElementString = {"Piedra", "Papel", "Tijera"};

        int GameElementIndex = (int) (Math.random() * GameElementString.length);

        System.out.print(GameElementString[GameElementIndex]);
    }
    
}
