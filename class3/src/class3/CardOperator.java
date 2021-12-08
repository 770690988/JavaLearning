package class3;

public class CardOperator {
    private int num_per_cards = 52; //每副卡牌的数量
    private int cards_num;          //一共几副牌
    private static int [][] cards;         //卡牌组数，例如三副牌，就是3*52的二维矩阵

    public CardOperator(int user_input_cards_num){
        //接受几副牌的信息
        cards_num = user_input_cards_num;
        initialCards();
    }

    public void initialCards(){
        //每副牌都按照黑桃红桃、方片、草花,A-K的顺序初始化
        //系统认定先是13张黑桃，再13张红桃A-K，再13张方片A-K，最后13张草花A-K
        cards = new int[cards_num][num_per_cards];
        for (int i = 0; i < cards_num; i++) {
            for (int j = 0; j < num_per_cards; j++) {
                cards[i][j] = j+i*num_per_cards;
            }
        }
    }
    public void showCards(){
        //依次显示每副牌的牌面
        String card_type; //牌型: 花色
        String card_value; //牌值
        for (int i = 0; i < cards_num; i++) {
            System.out.println("第"+(i+1)+"副牌:");
            for (int j = 0; j < num_per_cards; j++) {
                card_type = getCardType(j+i*num_per_cards);
                card_value = getCardValue(j+i*num_per_cards);
                System.out.print(card_type+card_value+",");
                if((j+1) % 13 == 0){
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    private static String getCardType(int card_info){
        String card_type = null;
        int type;
        type = (cards[card_info/52][card_info%52]%52)/13;
        switch (type){
            case 0:
                card_type = "黑桃";
                break;
            case 1:
                card_type = "红桃";
                break;
            case 2:
                card_type = "方片";
                break;
            case 3:
                card_type = "梅花";
                break;
        }
        return card_type;
    }

    private static String getCardValue(int card_info){
        String card_value;
        int value;
        value = (cards[card_info/52][card_info%52]+1) % 13;
        switch (value){
            case 1:
                card_value = "A";
                break;
            case 2:
                card_value = "2";
                break;
            case 3:
                card_value = "3";
                break;
            case 4:
                card_value = "4";
                break;
            case 5:
                card_value = "5";
                break;
            case 6:
                card_value = "6";
                break;
            case 7:
                card_value = "7";
                break;
            case 8:
                card_value = "8";
                break;
            case 9:
                card_value = "9";
                break;
            case 10:
                card_value = "10";
                break;
            case 11:
                card_value = "Jack";
                break;
            case 12:
                card_value = "Queen";
                break;
            case 0:
                card_value = "King";
                break;
            default:
                card_value = "wrong";
        }
        return  card_value;
    }

    public void shuffleCards(){
        int shuffle_num = 100; //打乱100次
        int first_index,second_index;//用于交换位置的两个元素的下标
        int temp; //用于交换时候的临时变量
        for (int i = 0; i < cards_num; i++) {
            for (int j = 0; j < shuffle_num; j++) {
                first_index = (int) (Math.random()*(num_per_cards-1));
                second_index = (int) (Math.random()*(num_per_cards-1));
                temp = cards[i][first_index];
                cards[i][first_index] = cards[i][second_index];
                cards[i][second_index] = temp;
            }
        }

    }

    public void rankCards(){
        for (int i = 0; i < cards_num; i++) {
            quick_sort(cards[i],0, num_per_cards-1);
        }
    }

    private void quick_sort(int [] array, int l, int r){
        int head = l;
        int tail = r;
        while (head < tail) {
            while (head < tail) {
                if (array[l] <= array[tail]) {
                    tail--;
                } else {
                    break;
                }
            }
            while (head < tail) {
                if (array[l] >= array[head]) {
                    head++;
                } else {
                    break;
                }
            }
            if (head < tail) {
                int temp;
                temp = array[head];
                array[head] = array[tail];
                array[tail] = temp;
            } else if (head == tail) {
                int temp;
                temp = array[head];
                array[head] = array[l];
                array[l] = temp;
                quick_sort(array, l, head - 1);
                quick_sort(array, head + 1, r);
                break;

            } else {
                System.out.println("发生错误");
            }
        }
    }

}
