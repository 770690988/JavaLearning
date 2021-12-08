package class3;

public class MainProcess {
    public static void main(String[] args) {
        int cardNum = 2; //定义牌的张数
        CardOperator card = new CardOperator(cardNum);
        System.out.println("卡牌初始化:");
        card.showCards();

        System.out.println("卡牌打乱后:");
        card.shuffleCards();
        card.showCards();

        System.out.println("卡牌理牌后:");
        card.rankCards();
        card.showCards();
    }
}
