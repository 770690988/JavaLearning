public class CardOperator {
    private int num_per_cards = 52; //每副卡牌的数量
    private int cards_num;          //一共几副牌
    private static int [][] cards;         //卡牌组数，例如三副牌，就是3*52的二维矩阵
    private static int deal_cards_num = 26; //指定发牌的数量
    private static int [] deal_cards = new int[deal_cards_num]; //用以存储发出的牌

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
                int value= (cards[(j+i*num_per_cards)/52][(j+i*num_per_cards)%52]+1) % 13;
                int type = (cards[(j+i*num_per_cards)/52][(j+i*num_per_cards)%52]%52)/13;
                card_type = getCardType(type);
                card_value = getCardValue(value);
                System.out.print(card_type+card_value+",");
                if((j+1) % 13 == 0){
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    private static String getCardType(int type){
        String card_type = null;
        switch (type){
            case 0:
                card_type = "♠";
                break;
            case 1:
                card_type = "♥";
                break;
            case 2:
                card_type = "♦";
                break;
            case 3:
                card_type = "♣";
                break;
        }
        return card_type;
    }

    private static String getCardValue(int value){
        String card_value;
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

    public void showDealCards() {
        //依次显示每副牌的牌面
        String card_type; //牌型: 花色
        String card_value; //牌值
        for (int i = 0; i < cards_num; i++) {
            System.out.println("第"+(i+1)+"副牌:");
            for (int j = 0; j < deal_cards_num; j++) {
                int value = (deal_cards[(j+i*num_per_cards)%52]+1) % 13;
                int type = (deal_cards[(j+i*num_per_cards)%52]%52/13);
                card_type = getCardType(type);
                card_value = getCardValue(value);
                System.out.print(card_type+card_value+",");
                if((j+1) % 13 == 0){
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    public void dealCards() {
        for (int i = 0; i < deal_cards_num; i++) {
            deal_cards[i] = cards[0][i];
        }
    }

    private static int getTrueValueDDZ(int cardNum){ //对于特殊的A 2 和 k 做特殊处理
        if(cardNum == 0){
            return 2;
        }else if(cardNum == 1){
            return 1;
        }else if(cardNum == 2){
            return 0;
        }else {
            return 15-cardNum;
        }
    }

    private static int compareDDZ(int cardA, int cardB){ //这里的cardA和cardB表示的是卡牌本身的值
        int compare;
        compare = getTrueValueDDZ((cardA+1) % 13)-getTrueValueDDZ((cardB+1) % 13);
        return compare;
    }

    private static int compareTLJ(int cardA, int cardB){ //这里的cardA和cardB表示的是卡牌本身的值
        int compare;
        compare = (cardA%52/13) - (cardB%52/13);
        return compare;
    }

    private void quick_sort_DDZ(int [] array, int l, int r){
        int head = l;
        int tail = r;
        while (head < tail) {
            while (head < tail) {
                if (compareDDZ(array[l],array[tail]) <= 0) {
                    tail--;
                } else {
                    break;
                }
            }
            while (head < tail) {
                if (compareDDZ(array[l],array[head]) >= 0) {
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
                quick_sort_DDZ(array, l, head - 1);
                quick_sort_DDZ(array, head + 1, r);
                break;

            } else {
                System.out.println("发生错误");
            }
        }
    }

    private void quick_sort_TLJ(int[] array, int l, int r) {
        int head = l;
        int tail = r;
        while (head < tail) {
            while (head < tail) {
                if (compareTLJ(array[l],array[tail]) < 0 || (compareTLJ(array[l],array[tail]) == 0 && compareDDZ(array[l],array[tail]) <= 0)) {
                    tail--;
                } else {
                    break;
                }
            }
            while (head < tail) {
                if (compareTLJ(array[l],array[head]) > 0 || (compareTLJ(array[l],array[head]) == 0 && compareDDZ(array[l],array[head]) >= 0)) {
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
                quick_sort_TLJ(array, l, head - 1);
                quick_sort_TLJ(array, head + 1, r);
                break;

            } else {
                System.out.println("发生错误");
            }
        }
    }

    public void rankCardsDDZType() {
        //按照斗地主的方式实现卡牌的排序
        quick_sort_DDZ(deal_cards,0,deal_cards.length-1);
    }

    public void rankCardsTLJType() {
        quick_sort_TLJ(deal_cards,0,deal_cards.length-1);
    }




}
