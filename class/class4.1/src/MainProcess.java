public class MainProcess {
    public static void main(String[] args) {
        int cardNum = 1; //定义牌的张数
        CardOperator co = new CardOperator(cardNum);
        System.out.println("卡牌初始化:");
        co.showCards();

        co.shuffleCards();
        System.out.println("卡牌洗牌后:");
        co.showCards();

        co.dealCards();
        System.out.println("发牌后:");
        co.showDealCards();

        co.rankCardsDDZType();
        System.out.println("卡牌按斗地主模式理牌后:");
        co.showDealCards();

        co.rankCardsTLJType();
        System.out.println("卡牌按拖拉机模式理牌后:");
        co.showDealCards();

        co.rankCards();
        System.out.println("所有卡牌理牌后:");
        co.showCards();

    }
}